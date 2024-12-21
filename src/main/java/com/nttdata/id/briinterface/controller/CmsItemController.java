package com.nttdata.id.briinterface.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nttdata.id.briinterface.model.db2.CmsItem;
import com.nttdata.id.briinterface.service.CmsItemService;

import COM.ibm.db2.app.Blob;

import java.io.InputStream;
import java.sql.SQLException;

@RestController
@RequestMapping("/api/items")
public class CmsItemController {

    @Autowired
    private CmsItemService cmsItemService;

    @GetMapping("/{itemId}/download")
    public ResponseEntity<byte[]> downloadItem(@PathVariable String itemId) {
        CmsItem cmsItem = cmsItemService.getItemById(itemId);
        if (cmsItem == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        byte[] fileContent = cmsItem.getItem();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", cmsItem.getMimeType());
        headers.set("Content-Disposition", "attachment; filename=\"" + itemId + "\"");

        return new ResponseEntity<>(fileContent, headers, HttpStatus.OK);
    }
}
