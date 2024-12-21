package com.nttdata.id.briinterface.model.lc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.validation.constraints.*;

// Import LC Outstanding Claim
@JacksonXmlRootElement(localName = "TFILCPYR")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TFILCPYR {

	@JacksonXmlProperty(localName = "Context", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private Context context;

	@JacksonXmlElementWrapper(localName = "DocumentsReceiveds", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@JacksonXmlProperty(localName = "DocumentsReceived", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private List<DocumentsReceived> documentsReceiveds;

	@JacksonXmlElementWrapper(localName = "EventNotificationss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@JacksonXmlProperty(localName = "EventNotifications", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private List<EventNotifications> eventNotificationss;

	@JacksonXmlProperty(localName = "FileIdentification", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 4, max = 70, message = "FileIdentification must be between 4 and 70 characters")
	private String fileIdentification;

	@JacksonXmlElementWrapper(localName = "EmbeddedItemss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@JacksonXmlProperty(localName = "EmbeddedItems", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private List<EmbeddedItems> embeddedItemss;

	@JacksonXmlProperty(localName = "MasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 20, message = "MasterRef must be between 1 and 20 characters")
	private String masterRef;

	// @NotBlank(message = "ContinueEvent is mandatory")
	@JacksonXmlProperty(localName = "ContinueEvent", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(max = 6, message = "ContinueEvent must be maximum 6 characters")
	private String continueEvent;

	@JacksonXmlProperty(localName = "ProvisionalFlags", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private ProvisionalFlags provisionalFlags;

	@JacksonXmlProperty(localName = "ClaimId", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String claimId;

	@JacksonXmlProperty(localName = "Sender", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private Sender sender;

	// @NotBlank(message = "ResponseAction is mandatory")
	@JacksonXmlProperty(localName = "ResponseAction", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String responseAction;

	// @NotBlank(message = "ResponseType is mandatory")
	@JacksonXmlProperty(localName = "ResponseType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String responseType;

	@JacksonXmlProperty(localName = "ResponseDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "ResponseDetails is mandatory")
	private String responseDetails;

	@JacksonXmlProperty(localName = "RefusalDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String refusalDetails;

	// @NotBlank(message = "eBankMasterRef is mandatory")
	@JacksonXmlProperty(localName = "eBankMasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(max = 20, message = "eBankMasterRef must be maximum 20 characters")
	private String eBankMasterRef;

	// @NotBlank(message = "eBankEventRef is mandatory")
	@JacksonXmlProperty(localName = "eBankEventRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(max = 20, message = "eBankEventRef must be maximum 20 characters")
	private String eBankEventRef;

	@JacksonXmlProperty(localName = "AdditionalData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private AdditionalData additionalData;

	@JacksonXmlProperty(localName = "ExtraData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String extraData;

	// getters and setters

	public Context getContext() {
		return context;
	}
	public void setContext(Context context) {
		this.context = context;
	}
	public List<DocumentsReceived> getDocumentsReceiveds() {
		return documentsReceiveds;
	}
	public void setDocumentsReceiveds(List<DocumentsReceived> documentsReceiveds) {
		this.documentsReceiveds = documentsReceiveds;
	}
	public List<EventNotifications> getEventNotificationss() {
		return eventNotificationss;
	}
	public void setEventNotificationss(List<EventNotifications> eventNotificationss) {
		this.eventNotificationss = eventNotificationss;
	}
	public String getFileIdentification() {
		return fileIdentification;
	}
	public void setFileIdentification(String fileIdentification) {
		this.fileIdentification = fileIdentification;
	}
	public List<EmbeddedItems> getEmbeddedItemss() {
		return embeddedItemss;
	}
	public void setEmbeddedItemss(List<EmbeddedItems> embeddedItemss) {
		this.embeddedItemss = embeddedItemss;
	}
	public String getMasterRef() {
		return masterRef;
	}
	public void setMasterRef(String masterRef) {
		this.masterRef = masterRef;
	}
	public String getContinueEvent() {
		return continueEvent;
	}
	public void setContinueEvent(String continueEvent) {
		this.continueEvent = continueEvent;
	}
	public ProvisionalFlags getProvisionalFlags() {
		return provisionalFlags;
	}
	public void setProvisionalFlags(ProvisionalFlags provisionalFlags) {
		this.provisionalFlags = provisionalFlags;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public String getResponseAction() {
		return responseAction;
	}
	public void setResponseAction(String responseAction) {
		this.responseAction = responseAction;
	}
	public String getResponseType() {
		return responseType;
	}
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	public String getResponseDetails() {
		return responseDetails;
	}
	public void setResponseDetails(String responseDetails) {
		this.responseDetails = responseDetails;
	}
	public String getRefusalDetails() {
		return refusalDetails;
	}
	public void setRefusalDetails(String refusalDetails) {
		this.refusalDetails = refusalDetails;
	}
	public String geteBankMasterRef() {
		return eBankMasterRef;
	}
	public void seteBankMasterRef(String eBankMasterRef) {
		this.eBankMasterRef = eBankMasterRef;
	}
	public String geteBankEventRef() {
		return eBankEventRef;
	}
	public void seteBankEventRef(String eBankEventRef) {
		this.eBankEventRef = eBankEventRef;
	}
	public AdditionalData getAdditionalData() {
		return additionalData;
	}
	public void setAdditionalData(AdditionalData additionalData) {
		this.additionalData = additionalData;
	}
	public String getExtraData() {
		return extraData;
	}
	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

}