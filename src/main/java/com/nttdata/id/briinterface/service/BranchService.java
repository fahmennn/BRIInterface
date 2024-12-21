package com.nttdata.id.briinterface.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;

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
import com.nttdata.id.briinterface.dtos.BranchInquiryRequestDTO;
import com.nttdata.id.briinterface.dtos.BranchInquiryResponseDTO;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.mapper.MapperRequestTI;
import com.nttdata.id.briinterface.model.Credentials;
import com.nttdata.id.briinterface.model.RequestHeader;
import com.nttdata.id.briinterface.model.ResponseHeader;
import com.nttdata.id.briinterface.model.branch.Branch;
import com.nttdata.id.briinterface.repository.db2.BranchInquiryRepository;

@Service
@DependsOn("ConfigLoader")
public class BranchService {

  private MQService mqService;

  private XmlConverterService xmlConverterService;

  private BranchInquiryRepository branchInquiryRepository;

  private Executor busyTaskExecutor;
  
  @Value("${ibm_mq_incoming_queue_name}")
  private String inputQueue;

  @Value("${ibm_mq_outgoing_queue_name}")
  private String outputQueue;

  @Autowired
  public void setMqService(@Lazy MQService mqService, @Lazy XmlConverterService xmlConverterService, @Lazy Executor busyTaskExecutor
  , @Lazy BranchInquiryRepository branchInquiryRepository
  ) {
    this.mqService = mqService;
    this.xmlConverterService = xmlConverterService;
    this.branchInquiryRepository = branchInquiryRepository;
    this.busyTaskExecutor = busyTaskExecutor;
  }

  // Insert Branch
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessBranchInsert(Branch request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", "Branch", credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<Branch> branchInsert = new MapperRequestTI<Branch>(request, requestHeader);
        String xmlRequest = xmlConverterService.convertToXmlNew(branchInsert, correlationId.getHeader("Correlation-Id"), Branch.class.getSimpleName());
        mqService.sendToQueue("TI.INTERFACE.IN2", xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue("TI.INTERFACE.OUT2", correlationId.getHeader("Correlation-Id"), isCancelled);
//        String xmlResponse = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ServiceResponse xmlns=\"urn:control.services.tiplus2.misys.com\" xmlns:ns2=\"urn:messages.service.ti.apps.tiplus2.misys.com\" xmlns:ns4=\"urn:custom.service.ti.apps.tiplus2.misys.com\" xmlns:ns3=\"urn:common.service.ti.apps.tiplus2.misys.com\"><ResponseHeader><Service>TI</Service><Operation>Branch</Operation><Status>FAILED</Status><Details><Error>Cannot find record to delete</Error></Details><TargetSystem>NONE</TargetSystem><SourceSystem>NONE</SourceSystem></ResponseHeader></ServiceResponse>";
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader);
  
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Branch Insert Request",
          response
        );
      } catch (IllegalStateException e) {
        throw e;
      }catch (DataAccessException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      } 
    }, busyTaskExecutor).orTimeout(2, TimeUnit.MINUTES).exceptionally(ex -> {
      isCancelled.set(true);
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });
  }

  // Update Branch
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessBranchUpdate(Branch request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", "Branch", credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<Branch> branchUpdate = new MapperRequestTI<Branch>(request, requestHeader);
        String xmlRequest = xmlConverterService.convertToXmlNew(branchUpdate, correlationId.getHeader("Correlation-Id"), Branch.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader);
  
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Branch Insert Request",
          response
        );
      } catch (IllegalStateException e) {
        throw e;
      } catch (DataAccessException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      } 
    }, busyTaskExecutor).orTimeout(2, TimeUnit.MINUTES).exceptionally(ex -> {
      isCancelled.set(true);
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });
  }


  // Service for Branch Inquiry
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessBranchInquiry(BranchInquiryRequestDTO request){

    return CompletableFuture.supplyAsync(() -> {
      // return transactionTemplate.execute(status -> {
      try {
        String message = "";

        // Count Total Data in Database
        Long totalAll = branchInquiryRepository.count();

        // Check if sortBy is empty, set default value
        String sortBy = request.getPagination().getSortBy() == null ? "CABBN" : request.getPagination().getSortBy().toUpperCase();

        // Check if sortType is empty, set default value
        String sortType = request.getPagination().getSortType() == null ? "ASC" : request.getPagination().getSortType().toUpperCase();

        List<BranchInquiryResponseDTO> result = branchInquiryRepository.filterDataBranch(
          request.getCabbn(), request.getFullName(), request.getCity(), request.getPagination().getPage(), 
          request.getPagination().getSize(), request.getPagination().getSortBy(), request.getPagination().getSortType()
        );

        if (result.isEmpty()) {
          message = "Data not found";
        } else {
          message = "Success send Branch Inquiry Request";
        }

        ListDTO<List<BranchInquiryResponseDTO>> data = new ListDTO<>(
          totalAll,
          request.getPagination().getPage(),
          request.getPagination().getSize(),
          sortType,
          sortBy,
          result
        );

        ResponseDataDTO branchInquiry = new ResponseDataDTO();
        branchInquiry.setResponseData("data", data);

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          message,
          branchInquiry
        );
      } catch (IllegalStateException e) {
        throw e;
      } catch (DataAccessException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      }
    }, busyTaskExecutor)
    .orTimeout(2, TimeUnit.MINUTES)
    .exceptionally(ex -> {
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });

  }

}
