package com.nttdata.id.briinterface.dtos;

import com.nttdata.id.briinterface.utils.TrimUtils;

public class CustomerSearchResponseDTO {
  private String customerMnemonic;
  private String fullName;
  private String customerNumber;
  private String countryOfResidence;
  private String accountOfficer;
  private String blocked;
  private String customerGroup;
  private String location;

  // Constructor
  public CustomerSearchResponseDTO(String customerMnemonic, String fullName, String customerNumber, String countryOfResidence, String accountOfficer, String blocked, String customerGroup, String location) {
    this.customerMnemonic = TrimUtils.trim(customerMnemonic);
    this.fullName = TrimUtils.trim(fullName);
    this.customerNumber = TrimUtils.trim(customerNumber);
    this.countryOfResidence = TrimUtils.trim(countryOfResidence);
    this.accountOfficer = TrimUtils.trim(accountOfficer);
    this.blocked = TrimUtils.trim(blocked);
    this.customerGroup = TrimUtils.trim(customerGroup);
    this.location = TrimUtils.trim(location);
  }

  public CustomerSearchResponseDTO(){
  }

  // Getter & Setter

  public String getCustomerMnemonic() {
    return customerMnemonic;
  }

  public void setCustomerMnemonic(String customerMnemonic) {
    this.customerMnemonic = customerMnemonic;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public String getCountryOfResidence() {
    return countryOfResidence;
  }

  public void setCountryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
  }

  public String getAccountOfficer() {
    return accountOfficer;
  }

  public void setAccountOfficer(String accountOfficer) {
    this.accountOfficer = accountOfficer;
  }

  public String getBlocked() {
    return blocked;
  }

  public void setBlocked(String blocked) {
    this.blocked = blocked;
  }

  public String getCustomerGroup() {
    return customerGroup;
  }

  public void setCustomerGroup(String customerGroup) {
    this.customerGroup = customerGroup;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

}
