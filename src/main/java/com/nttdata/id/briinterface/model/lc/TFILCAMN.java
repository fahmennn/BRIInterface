package com.nttdata.id.briinterface.model.lc;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

// Import LC Amendment
@JacksonXmlRootElement(localName = "TFILCAMN")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TFILCAMN {
  @JacksonXmlProperty(localName = "Context", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Context context;

  @JacksonXmlElementWrapper(localName = "DocumentsReceiveds", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "DocumentsReceived", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<DocumentsReceived> documentsReceiveds;

  @JacksonXmlElementWrapper(localName = "EventNotificationss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "EventNotificationss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<EventNotifications> eventNotificationss;

  @JacksonXmlProperty(localName = "FileIdentification", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 4, max = 70, message = "FileIdentification must be between 4 and 70 characters")
  private String fileIdentification;

  @JacksonXmlElementWrapper(localName = "EmbeddedItemss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "EmbeddedItemss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<EmbeddedItems> embeddedItemss;

  @JacksonXmlProperty(localName = "MasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "MasterRef must be between 1 and 20 characters")
  private String masterRef;

  @JacksonXmlProperty(localName = "ContinueEvent", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ContinueEvent is mandatory")
  @Size(max = 6, message = "ContinueEvent must be maximum 6 characters")
  private String continueEvent;

  @JacksonXmlProperty(localName = "ProvisionalFlags", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private ProvisionalFlags provisionalFlags;

  @JacksonXmlProperty(localName = "Applicant", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer applicant;

  @JacksonXmlProperty(localName = "ApplicantInstructions", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 32000, message = "ApplicantInstructions must be maximum 32000 characters")
  private String applicantInstructions;

  @JacksonXmlProperty(localName = "Beneficiary", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer beneficiary;

  @JacksonXmlProperty(localName = "BenAccNo", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "BenAccNo must be between 1 and 34 characters")
  private String benAccNo;

  @JacksonXmlProperty(localName = "ConfirmationDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private ConfirmationDetails confirmationDetails;

  @JacksonXmlProperty(localName = "IssueBy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "IssueBy is mandatory")
  @Size(max = 6, message = "IssueBy must be maximum 6 characters")
  private String issueBy;

  @JacksonXmlProperty(localName = "LCAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount lcAmount;

  @JacksonXmlProperty(localName = "LCAmountSpec", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AmountSpec lcAmountSpec;

  @JacksonXmlProperty(localName = "Revocable", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean revocable;

  @JacksonXmlProperty(localName = "Confirmation", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "Confirmation must be minimum and maximum 1 character")
  private String confirmation;

  @JacksonXmlProperty(localName = "Revolving", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Revolving revolving;

  @JacksonXmlProperty(localName = "Transferable", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean transferable;

  @JacksonXmlProperty(localName = "StandBy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean standBy;

  @JacksonXmlProperty(localName = "ExpiryDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date expiryDate;

  @JacksonXmlProperty(localName = "ApplicationDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date applicationDate;

  @JacksonXmlProperty(localName = "IssueDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date issueDate;

  @JacksonXmlProperty(localName = "ExpiryPlace", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 29, message = "ExpiryPlace must be between 1 and 29 characters")
  private String expiryPlace;

  @JacksonXmlProperty(localName = "TermsOfPayment", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private TermsOfPayment termsOfPayment;

  @JacksonXmlProperty(localName = "AvailableWith", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AvailableWith availableWith;

  @JacksonXmlProperty(localName = "InvoicePct", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Digits(integer = 17, fraction = 2)
  private BigDecimal invoicePct;

  @JacksonXmlProperty(localName = "DraftsDrawnByDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private DraftsDrawnByDetails draftsDrawnByDetails;

  @JacksonXmlProperty(localName = "ShipmentFrom", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ShipmentFrom is mandatory")
  @Size(max = 65, message = "ShipmentFrom must be maximum 65 characters")
  private String shipmentFrom;

  @JacksonXmlProperty(localName = "ShipmentTo", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ShipmentTo is mandatory")
  @Size(max = 65, message = "ShipmentTo must be maximum 65 characters")
  private String shipmentTo;

  @JacksonXmlProperty(localName = "ShipmentDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date shipmentDate;

  @JacksonXmlProperty(localName = "ShipmentPeriod", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ShipmentPeriod is mandatory")
  @Size(max = 402, message = "ShipmentPeriod must be maximum 402 characters")
  private String shipmentPeriod;

  @JacksonXmlProperty(localName = "TransShipment", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "TransShipment must be between 1 and 35 characters")
  private String transShipment;

  @JacksonXmlProperty(localName = "PartShipment", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "PartShipment must be between 1 and 35 characters")
  private String partShipment;

  @JacksonXmlProperty(localName = "Incoterm", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 3, message = "Incoterm must be between 1 and 3 characters")
  private String incoterm;

  @JacksonXmlProperty(localName = "IncoPlace", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "IncoPlace is mandatory")
  @Size(max = 60, message = "IncoPlace must be maximum 60 characters")
  private String incoPlace;

  @JacksonXmlProperty(localName = "InsuranceFor", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean insuranceFor;

  @JacksonXmlProperty(localName = "FreightPrepaid", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "FreightPrepaid must be minimum and maximum 1 character")
  private String freightPrepaid;

  @JacksonXmlProperty(localName = "PresentationDays", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer presentationDays;

  @JacksonXmlProperty(localName = "PresentationPeriod", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "PresentationPeriod is mandatory")
  @Size(max = 148, message = "PresentationPeriod must be maximum 148 characters")
  private String presentationPeriod;

  @JacksonXmlProperty(localName = "Goods", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Goods is mandatory")
  @Size(max = 53600, message = "Goods must be maximum 53600 characters")
  private String goods;

  @JacksonXmlProperty(localName = "Documents", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Documents is mandatory")
  @Size(max = 53600, message = "Documents must be maximum 53600 characters")
  private String documents;

  @JacksonXmlProperty(localName = "AdditionalConditions", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "AdditionalConditions is mandatory")
  @Size(max = 53600, message = "AdditionalConditions must be maximum 53600 characters")
  private String additionalConditions;

  @JacksonXmlProperty(localName = "SpecialPaymentConditions", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private SpecialPaymentConditions specialPaymentConditions;

  @JacksonXmlProperty(localName = "GoodsCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "GoodsCode must be between 1 and 10 characters")
  private String goodsCode;

  @JacksonXmlProperty(localName = "IssuanceChgsFor", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "IssuanceChgsFor must be minimum and maximum 1 character")
  private String issuanceChgsFor;

  @JacksonXmlProperty(localName = "TaxFor", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "TaxFor must be minimum and maximum 1 character")
  private String taxFor;

  @JacksonXmlProperty(localName = "OverseasChgsFor", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "OverseasChgsFor must be minimum and maximum 1 character")
  private String overseasChgsFor;

  @JacksonXmlProperty(localName = "ChargeText", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ChargeText is mandatory")
  @Size(max = 222, message = "ChargeText must be maximum 222 characters")
  private String chargeText;

  @JacksonXmlProperty(localName = "AddAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount addAmount;

  @JacksonXmlProperty(localName = "AddAmountText", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "AddAmountText is mandatory")
  @Size(max = 804, message = "AddAmountText must be maximum 804 characters")
  private String addAmountText;

  @JacksonXmlProperty(localName = "AdviseThru", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer adviseThru;

  @JacksonXmlProperty(localName = "AdviseThruAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 35, message = "AdviseThruAccount must be between 1 and 35 characters")
  private String adviseThruAccount;

  @JacksonXmlProperty(localName = "PreferredCcy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 3, message = "PreferredCcy must be between 1 and 3 characters")
  private String preferredCcy;

  @JacksonXmlProperty(localName = "ChargeAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "ChargeAccount must be between 1 and 34 characters")
  private String chargeAccount;

  @JacksonXmlProperty(localName = "ChargeDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private ChargeDetails chargeDetails;

  @JacksonXmlProperty(localName = "PrincipalAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "PrincipalAccount must be between 1 and 34 characters")
  private String principalAccount;

  @JacksonXmlProperty(localName = "FXOptDealRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "FXOptDealRef must be between 1 and 34 characters")
  private String fxOptDealRef;

  @JacksonXmlProperty(localName = "BankCodes", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private BankCodes bankCodes;

  @JacksonXmlProperty(localName = "AdvisingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer advisingBank;

  @JacksonXmlProperty(localName = "eBankMasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "eBankMasterRef is mandatory")
  @Size(max = 20, message = "eBankMasterRef must be maximum 20 characters")
  private String eBankMasterRef;

  @JacksonXmlProperty(localName = "eBankEvent", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "eBankEvent is mandatory")
  @Size(max = 20, message = "eBankEvent must be maximum 20 characters")
  private String eBankEvent;

  @JacksonXmlProperty(localName = "RelatedMasterRef", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "RelatedMasterRef must be between 1 and 34 characters")
  private String relatedMasterRef;

  @JacksonXmlProperty(localName = "AdviseDirect", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean adviseDirect;

  @JacksonXmlProperty(localName = "DomesticExpiry", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean domesticExpiry;

  @JacksonXmlProperty(localName = "Operative", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean operative;

  @JacksonXmlProperty(localName = "ApplicableRules", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "ApplicableRules must be minimum and maximum 1 character")
  private String applicableRules;

  @JacksonXmlProperty(localName = "ApplicableRulesNarrative", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ApplicableRulesNarrative is mandatory")
  @Size(max = 35, message = "ApplicableRulesNarrative must be maximum 35 characters")
  private String applicableRulesNarrative;

  @JacksonXmlProperty(localName = "ReimbursementApplicableRules", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "ReimbursementApplicableRules must be minimum and maximum 1 character")
  private String reimbursementApplicableRules;

  @JacksonXmlProperty(localName = "PortOfLoading", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "PortOfLoading is mandatory")
  @Size(max = 65, message = "PortOfLoading must be maximum 65 characters")
  private String portOfLoading;

  @JacksonXmlProperty(localName = "PortOfDischarge", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "PortOfDischarge is mandatory")
  @Size(max = 65, message = "PortOfDischarge must be maximum 65 characters")
  private String portOfDischarge;

  @JacksonXmlElementWrapper(localName = "PurchaseOrderss", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "PurchaseOrders", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<PurchaseOrders> purchaseOrderss;

  @JacksonXmlProperty(localName = "OutstandingAdditionalAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount outstandingAdditionalAmount;

  @JacksonXmlProperty(localName = "OutstandingAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount outstandingAmount;

  @JacksonXmlProperty(localName = "OriginalMasterReference", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 20, message = "OriginalMasterReference must be between 1 and 20 characters")
  private String originalMasterReference;

  @JacksonXmlProperty(localName = "TakeonExtra", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private TakeonExtra takeonExtra;

  @JacksonXmlProperty(localName = "InstructionsToAdvisingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "InstructionsToAdvisingBank is mandatory")
  @Size(max = 1820, message = "InstructionsToAdvisingBank must be maximum 1820 characters")
  private String instructionsToAdvisingBank;

  @JacksonXmlProperty(localName = "InstructionsToPayingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "InstructionsToPayingBank is mandatory")
  @Size(max = 1820, message = "InstructionsToPayingBank must be maximum 1820 characters")
  private String instructionsToPayingBank;

  @JacksonXmlProperty(localName = "InternalMasterRefSequence", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer internalMasterRefSequence;

  @JacksonXmlProperty(localName = "DocumentsToBeSentBy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 2, message = "DocumentsToBeSentBy must be maximum 2 characters")
  private String documentsToBeSentBy;

  @JacksonXmlProperty(localName = "DeliveryNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Integer deliveryNumber;

  @JacksonXmlProperty(localName = "DeferChgs", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean deferChgs;

  @JacksonXmlProperty(localName = "MarginDeposit", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private MarginDeposit marginDeposit;

  @JacksonXmlProperty(localName = "Collateral", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Collateral collateral;

  @JacksonXmlElementWrapper(localName = "FxContracts", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "FxContract", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<FxContract> fxContracts;

  @JacksonXmlProperty(localName = "ReimbursingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer reimbursingBank;

  @JacksonXmlProperty(localName = "ReimbursingBankAccount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "ReimbursingBankAccount must be between 1 and 34 characters")
  private String reimbursingBankAccount;

  @JacksonXmlProperty(localName = "ReimbursingBankAccountNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 34, message = "ReimbursingBankAccountNumber must be between 1 and 34 characters")
  private String reimbursingBankAccountNumber;

  @JacksonXmlProperty(localName = "ReimbursingBankTransferMethod", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "ReimbursingBankTransferMethod must be minimum and maximum 1 character")
  private String reimbursingBankTransferMethod;

  @JacksonXmlProperty(localName = "ReimbursingBankCharge", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "ReimbursingBankCharge must be minimum and maximum 1 character")
  private String reimbursingBankCharge;

  @JacksonXmlProperty(localName = "InstructionsToReimbursingBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "InstructionsToReimbursingBank is mandatory")
  @Size(max = 1820, message = "InstructionsToReimbursingBank must be maximum 1820 characters")
  private String instructionsToReimbursingBank;

  @JacksonXmlElementWrapper(localName = "LicenseDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "LicenseDetail", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private List<LicenseDetail> licenseDetails;

  @JacksonXmlProperty(localName = "Sender", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Sender sender;

  @JacksonXmlProperty(localName = "BenApprovalReq", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean benApprovalReq;

  @JacksonXmlProperty(localName = "IncreaseAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount increaseAmount;

  @JacksonXmlProperty(localName = "DecreaseAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Amount decreaseAmount;

  @JacksonXmlProperty(localName = "AmendmentDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AmendmentDetails amendmentDetails;

  @JacksonXmlProperty(localName = "AmendmentNarrative", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "AmendmentNarrative is mandatory")
  @Size(max = 15860, message = "AmendmentNarrative must be maximum 15860 characters")
  private String amendmentNarrative;

  @JacksonXmlProperty(localName = "AmendChanges", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "AmendChanges is mandatory")
  @Size(max = 1820, message = "AmendChanges must be maximum 1820 characters")
  private String amendChanges;

  @JacksonXmlProperty(localName = "ProductType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "ProductType is mandatory")
  @Size(max = 3, message = "ProductType must be maximum 3 characters")
  private String productType;

  @JacksonXmlProperty(localName = "AdditionalParties", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AdditionalParties additionalParties;

  @JacksonXmlProperty(localName = "AmendDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date amendDate;

  @JacksonXmlProperty(localName = "LCMasterGoodsAmendments", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private LCMasterGoodsAmendments lcMasterGoodsAmendments;

  @JacksonXmlProperty(localName = "SpecialPaymentConditionsAmendments", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private SpecialPaymentConditionsAmendments specialPaymentConditionsAmendments;

  @JacksonXmlProperty(localName = "ApplicantBank", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Customer applicantBank;

  @JacksonXmlProperty(localName = "AdditionalData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private AdditionalData additionalData;

  @JacksonXmlProperty(localName = "ExtraData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private String extraData;

  // Getter & Setter

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

  public Customer getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(Customer beneficiary) {
    this.beneficiary = beneficiary;
  }

  public String getBenAccNo() {
    return benAccNo;
  }

  public void setBenAccNo(String benAccNo) {
    this.benAccNo = benAccNo;
  }

  public ConfirmationDetails getConfirmationDetails() {
    return confirmationDetails;
  }

  public void setConfirmationDetails(ConfirmationDetails confirmationDetails) {
    this.confirmationDetails = confirmationDetails;
  }

  public String getIssueBy() {
    return issueBy;
  }

  public void setIssueBy(String issueBy) {
    this.issueBy = issueBy;
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

  public Boolean getRevocable() {
    return revocable;
  }

  public void setRevocable(Boolean revocable) {
    this.revocable = revocable;
  }

  public String getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }

  public Revolving getRevolving() {
    return revolving;
  }

  public void setRevolving(Revolving revolving) {
    this.revolving = revolving;
  }

  public Boolean getTransferable() {
    return transferable;
  }

  public void setTransferable(Boolean transferable) {
    this.transferable = transferable;
  }

  public Boolean getStandBy() {
    return standBy;
  }

  public void setStandBy(Boolean standBy) {
    this.standBy = standBy;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Date getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(Date applicationDate) {
    this.applicationDate = applicationDate;
  }

  public Date getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }

  public String getExpiryPlace() {
    return expiryPlace;
  }

  public void setExpiryPlace(String expiryPlace) {
    this.expiryPlace = expiryPlace;
  }

  public TermsOfPayment getTermsOfPayment() {
    return termsOfPayment;
  }

  public void setTermsOfPayment(TermsOfPayment termsOfPayment) {
    this.termsOfPayment = termsOfPayment;
  }

  public AvailableWith getAvailableWith() {
    return availableWith;
  }

  public void setAvailableWith(AvailableWith availableWith) {
    this.availableWith = availableWith;
  }

  public BigDecimal getInvoicePct() {
    return invoicePct;
  }

  public void setInvoicePct(BigDecimal invoicePct) {
    this.invoicePct = invoicePct;
  }

  public DraftsDrawnByDetails getDraftsDrawnByDetails() {
    return draftsDrawnByDetails;
  }

  public void setDraftsDrawnByDetails(DraftsDrawnByDetails draftsDrawnByDetails) {
    this.draftsDrawnByDetails = draftsDrawnByDetails;
  }

  public String getShipmentFrom() {
    return shipmentFrom;
  }

  public void setShipmentFrom(String shipmentFrom) {
    this.shipmentFrom = shipmentFrom;
  }

  public String getShipmentTo() {
    return shipmentTo;
  }

  public void setShipmentTo(String shipmentTo) {
    this.shipmentTo = shipmentTo;
  }

  public Date getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(Date shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public String getShipmentPeriod() {
    return shipmentPeriod;
  }

  public void setShipmentPeriod(String shipmentPeriod) {
    this.shipmentPeriod = shipmentPeriod;
  }

  public String getTransShipment() {
    return transShipment;
  }

  public void setTransShipment(String transShipment) {
    this.transShipment = transShipment;
  }

  public String getPartShipment() {
    return partShipment;
  }

  public void setPartShipment(String partShipment) {
    this.partShipment = partShipment;
  }

  public String getIncoterm() {
    return incoterm;
  }

  public void setIncoterm(String incoterm) {
    this.incoterm = incoterm;
  }

  public String getIncoPlace() {
    return incoPlace;
  }

  public void setIncoPlace(String incoPlace) {
    this.incoPlace = incoPlace;
  }

  public Boolean getInsuranceFor() {
    return insuranceFor;
  }

  public void setInsuranceFor(Boolean insuranceFor) {
    this.insuranceFor = insuranceFor;
  }

  public String getFreightPrepaid() {
    return freightPrepaid;
  }

  public void setFreightPrepaid(String freightPrepaid) {
    this.freightPrepaid = freightPrepaid;
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

  public String getGoods() {
    return goods;
  }

  public void setGoods(String goods) {
    this.goods = goods;
  }

  public String getDocuments() {
    return documents;
  }

  public void setDocuments(String documents) {
    this.documents = documents;
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

  public void setSpecialPaymentConditions(SpecialPaymentConditions specialPaymentConditions) {
    this.specialPaymentConditions = specialPaymentConditions;
  }

  public String getGoodsCode() {
    return goodsCode;
  }

  public void setGoodsCode(String goodsCode) {
    this.goodsCode = goodsCode;
  }

  public String getIssuanceChgsFor() {
    return issuanceChgsFor;
  }

  public void setIssuanceChgsFor(String issuanceChgsFor) {
    this.issuanceChgsFor = issuanceChgsFor;
  }

  public String getTaxFor() {
    return taxFor;
  }

  public void setTaxFor(String taxFor) {
    this.taxFor = taxFor;
  }

  public String getOverseasChgsFor() {
    return overseasChgsFor;
  }

  public void setOverseasChgsFor(String overseasChgsFor) {
    this.overseasChgsFor = overseasChgsFor;
  }

  public String getChargeText() {
    return chargeText;
  }

  public void setChargeText(String chargeText) {
    this.chargeText = chargeText;
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

  public String getPreferredCcy() {
    return preferredCcy;
  }

  public void setPreferredCcy(String preferredCcy) {
    this.preferredCcy = preferredCcy;
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

  public String getPrincipalAccount() {
    return principalAccount;
  }

  public void setPrincipalAccount(String principalAccount) {
    this.principalAccount = principalAccount;
  }

  public String getFxOptDealRef() {
    return fxOptDealRef;
  }

  public void setFxOptDealRef(String fxOptDealRef) {
    this.fxOptDealRef = fxOptDealRef;
  }

  public BankCodes getBankCodes() {
    return bankCodes;
  }

  public void setBankCodes(BankCodes bankCodes) {
    this.bankCodes = bankCodes;
  }

  public Customer getAdvisingBank() {
    return advisingBank;
  }

  public void setAdvisingBank(Customer advisingBank) {
    this.advisingBank = advisingBank;
  }

  public String geteBankMasterRef() {
    return eBankMasterRef;
  }

  public void seteBankMasterRef(String eBankMasterRef) {
    this.eBankMasterRef = eBankMasterRef;
  }

  public String geteBankEvent() {
    return eBankEvent;
  }

  public void seteBankEvent(String eBankEvent) {
    this.eBankEvent = eBankEvent;
  }

  public String getRelatedMasterRef() {
    return relatedMasterRef;
  }

  public void setRelatedMasterRef(String relatedMasterRef) {
    this.relatedMasterRef = relatedMasterRef;
  }

  public Boolean getAdviseDirect() {
    return adviseDirect;
  }

  public void setAdviseDirect(Boolean adviseDirect) {
    this.adviseDirect = adviseDirect;
  }

  public Boolean getDomesticExpiry() {
    return domesticExpiry;
  }

  public void setDomesticExpiry(Boolean domesticExpiry) {
    this.domesticExpiry = domesticExpiry;
  }

  public Boolean getOperative() {
    return operative;
  }

  public void setOperative(Boolean operative) {
    this.operative = operative;
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

  public String getReimbursementApplicableRules() {
    return reimbursementApplicableRules;
  }

  public void setReimbursementApplicableRules(String reimbursementApplicableRules) {
    this.reimbursementApplicableRules = reimbursementApplicableRules;
  }

  public String getPortOfLoading() {
    return portOfLoading;
  }

  public void setPortOfLoading(String portOfLoading) {
    this.portOfLoading = portOfLoading;
  }

  public String getPortOfDischarge() {
    return portOfDischarge;
  }

  public void setPortOfDischarge(String portOfDischarge) {
    this.portOfDischarge = portOfDischarge;
  }

  public List<PurchaseOrders> getPurchaseOrderss() {
    return purchaseOrderss;
  }

  public void setPurchaseOrderss(List<PurchaseOrders> purchaseOrderss) {
    this.purchaseOrderss = purchaseOrderss;
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

  public String getOriginalMasterReference() {
    return originalMasterReference;
  }

  public void setOriginalMasterReference(String originalMasterReference) {
    this.originalMasterReference = originalMasterReference;
  }

  public TakeonExtra getTakeonExtra() {
    return takeonExtra;
  }

  public void setTakeonExtra(TakeonExtra takeonExtra) {
    this.takeonExtra = takeonExtra;
  }

  public String getInstructionsToAdvisingBank() {
    return instructionsToAdvisingBank;
  }

  public void setInstructionsToAdvisingBank(String instructionsToAdvisingBank) {
    this.instructionsToAdvisingBank = instructionsToAdvisingBank;
  }

  public String getInstructionsToPayingBank() {
    return instructionsToPayingBank;
  }

  public void setInstructionsToPayingBank(String instructionsToPayingBank) {
    this.instructionsToPayingBank = instructionsToPayingBank;
  }

  public Integer getInternalMasterRefSequence() {
    return internalMasterRefSequence;
  }

  public void setInternalMasterRefSequence(Integer internalMasterRefSequence) {
    this.internalMasterRefSequence = internalMasterRefSequence;
  }

  public String getDocumentsToBeSentBy() {
    return documentsToBeSentBy;
  }

  public void setDocumentsToBeSentBy(String documentsToBeSentBy) {
    this.documentsToBeSentBy = documentsToBeSentBy;
  }

  public Integer getDeliveryNumber() {
    return deliveryNumber;
  }

  public void setDeliveryNumber(Integer deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
  }

  public Boolean getDeferChgs() {
    return deferChgs;
  }

  public void setDeferChgs(Boolean deferChgs) {
    this.deferChgs = deferChgs;
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

  public Customer getReimbursingBank() {
    return reimbursingBank;
  }

  public void setReimbursingBank(Customer reimbursingBank) {
    this.reimbursingBank = reimbursingBank;
  }

  public String getReimbursingBankAccount() {
    return reimbursingBankAccount;
  }

  public void setReimbursingBankAccount(String reimbursingBankAccount) {
    this.reimbursingBankAccount = reimbursingBankAccount;
  }

  public String getReimbursingBankAccountNumber() {
    return reimbursingBankAccountNumber;
  }

  public void setReimbursingBankAccountNumber(String reimbursingBankAccountNumber) {
    this.reimbursingBankAccountNumber = reimbursingBankAccountNumber;
  }

  public String getReimbursingBankTransferMethod() {
    return reimbursingBankTransferMethod;
  }

  public void setReimbursingBankTransferMethod(String reimbursingBankTransferMethod) {
    this.reimbursingBankTransferMethod = reimbursingBankTransferMethod;
  }

  public String getReimbursingBankCharge() {
    return reimbursingBankCharge;
  }

  public void setReimbursingBankCharge(String reimbursingBankCharge) {
    this.reimbursingBankCharge = reimbursingBankCharge;
  }

  public String getInstructionsToReimbursingBank() {
    return instructionsToReimbursingBank;
  }

  public void setInstructionsToReimbursingBank(String instructionsToReimbursingBank) {
    this.instructionsToReimbursingBank = instructionsToReimbursingBank;
  }

  public List<LicenseDetail> getLicenseDetails() {
    return licenseDetails;
  }

  public void setLicenseDetails(List<LicenseDetail> licenseDetails) {
    this.licenseDetails = licenseDetails;
  }

  public Sender getSender() {
    return sender;
  }

  public void setSender(Sender sender) {
    this.sender = sender;
  }

  public Boolean getBenApprovalReq() {
    return benApprovalReq;
  }

  public void setBenApprovalReq(Boolean benApprovalReq) {
    this.benApprovalReq = benApprovalReq;
  }

  public Amount getIncreaseAmount() {
    return increaseAmount;
  }

  public void setIncreaseAmount(Amount increaseAmount) {
    this.increaseAmount = increaseAmount;
  }

  public Amount getDecreaseAmount() {
    return decreaseAmount;
  }

  public void setDecreaseAmount(Amount decreaseAmount) {
    this.decreaseAmount = decreaseAmount;
  }

  public AmendmentDetails getAmendmentDetails() {
    return amendmentDetails;
  }

  public void setAmendmentDetails(AmendmentDetails amendmentDetails) {
    this.amendmentDetails = amendmentDetails;
  }

  public String getAmendmentNarrative() {
    return amendmentNarrative;
  }

  public void setAmendmentNarrative(String amendmentNarrative) {
    this.amendmentNarrative = amendmentNarrative;
  }

  public String getAmendChanges() {
    return amendChanges;
  }

  public void setAmendChanges(String amendChanges) {
    this.amendChanges = amendChanges;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public AdditionalParties getAdditionalParties() {
    return additionalParties;
  }

  public void setAdditionalParties(AdditionalParties additionalParties) {
    this.additionalParties = additionalParties;
  }

  public Date getAmendDate() {
    return amendDate;
  }

  public void setAmendDate(Date amendDate) {
    this.amendDate = amendDate;
  }

  public LCMasterGoodsAmendments getLcMasterGoodsAmendments() {
    return lcMasterGoodsAmendments;
  }

  public void setLcMasterGoodsAmendments(LCMasterGoodsAmendments lcMasterGoodsAmendments) {
    this.lcMasterGoodsAmendments = lcMasterGoodsAmendments;
  }

  public SpecialPaymentConditionsAmendments getSpecialPaymentConditionsAmendments() {
    return specialPaymentConditionsAmendments;
  }

  public void setSpecialPaymentConditionsAmendments(SpecialPaymentConditionsAmendments specialPaymentConditionsAmendments) {
    this.specialPaymentConditionsAmendments = specialPaymentConditionsAmendments;
  }

  public Customer getApplicantBank() {
    return applicantBank;
  }

  public void setApplicantBank(Customer applicantBank) {
    this.applicantBank = applicantBank;
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
