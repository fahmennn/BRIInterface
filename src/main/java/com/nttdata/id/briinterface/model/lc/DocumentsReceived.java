package com.nttdata.id.briinterface.model.lc;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "DocumentsReceived")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DocumentsReceived {
  @JacksonXmlProperty(localName = "DocID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "DocID is mandatory")
  @Size(max = 128, message = "docID maximum 128 characters")
  private String docID;

  @JacksonXmlProperty(localName = "DMSID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "DMSID is mandatory")
  @Size(max = 35, message = "DMSID maximum 35 characters")
  private String dmsID;

  @JacksonXmlProperty(localName = "DocType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "DocType is mandatory")
  @Size(max = 3, message = "DocType maximum 3 characters")
  private String docType;

  @JacksonXmlProperty(localName = "Description", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Description is mandatory")
  @Size(max = 35, message = "Description maximum 35 characters")
  private String description;

  @JacksonXmlProperty(localName = "ReceivedDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date receivedDate;

  @JacksonXmlProperty(localName = "ReceivedTime", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ReceivedTime is mandatory")
  @Size(max = 8, message = "ReceivedTime maximum 8 characters")
  private String receivedTime;

  @JacksonXmlProperty(localName = "BankDoc", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "BankDoc is mandatory")
  private boolean bankDoc;

  @JacksonXmlProperty(localName = "BatchID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "BatchID is mandatory")
  @Size(max = 100, message = "BatchID maximum 100 characters")
  private String batchID;

  @JacksonXmlProperty(localName = "DocFaceRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "DocFaceRef is mandatory")
  @Size(max = 20, message = "DocFaceRef maximum 20 characters")
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

  // Getter & Setter

  public String getDocID() {
    return docID;
  }

  public void setDocID(String docID) {
    this.docID = docID;
  }

  public String getDmsID() {
    return dmsID;
  }

  public void setDmsID(String dmsID) {
    this.dmsID = dmsID;
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

  public Date getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(Date receivedDate) {
    this.receivedDate = receivedDate;
  }

  public String getReceivedTime() {
    return receivedTime;
  }

  public void setReceivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
  }

  public boolean isBankDoc() {
    return bankDoc;
  }

  public void setBankDoc(boolean bankDoc) {
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
