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

import com.nttdata.id.briinterface.dtos.AccountResultResponseDTO;
import com.nttdata.id.briinterface.dtos.AccountSearchRequestDTO;
import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.mapper.MapperRequestTI;
import com.nttdata.id.briinterface.model.Credentials;
import com.nttdata.id.briinterface.model.RequestHeader;
import com.nttdata.id.briinterface.model.ResponseHeader;
import com.nttdata.id.briinterface.model.account.Account;
import com.nttdata.id.briinterface.model.account.AccountSearchRequest;
import com.nttdata.id.briinterface.model.account.AccountSearchResponse;
import com.nttdata.id.briinterface.model.account.AccountSearchResult;
import com.nttdata.id.briinterface.repository.db2.AccountRepository;

@Service
@DependsOn("ConfigLoader")
public class AccountService {
  // private static final Logger logger = LoggerFactory.getLogger(TestingThreadpoolService.class);

  private AccountRepository accountRepository;

  private MQService mqService;

  private XmlConverterService xmlConverterService;

  private Executor busyTaskExecutor;

  @Value("${ibm_mq_incoming_queue_name}")
  private String inputQueue;

  @Value("${ibm_mq_outgoing_queue_name}")
  private String outputQueue;

  @Autowired
  public void setMqService(@Lazy MQService mqService, @Lazy XmlConverterService xmlConverterService, @Lazy Executor busyTaskExecutor, @Lazy AccountRepository accountRepository) {
    this.mqService = mqService;
    this.xmlConverterService = xmlConverterService;
    this.busyTaskExecutor = busyTaskExecutor;
    this.accountRepository = accountRepository;
  }

  // Account Search Service in TI
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessInquiry(AccountSearchRequest request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("Account", "AccountSearch", credentials, "");
        MapperRequestTI<AccountSearchRequest> accountSearchRequest = new MapperRequestTI<>(request, requestHeader);
        String xmlRequest = xmlConverterService.convertToXmlNew(accountSearchRequest, correlationId.getHeader("Correlation-Id"), AccountSearchRequest.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
        AccountSearchResponse accountSearchResponse = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), AccountSearchResponse.class, AccountSearchResponse.class.getSimpleName());

        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(
          xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), 
          responseHeader
        );
        response.setResponseData(
          xmlConverterService.toCamelCase(AccountSearchResponse.class.getSimpleName()), 
          accountSearchResponse
        );

        return new ApiResponse<>(
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

  // Account Search Request by DB2
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> bussyProcessAccountSearchDb(AccountSearchRequestDTO request) {
    return CompletableFuture.supplyAsync(() -> {
      try {
        String message = "";
        Long totalAll = accountRepository.count();
        List<AccountResultResponseDTO> data = accountRepository.getAccountResponse(request);

        if (data.isEmpty()) {
          message = "Data not found";
        } else {
          message = "Success send Account Search Request";
        }

        ListDTO<List<AccountResultResponseDTO>> response = new ListDTO<>(
          totalAll,
          request.getPagination().getPage(),
          request.getPagination().getSize(),
          request.getPagination().getSortType(),
          request.getPagination().getSortBy(),
          data
        );

        ResponseDataDTO accountSearchResponse = new ResponseDataDTO();
        accountSearchResponse.setResponseData("accountSearchResponse", response);

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          message,
          accountSearchResponse
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
        if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
        throw new CompletionException(new Exception(ex.getMessage()));
      }
    );
  }

  // Account Insert Service
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>>bussyProcessAccountInsert(Account request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        // Costructing Request Header
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", "Account", credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<Account> account = new MapperRequestTI<Account>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(account, correlationId.getHeader("Correlation-Id"), Account.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
        
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader);
        
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(), 
          "Success send Account Request",
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
    .exceptionally(ex -> {
      isCancelled.set(true);
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });
  }

  // Account Update Service
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>>bussyProcessAccountUpdate(Account request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        // Costructing Request Header
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", "Account", credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<Account> account = new MapperRequestTI<Account>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(account, correlationId.getHeader("Correlation-Id"), Account.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
        
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader);
        
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(), 
          "Success send Account Request",
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

}
