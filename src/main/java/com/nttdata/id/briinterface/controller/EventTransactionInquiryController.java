package com.nttdata.id.briinterface.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.EventTransactionInquiryDTO;
import com.nttdata.id.briinterface.dtos.EventTransactionInquiryRequestDTO;
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.service.EventTransactionInquiryService;

@RestController
@RequestMapping("/api/v2.9.2.6/event")
public class EventTransactionInquiryController {
	
	private final EventTransactionInquiryService eventTransactionInquiryService;

    @Autowired
    public EventTransactionInquiryController(EventTransactionInquiryService eventTransactionInquiryService) {
        this.eventTransactionInquiryService = eventTransactionInquiryService;
    }
    
    @PostMapping("/eventtransactioninquiry")
    public CompletableFuture<ResponseEntity<ApiResponse<ListDTO<List<EventTransactionInquiryDTO>>>>> busyProcessEventTransactionInquiry(@Valid @RequestBody EventTransactionInquiryRequestDTO request) {
        return eventTransactionInquiryService.busyProcessEventTransactionInquiry(request)
                .thenApply(ResponseEntity::ok);
    }

}
