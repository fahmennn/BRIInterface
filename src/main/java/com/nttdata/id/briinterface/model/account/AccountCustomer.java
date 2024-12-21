package com.nttdata.id.briinterface.model.account;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Customer")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AccountCustomer {
  @JacksonXmlProperty(localName = "SourceBankingBusiness", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "SourceBankingBusiness must 1-8 characters")
  private String sourceBankingBusiness;

  @JacksonXmlProperty(localName = "Mnemonic", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "Mnemonic must 1-20 characters")
  private String mnemonic;

  // Getter and Setter
  public String getSourceBankingBusiness() {
    return sourceBankingBusiness;
  }

  public void setSourceBankingBusiness(String sourceBankingBusiness) {
    this.sourceBankingBusiness = sourceBankingBusiness;
  }

  public String getMnemonic() {
    return mnemonic;
  }

  public void setMnemonic(String mnemonic) {
    this.mnemonic = mnemonic;
  }
}
