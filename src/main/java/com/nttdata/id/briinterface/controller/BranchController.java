package com.nttdata.id.briinterface.controller;

import java.util.List;
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
import com.nttdata.id.briinterface.dtos.BranchInquiryRequestDTO;
import com.nttdata.id.briinterface.dtos.BranchInquiryResponseDTO;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.model.branch.Branch;
import com.nttdata.id.briinterface.service.BranchService;

@RestController
@RequestMapping("/api/v2.9.2.6/branch")
public class BranchController {
  private final BranchService branchService;

  @Autowired
  public BranchController(BranchService branchService) {
    this.branchService = branchService;
  }

  // Controller for Insert Branch
  @PostMapping(value = "/insert", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyInsertBranch(@Valid @RequestBody Branch request, HttpServletResponse response) {
    return branchService.busyProcessBranchInsert(request, response)
            .thenApply(ResponseEntity::ok);
  }

  // Controller for Update Branch
  @PostMapping(value = "/update", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyUpdateBranch(@Valid @RequestBody Branch request, HttpServletResponse response) {
    return branchService.busyProcessBranchUpdate(request, response)
            .thenApply(ResponseEntity::ok);
  }

  // Controller for inquiry data branch
  @PostMapping(value = "/inquiry", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyInquiryBranch(@Valid @RequestBody BranchInquiryRequestDTO request) {
    return branchService.busyProcessBranchInquiry(request)
            .thenApply(ResponseEntity::ok);
  }
}
