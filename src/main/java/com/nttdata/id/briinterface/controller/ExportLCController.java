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
import com.nttdata.id.briinterface.model.lc.TFCRNADJ;
import com.nttdata.id.briinterface.model.lc.TFELCAMD;
import com.nttdata.id.briinterface.model.lc.TFELCBMR;
import com.nttdata.id.briinterface.model.lc.TFELCCOR;
import com.nttdata.id.briinterface.model.lc.TFELCNEW;
import com.nttdata.id.briinterface.model.lc.TFELCADD;
import com.nttdata.id.briinterface.service.ExportLCService;

@RestController
@RequestMapping("api/v2.9.2.6/exportlc")
public class ExportLCController {
  private final ExportLCService exportLCService;

  @Autowired
  public ExportLCController(ExportLCService exportLCService) {
    this.exportLCService = exportLCService;
  }

  // Endpoint for Export LC Advise
  @PostMapping(value = "/advise", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessExportLCAdvice(@Valid @RequestBody TFELCNEW request, HttpServletResponse response) {
    return exportLCService.busyProcessExportLCAdvice(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Export LC Amendement
  @PostMapping(value = "/amendment", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessExportLCAmendement(@Valid @RequestBody TFELCAMD request, HttpServletResponse response) {
    return exportLCService.busyProcessExportLCAmendment(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Export LC Adjust
  @PostMapping(value = "/adjust", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessExportLCAdjust(@Valid @RequestBody TFCRNADJ request, HttpServletResponse response) {
    return exportLCService.busyProcessExportLCAdjust(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Export LC Beneficiary
  @PostMapping(value = "/beneficiary", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessExportLCBeneficiary(@Valid @RequestBody TFELCBMR request, HttpServletResponse response) {
    return exportLCService.busyProcessExportLCBeneficiary(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Export LC Correspondent
  @PostMapping(value = "/correspondent", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessExportLCCorrespondent(@Valid @RequestBody TFELCCOR request, HttpServletResponse response) {
    return exportLCService.busyProcessExportLCCorrespondent(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Endpoint for Export LC Outstanding Presentation
  @PostMapping(value = "/outstanding", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessExportLCOutstanding(@Valid @RequestBody TFELCADD request, HttpServletResponse response) {
    return exportLCService.busyProcessExportLCOutstandingPresentation(request, response)
              .thenApply(ResponseEntity::ok);
  }
}
