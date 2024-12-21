package com.nttdata.id.briinterface.model.customerdata;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "OtherDetails")
public class OtherDetails {

  @JacksonXmlProperty(localName = "AllowMT103C", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean allowMT103C;

  @JacksonXmlProperty(localName = "CutOffAmount", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private CutoffAmount cutoffAmount;

  @JacksonXmlProperty(localName = "SWIFTAckRequired", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean swiftAckRequired;

  @JacksonXmlProperty(localName = "TransliterateSWIFT", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean transliterateSWIFT;

  @JacksonXmlProperty(localName = "Team", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 15, message = "Team must be 1-15 characters")
  private String team;

  @JacksonXmlProperty(localName = "CorporateAccessMappings", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private CorporateAccessMappings corporateAccessMappings;

  @JacksonXmlProperty(localName = "CorporateAccess", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "CorporateAccess cannot be blank")
  @Size(max = 20, message = "CorporateAccess must be maximum 20 characters")
  private String corporateAccess;

  @JacksonXmlProperty(localName = "PrincipalFxRateCode", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "PrincipalFxRateCode must be 1-10 characters")
  private String principalFxRateCode;
  
  @JacksonXmlProperty(localName = "ChargeFxRateCode", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "ChargeFxRateCode must be 1-10 characters")
  private String chargeFxRateCode;

  @JacksonXmlProperty(localName = "ChargeGroup", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min =1, max = 6, message = "ChargeGroup must be 1-6 characters")
  private String chargeGroup;
  
  @JacksonXmlProperty(localName = "AllowTaxExemptions", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean allowTaxExemptions;

  @JacksonXmlProperty(localName = "Suspended", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean suspended;
  
  @JacksonXmlProperty(localName = "CutoffFxRateCode", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 6, message = "CutoffFxRateCode must be 1-6 characters")
  private String cutoffFxRateCode;
  
  @JacksonXmlProperty(localName = "AllowInterestConsolidation", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean allowInterestConsolidation;
  
  @JacksonXmlProperty(localName = "SWIFTScoreEnabled", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean swiftScoreEnabled;
  
  @JacksonXmlProperty(localName = "DocumentPreparationService", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "DocumentPreparationService must be 1 character")
  private String documentPreparationService;
  
  public static class CutoffAmount {
    @JacksonXmlProperty(localName = "Amount", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "Amount is mandatory")
    @Size(max = 22, message = "Amount must be maximum 22 characters")
    private String amount;

    @JacksonXmlProperty(localName = "Currency", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @Size(min = 1, max = 3, message = "Currency must be 1-3 characters")
    private String currency;

    // Getters and setters
    public String getAmount() {
      return amount;
    }

    public void setAmount(String amount) {
      this.amount = amount;
    }

    public String getCurrency() {
      return currency;
    } 

    public void setCurrency(String currency) {
      this.currency = currency;
    }
  }

  public static class CorporateAccessMappings {
    @JacksonXmlProperty(localName = "ID", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @NotBlank(message = "ID cannot be blank")
    @Size(max = 20, message = "ID must be maximum 20 characters")
    private String id;
  
    // Getters and setters
    public String getId() {
      return id;
    }
  
    public void setId(String id) {
      this.id = id;
    }
  }

  // Getter and Setter
  public Boolean getAllowMT103C() {
    return allowMT103C;
  }

  public void setAllowMT103C(Boolean allowMT103C) {
    this.allowMT103C = allowMT103C;
  }

  public CutoffAmount getCutoffAmount() {
    return cutoffAmount;
  }

  public void setCutoffAmount(CutoffAmount cutoffAmount) {
    this.cutoffAmount = cutoffAmount;
  }

  public Boolean getSwiftAckRequired() {
    return swiftAckRequired;
  }

  public void setSwiftAckRequired(Boolean swiftAckRequired) {
    this.swiftAckRequired = swiftAckRequired;
  }

  public Boolean getTransliterateSWIFT() {
    return transliterateSWIFT;
  }

  public void setTransliterateSWIFT(Boolean transliterateSWIFT){
    this.transliterateSWIFT = transliterateSWIFT;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public CorporateAccessMappings getCorporateAccessMappings() {
    return corporateAccessMappings;
  }

  public void setCorporateAccessMappings(CorporateAccessMappings corporateAccessMappings) {
    this.corporateAccessMappings = corporateAccessMappings;
  }

  public String getCorporateAccess() {
    return corporateAccess;
  }

  public void setCorporateAccess(String corporateAccess) {
    this.corporateAccess = corporateAccess;
  }

  public String getPrincipalFxRateCode() {
    return principalFxRateCode;
  }

  public void setPrincipalFxRateCode(String principalFxRateCode) {
    this.principalFxRateCode = principalFxRateCode;
  }

  public String getChargeFxRateCode() {
    return chargeFxRateCode;
  }

  public void setChargeFxRateCode(String chargeFxRateCode) {
    this.chargeFxRateCode = chargeFxRateCode;
  }

  public String getChargeGroup() {
    return chargeGroup;
  }

  public void setChargeGroup(String chargeGroup) {
    this.chargeGroup = chargeGroup;
  }

  public Boolean getAllowTaxExemptions() {
    return allowTaxExemptions;
  }

  public void setAllowTaxExemptions(Boolean allowTaxExemptions) {
    this.allowTaxExemptions = allowTaxExemptions;
  }

  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public String getCutoffFxRateCode() {
    return cutoffFxRateCode;
  }

  public void setCutoffFxRateCode(String cutoffFxRateCode) {
    this.cutoffFxRateCode = cutoffFxRateCode;
  }

  public Boolean getAllowInterestConsolidation() {
    return allowInterestConsolidation;
  }

  public void setAllowInterestConsolidation(Boolean allowInterestConsolidation) {
    this.allowInterestConsolidation = allowInterestConsolidation;
  }

  public Boolean getSwiftScoreEnabled() {
    return swiftScoreEnabled;
  }

  public void setSwiftScoreEnabled(Boolean swiftScoreEnabled) {
    this.swiftScoreEnabled = swiftScoreEnabled;
  }

  public String getDocumentPreparationService() {
    return documentPreparationService;
  }

  public void setDocumentPreparationService(String documentPreparationService) {
    this.documentPreparationService = documentPreparationService;
  }
}
