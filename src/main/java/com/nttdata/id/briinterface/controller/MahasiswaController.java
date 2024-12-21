package com.nttdata.id.briinterface.controller;

import com.nttdata.id.briinterface.model.Mahasiswa;
import com.nttdata.id.briinterface.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.concurrent .CompletableFuture;

@RestController
@RequestMapping("/api/mahasiswa")
public class MahasiswaController {

    private final MahasiswaService mahasiswaService;

    @Autowired
    public MahasiswaController(@Lazy MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @PostMapping(value = "/busyinquiry", consumes = "application/json", produces = "application/json")
    public CompletableFuture<ResponseEntity<Mahasiswa>> busyInquiryMahasiswa(@Valid @RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.busyProcessInquiry(mahasiswa)
                .thenApply(ResponseEntity::ok);
    }

    @PostMapping(value = "/idleinquiry", consumes = "application/json", produces = "application/json")
    public CompletableFuture<ResponseEntity<Mahasiswa>> idleInquiryMahasiswa(@Valid @RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.idleProcessInquiry(mahasiswa)
                .thenApply(ResponseEntity::ok);
    }
}