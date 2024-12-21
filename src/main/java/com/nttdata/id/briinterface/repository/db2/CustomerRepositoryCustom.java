package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import com.nttdata.id.briinterface.dtos.CustomerSearchRequestDTO;
import com.nttdata.id.briinterface.dtos.CustomerSearchResponseDTO;

public interface CustomerRepositoryCustom {
  List<CustomerSearchResponseDTO> customerSearchInquiry(CustomerSearchRequestDTO request);
}
