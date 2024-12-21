package com.nttdata.id.briinterface.dtos;

public class AccountSearchRequestDTO {
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
  private PaginationRequest pagination;

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

  public PaginationRequest getPagination() {
    return pagination;
  }

  public void setPagination(PaginationRequest pagination) {
    this.pagination = pagination;
  }
}
