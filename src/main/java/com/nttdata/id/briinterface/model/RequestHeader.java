package com.nttdata.id.briinterface.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "RequestHeader")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RequestHeader {
  @JacksonXmlProperty(localName = "Service")
  private String service;

  @JacksonXmlProperty(localName = "Operation")
  private String operation;

  @JacksonXmlProperty(localName = "Credentials")
  private Credentials credentials;

  @JacksonXmlProperty(localName = "ReplyFormat")
  private String replyFormat;

  @JacksonXmlProperty(localName = "ReplyTarget")
  private String replyTarget;

  @JacksonXmlProperty(localName = "TargetSystem")
  private String targetSystem;

  @JacksonXmlProperty(localName = "SourceSystem")
  private String sourceSystem;

  @JacksonXmlProperty(localName = "NoRepair")
  private String noRepair;

  @JacksonXmlProperty(localName = "NoOverride")
  private String noOverride;

  @JacksonXmlProperty(localName = "CorrelationId")
  private String correlationId;

  @JacksonXmlProperty(localName = "TransactionControl")
  private String transactionControl;

  @JacksonXmlProperty(localName = "CreationDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date creationDate;

  @JacksonXmlProperty(localName = "GroupingId")
  private String groupingId;

  // Constructor
  public RequestHeader() {
  }

  public RequestHeader(String service, String operation, Credentials credentials, String correlationId) {
    this.service = service;
    this.operation = operation;
    this.credentials = credentials;
    this.replyFormat = "";
    this.replyTarget = "";
    this.targetSystem = "NONE";
    this.sourceSystem = "NONE";
    this.noRepair = "";
    this.noOverride = "";
    this.correlationId = "";
    this.transactionControl = "NONE";
    this.creationDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = dateFormat.format(creationDate);
    this.groupingId = formattedDate + "Z";
  }


  // Getters and Setters

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public Credentials getCredentials() {
    return credentials;
  }

  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  public String getReplyFormat() {
    return replyFormat;
  }

  public void setReplyFormat(String replyFormat) {
    this.replyFormat = replyFormat;
  }

  public String getReplyTarget() {
    return replyTarget;
  }

  public void setReplyTarget(String replyTarget) {
    this.replyTarget = replyTarget;
  }

  public String getTargetSystem() {
    return targetSystem;
  }

  public void setTargetSystem(String targetSystem) {
    this.targetSystem = targetSystem;
  }

  public String getSourceSystem() {
    return sourceSystem;
  }

  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }

  public String getNoRepair() {
    return noRepair;
  }

  public void setNoRepair(String noRepair) {
    this.noRepair = noRepair;
  }

  public String getNoOverride() {
    return noOverride;
  }

  public void setNoOverride(String noOverride) {
    this.noOverride = noOverride;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public String getTransactionControl() {
    return transactionControl;
  }

  public void setTransactionControl(String transactionControl) {
    this.transactionControl = transactionControl;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }
}
