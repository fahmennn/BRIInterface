package com.nttdata.id.briinterface.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.id.briinterface.model.db2.CmsItem;
import com.nttdata.id.briinterface.repository.db2.CmsItemRepository;

@Service
public class CmsItemService {

    @Autowired
    private CmsItemRepository cmsItemRepository;

    @Transactional(readOnly = true)
    public CmsItem getItemById(String itemId) {
        return cmsItemRepository.findById(itemId).orElse(null);
    }
}