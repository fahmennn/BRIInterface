package com.nttdata.id.briinterface.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.dtos.MasterRequestDTO;
import com.nttdata.id.briinterface.dtos.MasterResponseDTO;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.repository.db2.MasterRepository;

@Service
public class MasterService {
  private final MasterRepository masterRepository;

  private Executor busyTaskExecutor;

  private final TransactionTemplate transactionTemplate;

  @Autowired
  public MasterService(@Lazy MasterRepository masterRepository, @Lazy Executor busyTaskExecutor, TransactionTemplate transactionTemplate) {
    this.masterRepository = masterRepository;
    this.transactionTemplate = transactionTemplate;
    this.busyTaskExecutor = busyTaskExecutor;
  }

  @Transactional
  @Async("busyTaskExecutor")
  public CompletableFuture<ApiResponse<ResponseDataDTO>> masterTransactionalByReference(MasterRequestDTO request) {
    return CompletableFuture.supplyAsync(() -> {
      return transactionTemplate.execute(status -> {
        try {
            String message = "";

            // Count Total Data in Database
            Long totalAll = masterRepository.count();

            // Check if sortBy is empty, set default value
            String sortType = request.getPagination().getSortType() == null ? "ASC" : request.getPagination().getSortType().toUpperCase();
            
            // Check if sortType is empty, set default value
            String sortBy = request.getPagination().getSortBy() == null ? "KEY97" : request.getPagination().getSortBy().toUpperCase();

            List<MasterResponseDTO> data = masterRepository.filterDataMaster(
                request.getStatus(), request.getOrig_ref(), request.getInputBrn(), request.getBhalfBrn(), 
                request.getExpiryDat(), request.getAmount(), request.getCcy(), request.getCtrctDate(), 
                request.getRelMstrRef(), request.getProdtype(), request.getPrimaryCus(), request.getMasterRef(), 
                request.getPricustsbb(), request.getPricustmnm(), request.getPreRef(), request.getCanPrnRef(), 
                request.getNprRef(), request.getCannPrnRef(), request.getNprCustSbb(), request.getNprCustmnm(), 
                request.getNprNameL1(), request.getPcpSwBic(), request.getNpcSwBic(), request.getStartCtrctDate(), request.getEndCtrctDate(),
                request.getPagination().getPage(), request.getPagination().getSize(), 
                request.getPagination().getSortBy().toUpperCase(), request.getPagination().getSortType().toUpperCase()
            );

            if (data.isEmpty()) {
                message = "Data not found";
            } else {
                message = "Success send Master Transaction Request";
            }

            ListDTO<List<MasterResponseDTO>> response = new ListDTO<>(
                totalAll,
                request.getPagination().getPage(),
                request.getPagination().getSize(),
                sortType,
                sortBy,
                data
            );
            
            ResponseDataDTO masterdata = new ResponseDataDTO();
            masterdata.setResponseData("masterTransaction", response);

            return new ApiResponse<>(
                HttpStatus.OK.value(),
                HttpStatus.OK.getReasonPhrase(),
                message,
                masterdata
            ); 

        } catch (DataAccessException e) {
            throw e; // Rethrow the exception to trigger transaction rollback
        } catch (Exception e) {
            throw e; // Rethrow the exception to trigger transaction rollback
        }
      });
    }, busyTaskExecutor)
    .orTimeout(5, TimeUnit.MINUTES)
    .exceptionally(ex -> {
        if (ex.getCause() instanceof TimeoutException) {
            throw new CompletionException(new TimeoutException("Request Timeout"));
        }
        throw new CompletionException(ex.getCause());
    }); 
  }
}
