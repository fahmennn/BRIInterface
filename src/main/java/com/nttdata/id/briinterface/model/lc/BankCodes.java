package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "BankCodes")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BankCodes {
  @JacksonXmlProperty(localName = "BankCode1", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 4, message = "BankCode1 must be maximum 4 characters")
  @NotBlank(message = "BankCode1 is mandatory")
  private String bankCode1;

  @JacksonXmlProperty(localName = "BankCode2", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 4, message = "BankCode2 must be maximum 4 characters")
  @NotBlank(message = "BankCode2 is mandatory")
  private String bankCode2;

  @JacksonXmlProperty(localName = "BankCode3", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 4, message = "BankCode3 must be maximum 4 characters")
  @NotBlank(message = "BankCode3 is mandatory")
  private String bankCode3;

  @JacksonXmlProperty(localName = "BankCode4", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 4, message = "BankCode4 must be maximum 4 characters")
  @NotBlank(message = "BankCode4 is mandatory")
  private String bankCode4;

  @JacksonXmlProperty(localName = "BankCode5", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 4, message = "BankCode5 must be maximum 4 characters")
  @NotBlank(message = "BankCode5 is mandatory")
  private String bankCode5;



  // Getter and Setter

  public String getBankCode1() {
    return bankCode1;
  }

  public void setBankCode1(String bankCode1) {
    this.bankCode1 = bankCode1;
  }

  public String getBankCode2() {
    return bankCode2;
  }

  public void setBankCode2(String bankCode2) {
    this.bankCode2 = bankCode2;
  }

  public String getBankCode3() {
    return bankCode3;
  }

  public void setBankCode3(String bankCode3) {
    this.bankCode3 = bankCode3;
  }

  public String getBankCode4() {
    return bankCode4;
  }

  public void setBankCode4(String bankCode4) {
    this.bankCode4 = bankCode4;
  }

  public String getBankCode5() {
    return bankCode5;
  }

  public void setBankCode5(String bankCode5) {
    this.bankCode5 = bankCode5;
  }
}
