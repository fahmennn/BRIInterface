package com.nttdata.id.briinterface.model.lc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.validation.constraints.*;

// Export LC Correspondence
@JacksonXmlRootElement(localName = "TFELCCOR")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TFELCCOR {
	
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

	@JacksonXmlProperty(localName = "Sender", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private Sender sender;

	@JacksonXmlProperty(localName = "Subject", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String subject;

	@JacksonXmlProperty(localName = "CorresType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String corresType;

	@JacksonXmlProperty(localName = "EventFurtherID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String eventFurtherID;

	@JacksonXmlProperty(localName = "ExtraInformation", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String extraInformation;

	@JacksonXmlProperty(localName = "RelatedRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String relatedRef;

	@JacksonXmlProperty(localName = "MessageText", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String messageText;

	@JacksonXmlProperty(localName = "RelatedInformation", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String relatedInformation;

	@JacksonXmlProperty(localName = "eBankMasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "eBankMasterRef is mandatory")
	@Size(max = 20, message = "eBankMasterRef must be maximum 20 characters")
	private String eBankMasterRef;

	@JacksonXmlProperty(localName = "eBankEventRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "eBankEventRef is mandatory")
	@Size(max = 20, message = "eBankEventRef must be maximum 20 characters")
	private String eBankEventRef;

	@JacksonXmlProperty(localName = "eBankCorpRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "eBankCorpRef is mandatory")
	@Size(max = 20, message = "eBankCorpRef must be maximum 20 characters")
	private String eBankCorpRef;

	@JacksonXmlProperty(localName = "FormOfUndertaking", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String formOfUndertaking;

	@JacksonXmlProperty(localName = "Function", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String function;

	@JacksonXmlProperty(localName = "Narrative", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	private String narrative;

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

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCorresType() {
		return corresType;
	}

	public void setCorresType(String corresType) {
		this.corresType = corresType;
	}

	public String getEventFurtherID() {
		return eventFurtherID;
	}

	public void setEventFurtherID(String eventFurtherID) {
		this.eventFurtherID = eventFurtherID;
	}

	public String getExtraInformation() {
		return extraInformation;
	}

	public void setExtraInformation(String extraInformation) {
		this.extraInformation = extraInformation;
	}

	public String getRelatedRef() {
		return relatedRef;
	}

	public void setRelatedRef(String relatedRef) {
		this.relatedRef = relatedRef;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getRelatedInformation() {
		return relatedInformation;
	}

	public void setRelatedInformation(String relatedInformation) {
		this.relatedInformation = relatedInformation;
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

	public String geteBankCorpRef() {
		return eBankCorpRef;
	}

	public void seteBankCorpRef(String eBankCorpRef) {
		this.eBankCorpRef = eBankCorpRef;
	}

	public String getFormOfUndertaking() {
		return formOfUndertaking;
	}

	public void setFormOfUndertaking(String formOfUndertaking) {
		this.formOfUndertaking = formOfUndertaking;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
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
