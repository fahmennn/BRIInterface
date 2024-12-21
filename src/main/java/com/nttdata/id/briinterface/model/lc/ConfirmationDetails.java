package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ConfirmationDetails")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class  ConfirmationDetails {
  @JacksonXmlProperty(localName = "ConfirmationCharges", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1 ,max = 1, message = "ConfirmationCharges must be maximum 1 characters")
  private String confirmationCharges;

  @JacksonXmlProperty(localName = "RequestedConfirmationParty", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Customer requestedConfirmationParty;
  
  @JacksonXmlProperty(localName = "RequestedConfirmationPartyRole", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 3, message = "RequestedConfirmationPartyRole must be maximum 3 characters")
  @NotBlank(message = "RequestedConfirmationPartyRole is mandatory")
  private String requestedConfirmationPartyRole;

  // Getter & Setter

  public String getConfirmationCharges() {
    return confirmationCharges;
  }

  public void setConfirmationCharges(String confirmationCharges) {
    this.confirmationCharges = confirmationCharges;
  }

  public Customer getRequestedConfirmationParty() {
    return requestedConfirmationParty;
  }

  public void setRequestedConfirmationParty(Customer requestedConfirmationParty) {
    this.requestedConfirmationParty = requestedConfirmationParty;
  }

  public String getRequestedConfirmationPartyRole() {
    return requestedConfirmationPartyRole;
  }

  public void setRequestedConfirmationPartyRole(String requestedConfirmationPartyRole) {
    this.requestedConfirmationPartyRole = requestedConfirmationPartyRole;
  }
}
