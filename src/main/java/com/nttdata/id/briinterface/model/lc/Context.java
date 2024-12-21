package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Context")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Context {
	@JacksonXmlProperty(localName = "Branch", namespace = "urn:common.service.ti.apps.tiplus2.misys .com")
	@Size(min = 1, max = 8, message = "Branch must be between 1 and 8 characters")
	private String branch;

	@JacksonXmlProperty(localName = "Customer", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 20, message = "Customer must be between 1 and 10 characters")
	private String customer;

	@JacksonXmlProperty(localName = "CustomerSwiftAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(max = 14, message = "CustomerSwiftAddress must be maximum 14 characters")
	private String customerSwiftAddress;

	@JacksonXmlProperty(localName = "Product", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "Product is mandatory")
	@Size(max = 4, message = "Product must be maximum 4 characters")
	private String product;

	@JacksonXmlProperty(localName = "Event", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "Event is mandatory")
	@Size(max = 4, message = "Event must be maximum 4 characters")
	private String event;

	@JacksonXmlProperty(localName = "OurReference", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 20, message = "OurReference must be between 1 and 10 characters")
	private String ourReference;

	@JacksonXmlProperty(localName = "TheirReference", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 34, message = "TheirReference must be between 1 and 10 characters")
	private String theirReference;

	@JacksonXmlProperty(localName = "Team", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 15, message = "Team must be between 1 and 10 characters")
	private String team;

	@JacksonXmlProperty(localName = "BehalfOfBranch", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 8, message = "BehalfOfBranch must be between 1 and 10 characters")
	private String behalfOfBranch;

	@JacksonXmlProperty(localName = "BehalfOfBranchSwiftAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "BehalfOfBranchSwiftAddress is mandatory")
	@Size(max = 14, message = "BehalfOfBranchSwiftAddress must be maximum 14 characters")
	private String behalfOfBranchSwiftAddress;

	@JacksonXmlProperty(localName = "TemplateIdentifier", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "TemplateIdentifier is mandatory")
	@Size(max = 35, message = "TemplateIdentifier must be maximum 35 characters")
	private String templateIdentifier;

	@JacksonXmlProperty(localName = "EventReference", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "EventReference is mandatory")
	@Size(max = 6, message = "eventReference must be maximum 6 characters")
	private String eventReference;

	@JacksonXmlProperty(localName = "Step", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 15, message = "Step must be between 1 and 15 characters")
	private String step;

	@JacksonXmlProperty(localName = "SubsidiaryMasterPrefixAndSerial", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	private SubsidiaryMasterPrefixAndSerial subsidiaryMasterPrefixAndSerial;

	@JacksonXmlProperty(localName = "ExchangeNonAutoComplete", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "ExchangeNonAutoComplete is mandatory")
	private boolean exchangeNonAutoComplete;

  // getters and setters

  public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCustomerSwiftAddress() {
		return customerSwiftAddress;
	}
	public void setCustomerSwiftAddress(String customerSwiftAddress) {
		this.customerSwiftAddress = customerSwiftAddress;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getOurReference() {
		return ourReference;
	}
	public void setOurReference(String ourReference) {
		this.ourReference = ourReference;
	}
	public String getTheirReference() {
		return theirReference;
	}
	public void setTheirReference(String theirReference) {
		this.theirReference = theirReference;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getBehalfOfBranch() {
		return behalfOfBranch;
	}
	public void setBehalfOfBranch(String behalfOfBranch) {
		this.behalfOfBranch = behalfOfBranch;
	}
	public String getBehalfOfBranchSwiftAddress() {
		return behalfOfBranchSwiftAddress;
	}
	public void setBehalfOfBranchSwiftAddress(String behalfOfBranchSwiftAddress) {
		this.behalfOfBranchSwiftAddress = behalfOfBranchSwiftAddress;
	}
	public String getTemplateIdentifier() {
		return templateIdentifier;
	}
	public void setTemplateIdentifier(String templateIdentifier) {
		this.templateIdentifier = templateIdentifier;
	}
	public String getEventReference() {
		return eventReference;
	}
	public void setEventReference(String eventReference) {
		this.eventReference = eventReference;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public SubsidiaryMasterPrefixAndSerial getSubsidiaryMasterPrefixAndSerial() {
		return subsidiaryMasterPrefixAndSerial;
	}
	public void setSubsidiaryMasterPrefixAndSerial(SubsidiaryMasterPrefixAndSerial subsidiaryMasterPrefixAndSerial) {
		this.subsidiaryMasterPrefixAndSerial = subsidiaryMasterPrefixAndSerial;
	}
	public boolean isExchangeNonAutoComplete() {
		return exchangeNonAutoComplete;
	}
	public void setExchangeNonAutoComplete(boolean exchangeNonAutoComplete) {
		this.exchangeNonAutoComplete = exchangeNonAutoComplete;
	}
	
}
