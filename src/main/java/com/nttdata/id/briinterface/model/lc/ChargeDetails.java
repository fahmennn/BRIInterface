package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ChargeDetails")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChargeDetails {
  
  @JacksonXmlProperty(localName = "BillingAutomatedInvoices", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean billingAutomatedInvoices;

  @JacksonXmlProperty(localName = "DebitCustomerAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private DebitCustomerAddress debitCustomerAddress;


  public static class DebitCustomerAddress {

    @JacksonXmlProperty(localName = "AddressType", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @Size(max = 10, message = "AddressType must be maximum 10 characters")
    @NotBlank(message = "AddressType is mandatory")
    private String addressType;

    @JacksonXmlProperty(localName = "AddressSequence", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    private Integer addressSequence;

    // Getter & Setter

    public String getAddressType() {
      return addressType;
    }

    public void setAddressType(String addressType) {
      this.addressType = addressType;
    }

    public Integer getAddressSequence() {
      return addressSequence;
    }

    public void setAddressSequence(Integer addressSequence) {
      this.addressSequence = addressSequence;
    }
  }

  // Getter & Setter

  public Boolean getBillingAutomatedInvoices() {
    return billingAutomatedInvoices;
  }

  public void setBillingAutomatedInvoices(Boolean billingAutomatedInvoices) {
    this.billingAutomatedInvoices = billingAutomatedInvoices;
  }

  public DebitCustomerAddress getDebitCustomerAddress() {
    return debitCustomerAddress;
  }

  public void setDebitCustomerAddress(DebitCustomerAddress debitCustomerAddress) {
    this.debitCustomerAddress = debitCustomerAddress;
  }
}
