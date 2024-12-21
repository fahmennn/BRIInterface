package com.nttdata.id.briinterface.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.id.briinterface.dtos.ReleaseItemDocumentDTO;
import com.nttdata.id.briinterface.repository.db2.CmsMetaRepository;
//import com.nttdata.id.briinterface.repository.db2.ReleaseItemDocumentRepository;

import java.util.List;

@Service
public class ReleaseItemDocumentService {

    private final CmsMetaRepository repository;

    @Autowired
    public ReleaseItemDocumentService(CmsMetaRepository repository) {
        this.repository = repository;
    }

    public List<ReleaseItemDocumentDTO> findReleaseItemDocumentsByEventAndReference(String event, String reference) {
        return repository.findReleaseItemDocumentsByEventAndReference(event,reference);
    }
}