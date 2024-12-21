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
import com.nttdata.id.briinterface.dtos.ListDTO;
import com.nttdata.id.briinterface.dtos.ReleaseItemChargeDTO;
import com.nttdata.id.briinterface.dtos.ReleaseItemChargeRequestDTO;
import com.nttdata.id.briinterface.service.ReleaseItemChargeService;

@RestController
@RequestMapping("/api/v2.9.2.6/release-item")
public class ReleaseItemChargeController {
	
	private final ReleaseItemChargeService releaseItemChargeService;

    @Autowired
    public ReleaseItemChargeController(ReleaseItemChargeService releaseItemChargeService) {
        this.releaseItemChargeService = releaseItemChargeService;
    }
    
    @PostMapping(value = "/charge/inquiry", consumes = "application/json", produces = "application/json")
    public CompletableFuture<ResponseEntity<ApiResponse<ListDTO<List<ReleaseItemChargeDTO>>>>> busyProcessReleaseItemChargeInquiry(@Valid @RequestBody ReleaseItemChargeRequestDTO request) {
        return releaseItemChargeService.busyProcessReleaseItemChargeInquiry(request)
                .thenApply(ResponseEntity::ok);
    }

}
