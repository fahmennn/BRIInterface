package com.nttdata.id.briinterface.dtos;

public class BranchInquiryResponseDTO {
  private String cabrnm;
  private String cabad1;
  private String cabad2;
  private String cabad3;
  private String cabad4;
  private String cabbn;
  private String cabrn;
  private String catly;
  private String catph;
  private String cabad5;
  private String caswb;
  private String cacnas;
  private String caswl;
  private String caswbr;
  private String tibicn;
  private String mnt_in_bo;
  private String parent_brn;
  private String baseCcy;
  private String localCcy;
  private String swift_brn;
  private String country;
  private String furtherId;
  private Long branchEnt;
  private String timeZone;
  private String mainBank;
  private String noTrans;
  private Integer brchLevel;
  private String children;
  private String mainBranch;
  private String ultParent;
  private String fullName;
  private String city;
  private String email;
  private String telephone;
  private String fax;
  private String telex;
  private String telexAb;
  private String bankGroup;
  private String business;
  private String autonomous;
  private String rateFormat;
  private Integer tolerance;
  private String paramSet;
  private String services;
  private Long optParSet;
  private String inheritCdp;
  private String rf_status;
  private String bhOpening;
  private String bhClosing;
  private String swiftGpi;

  // Constructor
  public BranchInquiryResponseDTO(String cabrn, String cabad1, String cabad2, String cabad3, String cabad4, String cabbn, String catly, 
                  String catph, String cabrnm, String cabad5, String caswb, String cacnas, String caswl, String caswbr, 
                  String tibicn, String mnt_in_bo, String parent_brn, String baseCcy, String localCcy, String swift_brn, 
                  String country, String furtherId, Long branchEnt, String timeZone, String mainBank, String noTrans, 
                  Integer brchLevel, String children, String mainBranch, String ultParent, String fullName, String city, 
                  String email, String telephone, String fax, String telex, String telexAb, String bankGroup, 
                  String business, String autonomous, String rateFormat, Integer tolerance, String paramSet, String services, 
                  Long optParSet, String inheritCdp, String rf_status, String bhOpening, String bhClosing, String swiftGpi) {
      this.cabad1 = cabad1 != null ? cabad1.trim() : null;
      this.cabad2 = cabad2 != null ? cabad2.trim() : null;
      this.cabad3 = cabad3 != null ? cabad3.trim() : null;
      this.cabad4 = cabad4 != null ? cabad4.trim() : null;
      this.cabbn = cabbn != null ? cabbn.trim() : null;
      this.cabrn = cabrn != null ? cabrn.trim() : null;
      this.catly = catly != null ? catly.trim() : null;
      this.catph = catph != null ? catph.trim() : null;
      this.cabrnm = cabrnm != null ? cabrnm.trim() : null;
      this.cabad5 = cabad5 != null ? cabad5.trim() : null;
      this.caswb = caswb != null ? caswb.trim() : null;
      this.cacnas = cacnas != null ? cacnas.trim() : null;
      this.caswl = caswl != null ? caswl.trim() : null;
      this.caswbr = caswbr != null ? caswbr.trim() : null;
      this.tibicn = tibicn != null ? tibicn.trim() : null;
      this.mnt_in_bo = mnt_in_bo != null ? mnt_in_bo.trim() : null;
      this.parent_brn = parent_brn != null ? parent_brn.trim() : null;
      this.baseCcy = baseCcy != null ? baseCcy.trim() : null;
      this.localCcy = localCcy != null ? localCcy.trim() : null;
      this.swift_brn = swift_brn != null ? swift_brn.trim() : null;
      this.country = country != null ? country.trim() : null;
      this.furtherId = furtherId != null ? furtherId.trim() : null;
      this.branchEnt = branchEnt;
      this.timeZone = timeZone != null ? timeZone.trim() : null;
      this.mainBank = mainBank != null ? mainBank.trim() : null;
      this.noTrans = noTrans != null ? noTrans.trim() : null;
      this.brchLevel = brchLevel;
      this.children = children != null ? children.trim() : null;
      this.mainBranch = mainBranch != null ? mainBranch.trim() : null;
      this.ultParent = ultParent != null ? ultParent.trim() : null;
      this.fullName = fullName != null ? fullName.trim() : null;
      this.city = city != null ? city.trim() : null;
      this.email = email != null ? email.trim() : null;
      this.telephone = telephone != null ? telephone.trim() : null;
      this.fax = fax != null ? fax.trim() : null;
      this.telex = telex != null ? telex.trim() : null;
      this.telexAb = telexAb != null ? telexAb.trim() : null;
      this.bankGroup = bankGroup != null ? bankGroup.trim() : null;
      this.business = business != null ? business.trim() : null;
      this.autonomous = autonomous != null ? autonomous.trim() : null;
      this.rateFormat = rateFormat != null ? rateFormat.trim() : null;
      this.tolerance = tolerance;
      this.paramSet = paramSet != null ? paramSet.trim() : null;
      this.services = services != null ? services.trim() : null;
      this.optParSet = optParSet;
      this.inheritCdp = inheritCdp != null ? inheritCdp.trim() : null;
      this.rf_status = rf_status != null ? rf_status.trim() : null;
      this.bhOpening = bhOpening != null ? bhOpening.trim() : null;
      this.bhClosing = bhClosing != null ? bhClosing.trim() : null;
      this.swiftGpi = swiftGpi != null ? swiftGpi.trim() : null;
  }

  public BranchInquiryResponseDTO() {
  }

  // Getter & Setter
  public String getCabrnm() {
    return cabrnm;
  }

  public void setCabrnm(String cabrnm) {
    this.cabrnm = cabrnm;
  }

  public String getCabad1() {
    return cabad1;
  }

