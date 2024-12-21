package com.nttdata.id.briinterface.model.branch;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "BusinessHours")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BusinessHours {
  @JacksonXmlProperty(localName = "OpeningTime", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 5, message = "OpeningTime must be maximum 5 characters")
  private String openingTime;

  @JacksonXmlProperty(localName = "ClosingTime", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 5, message = "ClosingTime must be maximum 5 characters")
  private String closingTime;

  // Getter & Setter
  public String getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(String openingTime) {
    this.openingTime = openingTime;
  }

  public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }
}
