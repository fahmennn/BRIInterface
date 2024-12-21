package com.nttdata.id.briinterface.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ResponseHeader")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResponseHeader {
  @JacksonXmlProperty(localName = "Service")
  private String service;

  @JacksonXmlProperty(localName = "Operation")
  private String operation;

  @JacksonXmlProperty(localName = "Status")
  private String status;

  @JacksonXmlProperty(localName = "Details")
  private DetailResponse details;

  @JacksonXmlProperty(localName = "CorrelationId")
  private String correlationId;

  @JacksonXmlProperty(localName = "TargetSystem")
  private String targetSystem;

  @JacksonXmlProperty(localName = "SourceSystem")
  private String sourceSystem;

  // Constructor
  public ResponseHeader(){}

  public ResponseHeader(String service, String operation, String status, DetailResponse details, String correlationId, String targetSystem, String sourceSystem){
    this.service = service;
    this.operation = operation;
    this.status = status;
    this.details = details;
    this.correlationId = correlationId;
    this.targetSystem = targetSystem;
    this.sourceSystem = sourceSystem;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DetailResponse getDetails() {
    return details;
  }

  public void setDetails(DetailResponse detail) {
    this.details = detail;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public String getTargetSystemlString() {
    return targetSystem;
  }

  public void setTargetSystemlString(String targetSystemlString) {
    this.targetSystem = targetSystemlString;
  }

  public String getSourceSystem() {
    return sourceSystem;
  }

  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }
}
