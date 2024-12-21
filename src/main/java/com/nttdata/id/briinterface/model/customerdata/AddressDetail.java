package com.nttdata.id.briinterface.model.customerdata;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "AddressDetail")
public class AddressDetail {
    @JacksonXmlProperty(localName = "AddressType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "AddressType is mandatory")
    @Size(min = 1, max = 10, message = "AddressType must 1-10 characters")
    private String addressType;

    @JacksonXmlProperty(localName = "AddressId", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    private Integer addressId;

    @JacksonXmlProperty(localName = "Salutation", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "Salutation is mandatory")
    @Size(min = 1, max = 35, message = "Salutation must 1-35 characters")
    private String salutation;

    @JacksonXmlProperty(localName = "NameAndAddress", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "NameAndAddress is mandatory")
    @Size(min = 1, max = 70, message = "NameAndAddress must 1-70 characters")
    private String nameAndAddress;

    @JacksonXmlProperty(localName = "ZipCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 10, message = "ZipCode must 1-10 characters")
    private String zipCode;

    @JacksonXmlProperty(localName = "Language", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 2, message = "Language must 1-2 characters")
    private String language;

    @JacksonXmlProperty(localName = "Locale", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "Locale is mandatory")
    @Size(max = 6, message = "Locale 6 characters")
    private String locale;

    @JacksonXmlProperty(localName = "Phone", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 20, message = "Phone must 1-20 characters")
    private String phone;

    @JacksonXmlProperty(localName = "Fax", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 20, message = "Fax must 1-20 characters")
    private String fax;

    @JacksonXmlProperty(localName = "Telex", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 20, message = "Telex must 1-20 characters")
    private String telex;

    @JacksonXmlProperty(localName = "TelexAnswerBack", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 8, message = "TelexAnswerBack must 1-8 characters")
    private String telexAnswerBack;

    @JacksonXmlProperty(localName = "Email", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 50, message = "Email must 1-50 characters")
    private String email;

    @JacksonXmlProperty(localName = "AddresseeCustomerSBB", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 8, message = "AddresseeCustomerSBB must 1-8 characters")
    private String addresseeCustomerSBB;

    @JacksonXmlProperty(localName = "AddresseeCustomer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 20)
    private String addresseeCustomer;

    @JacksonXmlProperty(localName = "NumberOfDuplicates", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
    private Integer numberOfDuplicates;

    // getters and setters
    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getNameAndAddress() {
        return nameAndAddress;
    }

    public void setNameAndAddress(String nameAndAddress) {
        this.nameAndAddress = nameAndAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelex() {
        return telex;
    }

    public void setTelex(String telex) {
        this.telex = telex;
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

    public String getAddresseeCustomerSBB() {
        return addresseeCustomerSBB;
    }

    public void setAddresseeCustomerSBB(String addresseeCustomerSBB) {
        this.addresseeCustomerSBB = addresseeCustomerSBB;
    }

    public String getAddresseeCustomer() {
        return addresseeCustomer;
    }

    public void setAddresseeCustomer(String addresseeCustomer) {
        this.addresseeCustomer = addresseeCustomer;
    }

    public Integer getNumberOfDuplicates() {
        return numberOfDuplicates;
    }

    public void setNumberOfDuplicates(Integer numberOfDuplicates) {
        this.numberOfDuplicates = numberOfDuplicates;
    }
}
