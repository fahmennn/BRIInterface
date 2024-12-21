package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "DraftsDrawnByDetails")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DraftsDrawnByDetails {

	@JacksonXmlProperty(localName = "WhoDraftsDrawnBy", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 1, message = "WhoDraftsDrawnBy must be minimum and maximum 1 character")
	private String whoDraftsDrawnBy;
	
	@JacksonXmlProperty(localName = "DraftsDrawnBy", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	private Customer draftsDrawnBy;

	public String getWhoDraftsDrawnBy() {
		return whoDraftsDrawnBy;
	}

	public void setWhoDraftsDrawnBy(String whoDraftsDrawnBy) {
		this.whoDraftsDrawnBy = whoDraftsDrawnBy;
	}

	public Customer getDraftsDrawnBy() {
		return draftsDrawnBy;
	}

	public void setDraftsDrawnBy(Customer draftsDrawnBy) {
		this.draftsDrawnBy = draftsDrawnBy;
	}
	
}
