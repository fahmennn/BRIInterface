package com.nttdata.id.briinterface.dtos;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MasterRequestDTO {
  @Size(max = 4, message = "STATUS must be 4 characters")
  private String status;

  @Size(max = 34, message = "ORIG_REF must be 34 characters")
  private String orig_ref;

  @Size(max = 8, message = "INPUTBRN must be 8 characters")
  private String inputBrn;

  @Size(max = 8, message = "BHALFBRN must be 8 characters")
  private String bhalfBrn;

  private String expiryDat;

  private Double amount;
  
  @Size(max = 3, message = "CCY must be 3 characters")
  private String ccy;

  private String ctrctDate;

  @Size(max = 20, message = "RELMSTRREF must be 20 characters")
  private String relMstrRef;

  private Long prodtype;

  private Long primaryCus;

  @Size(max = 20, message = "MASTERREF must be 20 characters")
  private String masterRef;

  @Size(max = 8, message = "PRICUSTSBB must be 8 characters")
  private String pricustsbb;

  @Size(max = 20, message = "PRICUSTMNM must be 20 characters")
  private String pricustmnm;

  @Size(max = 34, message = "PREREF must be 34 characters")
  private String preRef;

  @Size(max = 34, message = "CANPRNREF must be 34 characters")
  private String canPrnRef;

  @Size(max = 34, message = "NPRREF must be 34 characters")
  private String nprRef;

  @Size(max = 34, message = "CANNPRNREF must be 34 characters")
  private String cannPrnRef;

  @Size(max = 8, message = "NPRCUSTSBB must be 8 characters")
  private String nprCustSbb;

  @Size(max = 20, message = "NPRCUSTMNM must be 20 characters")
  private String nprCustmnm;

  @Size(max = 35, message = "NPRNAMEL1 must be 35 characters")
  private String nprNameL1;

  @Size(max = 11, message = "PCPSWBIC must be 11 characters")
  private String pcpSwBic;

  @Size(max = 11, message = "NPCSWBIC must be 11 characters")
  private String npcSwBic;

  private String startCtrctDate;

  private String endCtrctDate;

  private PaginationRequest pagination;

  // Getter & Setter
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getOrig_ref() {
    return orig_ref;
  }

  public void setOrig_ref(String orig_ref) {
    this.orig_ref = orig_ref;
  }

  public String getInputBrn() {
    return inputBrn;
  }

  public void setInputBrn(String inputBrn) {
    this.inputBrn = inputBrn;
  }

  public String getBhalfBrn() {
    return bhalfBrn;
  }

  public void setBhalfBrn(String bhalfBrn) {
    this.bhalfBrn = bhalfBrn;
  }

  public String getExpiryDat() {
    return expiryDat;
  }

  public void setExpiryDat(String expiryDat) {
    this.expiryDat = expiryDat;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getCcy() {
    return ccy;
  }

  public void setCcy(String ccy) {
    this.ccy = ccy;
  }

  public String getCtrctDate() {
    return ctrctDate;
  }

  public void setCtrctDate(String ctrctDate) {
    this.ctrctDate = ctrctDate;
  }

  public String getRelMstrRef() {
    return relMstrRef;
  }

  public void setRelMstrRef(String relMstrRef) {
    this.relMstrRef = relMstrRef;
  }

  public Long getProdtype() {
    return prodtype;
  }

  public void setProdtype(Long prodtype) {
    this.prodtype = prodtype;
  }

  public Long getPrimaryCus() {
    return primaryCus;
  }

  public void setPrimaryCus(Long primaryCus) {
    this.primaryCus = primaryCus;
  }

  public String getMasterRef() {
    return masterRef;
  }

  public void setMasterRef(String masterRef) {
    this.masterRef = masterRef;
  }

  public String getPricustsbb() {
    return pricustsbb;
  }

  public void setPricustsbb(String pricustsbb) {
    this.pricustsbb = pricustsbb;
  }

  public String getPricustmnm() {
    return pricustmnm;
  }

  public void setPricustmnm(String pricustmnm) {
    this.pricustmnm = pricustmnm;
  }

  public String getPreRef() {
    return preRef;
  }

  public void setPreRef(String preRef) {
    this.preRef = preRef;
  }

  public String getCanPrnRef() {
    return canPrnRef;
  }

  public void setCanPrnRef(String canPrnRef) {
    this.canPrnRef = canPrnRef;
  }

  public String getNprRef() {
    return nprRef;
  }

  public void setNprRef(String nprRef) {
    this.nprRef = nprRef;
  }

  public String getCannPrnRef() {
    return cannPrnRef;
  }

  public void setCannPrnRef(String cannPrnRef) {
    this.cannPrnRef = cannPrnRef;
  }

  public String getNprCustSbb() {
    return nprCustSbb;
  }

  public void setNprCustSbb(String nprCustSbb) {
    this.nprCustSbb = nprCustSbb;
  }

  public String getNprCustmnm() {
    return nprCustmnm;
  }

  public void setNprCustmnm(String nprCustmnm) {
    this.nprCustmnm = nprCustmnm;
  }

  public String getNprNameL1() {
    return nprNameL1;
  }

  public void setNprNameL1(String nprNameL1) {
    this.nprNameL1 = nprNameL1;
  }

  public String getPcpSwBic() {
    return pcpSwBic;
  }

  public void setPcpSwBic(String pcpSwBic) {
    this.pcpSwBic = pcpSwBic;
  }

  public String getNpcSwBic() {
    return npcSwBic;
  }

  public void setNpcSwBic(String npcSwBic) {
    this.npcSwBic = npcSwBic;
  }

  public PaginationRequest getPagination() {
    return pagination;
  }

  public void setPagination(PaginationRequest pagination) {
    this.pagination = pagination;
  }

  public String getStartCtrctDate() {
    return startCtrctDate;
  }

  public void setStartCtrctDate(String startCtrctDate) {
    this.startCtrctDate = startCtrctDate;
  }

  public String getEndCtrctDate() {
    return endCtrctDate;
  }

  public void setEndCtrctDate(String endCtrctDate) {
    this.endCtrctDate = endCtrctDate;
  }
}
