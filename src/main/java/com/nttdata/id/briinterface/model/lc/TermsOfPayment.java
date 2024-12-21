package com.nttdata.id.briinterface.model.lc;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "TermsOfPayment")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TermsOfPayment {
	
	@JacksonXmlProperty(localName = "Tenor", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Tenor tenor;
	
	@JacksonXmlProperty(localName = "FromAfter", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 1, message = "FromAfter must be minimum and maximum 1 character")
  private String fromAfter;
	
	@JacksonXmlProperty(localName = "TenorFrom", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 222, message = "TenorFrom must be between 1 and 222 characters")
  private String tenorFrom;
	
	@JacksonXmlProperty(localName = "TenorText", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "TenorText is mandatory")
	@Size(max = 148, message = "TenorFrom must be maximum 148 characters")
  private String tenorText;
	
	@JacksonXmlProperty(localName = "TenorMaturityDate", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date tenorMaturityDate;
	
	@JacksonXmlProperty(localName = "MixedPayDtls", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "MixedPayDtls is mandatory")
	@Size(max = 148, message = "MixedPayDtls must be maximum 148 characters")
  private String mixedPayDtls;
	
	@JacksonXmlProperty(localName = "DraftsDrawnOn", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 1, message = "DraftsDrawnOn must be minimum and maximum 1 character")
  private String draftsDrawnOn;
	
	@JacksonXmlProperty(localName = "DraftsDrawnOnBank", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 175, message = "DraftsDrawnOnBank must be between 1 and 175 characters")
  private String draftsDrawnOnBank;
	
	@JacksonXmlProperty(localName = "AvailableBy", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 1, message = "AvailableBy must be minimum and maximum 1 character")
  private String availableBy;

	public Tenor getTenor() {
		return tenor;
	}

	public void setTenor(Tenor tenor) {
		this.tenor = tenor;
	}

	public String getFromAfter() {
		return fromAfter;
	}

	public void setFromAfter(String fromAfter) {
		this.fromAfter = fromAfter;
	}

	public String getTenorFrom() {
		return tenorFrom;
	}

	public void setTenorFrom(String tenorFrom) {
		this.tenorFrom = tenorFrom;
	}

	public String getTenorText() {
		return tenorText;
	}

	public void setTenorText(String tenorText) {
		this.tenorText = tenorText;
	}

	public Date getTenorMaturityDate() {
		return tenorMaturityDate;
	}

	public void setTenorMaturityDate(Date tenorMaturityDate) {
		this.tenorMaturityDate = tenorMaturityDate;
	}

	public String getMixedPayDtls() {
		return mixedPayDtls;
	}

	public void setMixedPayDtls(String mixedPayDtls) {
		this.mixedPayDtls = mixedPayDtls;
	}

	public String getDraftsDrawnOn() {
		return draftsDrawnOn;
	}

	public void setDraftsDrawnOn(String draftsDrawnOn) {
		this.draftsDrawnOn = draftsDrawnOn;
	}

	public String getDraftsDrawnOnBank() {
		return draftsDrawnOnBank;
	}

	public void setDraftsDrawnOnBank(String draftsDrawnOnBank) {
		this.draftsDrawnOnBank = draftsDrawnOnBank;
	}

	public String getAvailableBy() {
		return availableBy;
	}

	public void setAvailableBy(String availableBy) {
		this.availableBy = availableBy;
	}

}
