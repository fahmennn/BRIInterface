package com.nttdata.id.briinterface.controller;

import java.util.concurrent.CompletableFuture;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.dtos.MasterRequestDTO;
import com.nttdata.id.briinterface.dtos.ResponseDataDTO;
import com.nttdata.id.briinterface.service.MasterService;

@RestController
@RequestMapping("/api/v2.9.2.6/datamaster")
public class MasterController {

  private final MasterService masterService;

  @Autowired
  public MasterController(MasterService masterService) {
    this.masterService = masterService;
  }

  @PostMapping("/mastertransaction")
  public CompletableFuture<ResponseEntity<ApiResponse<ResponseDataDTO>>> masterTransaction(@Valid @RequestBody MasterRequestDTO request) {
    return masterService.masterTransactionalByReference(request).thenApply(ResponseEntity::ok);
  }
}
