package com.nttdata.id.briinterface.model.customerdata;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "CustomerSearchResult")
public class CustomerSearchResult {

    @JacksonXmlProperty(localName = "CustomerMnemonic", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 20, message = "CustomerMnemonic must be 1-20 characters")
    private String customerMnemonic;

    @JacksonXmlProperty(localName = "FullName", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "FullName is mandatory")
    @Size(max = 35, message = "FullName maximum 35 characters")
    private String fullName;

    @JacksonXmlProperty(localName = "CustomerNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 12, message = "CustomerNumber must be 1-12 characters")
    private String customerNumber;

    @JacksonXmlProperty(localName = "CountryOfResidence", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 2, message = "CountryOfResidence must be 1-2 characters")
    private String countryOfResidence;

    @JacksonXmlProperty(localName = "AccountOfficer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 10, message = "AccountOfficer must be 1-10 characters")
    private String accountOfficer;

    @JacksonXmlProperty(localName = "Blocked", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    private Boolean blocked;

    @JacksonXmlProperty(localName = "Group", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 6, message = "Group must be 1-6 characters")
    private String group;

    @JacksonXmlProperty(localName = "Location", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 60, message = "Location must be 1-60 characters")
    private String location;

    // getters and setters

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

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
