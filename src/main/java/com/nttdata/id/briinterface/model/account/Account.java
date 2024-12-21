package com.nttdata.id.briinterface.model.account;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Account")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Account {
  // Untuk mainType tipe Insert = A, untuk Update = F
  @JacksonXmlProperty(localName = "MaintType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MaintType is required")
  @Size(max = 1, message = "MaintType must be maximum 1 character")
  private String maintType;

  @JacksonXmlProperty(localName = "MaintainedInBackOffice", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String maintainedInBackOffice;

  @JacksonXmlProperty(localName = "BackOfficeAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "BackOfficeAccount must be 1-34 characters")
  private String backOfficeAccount;

  @JacksonXmlProperty(localName = "Branch", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "Branch must be 1-8 characters")
  private String branch;

  @JacksonXmlProperty(localName = "Customer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AccountCustomer customer;

  @JacksonXmlProperty(localName = "CategoryCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 20, message = "CategoryCode must be maximum 20 characters")
  private String categoryCode;

  @JacksonXmlProperty(localName = "AccountType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 10, message = "AccountType must be maximum 10 characters")
  private String accountType;

  @JacksonXmlProperty(localName = "Currency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 3, message = "Currency must be maximum 3 characters")
  private String currency;

  @JacksonXmlProperty(localName = "OtherCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 3, message = "OtherCurrency must be maximum 3 characters")
  private String otherCurrency;

  @JacksonXmlProperty(localName = "ExternalAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 34, message = "ExternalAccount must be maximum 34 characters")
  private String externalAccount;

  @JacksonXmlProperty(localName = "IBAN", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 34, message = "IBAN must be maximum 34 characters")
  private String iban;

  @JacksonXmlProperty(localName = "ShortName", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 15, message = "ShortName must be maximum 15 characters")
  private String shortName;

  @JacksonXmlProperty(localName = "Country", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String country;

  @JacksonXmlProperty(localName = "ContingentAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String contingentAccount;

  @JacksonXmlProperty(localName = "InternalAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String internalAccount;

  @JacksonXmlProperty(localName = "DateOpened", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dateOpened;

  @JacksonXmlProperty(localName = "DateMaintained", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dateMaintained;

  @JacksonXmlProperty(localName = "DateClosed", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dateClosed;

  @JacksonXmlProperty(localName = "Description1", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 35, message = "Description1 must be maximum 35 characters")
  private String description1;

  @JacksonXmlProperty(localName = "Description2", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 35, message = "Description2 must be maximum 35 characters")
  private String description2;

  @JacksonXmlProperty(localName = "PreferredAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String preferredAccount;

  @JacksonXmlElementWrapper(localName = "SpecialInstructions", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "SpecialInstruction", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<SpecialInstuction> specialInstructions;

  @JacksonXmlProperty(localName = "AccountKey", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "AccountKey must 1-34 characters")
  private String accountKey;

  @JacksonXmlProperty(localName = "AccountIdentifier", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 50, message = "AccountIdentifier must be 1-50 characters")
  private String accountIdentifier;

  // Getter and Setter
  public String getMaintType() {
    return maintType;
  }

  public void setMaintType(String maintType) {
    this.maintType = maintType;
  }

  public String getMaintainedInBackOffice() {
    return maintainedInBackOffice;
  }

  public void setMaintainedInBackOffice(String maintainedInBackOffice) {
    this.maintainedInBackOffice = maintainedInBackOffice;
  }

  public String getBackOfficeAccount() {
    return backOfficeAccount;
  }

  public void setBackOfficeAccount(String backOfficeAccount) {
    this.backOfficeAccount = backOfficeAccount;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public AccountCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(AccountCustomer customer) {
    this.customer = customer;
  }

  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getOtherCurrency() {
    return otherCurrency;
  }

  public void setOtherCurrency(String otherCurrency) {
    this.otherCurrency = otherCurrency;
  }

  public String getExternalAccount() {
    return externalAccount;
  }

  public void setExternalAccount(String externalAccount) {
    this.externalAccount = externalAccount;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getContingentAccount() {
    return contingentAccount;
  }

  public void setContingentAccount(String contingentAccount) {
    this.contingentAccount = contingentAccount;
  }

  public String getInternalAccount() {
    return internalAccount;
  }

  public void setInternalAccount(String internalAccount) {
    this.internalAccount = internalAccount;
  }

  public Date getDateOpened() {
    return dateOpened;
  }

  public void setDateOpened(Date dateOpened) {
    this.dateOpened = dateOpened;
  }

  public Date getDateMaintained() {
    return dateMaintained;
  }

  public void setDateMaintained(Date dateMaintained) {
    this.dateMaintained = dateMaintained;
  }

  public Date getDateClosed() {
    return dateClosed;
  }

  public void setDateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
  }

  public String getDescription1() {
    return description1;
  }

  public void setDescription1(String description1) {
    this.description1 = description1;
  }

  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public String getPreferredAccount() {
    return preferredAccount;
  }

  public void setPreferredAccount(String preferredAccount) {
    this.preferredAccount = preferredAccount;
  }

  public String getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }

  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public List<SpecialInstuction> getSpecialInstructions() {
    return specialInstructions;
  }

  public void setSpecialInstructions(List<SpecialInstuction> specialInstructions) {
    this.specialInstructions = specialInstructions;
  }
}