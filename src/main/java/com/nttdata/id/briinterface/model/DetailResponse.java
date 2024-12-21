package com.nttdata.id.briinterface.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Details")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DetailResponse {
  @JacksonXmlProperty(localName = "Error")
  @JsonProperty("Error")
  private String error;

  @JacksonXmlProperty(localName = "Warning")
  @JsonProperty("Warning")
  private String warning;

  @JacksonXmlProperty(localName = "Info")
  @JsonProperty("Info")
  private String info;

  // Constructor
  public DetailResponse(){}

  public DetailResponse(String error, String warning, String info){
    this.error = error;
    this.warning = warning;
    this.info = info;
  }


  // Getter & Setter

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}
