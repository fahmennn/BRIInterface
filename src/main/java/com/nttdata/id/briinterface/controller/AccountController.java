package com.nttdata.id.briinterface.controller;

import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.id.briinterface.dtos.AccountSearchRequestDTO;
import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.model.account.Account;
import com.nttdata.id.briinterface.model.account.AccountSearchRequest;
import com.nttdata.id.briinterface.service.AccountService;

@RestController
@RequestMapping("/api/v2.9.2.6/account")
public class AccountController {

  private final AccountService accountDetailService;

  @Autowired
  public AccountController(@Lazy AccountService accountDetailService) {
    this.accountDetailService = accountDetailService;
  }

  @PostMapping(value = "/inquiry", consumes = "application/json", produces = "application/json")
  public CompletableFuture<Object> busyProcessAccountSearchInquiry(@Valid @RequestBody AccountSearchRequest accountDetail, 
                                                            HttpServletResponse request) {
    return accountDetailService.busyProcessInquiry(accountDetail, request)
              .thenApply(ResponseEntity::ok);
  }

  @PostMapping(value = "/insert", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessInsertAccount(@Valid @RequestBody Account request, HttpServletResponse response) throws Exception {
    return accountDetailService.bussyProcessAccountInsert(request, response)
              .thenApply(ResponseEntity::ok);
  }

  @PostMapping(value = "/update", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessUpdateAccount(@Valid @RequestBody Account request, HttpServletResponse response) throws Exception {
    return accountDetailService.bussyProcessAccountInsert(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Request AccountSearchRequest with DB2
  @PostMapping(value = "/search-in-db", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyProcessAccountSearchInquiryDB2(@Valid @RequestBody AccountSearchRequestDTO request) throws Exception {
    return accountDetailService.bussyProcessAccountSearchDb(request)
              .thenApply(ResponseEntity::ok);
  }
}
