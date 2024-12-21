package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Customer")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Customer {
  @JacksonXmlProperty(localName = "Customer", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 20, message = "Customer must be maximum 20 characters")
  private String customer;

  @JacksonXmlProperty(localName = "NameAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 1024, message = "NameAddress must be maximum 1024 characters")
  @NotBlank(message = "NameAddress is mandatory")
  private String nameAddress;

  @JacksonXmlProperty(localName = "SwiftAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 14, message = "SwiftAddress must be maximum 14 characters")
  private String swiftAddress;

  @JacksonXmlProperty(localName = "Reference", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 34, message = "Reference must be maximum 34 characters")
  private String reference;

  @JacksonXmlProperty(localName = "Contact", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 35, message = "Contact must be maximum 35 characters")
  @NotBlank(message = "Contact is mandatory")
  private String contact;

  @JacksonXmlProperty(localName = "ZipCode", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 15, message = "ZipCode must be maximum 15 characters")
  private String zipCode;

  @JacksonXmlProperty(localName = "Telephone", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 20, message = "Telephone must be maximum 20 characters")
  private String telephone;

  @JacksonXmlProperty(localName = "FaxNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 20, message = "FaxNumber must be maximum 20 characters")
  private String faxNumber;

  @JacksonXmlProperty(localName = "TelexNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 20, message = "TelexNumber must be maximum 20 characters")
  private String telexNumber;

  @JacksonXmlProperty(localName = "Country", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 2, message = "Country must be maximum 2 characters")
  private String country;

  @JacksonXmlProperty(localName = "TelexAnswerBack", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 8, message = "TelexAnswerBack must be maximum 8 characters")
  private String telexAnswerBack;

  @JacksonXmlProperty(localName = "Email", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 128, message = "Email must be maximum 128 characters")
  @NotBlank(message = "Email is mandatory")
  private String email;

  @JacksonXmlProperty(localName = "Language", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(max = 2, message = "Language must be maximum 2 characters")
  private String language;

  // Getters and Setters
  public String getCustomer() {
      return customer;
  }

  public void setCustomer(String customer) {
      this.customer = customer;
  }

  public String getNameAddress() {
      return nameAddress;
  }

  public void setNameAddress(String nameAddress) {
      this.nameAddress = nameAddress;
  }

  public String getSwiftAddress() {
      return swiftAddress;
  }

  public void setSwiftAddress(String swiftAddress) {
      this.swiftAddress = swiftAddress;
  }

  public String getReference() {
      return reference;
  }

  public void setReference(String reference) {
      this.reference = reference;
  }

  public String getContact() {
      return contact;
  }

  public void setContact(String contact) {
      this.contact = contact;
  }

  public String getZipCode() {
      return zipCode;
  }

  public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
  }

  public String getTelephone() {
      return telephone;
  }

  public void setTelephone(String telephone) {
      this.telephone = telephone;
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

  public String getCountry() {
      return country;
  }

  public void setCountry(String country) {
      this.country = country;
  }

  public String getTelexAnswerBack() {
      return telexAnswerBack;
  }

  public void setTelexAnswerBack(String telexAnswerBack) {
      this.telexAnswerBack = telexAnswerBack;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getLanguage() {
      return language;
  }

  public void setLanguage(String language) {
      this.language = language;
  }
}
