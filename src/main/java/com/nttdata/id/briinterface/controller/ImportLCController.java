package com.nttdata.id.briinterface.controller;

import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.model.lc.TFILCAMN;
import com.nttdata.id.briinterface.model.lc.TFILCAPP;
import com.nttdata.id.briinterface.model.lc.TFILCCAN;
import com.nttdata.id.briinterface.model.lc.TFILCPYR;
import com.nttdata.id.briinterface.service.ImportLCService;

@RestController
@RequestMapping("api/v2.9.2.6/importlc")
public class ImportLCController {
  private final ImportLCService importLCService;

  @Autowired
  public ImportLCController(ImportLCService importLCService) {
    this.importLCService = importLCService;
  }

  // Endpoint for Import LC Amandment
  @PostMapping(value = "/amandment", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessImportLCAdvice(@Valid @RequestBody TFILCAMN request, HttpServletResponse response) {
    return importLCService.busyProcesImportLCAmendment(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Import LC Cancellation
  @PostMapping(value = "/cancellation", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessImportLCCancellation(@Valid @RequestBody TFILCCAN request, HttpServletResponse response) {
    return importLCService.busyProcesImportLCCancellation(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Import LC Issuance
  @PostMapping(value = "/issuance", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessImportLCIssuance(@Valid @RequestBody TFILCAPP request, HttpServletResponse response) {
    return importLCService.busyProcesImportLCIssuance(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Import LC Outstanding Claim
  @PostMapping(value = "/outstanding", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessImportLCOutstanding(@Valid @RequestBody TFILCPYR request, HttpServletResponse response) {
    return importLCService.busyProcesImportLCOutstandingClaim(request, response)
              .thenApply(ResponseEntity::ok);
  }
}
