package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import com.nttdata.id.briinterface.dtos.MasterResponseDTO;

public interface MasterRepositoryCustom {
  List<MasterResponseDTO> filterDataMaster(
    String status,
    String orig_ref,
    String inputBrn,
    String bhalfBrn,
    String expiryDat,
    Double amount,
    String ccy,
    String ctrctDate,
    String relMstrRef,
    Long prodtype,
    Long primaryCus,
    String masterRef,
    String pricustsbb,
    String pricustmnm,
    String preRef,
    String canPrnRef,
    String nprRef,
    String cannPrnRef,
    String nprCustSbb,
    String nprCustMnm,
    String nprNameL1,
    String pcpSwBic,
    String npcSwBic,
    String startCtrcDate,
    String endCtrcDate,
    Integer page,
    Integer size,
    String sortBy,
    String sortType
  );
}

