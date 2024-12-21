package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AmountSpec")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AmountSpec {
  @JacksonXmlProperty(localName = "Qualifier", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "Qualifier must be 1 character")
  private String qualifier;

  @JacksonXmlProperty(localName = "Min", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "Min must be 1-2 characters")
  private String min;

  @JacksonXmlProperty(localName = "Max", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "Min must be 1-2 characters")
  private String max;

  @JacksonXmlProperty(localName = "AmountMin", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Long amountMin;

  @JacksonXmlProperty(localName = "AmountMax", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Long amountMax;

  // Getter and Setter

  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public Long getAmountMin() {
    return amountMin;
  }

  public void setAmountMin(Long amountMin) {
    this.amountMin = amountMin;
  }

  public Long getAmountMax() {
    return amountMax;
  }

  public void setAmountMax(Long amountMax) {
    this.amountMax = amountMax;
  }

}