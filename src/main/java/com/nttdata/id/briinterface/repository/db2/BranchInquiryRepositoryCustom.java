package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import com.nttdata.id.briinterface.dtos.BranchInquiryResponseDTO;

public interface BranchInquiryRepositoryCustom {
  List<BranchInquiryResponseDTO> filterDataBranch(String cabbn, String fullName, String city, 
      Integer page, Integer size, String sortBy, String sortType);
}