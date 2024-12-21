package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "SubsidiaryMasterPrefixAndSerial")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SubsidiaryMasterPrefixAndSerial {
  @JacksonXmlProperty(localName = "MasterPrefix", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 3, message = "MasterPrefix must be between 1 and 15 characters")
  private String masterPrefix;

  @JacksonXmlProperty(localName = "MasterSerialNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private String masterSerialNumber;

  // getters and setters
  public String getMasterPrefix() {
    return masterPrefix;
  }
  public void setMasterPrefix(String masterPrefix) {
    this.masterPrefix = masterPrefix;
  }
  public String getMasterSerialNumber() {
    return masterSerialNumber;
  }
  public void setMasterSerialNumber(String masterSerialNumber) {
    this.masterSerialNumber = masterSerialNumber;
  }
}
