package com.nttdata.id.briinterface.model.branch;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContactDetails {
  @JacksonXmlProperty(localName = "EmailAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "EmailAddress is mandatory")
  @Size(max = 128, message = "EmailAddress must be maximum 128 characters")
  private String emailAddress;

  @JacksonXmlProperty(localName = "TelephoneNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "TelephoneNumber must be between 1-20 characters")
  private String telephoneNumber;

  @JacksonXmlProperty(localName = "FaxNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "FaxNumber must be between 1-20 characters")
  private String faxNumber;

  @JacksonXmlProperty(localName = "TelexNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "TelexNumber must be between 1-20 characters")
  private String telexNumber;

  @JacksonXmlProperty(localName = "TelexAnswerBack", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "TelexAnswerBack must be between 1-8 characters")
  private String telexAnswerBack;

  // Getter & Setter
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public String getTelexNumber() {
    return telexNumber;
  }

  public void setTelexNumber(String telexNumber) {
    this.telexNumber = telexNumber;
  }

  public String getTelexAnswerBack() {
    return telexAnswerBack;
  }

  public void setTelexAnswerBack(String telexAnswerBack) {
    this.telexAnswerBack = telexAnswerBack;
  }
}
