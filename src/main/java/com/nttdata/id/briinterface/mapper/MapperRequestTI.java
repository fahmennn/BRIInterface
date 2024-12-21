package com.nttdata.id.briinterface.mapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.nttdata.id.briinterface.model.RequestHeader;

@JacksonXmlRootElement(localName = "ServiceRequest")
public class MapperRequestTI<T> {
  
  @JacksonXmlProperty(localName = "RequestHeader")
  private RequestHeader requestHeader; 
  
  @JacksonXmlProperty(localName = "RequestBody", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private T body;

  // Constructor

  public MapperRequestTI() {
  }

  public MapperRequestTI(T body, RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
    this.body = body;
  }

  // Getter and Setter

  public RequestHeader getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }

  public T getBody() {
    return body;
  }

  public void setBody(T body) {
    this.body = body;
  }

}
  