  public void setCabad1(String cabad1) {
    this.cabad1 = cabad1;
  }

  public String getCabad2() {
    return cabad2;
  }

  public void setCabad2(String cabad2) {
    this.cabad2 = cabad2;
  }

  public String getCabad3() {
    return cabad3;
  }

  public void setCabad3(String cabad3) {
    this.cabad3 = cabad3;
  }

  public String getCabad4() {
    return cabad4;
  }

  public void setCabad4(String cabad4) {
    this.cabad4 = cabad4;
  }

  public String getCabbn() {
    return cabbn;
  }

  public void setCabbn(String cabbn) {
    this.cabbn = cabbn;
  }

  public String getCabrn() {
    return cabrn;
  }

  public void setCabrn(String cabrn) {
    this.cabrn = cabrn;
  }

  public String getCatly() {
    return catly;
  }

  public void setCatly(String catly) {
    this.catly = catly;
  }

  public String getCatph() {
    return catph;
  }

  public void setCatph(String catph) {
    this.catph = catph;
  }

  public String getCabad5() {
    return cabad5;
  }

  public void setCabad5(String cabad5) {
    this.cabad5 = cabad5;
  }

  public String getCaswb() {
    return caswb;
  }

  public void setCaswb(String caswb) {
    this.caswb = caswb;
  }

  public String getCacnas() {
    return cacnas;
  }

  public void setCacnas(String cacnas) {
    this.cacnas = cacnas;
  }

  public String getCaswl() {
    return caswl;
  }

  public void setCaswl(String caswl) {
    this.caswl = caswl;
  }

  public String getCaswbr() {
    return caswbr;
  }

  public void setCaswbr(String caswbr) {
    this.caswbr = caswbr;
  }

  public String getTibicn() {
    return tibicn;
  }

  public void setTibicn(String tibicn) {
    this.tibicn = tibicn;
  }

  public String getMnt_in_bo() {
    return mnt_in_bo;
  }

  public void setMnt_in_bo(String mnt_in_bo) {
    this.mnt_in_bo = mnt_in_bo;
  }

  public String getParent_brn() {
    return parent_brn;
  }

  public void setParent_brn(String parent_brn) {
    this.parent_brn = parent_brn;
  }

  public String getBaseCcy() {
    return baseCcy;
  }

  public void setBaseCcy(String baseCcy) {
    this.baseCcy = baseCcy;
  }

  public String getLocalCcy() {
    return localCcy;
  }

  public void setLocalCcy(String localCcy) {
    this.localCcy = localCcy;
  }

  public String getSwift_brn() {
    return swift_brn;
  }

  public void setSwift_brn(String swift_brn) {
    this.swift_brn = swift_brn;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getFurtherId() {
    return furtherId;
  }

  public void setFurtherId(String furtherId) {
    this.furtherId = furtherId;
  }

  public Long getBranchEnt() {
    return branchEnt;
  }

  public void setBranchEnt(Long branchEnt) {
    this.branchEnt = branchEnt;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getMainBank() {
    return mainBank;
  }

  public void setMainBank(String mainBank) {
    this.mainBank = mainBank;
  }

  public String getNoTrans() {
    return noTrans;
  }

  public void setNoTrans(String noTrans) {
    this.noTrans = noTrans;
  }

  public Integer getBrchLevel() {
    return brchLevel;
  }

  public void setBrchLevel(Integer brchLevel) {
    this.brchLevel = brchLevel;
  }

  public String getChildren() {
    return children;
  }

  public void setChildren(String children) {
    this.children = children;
  }

  public String getMainBranch() {
    return mainBranch;
  }

  public void setMainBranch(String mainBranch) {
    this.mainBranch = mainBranch;
  }

  public String getUltParent() {
    return ultParent;
  }

  public void setUltParent(String ultParent) {
    this.ultParent = ultParent;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
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

  public String getTelexAb() {
    return telexAb;
  }

  public void setTelexAb(String telexAb) {
    this.telexAb = telexAb;
  }

  public String getBankGroup() {
    return bankGroup;
  }

  public void setBankGroup(String bankGroup) {
    this.bankGroup = bankGroup;
  }

  public String getBusiness() {
    return business;
  }

  public void setBusiness(String business) {
    this.business = business;
  }

  public String getAutonomous() {
    return autonomous;
  }

  public void setAutonomous(String autonomous) {
    this.autonomous = autonomous;
  }

  public String getRateFormat() {
    return rateFormat;
  }

  public void setRateFormat(String rateFormat) {
    this.rateFormat = rateFormat;
  }

  public Integer getTolerance() {
    return tolerance;
  }

  public void setTolerance(Integer tolerance) {
    this.tolerance = tolerance;
  }

  public String getParamSet() {
    return paramSet;
  }

  public void setParamSet(String paramSet) {
    this.paramSet = paramSet;
  }

  public String getServices() {
    return services;
  }

  public void setServices(String services) {
    this.services = services;
  }

  public Long getOptParSet() {
    return optParSet;
  }

  public void setOptParSet(Long optParSet) {
    this.optParSet = optParSet;
  }

  public String getInheritCdp() {
    return inheritCdp;
  }

  public void setInheritCdp(String inheritCdp) {
    this.inheritCdp = inheritCdp;
  }

  public String getRf_status() {
    return rf_status;
  }

  public void setRf_status(String rf_status) {
    this.rf_status = rf_status;
  }

  public String getBhOpening() {
    return bhOpening;
  }

  public void setBhOpening(String bhOpening) {
    this.bhOpening = bhOpening;
  }

  public String getBhClosing() {
    return bhClosing;
  }

  public void setBhClosing(String bhClosing) {
    this.bhClosing = bhClosing;
  }

  public String getSwiftGpi() {
    return swiftGpi;
  }
}
