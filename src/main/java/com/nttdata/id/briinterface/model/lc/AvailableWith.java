package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AvailableWith")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AvailableWith {
  @JacksonXmlProperty(localName = "Type", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "Type must be 1 character")
  private String type;

  @JacksonXmlProperty(localName = "Bank", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 175, message = "Bank must be between 1 and 175 characters")
  private String bank;

  @JacksonXmlProperty(localName = "Ctry", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "Ctry must be 2 characters")
  private String ctry;

  @JacksonXmlProperty(localName = "City", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "City must be between 1 and 35 characters")
  private String city;

  // Getter and Setter

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public String getCtry() {
    return ctry;
  }

  public void setCtry(String ctry) {
    this.ctry = ctry;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
