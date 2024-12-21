package com.nttdata.id.briinterface.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.CustomerSearchResponseDTO;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.dtos.CustomerSearchRequestDTO;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.mapper.MapperRequestTI;
import com.nttdata.id.briinterface.model.Credentials;
import com.nttdata.id.briinterface.model.RequestHeader;
import com.nttdata.id.briinterface.model.ResponseHeader;
import com.nttdata.id.briinterface.model.customerdata.Customer;
import com.nttdata.id.briinterface.model.customerdata.CustomerSearchRequest;
import com.nttdata.id.briinterface.model.customerdata.CustomerSearchResponse;
import com.nttdata.id.briinterface.repository.db2.CustomerRepository;

@Service
@DependsOn("ConfigLoader")
public class CustomerService {
  private MQService mqService;

  private CustomerRepository customerRepository;

  private XmlConverterService xmlConverterService;

  private Executor busyTaskExecutor;

  @Value("${ibm_mq_incoming_queue_name}")
  private String inputQueue;

  @Value("${ibm_mq_outgoing_queue_name}")
  private String outputQueue;

  @Autowired
  public void setMqService(@Lazy MQService mqService, @Lazy XmlConverterService xmlConverterService, @Lazy Executor busyTaskExecutor, @Lazy CustomerRepository customerRepository) {
    this.mqService = mqService;
    this.xmlConverterService = xmlConverterService;
    this.busyTaskExecutor = busyTaskExecutor;
    this.customerRepository = customerRepository;
  }

  // Request Search Customer
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessSearchCustomer(CustomerSearchRequest request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("Customer", "CustomerSearch", credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<CustomerSearchRequest> customerSearchRequest = new MapperRequestTI<CustomerSearchRequest>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(customerSearchRequest, correlationId.getHeader("Correlation-Id"), CustomerSearchRequest.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
  
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
        CustomerSearchResponse customerSearchResponse = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), CustomerSearchResponse.class, CustomerSearchResponse.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
  
        response.setResponseData(
          xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), 
          responseHeader
        );
        response.setResponseData(
          xmlConverterService.toCamelCase(CustomerSearchResponse.class.getSimpleName()), 
          customerSearchResponse
        );
              
        return  new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Account Search Request",
          response
        );
      } catch (IllegalStateException e) {
        throw e;
      } catch (DataAccessException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      }
    }, busyTaskExecutor).orTimeout(2, TimeUnit.MINUTES)
    .exceptionally(
      ex -> {
        isCancelled.set(true);
        if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
        throw new CompletionException(new Exception(ex.getMessage()));
      }
    );
  }

  // Customer Search Inquiry DB
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessCustomerInquiryDB(CustomerSearchRequestDTO request){
    return CompletableFuture.supplyAsync(() -> {
      try {
        String message = "";
        Long totalAll = customerRepository.count();
        List<CustomerSearchResponseDTO> data = customerRepository.customerSearchInquiry(request);
      
        if (data.isEmpty()) {
          message = "Data not found";
        } else {
          message = "Success send Customer Search Request";
        }

        ListDTO<List<CustomerSearchResponseDTO>> response = new ListDTO<>(
          totalAll,
          request.getPagination().getPage(),
          request.getPagination().getSize(),
          request.getPagination().getSortType(),
          request.getPagination().getSortBy(),
          data
        );

        ResponseDataDTO customerdata = new ResponseDataDTO();
        customerdata.setResponseData("customerSearchResponse", response);

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          message,
          customerdata
        );
      } catch (IllegalStateException e) {
        throw e;
      } catch (DataAccessException e) {
        throw e; // Rethrow the exception to trigger transaction rollback
      } catch (Exception e) {
        throw e; // Rethrow the exception to trigger transaction rollback
      }
    }, busyTaskExecutor)
    .orTimeout(5, TimeUnit.MINUTES)
    .exceptionally(ex -> {
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });
  }


  // Insert Customer
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessCustomerInsert(Customer request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", "Customer", credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<Customer> customerInsert = new MapperRequestTI<Customer>(request, requestHeader);

        String xmlRequest = xmlConverterService.convertToXmlNew(customerInsert, correlationId.getHeader("Correlation-Id"), Customer.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());

        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader);

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Customer Insert Request",
          response
        );
      } catch (IllegalStateException e) {
        throw e;
      } catch (DataAccessException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      }
    }, busyTaskExecutor).orTimeout(2, TimeUnit.MINUTES)
    .exceptionally(
      ex -> {
        isCancelled.set(true);
        if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
      }
    );
  }

  // Update Customer
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessCustomerUpdate(Customer request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", "Customer", credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<Customer> customerInsert = new MapperRequestTI<Customer>(request, requestHeader);

        String xmlRequest = xmlConverterService.convertToXmlNew(customerInsert, correlationId.getHeader("Correlation-Id"), Customer.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());

        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader);

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Customer Insert Request",
          response
        );
      } catch (IllegalStateException e) {
        throw e;
      } catch (DataAccessException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      }
    }, busyTaskExecutor).orTimeout(2, TimeUnit.MINUTES)
    .exceptionally(
      ex -> {
        isCancelled.set(true);
        if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
      }
    );
  }

}
