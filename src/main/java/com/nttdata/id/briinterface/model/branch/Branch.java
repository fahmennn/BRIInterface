package com.nttdata.id.briinterface.model.branch;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "Branch")
public class Branch {
  @JacksonXmlProperty(localName = "MaintType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MaintType is mandatory")
  @Size(max = 1, message = "MaintType must be maximum 1 character")
  private String maintType;

  @JacksonXmlProperty(localName = "MaintainedInBackOffice", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean maintainedInBackOffice;

  @JacksonXmlProperty(localName = "Code", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "Code must be between 1-8 characters")
  private String code;

  @JacksonXmlProperty(localName = "BranchNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 4, max = 4, message = "BranchNumber must be manimum and maximum 4 characters")
  private String branchNumber;

  @JacksonXmlProperty(localName = "MainBankingEntity", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "MainBankingEntity must be between 1-8 characters")
  private String mainBankingEntity;

  @JacksonXmlProperty(localName = "ParentBranch", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "ParentBranch must be between 1-8 characters")
  private String parentBranch;

  @JacksonXmlProperty(localName = "BankingGroup", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotNull(message = "BankingGroup is mandatory")
  private Boolean bankingGroup;

  @JacksonXmlProperty(localName = "BankingBusiness", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotNull(message = "BankingBusiness is mandatory")
  private Boolean bankingBusiness;

  @JacksonXmlProperty(localName = "AutonomousBankingEntity", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotNull(message = "AutonomousBankingEntity is mandatory")
  private Boolean autonomousBankingEntity;

  @JacksonXmlProperty(localName = "NonTransactionBranch", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotNull(message = "NonTransactionBranch is mandatory")
  private Boolean nonTransactionBranch;

  @JacksonXmlProperty(localName = "IsMainBankingEntity", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotNull(message = "IsMainBankingEntity is mandatory")
  private Boolean isMainBankingEntity;

  @JacksonXmlProperty(localName = "InternalCustomerMnemonic", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "InternalCustomerMnemonic must be between 1-20 characters")
  private String internalCustomerMnemonic;

  @JacksonXmlProperty(localName = "BaseCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 3, message = "BaseCurrency must be between 1-3 characters")
  private String baseCurrency;

  @JacksonXmlProperty(localName = "ExchangeRateFormat", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ExchangeRateFormat is mandatory")
  @Size(max = 3, message = "ExchangeRateFormat must be maximum 3 characters")
  private String exchangeRateFormat;

  @JacksonXmlProperty(localName = "ExchangeRateTolerance", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer exchangeRateTolerance;

  @JacksonXmlProperty(localName = "LocalCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 3, message = "LocalCurrency must be between 1-3 characters")
  private String localCurrency;

  @JacksonXmlProperty(localName = "SwiftAddress", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "SwiftAddress is mandatory")
  @Size(max = 14, message = "SwiftAddress must be maximum 14 characters")
  private String swiftAddress;

  @JacksonXmlProperty(localName = "IsSwiftGPIMember", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "IsSwiftGPIMember must be minimum and maximum 1 character")
  private String isSwiftGPIMember;

  @JacksonXmlProperty(localName = "BranchFurtherId", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "BranchFurtherId must be between 1-35 characters")
  private String branchFurtherId;

  @JacksonXmlProperty(localName = "EntityType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "EntityType is mandatory")
  @Size(max = 20, message = "EntityType must be maximum 20 characters")
  private String entityType;

  @JacksonXmlProperty(localName = "SwiftSenderBranchType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "SwiftSenderBranchType must be minimum and maximum 1 character")
  private String swiftSenderBranchType;

  @JacksonXmlProperty(localName = "Country", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "Country must be between 1-2 characters")
  private String country;

  @JacksonXmlProperty(localName = "TimeZone", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "TimeZone is mandatory")
  @Size(max = 100, message = "TimeZone must be maximum 100 characters")
  private String timeZone;

  @JacksonXmlProperty(localName = "InheritContactDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotNull(message = "InheritContactDetails is mandatory")
  private Boolean inheritContactDetails;

  @JacksonXmlProperty(localName = "ContactDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private ContactDetails contactDetails;

  @JacksonXmlProperty(localName = "AddressDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AddressDetails addressDetails;

  @JacksonXmlProperty(localName = "BusinessHours", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private BusinessHours businessHours;

  // Getter & Setter

  public String getMaintType() {
    return maintType;
  }

  public void setMaintType(String maintType) {
    this.maintType = maintType;
  }

  public Boolean getMaintainedInBackOffice() {
    return maintainedInBackOffice;
  }

  public void setMaintainedInBackOffice(Boolean maintainedInBackOffice) {
    this.maintainedInBackOffice = maintainedInBackOffice;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
  }

  public String getMainBankingEntity() {
    return mainBankingEntity;
  }

  public void setMainBankingEntity(String mainBankingEntity) {
    this.mainBankingEntity = mainBankingEntity;
  }

  public String getParentBranch() {
    return parentBranch;
  }

  public void setParentBranch(String parentBranch) {
    this.parentBranch = parentBranch;
  }

  public Boolean getBankingGroup() {
    return bankingGroup;
  }

  public void setBankingGroup(Boolean bankingGroup) {
    this.bankingGroup = bankingGroup;
  }

  public Boolean getBankingBusiness() {
    return bankingBusiness;
  }

  public void setBankingBusiness(Boolean bankingBusiness) {
    this.bankingBusiness = bankingBusiness;
  }

  public Boolean getAutonomousBankingEntity() {
    return autonomousBankingEntity;
  }

  public void setAutonomousBankingEntity(Boolean autonomousBankingEntity) {
    this.autonomousBankingEntity = autonomousBankingEntity;
  }

  public Boolean getNonTransactionBranch() {
    return nonTransactionBranch;
  }

  public void setNonTransactionBranch(Boolean nonTransactionBranch) {
    this.nonTransactionBranch = nonTransactionBranch;
  }

  public Boolean getIsMainBankingEntity() {
    return isMainBankingEntity;
  }

  public void setIsMainBankingEntity(Boolean isMainBankingEntity) {
    this.isMainBankingEntity = isMainBankingEntity;
  }

  public String getInternalCustomerMnemonic() {
    return internalCustomerMnemonic;
  }

  public void setInternalCustomerMnemonic(String internalCustomerMnemonic) {
    this.internalCustomerMnemonic = internalCustomerMnemonic;
  }

  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public String getExchangeRateFormat() {
    return exchangeRateFormat;
  }

  public void setExchangeRateFormat(String exchangeRateFormat) {
    this.exchangeRateFormat = exchangeRateFormat;
  }

  public Integer getExchangeRateTolerance() {
    return exchangeRateTolerance;
  }

  public void setExchangeRateTolerance(Integer exchangeRateTolerance) {
    this.exchangeRateTolerance = exchangeRateTolerance;
  }

  public String getLocalCurrency() {
    return localCurrency;
  }

  public void setLocalCurrency(String localCurrency) {
    this.localCurrency = localCurrency;
  }

  public String getSwiftAddress() {
    return swiftAddress;
  }

  public void setSwiftAddress(String swiftAddress) {
    this.swiftAddress = swiftAddress;
  }

  public String getIsSwiftGPIMember() {
    return isSwiftGPIMember;
  }

  public void setIsSwiftGPIMember(String isSwiftGPIMember) {
    this.isSwiftGPIMember = isSwiftGPIMember;
  }

  public String getBranchFurtherId() {
    return branchFurtherId;
  }

  public void setBranchFurtherId(String branchFurtherId) {
    this.branchFurtherId = branchFurtherId;
  }

  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getSwiftSenderBranchType() {
    return swiftSenderBranchType;
  }

  public void setSwiftSenderBranchType(String swiftSenderBranchType) {
    this.swiftSenderBranchType = swiftSenderBranchType;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Boolean getInheritContactDetails() {
    return inheritContactDetails;
  }

  public void setInheritContactDetails(Boolean inheritContactDetails) {
    this.inheritContactDetails = inheritContactDetails;
  }

  public ContactDetails getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  public AddressDetails getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
  }

  public BusinessHours getBusinessHours() {
    return businessHours;
  }

  public void setBusinessHours(BusinessHours businessHours) {
    this.businessHours = businessHours;
  }
}
