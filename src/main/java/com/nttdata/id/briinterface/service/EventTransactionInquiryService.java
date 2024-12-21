package com.nttdata.id.briinterface.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataAccessException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.EventTransactionInquiryDTO;
import com.nttdata.id.briinterface.dtos.EventTransactionInquiryRequestDTO;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.repository.db2.EventTransactionInquiryRepository;

@Service
public class EventTransactionInquiryService {
	
	private final EventTransactionInquiryRepository eventTransactionInquiryRepository;

  private Executor busyTaskExecutor;

  private final TransactionTemplate transactionTemplate;

  @Autowired
  public EventTransactionInquiryService(@Lazy EventTransactionInquiryRepository eventTransactionInquiryRepository, @Lazy Executor busyTaskExecutor, TransactionTemplate transactionTemplate) {
    this.eventTransactionInquiryRepository = eventTransactionInquiryRepository;
    this.busyTaskExecutor = busyTaskExecutor;
    this.transactionTemplate = transactionTemplate;
  }
  
  @Transactional
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ListDTO<List<EventTransactionInquiryDTO>>>> busyProcessEventTransactionInquiry(EventTransactionInquiryRequestDTO request){
    AtomicBoolean isCancelled = new AtomicBoolean(false);
    
    return CompletableFuture.supplyAsync(() -> {
      return transactionTemplate.execute(status -> {
        try {
          String message = "";
          Long totalAll = eventTransactionInquiryRepository.count();
  
          List<EventTransactionInquiryDTO> result = eventTransactionInquiryRepository.filterEventTransaction(
            request.getMasterRef(), request.getRefNoPfix(), request.getRefNoSerl(),
            request.getTimeStart(), request.getStatus(), request.getTimeFinish(), request.getTheirRef(), request.getAmount(),
            request.getCcy(), request.getStatusEV(), request.getCrossRef(), request.getStartDate(), request.getFinished(),
            request.getPagination().getPage(), request.getPagination().getSize(), request.getPagination().getSortBy(), request.getPagination().getSortType()
          );
          if (result.isEmpty()) {
            message = "Data not found";
          } else {
            message = "Success send Event Transaction Inquiry Request";
          }
          ListDTO<List<EventTransactionInquiryDTO>> data = new ListDTO<>(
            totalAll,
            request.getPagination().getPage(),
            request.getPagination().getSize(),
            request.getPagination().getSortType(),
            request.getPagination().getSortBy(),
            result
          );
          return new ApiResponse<>(
            HttpStatus.OK.value(),
            HttpStatus.OK.getReasonPhrase(),
            message,
            data
          );
        } catch (IllegalStateException e) {
          throw e;
        } catch (DataAccessException e) {
          throw e;
        } catch (Exception e) {
          throw e;
        }
      });
    }, busyTaskExecutor)
    .orTimeout(10, TimeUnit.MINUTES)
    .exceptionally(
      ex -> {
        isCancelled.set(true);
        if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
        throw new CompletionException(new Exception(ex.getMessage()));
      }
    );
  }

}
