package com.nttdata.id.briinterface.model.lc;

import java.math.BigDecimal;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "FxContract")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FxContract {

	@JacksonXmlProperty(localName = "Reference", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 20, message = "Reference must be between 1 and 20 characters")
	private String reference;
	
	@JacksonXmlProperty(localName = "Branch", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 8, message = "Branch must be between 1 and 8 characters")
	private String branch;
	
	@JacksonXmlProperty(localName = "DealType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 3, message = "DealType must be between 1 and 3 characters")
	private String dealType;
	
	@JacksonXmlProperty(localName = "PurchaseCcy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 3, message = "PurchaseCcy must be between 1 and 3 characters")
	private String purchaseCcy;
	
	@JacksonXmlProperty(localName = "SaleCcy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 3, message = "SaleCcy must be between 1 and 3 characters")
	private String saleCcy;
	
	@JacksonXmlProperty(localName = "ExchangeRate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Digits(integer = 28, fraction = 20)
	private BigDecimal exchangeRate;

	// Getters and Setters
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDealType() {
		return dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getPurchaseCcy() {
		return purchaseCcy;
	}

	public void setPurchaseCcy(String purchaseCcy) {
		this.purchaseCcy = purchaseCcy;
	}

	public String getSaleCcy() {
		return saleCcy;
	}

	public void setSaleCcy(String saleCcy) {
		this.saleCcy = saleCcy;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
