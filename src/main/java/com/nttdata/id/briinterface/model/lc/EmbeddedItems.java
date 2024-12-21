package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "EmbeddedItems")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EmbeddedItems {
  @JacksonXmlProperty(localName = "ID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ID is mandatory")
  @Size(max = 128, message = "ID maximum 128 characters")
  private String id;
  
  @JacksonXmlProperty(localName = "AttachType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "AttachType is mandatory")
  @Size(max = 35, message = "AttachType maximum 35 characters")
  private String attachType;
  
  @JacksonXmlProperty(localName = "DocType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "DocType is mandatory")
  @Size(max = 3, message = "DocType maximum 3 characters")
  private String docType;
  
  @JacksonXmlProperty(localName = "Description", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Description is mandatory")
  @Size(max = 35, message = "Description maximum 35 characters")
  private String description;
  
  @JacksonXmlProperty(localName = "FileName", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "FileName is mandatory")
    private String fileName;
  
  @JacksonXmlProperty(localName = "DataStream", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "DataStream is mandatory")
  private String dataStream;
  
  @JacksonXmlProperty(localName = "MimeType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MimeType is mandatory")
  @Size(max = 128, message = "MimeType maximum 128 characters")
  private String mimeType;
  
  @JacksonXmlProperty(localName = "BankDoc", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "BankDoc is mandatory")
  private Boolean bankDoc;
  
  @JacksonXmlProperty(localName = "BatchID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "BatchID is mandatory")
  @Size(max = 32, message = "BatchID maximum 32 characters")
  private String batchID;
  
  @JacksonXmlProperty(localName = "DocFaceRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "DocFaceRef is mandatory")
  @Size(max = 32, message = "DocFaceRef maximum 32 characters")
    private String docFaceRef;
  
  @JacksonXmlProperty(localName = "FirstMail", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "FirstMail is mandatory")
  @Size(max = 20, message = "FirstMail maximum 20 characters")
  private String firstMail;
  
  @JacksonXmlProperty(localName = "SecondMail", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "SecondMail is mandatory")
  @Size(max = 20, message = "SecondMail maximum 20 characters")
  private String secondMail;
  
  @JacksonXmlProperty(localName = "MailingTotal", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MailingTotal is mandatory")
  @Size(max = 20, message = "MailingTotal maximum 20 characters")
  private String mailingTotal;

  // getters and setters
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getAttachType() {
    return attachType;
  }
  public void setAttachType(String attachType) {
    this.attachType = attachType;
  }
  public String getDocType() {
    return docType;
  }
  public void setDocType(String docType) {
    this.docType = docType;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  public String getDataStream() {
    return dataStream;
  }
  public void setDataStream(String dataStream) {
    this.dataStream = dataStream;
  }
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }
  public Boolean isBankDoc() {
    return bankDoc;
  }
  public void setBankDoc(Boolean bankDoc) {
    this.bankDoc = bankDoc;
  }
  public String getBatchID() {
    return batchID;
  }
  public void setBatchID(String batchID) {
    this.batchID = batchID;
  }
  public String getDocFaceRef() {
    return docFaceRef;
  }
  public void setDocFaceRef(String docFaceRef) {
    this.docFaceRef = docFaceRef;
  }
  public String getFirstMail() {
    return firstMail;
  }
  public void setFirstMail(String firstMail) {
    this.firstMail = firstMail;
  }
  public String getSecondMail() {
    return secondMail;
  }
  public void setSecondMail(String secondMail) {
    this.secondMail = secondMail;
  }
  public String getMailingTotal() {
    return mailingTotal;
  }
  public void setMailingTotal(String mailingTotal) {
    this.mailingTotal = mailingTotal;
  }
}
