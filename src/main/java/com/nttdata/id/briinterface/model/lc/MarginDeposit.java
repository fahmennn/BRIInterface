package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "MarginDeposit")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MarginDeposit {
  @JacksonXmlProperty(localName = "AmountFieldCode", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 3, max = 10, message = "AmountFieldCode must be between 3 and 10 characters")
  private String amountFieldCode;

  @JacksonXmlProperty(localName = "Account", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "Account must be between 1 and 34 characters")
  private String account;

  @JacksonXmlProperty(localName = "Code", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "Code must be between 1 and 8 characters")
  private String code;

  @JacksonXmlProperty(localName = "Description", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Description is mandatory")
  @Size(max = 140, message = "Description must be maximum 140 characters")
  private String description;

  @JacksonXmlProperty(localName = "MarginAmount", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Amount marginAmount;

  @JacksonXmlProperty(localName = "Percentage" , namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Digits(integer = 15, fraction = 2, message = "Percentage must have up to 15 digits before the decimal and 2 digits after the decimal")
  private Double percentage;

  // Getter & Setter

  public String getAmountFieldCode() {
    return amountFieldCode;
  }

  public void setAmountFieldCode(String amountFieldCode) {
    this.amountFieldCode = amountFieldCode;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Amount getMarginAmount() {
    return marginAmount;
  }

  public void setMarginAmount(Amount marginAmount) {
    this.marginAmount = marginAmount;
  }

  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

}
