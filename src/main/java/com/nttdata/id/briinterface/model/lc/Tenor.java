package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Tenor")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Tenor {
  @JacksonXmlProperty(localName = "TenorDays", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Integer tenorDays;
  
  @JacksonXmlProperty(localName = "TenorPeriod", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "TenorPeriod must be minimum and maximum 1 character")
  private String tenorPeriod;
  
  // Getter and Setter
  public Integer getTenorDays() {
    return tenorDays;
  }

  public void setTenorDays(Integer tenorDays) {
    this.tenorDays = tenorDays;
  }

  public String getTenorPeriod() {
    return tenorPeriod;
  }

  public void setTenorPeriod(String tenorPeriod) {
    this.tenorPeriod = tenorPeriod;
  }
}
