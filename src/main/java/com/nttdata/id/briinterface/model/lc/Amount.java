package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Amount")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Amount {
  @JacksonXmlProperty(localName = "Amount", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 22, message = "Amount must be maximum 22 characters")
  @NotBlank(message = "Amount is mandatory")
  private String amount;

  @JacksonXmlProperty(localName = "Currency", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 3, message = "Currency must be maximum 3 characters")
  private String currency;

  // Getter & Setter

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
}
