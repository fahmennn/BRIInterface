package com.nttdata.id.briinterface.model.lc;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

// Export LC Advise
@JacksonXmlRootElement(localName = "TFELCNEW")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TFELCNEW {

  @JacksonXmlProperty(localName = "Context", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Context context;

  @JacksonXmlElementWrapper(localName = "DocumentsReceiveds", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "DocumentsReceived", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<DocumentsReceived> documentsReceiveds;

  @JacksonXmlElementWrapper(localName = "EventNotificationss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "EventNotifications", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<EventNotifications> eventNotificationss;

  @JacksonXmlProperty(localName = "FileIdentification", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 4, max = 70, message = "FileIdentification must be 4-70 characters")
  private String fileIdentification;

  @JacksonXmlElementWrapper(localName = "EmbeddedItemss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "EmbeddedItems", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<EmbeddedItems> embeddedItemss;

  @JacksonXmlProperty(localName = "MasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "MasterRef must be 1-20 characters")
  private String masterRef;

  @JacksonXmlProperty(localName = "ContinueEvent", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 6, message = "ContinueEvent must be maximum 6 characters")
  private String continueEvent;

  @JacksonXmlProperty(localName = "ProvisionalFlags", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private ProvisionalFlags provisionalFlags;

  @JacksonXmlProperty(localName = "AddAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount addAmount;

  @JacksonXmlProperty(localName = "AddAmountText", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 804, message = "AddAmountText must be maximum 804 characters")
  @NotBlank(message = "AddAmountText is mandatory")
  private String addAmountText;

  @JacksonXmlProperty(localName = "AdditionalConditions", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 53600, message = "AdditionalConditions must be maximum 53600 characters")
  @NotBlank(message = "AdditionalConditions is mandatory")
  private String additionalConditions;

  @JacksonXmlProperty(localName = "SpecialPaymentConditions", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private SpecialPaymentConditions specialPaymentConditions;

  @JacksonXmlProperty(localName = "AdviseThru", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer adviseThru;

  @JacksonXmlProperty(localName = "AdviseThruAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "AdviseThruAccount must be 1-35 characters")
  private String adviseThruAccount;

  @JacksonXmlProperty(localName = "NextAdvisingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer nextAdvisingBank;

  @JacksonXmlProperty(localName = "ApplicableRules", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "ApplicableRules must be 1 character")
  private String applicableRules;

  @JacksonXmlProperty(localName =  "ApplicableRulesNarrative", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 35, message = "ApplicableRulesNarrative must be maximum 35 characters")
  private String applicableRulesNarrative;

  @JacksonXmlProperty(localName = "Applicant", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer applicant;

  @JacksonXmlProperty(localName = "ApplicantInstructions", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 32000, message = "ApplicantInstructions must be maximum 32000 characters")
  private String applicantInstructions;

  @JacksonXmlProperty(localName = "ApplicantBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer applicantBank;

  @JacksonXmlProperty(localName = "AdviseDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date adviseDate;

  @JacksonXmlProperty(localName = "AvailableWith", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AvailableWith availableWith;

  @JacksonXmlProperty(localName = "BankCodes", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private BankCodes bankCodes;

  @JacksonXmlProperty(localName = "BenAccNo", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "BenAccNo must be 1-34 characters")
  private String benAccNo;

  @JacksonXmlProperty(localName = "Beneficiary", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer beneficiary;

  @JacksonXmlProperty(localName = "ConfirmationDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private ConfirmationDetails confirmationDetails;

  @JacksonXmlProperty(localName = "ChargeAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "ChargeAccount must be 1-34 characters")
  private String chargeAccount;

  @JacksonXmlProperty(localName = "ChargeDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private ChargeDetails chargeDetails;

  @JacksonXmlProperty(localName = "ChargeText", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ChargeText is mandatory")
  @Size(max = 222, message = "ChargeText must be maximum 222 characters")
  private String chargeText;

  @JacksonXmlProperty(localName = "OtherBankConfirmation", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "OtherBankConfirmation must be between 1 and 1 character")
  private String otherBankConfirmation;

  @JacksonXmlProperty(localName = "Confirmation", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "Confirmation must be between 1 and 1 character")
  private String confirmation;

  @JacksonXmlProperty(localName = "Documents", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Documents is mandatory")
  @Size(max = 53600, message = "Documents must be maximum 53600 characters")
  private String documents;

  @JacksonXmlProperty(localName = "DomesticExpiry", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean domesticExpiry;

  @JacksonXmlProperty(localName = "ExpiryDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Date expiryDate;

  @JacksonXmlProperty(localName = "ExpiryPlace", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 29, message = "ExpiryPlace must be between 1 and 29 characters")
  private String expiryPlace;

  @JacksonXmlProperty(localName = "FreightPrepaid", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "FreightPrepaid must be between 1 and 1 character")
  private String freightPrepaid;

  @JacksonXmlProperty(localName = "Goods", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Goods is mandatory")
  @Size(max = 53600, message = "Goods must be maximum 53600 characters")
  private String goods;

  @JacksonXmlProperty(localName = "GoodsCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "GoodsCode must be between 1 and 10 characters")
  private String goodsCode;

  @JacksonXmlProperty(localName = "IncoTerms", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 3, message = "IncoTerms must be between 1 and 3 characters")
  private String incoTerms;

  @JacksonXmlProperty(localName = "IncoPlace", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "IncoPlace is mandatory")
  @Size(max = 60, message = "IncoPlace must be maximum 60 characters")
  private String incoPlace;

  @JacksonXmlProperty(localName = "InstructionsToNextAdvisingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 32000, message = "InstructionsToNextAdvisingBank must be maximum 32000 characters")
  private String instructionsToNextAdvisingBank;

  @JacksonXmlProperty(localName = "InstructionsToPayingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 1820, message = "InstructionsToPayingBank must be maximum 1820 characters")
  private String instructionsToPayingBank;

  @JacksonXmlProperty(localName = "InsuranceForBuyer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean insuranceForBuyer;

  @JacksonXmlProperty(localName = "InternalMasterRefSequence", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer internalMasterRefSequence;

  @JacksonXmlProperty(localName = "InvoicePct", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Double invoicePct;

  @JacksonXmlProperty(localName = "IssuanceChgsFor", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "IssuanceChgsFor must be between 1 and 1 character")
  private String issuanceChgsFor;

  @JacksonXmlProperty(localName = "AdviseBy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "AdviseBy must be between 1 and 1 character")
  private String adviseBy;

  @JacksonXmlProperty(localName = "IssueDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date issueDate;

  @JacksonXmlProperty(localName = "LCAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount lcAmount;

  @JacksonXmlProperty(localName = "LCAmountSpec", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AmountSpec lcAmountSpec;

  @JacksonXmlProperty(localName = "Operative", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean operative;

  @JacksonXmlProperty(localName = "OriginalMasterReference", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "OriginalMasterReference must be between 1-20 character")
  private String originalMasterReference;

  @JacksonXmlProperty(localName = "OutstandingAdditionalAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount outstandingAdditionalAmount;

  @JacksonXmlProperty(localName = "OutstandingAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount outstandingAmount;

  @JacksonXmlProperty(localName = "OverseasChgsFor", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "OverseasChgsFor must be between 1 and 1 character")
  private String overseasChgsFor;

  @JacksonXmlProperty(localName = "PartShipment", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "PartShipment must be between 1 and 35 characters")
  private String partShipment;

  @JacksonXmlProperty(localName = "PortOfDischarge", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "PortOfDischarge is mandatory")
  @Size(max = 65, message = "PortOfDischarge must be maximum 65 characters")
  private String portOfDischarge;

  @JacksonXmlProperty(localName = "PortOfLoading", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "PortOfLoading is mandatory")
  @Size(max = 65, message = "PortOfLoading must be maximum 65 characters")
  private String portOfLoading;

  @JacksonXmlProperty(localName = "PreallocatedNo", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer preallocatedNo;

  @JacksonXmlProperty(localName = "PreferredCcy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 3, message = "PreferredCcy must be between 1 and 3 characters")
  private String preferredCcy;

  @JacksonXmlProperty(localName = "PresentationDays", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer presentationDays;

  @JacksonXmlProperty(localName = "PresentationPeriod", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "PresentationPeriod is mandatory")
  @Size(max = 148, message = "PresentationPeriod must be maximum 148 characters")
  private String presentationPeriod;

  @JacksonXmlProperty(localName = "ReimbursementApplicableRules", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "ReimbursementApplicableRules must be between 1 and 1 character")
  private String reimbursementApplicableRules;

  @JacksonXmlProperty(localName = "Revocable", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean revocable;

  @JacksonXmlProperty(localName = "Revolving", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Revolving revolving;

  @JacksonXmlProperty(localName = "ShipmentDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date shipmentDate;

  @JacksonXmlProperty(localName = "ShipmentFrom", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ShipmentFrom is mandatory")
  @Size(max = 65, message = "ShipmentFrom must be maximum 65 characters")
  private String shipmentFrom;

  @JacksonXmlProperty(localName = "ShipmentPeriod", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ShipmentPeriod is mandatory")
  @Size(max = 402, message = "ShipmentPeriod must be maximum 402 characters")
  private String shipmentPeriod;

  @JacksonXmlProperty(localName = "ShipmentTo", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ShipmentTo is mandatory")
  @Size(max = 65, message = "ShipmentTo must be maximum 65 characters")
  private String shipmentTo;

  @JacksonXmlProperty(localName = "TaxFor", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "TaxFor must be between 1 and 1 character")
  private String taxFor;

  @JacksonXmlProperty(localName = "TermsOfPayment", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private TermsOfPayment termsOfPayment;

  @JacksonXmlProperty(localName = "TransShipment", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "TransShipment must be between 1 and 35 characters")
  private String transShipment;

  @JacksonXmlProperty(localName = "Transferable", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean transferable;

  @JacksonXmlProperty(localName = "ReceivedFromBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer receivedFromBank;

  @JacksonXmlProperty(localName = "InstructionReceived", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 1820, message = "InstructionReceived must be maximum 1820 characters")
  private String instructionReceived;

  @JacksonXmlProperty(localName = "IssuingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer issuingBank;

  @JacksonXmlProperty(localName = "NonBankIssuer", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer nonBankIssuer;

  @JacksonXmlProperty(localName = "ReimbursingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer reimbursingBank;

  @JacksonXmlProperty(localName = "DeliveryNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer deliveryNumber;

  @JacksonXmlProperty(localName = "DocumentsToBeSentBy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 2, message = "DocumentsToBeSentBy must be maximum 2 characters")
  private String documentsToBeSentBy;

  @JacksonXmlProperty(localName = "EBankEventRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "EBankEventRef is mandatory")
  @Size(max = 20, message = "EBankEventRef must be maximum 20 characters")
  private String ebankEventRef;

  @JacksonXmlProperty(localName = "EBankMasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "EBankMasterRef is mandatory")
  @Size(max = 20, message = "EBankMasterRef must be maximum 20 characters")
  private String ebankMasterRef;

  @JacksonXmlProperty(localName = "FXOptionDeal", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "FXOptionDeal must be between 1 and 20 characters")
  private String fxOptionDeal;

  @JacksonXmlProperty(localName = "ProductType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ProductType is mandatory")
  @Size(max = 3, message = "ProductType must be maximum 3 characters")
  private String productType;

  @JacksonXmlProperty(localName = "DeferChgs", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean deferChgs;

  @JacksonXmlProperty(localName = "AdvisingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer advisingBank;

  @JacksonXmlProperty(localName = "MarginDeposit", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private MarginDeposit marginDeposit;

  @JacksonXmlProperty(localName = "Collateral", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Collateral collateral;

  @JacksonXmlElementWrapper(localName = "FxContracts", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "FxContract", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<FxContract> fxContracts;

  @JacksonXmlElementWrapper(localName = "LicenseDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "LicenseDetail", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<LicenseDetail> licenseDetails;

  @JacksonXmlProperty(localName = "Provisional", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean provisional;

  @JacksonXmlProperty(localName = "AutoCreateFollowOnEvent", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean autoCreateFollowOnEvent;

  @JacksonXmlElementWrapper(localName = "AdditionalParties", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "AdditionalPartiesToAdd", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private List<Parties> additionalParties;

  @JacksonXmlProperty(localName = "AdditionalData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AdditionalData additionalData;

  @JacksonXmlProperty(localName = "ExtraData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String extraData;

  // Getters and Setters
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public List<DocumentsReceived> getDocumentsReceiveds() {
    return documentsReceiveds;
  }

  public void setDocumentsReceiveds(List<DocumentsReceived> documentsReceiveds) {
    this.documentsReceiveds = documentsReceiveds;
  }

  public List<EventNotifications> getEventNotificationss() {
    return eventNotificationss;
  }

  public void setEventNotificationss(List<EventNotifications> eventNotificationss) {
    this.eventNotificationss = eventNotificationss;
  }

  public String getFileIdentification() {
    return fileIdentification;
  }

  public void setFileIdentification(String fileIdentification) {
    this.fileIdentification = fileIdentification;
  }

  public List<EmbeddedItems> getEmbeddedItemss() {
    return embeddedItemss;
  }

  public void setEmbeddedItemss(List<EmbeddedItems> embeddedItemss) {
    this.embeddedItemss = embeddedItemss;
  }

  public String getMasterRef() {
    return masterRef;
  }

  public void setMasterRef(String masterRef) {
    this.masterRef = masterRef;
  }

  public String getContinueEvent() {
    return continueEvent;
  }

  public void setContinueEvent(String continueEvent) {
    this.continueEvent = continueEvent;
  }

  public ProvisionalFlags getProvisionalFlags() {
    return provisionalFlags;
  }

  public void setProvisionalFlags(ProvisionalFlags provisionalFlags) {
    this.provisionalFlags = provisionalFlags;
  }

  public Amount getAddAmount() {
    return addAmount;
  }

  public void setAddAmount(Amount addAmount) {
    this.addAmount = addAmount;
  }

  public String getAddAmountText() {
    return addAmountText;
  }

  public void setAddAmountText(String addAmountText) {
    this.addAmountText = addAmountText;
  }

  public String getAdditionalConditions() {
    return additionalConditions;
  }

  public void setAdditionalConditions(String additionalConditions) {
    this.additionalConditions = additionalConditions;
  }

  public SpecialPaymentConditions getSpecialPaymentConditions() {
    return specialPaymentConditions;
  }

  public void setSpecialPaymentCondition(SpecialPaymentConditions specialPaymentConditions) {
    this.specialPaymentConditions = specialPaymentConditions;
  }

  public Customer getAdviseThru() {
    return adviseThru;
  }

  public void setAdviseThru(Customer adviseThru) {
    this.adviseThru = adviseThru;
  }

  public String getAdviseThruAccount() {
    return adviseThruAccount;
  }

  public void setAdviseThruAccount(String adviseThruAccount) {
    this.adviseThruAccount = adviseThruAccount;
  }

  public Customer getNextAdvisingBank() {
    return nextAdvisingBank;
  }

  public void setNextAdvisingBank(Customer nextAdvisingBank) {
    this.nextAdvisingBank = nextAdvisingBank;
  }

  public String getApplicableRules() {
    return applicableRules;
  }

  public void setApplicableRules(String applicableRules) {
    this.applicableRules = applicableRules;
  }

  public String getApplicableRulesNarrative() {
    return applicableRulesNarrative;
  }

  public void setApplicableRulesNarrative(String applicableRulesNarrative) {
    this.applicableRulesNarrative = applicableRulesNarrative;
  }

  public Customer getApplicant() {
    return applicant;
  }

  public void setApplicant(Customer applicant) {
    this.applicant = applicant;
  }

  public String getApplicantInstructions() {
    return applicantInstructions;
  }

  public void setApplicantInstructions(String applicantInstructions) {
    this.applicantInstructions = applicantInstructions;
  }

  public Customer getApplicantBank() {
    return applicantBank;
  }

  public void setApplicantBank(Customer applicantBank) {
    this.applicantBank = applicantBank;
  }

  public Date getAdviseDate() {
    return adviseDate;
  }

  public void setAdviseDate(Date adviseDate) {
    this.adviseDate = adviseDate;
  }

  public AvailableWith getAvailableWith() {
    return availableWith;
  }

  public void setAvailableWith(AvailableWith availableWith) {
    this.availableWith = availableWith;
  }

  public BankCodes getBankCodes() {
    return bankCodes;
  }

  public void setBankCodes(BankCodes bankCodes) {
    this.bankCodes = bankCodes;
  }

  public String getBenAccNo() {
    return benAccNo;
  }

  public void setBenAccNo(String benAccNo) {
    this.benAccNo = benAccNo;
  }

  public Customer getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(Customer beneficiary) {
    this.beneficiary = beneficiary;
  }

  public ConfirmationDetails getConfirmationDetails() {
    return confirmationDetails;
  }

  public void setConfirmationDetails(ConfirmationDetails confirmationDetails) {
    this.confirmationDetails = confirmationDetails;
  }

  public String getChargeAccount() {
    return chargeAccount;
  }

  public void setChargeAccount(String chargeAccount) {
    this.chargeAccount = chargeAccount;
  }

  public ChargeDetails getChargeDetails() {
    return chargeDetails;
  }

  public void setChargeDetails(ChargeDetails chargeDetails) {
    this.chargeDetails = chargeDetails;
  }

  public String getChargeText() {
    return chargeText;
  }

  public void setChargeText(String chargeText) {
    this.chargeText = chargeText;
  }

  public String getOtherBankConfirmation() {
    return otherBankConfirmation;
  }

  public void setOtherBankConfirmation(String otherBankConfirmation) {
    this.otherBankConfirmation = otherBankConfirmation;
  }

  public String getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }

  public String getDocuments() {
    return documents;
  }

  public void setDocuments(String documents) {
    this.documents = documents;
  }

  public Boolean getDomesticExpiry() {
    return domesticExpiry;
  }

  public void setDomesticExpiry(Boolean domesticExpiry) {
    this.domesticExpiry = domesticExpiry;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getExpiryPlace() {
    return expiryPlace;
  }

  public void setExpiryPlace(String expiryPlace) {
    this.expiryPlace = expiryPlace;
  }

  public String getFreightPrepaid() {
    return freightPrepaid;
  }

  public void setFreightPrepaid(String freightPrepaid) {
    this.freightPrepaid = freightPrepaid;
  }

  public String getGoods() {
    return goods;
  }

  public void setGoods(String goods) {
    this.goods = goods;
  }

  public String getGoodsCode() {
    return goodsCode;
  }

  public void setGoodsCode(String goodsCode) {
    this.goodsCode = goodsCode;
  }

  public String getIncoTerms() {
    return incoTerms;
  }

  public void setIncoTerms(String incoTerms) {
    this.incoTerms = incoTerms;
  }

  public String getIncoPlace() {
    return incoPlace;
  }

  public void setIncoPlace(String incoPlace) {
    this.incoPlace = incoPlace;
  }

  public String getInstructionsToNextAdvisingBank() {
    return instructionsToNextAdvisingBank;
  }

  public void setInstructionsToNextAdvisingBank(String instructionsToNextAdvisingBank) {
    this.instructionsToNextAdvisingBank = instructionsToNextAdvisingBank;
  }

  public String getInstructionsToPayingBank() {
    return instructionsToPayingBank;
  }

  public void setInstructionsToPayingBank(String instructionsToPayingBank) {
    this.instructionsToPayingBank = instructionsToPayingBank;
  }

  public Boolean getInsuranceForBuyer() {
    return insuranceForBuyer;
  }

  public void setInsuranceForBuyer(Boolean insuranceForBuyer) {
    this.insuranceForBuyer = insuranceForBuyer;
  }

  public Integer getInternalMasterRefSequence() {
    return internalMasterRefSequence;
  }

  public void setInternalMasterRefSequence(Integer internalMasterRefSequence) {
    this.internalMasterRefSequence = internalMasterRefSequence;
  }

  public Double getInvoicePct() {
    return invoicePct;
  }

  public void setInvoicePct(Double invoicePct) {
    this.invoicePct = invoicePct;
  }

  public String getIssuanceChgsFor() {
    return issuanceChgsFor;
  }

  public void setIssuanceChgsFor(String issuanceChgsFor) {
    this.issuanceChgsFor = issuanceChgsFor;
  }

  public String getAdviseBy() {
    return adviseBy;
  }

  public void setAdviseBy(String adviseBy) {
    this.adviseBy = adviseBy;
  }

  public Date getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }

  public Amount getLcAmount() {
    return lcAmount;
  }

  public void setLcAmount(Amount lcAmount) {
    this.lcAmount = lcAmount;
  }

  public AmountSpec getLcAmountSpec() {
    return lcAmountSpec;
  }

  public void setLcAmountSpec(AmountSpec lcAmountSpec) {
    this.lcAmountSpec = lcAmountSpec;
  }

  public Boolean getOperative() {
    return operative;
  }

  public void setOperative(Boolean operative) {
    this.operative = operative;
  }

  public String getOriginalMasterReference() {
    return originalMasterReference;
  }

  public void setOriginalMasterReference(String originalMasterReference) {
    this.originalMasterReference = originalMasterReference;
  }

  public Amount getOutstandingAdditionalAmount() {
    return outstandingAdditionalAmount;
  }

  public void setOutstandingAdditionalAmount(Amount outstandingAdditionalAmount) {
    this.outstandingAdditionalAmount = outstandingAdditionalAmount;
  }

  public Amount getOutstandingAmount() {
    return outstandingAmount;
  }

  public void setOutstandingAmount(Amount outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
  }

  public String getOverseasChgsFor() {
    return overseasChgsFor;
  }

  public void setOverseasChgsFor(String overseasChgsFor) {
    this.overseasChgsFor = overseasChgsFor;
  }

  public String getPartShipment() {
    return partShipment;
  }

  public void setPartShipment(String partShipment) {
    this.partShipment = partShipment;
  }

  public String getPortOfDischarge() {
    return portOfDischarge;
  }

  public void setPortOfDischarge(String portOfDischarge) {
    this.portOfDischarge = portOfDischarge;
  }

  public String getPortOfLoading() {
    return portOfLoading;
  }

  public void setPortOfLoading(String portOfLoading) {
    this.portOfLoading = portOfLoading;
  }

  public Integer getPreallocatedNo() {
    return preallocatedNo;
  }

  public void setPreallocatedNo(Integer preallocatedNo) {
    this.preallocatedNo = preallocatedNo;
  }

  public String getPreferredCcy() {
    return preferredCcy;
  }

  public void setPreferredCcy(String preferredCcy) {
    this.preferredCcy = preferredCcy;
  }

  public Integer getPresentationDays() {
    return presentationDays;
  }

  public void setPresentationDays(Integer presentationDays) {
    this.presentationDays = presentationDays;
  }

  public String getPresentationPeriod() {
    return presentationPeriod;
  }

  public void setPresentationPeriod(String presentationPeriod) {
    this.presentationPeriod = presentationPeriod;
  }

  public String getReimbursementApplicableRules() {
    return reimbursementApplicableRules;
  }

  public void setReimbursementApplicableRules(String reimbursementApplicableRules) {
    this.reimbursementApplicableRules = reimbursementApplicableRules;
  }

  public Boolean getRevocable() {
    return revocable;
  }

  public void setRevocable(Boolean revocable) {
    this.revocable = revocable;
  }

  public Revolving getRevolving() {
    return revolving;
  }

  public void setRevolving(Revolving revolving) {
    this.revolving = revolving;
  }

  public Date getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(Date shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public String getShipmentFrom() {
    return shipmentFrom;
  }

  public void setShipmentFrom(String shipmentFrom) {
    this.shipmentFrom = shipmentFrom;
  }

  public String getShipmentPeriod() {
    return shipmentPeriod;
  }

  public void setShipmentPeriod(String shipmentPeriod) {
    this.shipmentPeriod = shipmentPeriod;
  }

  public String getShipmentTo() {
    return shipmentTo;
  }

  public void setShipmentTo(String shipmentTo) {
    this.shipmentTo = shipmentTo;
  }

  public String getTaxFor() {
    return taxFor;
  }

  public void setTaxFor(String taxFor) {
    this.taxFor = taxFor;
  }

  public TermsOfPayment getTermsOfPayment() {
    return termsOfPayment;
  }

  public void setTermsOfPayment(TermsOfPayment termsOfPayment) {
    this.termsOfPayment = termsOfPayment;
  }

  public String getTransShipment() {
    return transShipment;
  }

  public void setTransShipment(String transShipment) {
    this.transShipment = transShipment;
  }

  public Boolean getTransferable() {
    return transferable;
  }

  public void setTransferable(Boolean transferable) {
    this.transferable = transferable;
  }

  public Customer getReceivedFromBank() {
    return receivedFromBank;
  }

  public void setReceivedFromBank(Customer receivedFromBank) {
    this.receivedFromBank = receivedFromBank;
  }

  public String getInstructionReceived() {
    return instructionReceived;
  }

  public void setInstructionReceived(String instructionReceived) {
    this.instructionReceived = instructionReceived;
  }

  public Customer getIssuingBank() {
    return issuingBank;
  }

  public void setIssuingBank(Customer issuingBank) {
    this.issuingBank = issuingBank;
  }

  public Customer getNonBankIssuer() {
    return nonBankIssuer;
  }

  public void setNonBankIssuer(Customer nonBankIssuer) {
    this.nonBankIssuer = nonBankIssuer;
  }

  public Customer getReimbursingBank() {
    return reimbursingBank;
  }

  public void setReimbursingBank(Customer reimbursingBank) {
    this.reimbursingBank = reimbursingBank;
  }

  public Integer getDeliveryNumber() {
    return deliveryNumber;
  }

  public void setDeliveryNumber(Integer deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
  }

  public String getDocumentsToBeSentBy() {
    return documentsToBeSentBy;
  }

  public void setDocumentsToBeSentBy(String documentsToBeSentBy) {
    this.documentsToBeSentBy = documentsToBeSentBy;
  }

  public String getEbankEventRef() {
    return ebankEventRef;
  }

  public void setEbankEventRef(String ebankEventRef) {
    this.ebankEventRef = ebankEventRef;
  }

  public String getEbankMasterRef() {
    return ebankMasterRef;
  }

  public void setEbankMasterRef(String ebankMasterRef) {
    this.ebankMasterRef = ebankMasterRef;
  }

  public String getFxOptionDeal() {
    return fxOptionDeal;
  }

  public void setFxOptionDeal(String fxOptionDeal) {
    this.fxOptionDeal = fxOptionDeal;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Boolean getDeferChgs() {
    return deferChgs;
  }

  public void setDeferChgs(Boolean deferChgs) {
    this.deferChgs = deferChgs;
  }

  public Customer getAdvisingBank() {
    return advisingBank;
  }

  public void setAdvisingBank(Customer advisingBank) {
    this.advisingBank = advisingBank;
  }

  public MarginDeposit getMarginDeposit() {
    return marginDeposit;
  }

  public void setMarginDeposit(MarginDeposit marginDeposit) {
    this.marginDeposit = marginDeposit;
  }

  public Collateral getCollateral() {
    return collateral;
  }

  public void setCollateral(Collateral collateral) {
    this.collateral = collateral;
  }

  public List<FxContract> getFxContracts() {
    return fxContracts;
  }

  public void setFxContracts(List<FxContract> fxContracts) {
    this.fxContracts = fxContracts;
  }

  public List<LicenseDetail> getLicenseDetails() {
    return licenseDetails;
  }

  public void setLicenseDetails(List<LicenseDetail> licenseDetails) {
    this.licenseDetails = licenseDetails;
  }

  public Boolean getProvisional() {
    return provisional;
  }

  public void setProvisional(Boolean provisional) {
    this.provisional = provisional;
  }

  public Boolean getAutoCreateFollowOnEvent() {
    return autoCreateFollowOnEvent;
  }

  public void setAutoCreateFollowOnEvent(Boolean autoCreateFollowOnEvent) {
    this.autoCreateFollowOnEvent = autoCreateFollowOnEvent;
  }

  public List<Parties> getAdditionalParties() {
    return additionalParties;
  }

  public void setAdditionalParties(List<Parties> additionalParties) {
    this.additionalParties = additionalParties;
  }

  public AdditionalData getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(AdditionalData additionalData) {
    this.additionalData = additionalData;
  }

  public String getExtraData() {
    return extraData;
  }

  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }
}
