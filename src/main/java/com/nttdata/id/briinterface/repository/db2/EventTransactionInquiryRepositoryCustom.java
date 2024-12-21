package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import com.nttdata.id.briinterface.dtos.EventTransactionInquiryDTO;


public interface EventTransactionInquiryRepositoryCustom {
	
	List<EventTransactionInquiryDTO> filterEventTransaction(String masterRef, String refNoPfix, String refNoSerl, String timeStart, 
			String status, String timeFinish, String theirRef, Double amount, String ccy, String statusEV, String crossRef, String startDate, String finished,
			Integer page, Integer size, String sortBy, String sortType);

}
