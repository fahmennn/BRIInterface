package com.nttdata.id.briinterface.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.dtos.ReleaseItemChargeDTO;
import com.nttdata.id.briinterface.dtos.ReleaseItemChargeRequestDTO;
import com.nttdata.id.briinterface.repository.db2.ReleaseItemChargeRepository;

@Service
public class ReleaseItemChargeService {
	
	private final ReleaseItemChargeRepository releaseItemChargeRepository;

  private Executor busyTaskExecutor;

  @Autowired
  public ReleaseItemChargeService(ReleaseItemChargeRepository releaseItemChargeRepository, Executor busyTaskExecutor) {
    this.releaseItemChargeRepository = releaseItemChargeRepository;
    this.busyTaskExecutor = busyTaskExecutor;
  }
    
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ListDTO<List<ReleaseItemChargeDTO>>>> busyProcessReleaseItemChargeInquiry(ReleaseItemChargeRequestDTO request){

    return CompletableFuture.supplyAsync(() -> {
      try {
        String message = "";
        Long totalAll = releaseItemChargeRepository.count();
        List<ReleaseItemChargeDTO> result = releaseItemChargeRepository.findReleaseItemCharge(
          request.getReference(), request.getEvent(),
          request.getPagination().getPage(), request.getPagination().getSize(), request.getPagination().getSortBy(), request.getPagination().getSortType()
        );
        if (result.isEmpty()) {
          message = "Data not found";
        } else {
          message = "Success send Event Transaction Inquiry Request";
        }
        ListDTO<List<ReleaseItemChargeDTO>> data = new ListDTO<>(
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
      } catch (Exception e) {
        throw e;
      }
    }, busyTaskExecutor).orTimeout(5, TimeUnit.MINUTES)
    .exceptionally(ex -> {
      if (ex == null) throw new CompletionException(new TimeoutException("Request Timeout"));
      throw new CompletionException(new Exception(ex.getMessage()));
    });
  }


}
