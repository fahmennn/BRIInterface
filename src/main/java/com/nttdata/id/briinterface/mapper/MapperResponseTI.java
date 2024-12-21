package com.nttdata.id.briinterface.mapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.nttdata.id.briinterface.model.ResponseHeader;

@JacksonXmlRootElement(localName = "ServiceResponse")
public class MapperResponseTI<T> {
  
  @JacksonXmlProperty(localName = "ResponseHeader")
  private ResponseHeader responseHeader;

  @JacksonXmlProperty(localName = "ResponseBody", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private T responseBody;

  // Getter and Setter

  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public T getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(T responseBody) {
    this.responseBody = responseBody;
  }
}
