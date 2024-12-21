package com.nttdata.id.briinterface.service;

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
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.mapper.MapperRequestTI;
import com.nttdata.id.briinterface.model.Credentials;
import com.nttdata.id.briinterface.model.RequestHeader;
import com.nttdata.id.briinterface.model.ResponseHeader;
import com.nttdata.id.briinterface.model.lc.TFCRNADJ;
import com.nttdata.id.briinterface.model.lc.TFELCAMD;
import com.nttdata.id.briinterface.model.lc.TFELCBMR;
import com.nttdata.id.briinterface.model.lc.TFELCCOR;
import com.nttdata.id.briinterface.model.lc.TFELCNEW;
import com.nttdata.id.briinterface.model.lc.TFELCADD;

@Service
@DependsOn("ConfigLoader")
public class ExportLCService {
  private MQService mqService;

  private XmlConverterService xmlConverterService;

  private Executor busyTaskExecutor;
    
  @Value("${ibm_mq_incoming_queue_name}")
  private String inputQueue;

  @Value("${ibm_mq_outgoing_queue_name}")
  private String outputQueue;

  @Autowired
  public void setMqService(@Lazy MQService mqService, @Lazy XmlConverterService xmlConverterService, @Lazy Executor busyTaskExecutor) {
    this.mqService = mqService;
    this.xmlConverterService = xmlConverterService;
    this.busyTaskExecutor = busyTaskExecutor;
  }

  // Service Export LC Advise
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessExportLCAdvice (TFELCNEW request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFELCNEW.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFELCNEW> exportLCAdvice = new MapperRequestTI<TFELCNEW>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(exportLCAdvice, correlationId.getHeader("Correlation-Id"), TFELCNEW.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
  
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(ResponseHeader.class.getSimpleName(), responseHeader);
  
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Export LC Advice Request",
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
      }
    );
  }

  // Service Export LC Amendment
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessExportLCAmendment(TFELCAMD request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFELCAMD.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFELCAMD> exportLCAmendment = new MapperRequestTI<TFELCAMD>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(exportLCAmendment, correlationId.getHeader("Correlation-Id"), TFELCAMD.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
  
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(ResponseHeader.class.getSimpleName(), responseHeader);
        
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Export LC Amendment Request",
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
      }
    );
  }

  // Service Export LC Adjust
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessExportLCAdjust(TFCRNADJ request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFCRNADJ.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFCRNADJ> exportLCAdjust = new MapperRequestTI<TFCRNADJ>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(exportLCAdjust, correlationId.getHeader("Correlation-Id"), TFCRNADJ.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
  
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(ResponseHeader.class.getSimpleName(), responseHeader);
        
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Export LC Adjust Request",
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
      }
    );
  }

  // Service Export LC Benerficiary
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessExportLCBeneficiary(TFELCBMR request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFELCBMR.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFELCBMR> exportLCBeneficiary = new MapperRequestTI<TFELCBMR>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(exportLCBeneficiary, correlationId.getHeader("Correlation-Id"), TFELCBMR.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
  
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(ResponseHeader.class.getSimpleName(), responseHeader);
        
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Export LC Beneficiary Request",
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
      }
    );
  }

  // Service Export LC Correspondent
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessExportLCCorrespondent(TFELCCOR request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFELCCOR.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFELCCOR> exportLCCorrespondent = new MapperRequestTI<TFELCCOR>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(exportLCCorrespondent, correlationId.getHeader("Correlation-Id"), TFELCCOR.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
  
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(ResponseHeader.class.getSimpleName(), responseHeader);
        
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Export LC Correspondent Request",
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
      }
    );
  }


  // Service Export LC Outstanding Presentation
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcessExportLCOutstandingPresentation(TFELCADD request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFELCADD.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFELCADD> exportLCOutstandingPresentation = new MapperRequestTI<TFELCADD>(request, requestHeader);
        
        String xmlRequest = xmlConverterService.convertToXmlNew(exportLCOutstandingPresentation, correlationId.getHeader("Correlation-Id"), TFELCADD.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());

        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(ResponseHeader.class.getSimpleName(), responseHeader);

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(),
          "Success send Export LC Outstanding Presentation Request",
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
      }
    );
  }

}
