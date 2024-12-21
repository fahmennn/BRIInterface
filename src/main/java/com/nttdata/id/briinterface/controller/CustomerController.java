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
import com.nttdata.id.briinterface.dtos.CustomerSearchRequestDTO;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.model.customerdata.Customer;
import com.nttdata.id.briinterface.model.customerdata.CustomerSearchRequest;
import com.nttdata.id.briinterface.service.CustomerService;

@RestController
@RequestMapping("/api/v2.9.2.6/customer")
public class CustomerController {
  private final CustomerService customerSearchRequestService;

  @Autowired
  public CustomerController(CustomerService customerSearchRequestService) {
    this.customerSearchRequestService = customerSearchRequestService;
  }

  // Customer Data Search
  @PostMapping(value = "/inquiry", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyInquiryAccountDetail(@Valid @RequestBody CustomerSearchRequest customerSearch, HttpServletResponse response) {
    return customerSearchRequestService.busyProcessSearchCustomer(customerSearch, response)
              .thenApply(ResponseEntity::ok);
  }

  // Customer Data Search DB
  @PostMapping(value = "/inquiry-db", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> busyInquiryAccountDetail(@Valid @RequestBody CustomerSearchRequestDTO customerSearch) {
    return customerSearchRequestService.busyProcessCustomerInquiryDB(customerSearch)
              .thenApply(ResponseEntity::ok);
  }
  
  // Customer Data Insert
  @PostMapping(value = "/insert", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> insertCustomerDetail(@Valid @RequestBody Customer request, HttpServletResponse response) {
    return customerSearchRequestService.busyProcessCustomerInsert(request, response)
              .thenApply(ResponseEntity::ok);
  }

  // Customer Data Update
  @PostMapping(value = "/update", consumes = "application/json", produces = "application/json")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> updateCustomerDetail(@Valid @RequestBody Customer request, HttpServletResponse response) {
    return customerSearchRequestService.busyProcessCustomerUpdate(request, response)
              .thenApply(ResponseEntity::ok);
  }

}
