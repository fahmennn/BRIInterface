package com.nttdata.id.briinterface.model.account;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AccountSearchResult")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AccountSearchResult {
    @JacksonXmlProperty(localName = "Branch", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 8, message = "Branch must be 1-8 characters")
    private String branch;

    @JacksonXmlProperty(localName = "BranchNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 4, max = 4, message = "Branch Number must be 4 characters")
    private String branchNumber;

    @JacksonXmlProperty(localName = "Customer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 20, message = "Customer must be 1-20 characters")
    private String customer;

    @JacksonXmlProperty(localName = "CustomerNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 12, message = "Customer Number must be 1-12 characters")
    private String customerNumber;

    @JacksonXmlProperty(localName = "SystemParameter", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 6, message = "System Parameter must be 1-6 characters")
    private String systemParameter;

    @JacksonXmlProperty(localName = "ChargeCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 2, max = 2, message = "Charge Code must be 2 characters")
    private String chargeCode;

    @JacksonXmlProperty(localName = "CategoryCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 20, message = "Category Code must be 1-20 characters")
    private String categoryCode;

    @JacksonXmlProperty(localName = "AccountType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "Account Type is Mandatory!")
    private String accountType;

    @JacksonXmlProperty(localName = "Currency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 3, message = "Currency must be 1-3 characters")
    private String currency;

    @JacksonXmlProperty(localName = "OtherCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 3, message = "Other Currency must be 1-3 characters")
    private String otherCurrency;

    @JacksonXmlProperty(localName = "BackOfficeAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 34, message = "Back Office Account must be 1-34 characters")
    private String backOfficeAccount;

    @JacksonXmlProperty(localName = "ShortName", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 15, message = "Short Name must be 1-15 characters")
    private String shortName;

    @JacksonXmlProperty(localName = "ExternalAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 34, message = "External Account must be 1-34 characters")
    private String externalAccount;

    @JacksonXmlProperty(localName = "IBAN", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 34, message = "IBAN must be 1-34 characters")
    private String iban;

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

    public String getSystemParameter() {
        return systemParameter;
    }

    public void setSystemParameter(String systemParameter) {
        this.systemParameter = systemParameter;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
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