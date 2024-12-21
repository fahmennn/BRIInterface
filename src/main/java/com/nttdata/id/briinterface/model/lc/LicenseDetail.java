package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "LicenseDetail")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LicenseDetail {

	@JacksonXmlProperty(localName = "OurReference", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 20, message = "OurReference must be between 1 and 20 characters")
	private String ourReference;
	
	@JacksonXmlProperty(localName = "EBankMasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "EBankMasterRef is mandatory")
	@Size(max = 20, message = "EBankMasterRef must be maximum 20 characters")
	private String eBankMasterRef;
	
	@JacksonXmlProperty(localName = "AuthorityReference", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "AuthorityReference is mandatory")
	@Size(max = 35, message = "AuthorityReference must be maximum 35 characters")
	private String authorityReference;
	
	@JacksonXmlProperty(localName = "Number", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "Number is mandatory")
	@Size(max = 35, message = "Number must be maximum 35 characters")
	private String number;
	
	@JacksonXmlProperty(localName = "AllocatedAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "AllocatedAmount is mandatory")
	@Size(max = 22, message = "AllocatedAmount must be maximum 35 characters")
	private String allocatedAmount;
	
	@JacksonXmlProperty(localName = "AllocatedCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 3, message = "AllocatedCurrency must be between 1 and 3 characters")
	private String allocatedCurrency;

	// Getters and Setters
	
	public String getOurReference() {
		return ourReference;
	}

	public void setOurReference(String ourReference) {
		this.ourReference = ourReference;
	}

	public String geteBankMasterRef() {
		return eBankMasterRef;
	}

	public void seteBankMasterRef(String eBankMasterRef) {
		this.eBankMasterRef = eBankMasterRef;
	}

	public String getAuthorityReference() {
		return authorityReference;
	}

	public void setAuthorityReference(String authorityReference) {
		this.authorityReference = authorityReference;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAllocatedAmount() {
		return allocatedAmount;
	}

	public void setAllocatedAmount(String allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}

	public String getAllocatedCurrency() {
		return allocatedCurrency;
	}

	public void setAllocatedCurrency(String allocatedCurrency) {
		this.allocatedCurrency = allocatedCurrency;
	}


}
