package com.nttdata.id.briinterface.model.customerdata;

import java.util.List;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "Customer")
public class Customer {

  @JacksonXmlProperty(localName = "MaintType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MaintType is mandatory")
  @Size(min = 1, max = 1, message = "MaintType must be exactly 1 character")
  private String maintType;

  @JacksonXmlProperty(localName = "MaintainedInBackOffice", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean maintainedInBackOffice;

  @JacksonXmlProperty(localName = "SourceBankingBusiness", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "SourceBankingBusiness must be between 1 and 8 characters")
  private String sourceBankingBusiness;

  @JacksonXmlProperty(localName = "Mnemonic", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "Mnemonic must be between 1 and 20 characters")
  private String mnemonic;

  @JacksonXmlProperty(localName = "CustomerNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 12, message = "CustomerNumber must be between 1 and 12 characters")
  private String customerNumber;

  @JacksonXmlProperty(localName = "CustomerType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 2, max = 8, message = "CustomerType must be between 2 and 8 characters")
  private String customerType;

  @JacksonXmlProperty(localName = "FullName", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "FullName is mandatory")
  @Size(max = 140, message = "FullName must be maximum 140 characters")
  private String fullName;

  @JacksonXmlProperty(localName = "ShortName", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 15, message = "ShortName must be between 1 and 15 characters")
  private String shortName;

  @JacksonXmlProperty(localName = "Reference", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "Reference must be between 1 and 20 characters")
  private String reference;

  @JacksonXmlProperty(localName = "DefaultBranch", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "DefaultBranch must be between 1 and 8 characters")
  private String defaultBranch;

  @JacksonXmlProperty(localName = "MailToBranch", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 8, message = "MailToBranch must be between 1 and 8 characters")
  private String mailToBranch;

  @JacksonXmlProperty(localName = "Group", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 6, message = "Group must be between 1 and 6 characters")
  private String group;

  @JacksonXmlProperty(localName = "GroupDescription", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "GroupDescription is mandatory")
  @Size(max = 35, message = "GroupDescription must be maximum 35 characters")
  private String groupDescription;

  @JacksonXmlProperty(localName = "AccountOfficer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "AccountOfficer must be between 1 and 10 characters")
  private String accountOfficer;

  @JacksonXmlProperty(localName = "ResidenceCountry", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "ResidenceCountry must be between 1 and 2 characters")
  private String residenceCountry;

  @JacksonXmlProperty(localName = "ParentCountry", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "ParentCountry must be between 1 and 2 characters")
  private String parentCountry;

  @JacksonXmlProperty(localName = "RiskCountry", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "RiskCountry must be between 1 and 2 characters")
  private String riskCountry;

  @JacksonXmlProperty(localName = "AnalysisCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "AnalysisCode must be between 1-2 characters")
  private String analysisCode;

  @JacksonXmlProperty(localName = "Language", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 2, message = "Language must be between 1 and 2 characters")
  private String language;

  @JacksonXmlProperty(localName = "Closed", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean closed;

  @JacksonXmlProperty(localName = "Blocked", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean blocked;

  @JacksonXmlProperty(localName = "Deceased", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean deceased;

  @JacksonXmlProperty(localName = "Inactive", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean inactive;

  @JacksonXmlProperty(localName = "MidasFacilityAllow", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "MidasFacilityAllow must be 1 character")
  private String midasFacilityAllow;

  @JacksonXmlProperty(localName = "BankCode1", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "BankCode1 must be between 1 and 20 characters")
  private String bankCode1;

  @JacksonXmlProperty(localName = "BankCode2", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "BankCode2 must be between 1 and 20 characters")
  private String bankCode2;

  @JacksonXmlProperty(localName = "BankCode3", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "BankCode3 must be between 1 and 10 characters")
  private String bankCode3;

  @JacksonXmlProperty(localName = "BankCode4", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "BankCode4 must be between 1 and 10 characters")
  private String bankCode4;

  @JacksonXmlProperty(localName = "ClearingId", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "ClearingId must be between 1 and 34 characters")
  private String clearingId;

  @JacksonXmlProperty(localName = "Location", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 60, message = "Location must be 1-60 characters")
  private String location;

  @JacksonXmlProperty(localName = "UsePrimeAddressForSWIFT", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean usePrimeAddressForSWIFT;

  @JacksonXmlElementWrapper(localName = "AddressDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "AddressDetail", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<AddressDetail> addressDetails;

  @JacksonXmlElementWrapper(localName = "AddOrUpdateSpecialInstructionDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "AddOrUpdateSpecialInstructionDetail")
  private List<SpecialInstuction> addOrUpdateSpecialInstructionDetails;

  @JacksonXmlProperty(localName = "OtherDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private OtherDetails otherDetails;

  @JacksonXmlProperty(localName = "SwiftDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private SwiftDetail swiftDetails;

  @JacksonXmlElementWrapper(localName = "DeleteSpecialInstructionDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "DeleteSpecialInstructionDetail")
  private List<SpecialInstuction> deleteSpecialInstructionDetails;

  @JacksonXmlProperty(localName = "CustomerExtraData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String customerExtraData;

  @JacksonXmlProperty(localName = "TICustomerExtraData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String tiCustomerExtraData;

  // Getter and Setter

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

  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public String getMailToBranch() {
    return mailToBranch;
  }

  public void setMailToBranch(String mailToBranch) {
    this.mailToBranch = mailToBranch;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getGroupDescription() {
    return groupDescription;
  }

  public void setGroupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
  }

  public String getAccountOfficer() {
    return accountOfficer;
  }

  public void setAccountOfficer(String accountOfficer) {
    this.accountOfficer = accountOfficer;
  }

  public String getResidenceCountry() {
    return residenceCountry;
  }

  public void setResidenceCountry(String residenceCountry) {
    this.residenceCountry = residenceCountry;
  }

  public String getParentCountry() {
    return parentCountry;
  }

  public void setParentCountry(String parentCountry) {
    this.parentCountry = parentCountry;
  }

  public String getRiskCountry() {
    return riskCountry;
  }

  public void setRiskCountry(String riskCountry) {
    this.riskCountry = riskCountry;
  }

  public String getAnalysisCode() {
    return analysisCode;
  }

  public void setAnalysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public Boolean getDeceased() {
    return deceased;
  }

  public void setDeceased(Boolean deceased) {
    this.deceased = deceased;
  }

  public Boolean getInactive() {
    return inactive;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  public String getMidasFacilityAllow() {
    return midasFacilityAllow;
  }

  public void setMidasFacilityAllow(String midasFacilityAllow) {
    this.midasFacilityAllow = midasFacilityAllow;
  }

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

  public String getClearingId() {
    return clearingId;
  }

  public void setClearingId(String clearingId) {
    this.clearingId = clearingId;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Boolean getUsePrimeAddressForSWIFT() {
    return usePrimeAddressForSWIFT;
  }

  public void setUsePrimeAddressForSWIFT(Boolean usePrimeAddressForSWIFT) {
    this.usePrimeAddressForSWIFT = usePrimeAddressForSWIFT;
  }

  public List<AddressDetail> getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(List<AddressDetail> addressDetails) {
    this.addressDetails = addressDetails;
  }

  public List<SpecialInstuction> getAddOrUpdateSpecialInstructionDetails() {
    return addOrUpdateSpecialInstructionDetails;
  }

  public void setAddOrUpdateSpecialInstructionDetails(List<SpecialInstuction> addOrUpdateSpecialInstructionDetails) {
    this.addOrUpdateSpecialInstructionDetails = addOrUpdateSpecialInstructionDetails;
  }

  public OtherDetails getOtherDetails() {
    return otherDetails;
  }

  public void setOtherDetails(OtherDetails otherDetails) {
    this.otherDetails = otherDetails;
  }

  public SwiftDetail getSwiftDetails() {
    return swiftDetails;
  }

  public void setSwiftDetails(SwiftDetail swiftDetails) {
    this.swiftDetails = swiftDetails;
  }

  public List<SpecialInstuction> getDeleteSpecialInstructionDetails() {
    return deleteSpecialInstructionDetails;
  }

  public void setDeleteSpecialInstructionDetails(List<SpecialInstuction> deleteSpecialInstructionDetails) {
    this.deleteSpecialInstructionDetails = deleteSpecialInstructionDetails;
  }

  public String getCustomerExtraData() {
    return customerExtraData;
  }

  public void setCustomerExtraData(String customerExtraData) {
    this.customerExtraData = customerExtraData;
  }

  public String getTiCustomerExtraData() {
    return tiCustomerExtraData;
  }

  public void setTiCustomerExtraData(String tiCustomerExtraData) {
    this.tiCustomerExtraData = tiCustomerExtraData;
  }

}
