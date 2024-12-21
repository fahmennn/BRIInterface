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
import com.nttdata.id.briinterface.model.lc.TFILCAMN;
import com.nttdata.id.briinterface.model.lc.TFILCAPP;
import com.nttdata.id.briinterface.model.lc.TFILCCAN;
import com.nttdata.id.briinterface.model.lc.TFILCPYR;

@Service
@DependsOn("ConfigLoader")
public class ImportLCService {
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

  // Import LC Amendment
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcesImportLCAmendment (TFILCAMN request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);
    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFILCAMN.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFILCAMN> importLCAmendment = new MapperRequestTI<>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(importLCAmendment, correlationId.getHeader("Correlation-Id"), TFILCAMN.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
  
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(ResponseHeader.class.getSimpleName(), responseHeader);
  
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(), 
          "Success send Import LC Amendment",
          response
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
      isCancelled.set(true);
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });
  }

  // Import LC Cancellation
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcesImportLCCancellation (TFILCCAN request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFILCCAN.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFILCCAN> importLCCancellation = new MapperRequestTI<>(request, requestHeader);

        String xmlRequest = xmlConverterService.convertToXmlNew(importLCCancellation, correlationId.getHeader("Correlation-Id"), TFILCCAN.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);

        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());

        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(
          xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader
        );

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(), 
          "Success send Import LC Cancellation",
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

  // Import LC Issuance
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcesImportLCIssuance (TFILCAPP request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFILCAPP.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFILCAPP> importLCIssuance = new MapperRequestTI<>(request, requestHeader);

        String xmlRequest = xmlConverterService.convertToXmlNew(importLCIssuance, correlationId.getHeader("Correlation-Id"), TFILCAPP.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());

        ResponseDataDTO response = new ResponseDataDTO();

        response.setResponseData(
          xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader
        );

        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(), 
          "Success send Import LC Issuance",
          response
        );
      } catch (IllegalStateException e) {
        throw e;
      } catch (DataAccessException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      }
    }, busyTaskExecutor).orTimeout(100, TimeUnit.MINUTES)
    .exceptionally(ex -> {
      isCancelled.set(true);
      System.out.println("this exception----------------------");
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });
  }

  // Import LC Outstanding Claim
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> busyProcesImportLCOutstandingClaim (TFILCPYR request, HttpServletResponse correlationId) {
    AtomicBoolean isCancelled = new AtomicBoolean(false);

    return CompletableFuture.supplyAsync(() -> {
      try {
        Credentials credentials = new Credentials("SUPERVISOR");
        RequestHeader requestHeader = new RequestHeader("TI", TFILCPYR.class.getSimpleName(), credentials, correlationId.getHeader("Correlation-Id"));
        MapperRequestTI<TFILCPYR> importLCOutstandingClaim = new MapperRequestTI<>(request, requestHeader);
  
        String xmlRequest = xmlConverterService.convertToXmlNew(importLCOutstandingClaim, correlationId.getHeader("Correlation-Id"), TFILCPYR.class.getSimpleName());
        mqService.sendToQueue(inputQueue, xmlRequest, correlationId.getHeader("Correlation-Id"), isCancelled);
        String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId.getHeader("Correlation-Id"), isCancelled);
        ResponseHeader responseHeader = xmlConverterService.convertToModelSpecificClass(xmlResponse, correlationId.getHeader("Correlation-Id"), ResponseHeader.class, ResponseHeader.class.getSimpleName());
  
        ResponseDataDTO response = new ResponseDataDTO();
        response.setResponseData(
          xmlConverterService.toCamelCase(ResponseHeader.class.getSimpleName()), responseHeader
        );
        
        return new ApiResponse<>(
          HttpStatus.OK.value(),
          HttpStatus.OK.getReasonPhrase(), 
          "Success send Import LC Outstanding Claim",
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
}
