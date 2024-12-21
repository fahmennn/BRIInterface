package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "SpecialPaymentConditions")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SpecialPaymentConditions {
  @JacksonXmlProperty(localName = "ForBeneficiary", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 53600, message = "ForBeneficiary must be maximum 53600 characters")
  @NotBlank(message = "ForBeneficiary is mandatory")
  private String forBeneficiary;

  @JacksonXmlProperty(localName = "ForReceivingBank", namespace = "urn:common.service.ti.apps.tiplus2.misys.com") 
  @Size(max = 53600, message = "ForBeneficiary must be maximum 53600 characters")
  @NotBlank(message = "ForReceivingBank is mandatory")
  private String forReceivingBank;

  // Getter and Setter

  public String getForBeneficiary() {
    return forBeneficiary;
  }

  public void setForBeneficiary(String forBeneficiary) {
    this.forBeneficiary = forBeneficiary;
  }

  public String getForReceivingBank() {
    return forReceivingBank;
  }

  public void setForReceivingBank(String forReceivingBank) {
    this.forReceivingBank = forReceivingBank;
  }
}
