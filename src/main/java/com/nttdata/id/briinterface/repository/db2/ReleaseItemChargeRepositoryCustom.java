package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import com.nttdata.id.briinterface.dtos.ReleaseItemChargeDTO;


public interface ReleaseItemChargeRepositoryCustom {
	
	List<ReleaseItemChargeDTO> findReleaseItemCharge(String reference, String event, Integer page, Integer size, String sortBy, String sortType);

}
