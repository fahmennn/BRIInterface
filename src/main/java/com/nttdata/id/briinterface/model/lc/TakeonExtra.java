package com.nttdata.id.briinterface.model.lc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "PurchaseOrderss")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TakeonExtra {
	
	@JacksonXmlProperty(localName = "LastAmendmentNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Integer lastAmendmentNumber;
	
	@JacksonXmlProperty(localName = "LastPaymentNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Integer lastPaymentNumber;

	public Integer getLastAmendmentNumber() {
		return lastAmendmentNumber;
	}

	public void setLastAmendmentNumber(Integer lastAmendmentNumber) {
		this.lastAmendmentNumber = lastAmendmentNumber;
	}

	public Integer getLastPaymentNumber() {
		return lastPaymentNumber;
	}

	public void setLastPaymentNumber(Integer lastPaymentNumber) {
		this.lastPaymentNumber = lastPaymentNumber;
	}
	
}
