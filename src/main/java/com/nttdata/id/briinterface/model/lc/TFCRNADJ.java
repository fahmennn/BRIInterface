package com.nttdata.id.briinterface.model.lc;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.validation.constraints.*;

// Export LC Adjust/TFCRNADJ
@JacksonXmlRootElement(localName = "TFCRNADJ")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TFCRNADJ {		

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

	@JacksonXmlProperty(localName = "ContinueEvent", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "ContinueEvent is mandatory")
	@Size(max = 6, message = "ContinueEvent must be maximum 6 characters")
	private String continueEvent;

	@JacksonXmlProperty(localName = "ProvisionalFlags", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private ProvisionalFlags provisionalFlags;

	@JacksonXmlProperty(localName = "TheirRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String theirRef;

	@JacksonXmlProperty(localName = "eBankMasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "eBankMasterRef is mandatory")
	@Size(max = 20, message = "eBankMasterRef must be maximum 20 characters")
	private String eBankMasterRef;

	@JacksonXmlProperty(localName = "eBankEventRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "eBankEventRef is mandatory")
	@Size(max = 20, message = "eBankEventRef must be maximum 20 characters")
	private String eBankEventRef;

	@JacksonXmlProperty(localName = "Programme", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String programme;

	@JacksonXmlProperty(localName = "Seller", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String seller;

	@JacksonXmlProperty(localName = "Buyer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String buyer;

	@JacksonXmlProperty(localName = "AnchorParty", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String anchorParty;

	@JacksonXmlProperty(localName = "ReceivedOn", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date receivedOn;

	@JacksonXmlProperty(localName = "CreditNoteAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private Amount creditNoteAmount;

	@JacksonXmlProperty(localName = "IssueDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date issueDate;

	@JacksonXmlProperty(localName = "ReasonsForIssuance", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String reasonsForIssuance;

	@JacksonXmlProperty(localName = "ReceivedFrom", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String receivedFrom;

	@JacksonXmlProperty(localName = "CreditNoteReceivedOn", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date creditNoteReceivedOn;

	@JacksonXmlProperty(localName = "AdjustmentDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date adjustmentDate;

	@JacksonXmlProperty(localName = "AdjustmentNarrative", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String adjustmentNarrative;

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

	public String getTheirRef() {
		return theirRef;
	}

	public void setTheirRef(String theirRef) {
		this.theirRef = theirRef;
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

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getAnchorParty() {
		return anchorParty;
	}

	public void setAnchorParty(String anchorParty) {
		this.anchorParty = anchorParty;
	}

	public Date getReceivedOn() {
		return receivedOn;
	}

	public void setReceivedOn(Date receivedOn) {
		this.receivedOn = receivedOn;
	}

	public Amount getCreditNoteAmount() {
		return creditNoteAmount;
	}

	public void setCreditNoteAmount(Amount creditNoteAmount) {
		this.creditNoteAmount = creditNoteAmount;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getReasonsForIssuance() {
		return reasonsForIssuance;
	}

	public void setReasonsForIssuance(String reasonsForIssuance) {
		this.reasonsForIssuance = reasonsForIssuance;
	}

	public String getReceivedFrom() {
		return receivedFrom;
	}

	public void setReceivedFrom(String receivedFrom) {
		this.receivedFrom = receivedFrom;
	}

	public Date getCreditNoteReceivedOn() {
		return creditNoteReceivedOn;
	}

	public void setCreditNoteReceivedOn(Date creditNoteReceivedOn) {
		this.creditNoteReceivedOn = creditNoteReceivedOn;
	}

	public Date getAdjustmentDate() {
		return adjustmentDate;
	}

	public void setAdjustmentDate(Date adjustmentDate) {
		this.adjustmentDate = adjustmentDate;
	}

	public String getAdjustmentNarrative() {
		return adjustmentNarrative;
	}

	public void setAdjustmentNarrative(String adjustmentNarrative) {
		this.adjustmentNarrative = adjustmentNarrative;
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