package com.nttdata.id.briinterface.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.id.briinterface.dtos.ReleaseItemDocumentDTO;
import com.nttdata.id.briinterface.dtos.ReleaseItemDocumentRequestDTO;
import com.nttdata.id.briinterface.service.ReleaseItemDocumentService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@RestController
public class ReleaseItemDocumentController {

    private final ReleaseItemDocumentService service;

    @Autowired
    public ReleaseItemDocumentController(ReleaseItemDocumentService service) {
        this.service = service;
    }

    @PostMapping("/release-item-documents/download")
    public ResponseEntity<byte[]> downloadReleaseItemDocumentsAsZip(@RequestBody ReleaseItemDocumentRequestDTO request) {
        List<ReleaseItemDocumentDTO> documents = service.findReleaseItemDocumentsByEventAndReference(request.getEvent(), request.getReference());

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ZipOutputStream zos = new ZipOutputStream(baos)) {

            for (ReleaseItemDocumentDTO document : documents) {
                if (document.getReference().equals(request.getReference())) {
                    String fileName = document.getReference() + "_"+ document.getEvent()+ "_"+document.getFilename()+"." + document.getFileType();
                    ZipEntry entry = new ZipEntry(fileName);
                    zos.putNextEntry(entry);
                    zos.write(document.getItem());
                    zos.closeEntry();
                }
            }

            zos.finish();

            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=test-rar.zip");

            return new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.OK);

        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}