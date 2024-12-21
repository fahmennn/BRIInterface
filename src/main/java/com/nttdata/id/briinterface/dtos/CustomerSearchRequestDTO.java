package com.nttdata.id.briinterface.dtos;

public class CustomerSearchRequestDTO {
  private String customerMnemonic;
  private String fullName;
  private String customerNumber;
  private String countryOfResidence;
  private String accountOfficer;
  private String blocked;
  private String customerGroup;
  private String location;
  private PaginationRequest pagination;

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

  public PaginationRequest getPagination() {
    return pagination;
  }

  public void setPagination(PaginationRequest pagination) {
    this.pagination = pagination;
  }
}
