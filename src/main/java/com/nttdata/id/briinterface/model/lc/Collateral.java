package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Collateral")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Collateral {

	@JacksonXmlProperty(localName = "CollateralDetail", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private CollateralDetail collateralDetail;
	
	// getters and setters
	public CollateralDetail getCollateralDetail() {
		return collateralDetail;
	}

	public void setCollateralDetail(CollateralDetail collateralDetail) {
		this.collateralDetail = collateralDetail;
	}
	
	public static class CollateralDetail {
		
		@JacksonXmlProperty(localName = "Code", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
		@Size(min = 1, max = 8, message = "Code must be between 1 and 8 characters")
	  private String code;
		
		@JacksonXmlProperty(localName = "Description", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
		@NotBlank(message = "Description is mandatory")
		@Size(max = 25, message = "Description must be maximum 25 characters")
		private String description;
		
		@JacksonXmlProperty(localName = "Amount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	  private Long amount;
		
		@JacksonXmlProperty(localName = "Currency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
		@Size(min = 1, max = 3, message = "Code must be between 1 and 3 characters")
	private String currency;

		@JacksonXmlProperty(localName = "OtherDetailsType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
		@NotBlank(message = "OtherDetailsType is mandatory")
	  private String otherDetailsType;
	    
		@JacksonXmlProperty(localName = "CustomerDDA", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	  @NotBlank(message = "CustomerDDA is mandatory")
		@Size(max = 25, message = "Description must be maximum 25 characters")
	  private String customerDDA;
	    
		@JacksonXmlProperty(localName = "OtherPledge", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	  @NotBlank(message = "OtherPledge is mandatory")
		@Size(max = 50, message = "OtherPledge must be maximum 50 characters")
	  private String otherPledge;
	  
		@JacksonXmlProperty(localName = "OwnPledge", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	  @NotBlank(message = "OwnPledge is mandatory")
		@Size(max = 50, message = "OwnPledge must be maximum 50 characters")
	  private String ownPledge;
	    
		@JacksonXmlProperty(localName = "Surety", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	  @NotBlank(message = "Surety is mandatory")
		@Size(max = 50, message = "Surety must be maximum 50 characters")
	  private String surety;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getAmount() {
			return amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getOtherDetailsType() {
			return otherDetailsType;
		}

		public void setOtherDetailsType(String otherDetailsType) {
			this.otherDetailsType = otherDetailsType;
		}

		public String isCustomerDDA() {
			return customerDDA;
		}

		public void setCustomerDDA(String customerDDA) {
			this.customerDDA = customerDDA;
		}

		public String getOtherPledge() {
			return otherPledge;
		}

		public void setOtherPledge(String otherPledge) {
			this.otherPledge = otherPledge;
		}

		public String getOwnPledge() {
			return ownPledge;
		}

		public void setOwnPledge(String ownPledge) {
			this.ownPledge = ownPledge;
		}

		public String getSurety() {
			return surety;
		}

		public void setSurety(String surety) {
			this.surety = surety;
		}
	}
	
}
