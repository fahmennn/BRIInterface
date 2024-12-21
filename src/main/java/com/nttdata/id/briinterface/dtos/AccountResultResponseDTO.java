package com.nttdata.id.briinterface.dtos;

import com.nttdata.id.briinterface.utils.TrimUtils;

public class AccountResultResponseDTO {
  private String branch;
  private String branchNumber;
  private String customer;
  private String customerNumber;
  private String categoryCode;
  private String accountType;
  private String currency;
  private String otherCurrency;
  private String backOfficeAccount;
  private String shortName;
  private String externalAccount;
  private String iban;

  // Constructor
  public AccountResultResponseDTO() {
  }

  public AccountResultResponseDTO(
      String branch,
      String branchNumber,
      String customer,
      String customerNumber,
      String categoryCode,
      String accountType,
      String currency,
      String otherCurrency,
      String backOfficeAccount,
      String shortName,
      String externalAccount,
      String iban
  ) {
    this.branch = TrimUtils.trim(branch);
    this.branchNumber = TrimUtils.trim(branchNumber);
    this.customer = TrimUtils.trim(customer);
    this.customerNumber = TrimUtils.trim(customerNumber);
    this.categoryCode = TrimUtils.trim(categoryCode);
    this.accountType = TrimUtils.trim(accountType);
    this.currency = TrimUtils.trim(currency);
    this.otherCurrency = TrimUtils.trim(otherCurrency);
    this.backOfficeAccount = TrimUtils.trim(backOfficeAccount);
    this.shortName = TrimUtils.trim(shortName);
    this.externalAccount = TrimUtils.trim(externalAccount);
    this.iban = TrimUtils.trim(iban);
  }


  // Getter & Setter
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
  }

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
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

  public String getBackOfficeAccount() {
    return backOfficeAccount;
  }

  public void setBackOfficeAccount(String backOfficeAccount) {
    this.backOfficeAccount = backOfficeAccount;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
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

}
