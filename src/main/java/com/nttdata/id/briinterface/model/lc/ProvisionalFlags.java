package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ProvisionalFlags")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProvisionalFlags {
	
	@JsonProperty("isProvisional")
	@JacksonXmlProperty(localName = "IsProvisional", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private boolean provisional;

	@JacksonXmlProperty(localName = "AutoCreateContinuationEvent", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "AutoCreateContinuationEvent is mandatory")
  private boolean autoCreateContinuationEvent;

	
  // Getter and Setter
	public boolean isProvisional() {
		return provisional;
	}

	public void setProvisional(boolean provisional) {
		this.provisional = provisional;
	}

	public boolean isAutoCreateContinuationEvent() {
		return autoCreateContinuationEvent;
	}

	public void setAutoCreateContinuationEvent(boolean autoCreateContinuationEvent) {
		this.autoCreateContinuationEvent = autoCreateContinuationEvent;
	}

}
