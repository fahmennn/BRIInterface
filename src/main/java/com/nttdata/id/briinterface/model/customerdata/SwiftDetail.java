package com.nttdata.id.briinterface.model.customerdata;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "SwiftDetail")
public class SwiftDetail {

    @JacksonXmlProperty(localName = "MainBankingEntity", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 8, message = "MainBankingEntity must be 1-8 characters")
    private String mainBankingEntity;

    @JacksonXmlProperty(localName = "SwiftAddress", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "SwiftAddress cannot be blank")
    @Size(max = 14, message = "SwiftAddress must be maximum 14 characters")
    private String swiftAddress;

    @JacksonXmlProperty(localName = "Authenticated", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "Authenticated cannot be blank")
    @Size(min = 1, max = 1, message = "Authenticated must be 1 character")
    private String authenticated;

    @JacksonXmlProperty(localName = "Blocked", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "Blocked cannot be blank")
    @Size(min = 1, max = 1, message = "Blocked must be 1 character")
    private String blocked;

    @JacksonXmlProperty(localName = "Closed", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "Closed cannot be blank")
    @Size(min = 1, max = 1, message = "Closed must be 1 character")
    private String closed;

    @JacksonXmlProperty(localName = "TransliterationRequired", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "TransliterationRequired cannot be blank")
    @Size(min = 1, max = 1, message = "TransliterationRequired must be 1 character")
    private String transliterationRequired;

    // Getter and Setter
    public String getMainBankingEntity() {
        return mainBankingEntity;
    }

    public void setMainBankingEntity(String mainBankingEntity) {
        this.mainBankingEntity = mainBankingEntity;
    }

    public String getSwiftAddress() {
        return swiftAddress;
    }

    public void setSwiftAddress(String swiftAddress) {
        this.swiftAddress = swiftAddress;
    }

    public String getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(String authenticated) {
        this.authenticated = authenticated;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getTransliterationRequired() {
        return transliterationRequired;
    }

    public void setTransliterationRequired(String transliterationRequired) {
        this.transliterationRequired = transliterationRequired;
    }
}
