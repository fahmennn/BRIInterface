package com.nttdata.id.briinterface.model.branch;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AddressDetails {
  @JacksonXmlProperty(localName = "FullName", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "FullName is mandatory")
  @Size(max = 140, message = "FullName must be maximum 140 characters")
  private String fullName;

  @JacksonXmlProperty(localName = "NameAndAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "NameAndAddress is mandatory")
  @Size(max = 1024, message = "NameAndAddress must be maximum 1024 characters")
  private String nameAndAddress;

  @JacksonXmlProperty(localName = "City", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "City must be between 1-35 characters")
  private String city;

  @JacksonXmlProperty(localName = "Zip", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 15, message = "Zip must be between 1-15 characters")
  private String zip;
  
  // Getter & Setter
  
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getNameAndAddress() {
    return nameAndAddress;
  }

  public void setNameAndAddress(String nameAndAddress) {
    this.nameAndAddress = nameAndAddress;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }
}
