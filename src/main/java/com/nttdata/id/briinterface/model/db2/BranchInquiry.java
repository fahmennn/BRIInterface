package com.nttdata.id.briinterface.model.db2;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.nttdata.id.briinterface.dtos.BranchInquiryResponseDTO;

@Entity
@Table(name = "CAPF", schema = "TRADEIN1")
@NamedNativeQuery(
  name = "BranchInquiry.findByCabbn",
  query = "",
  resultSetMapping = "BranchInquiryMapping"
)

@SqlResultSetMapping(
  name = "BranchInquiryMapping",
  classes = @ConstructorResult(
    targetClass = BranchInquiryResponseDTO.class,
    columns = {
      @ColumnResult(name = "CABRNM", type = String.class),
      @ColumnResult(name = "CABAD1", type = String.class),
      @ColumnResult(name = "CABAD2", type = String.class),
      @ColumnResult(name = "CABAD3", type = String.class),
      @ColumnResult(name = "CABAD4", type = String.class),
      @ColumnResult(name = "CABBN", type = String.class),
      @ColumnResult(name = "CABRN", type = String.class),
      @ColumnResult(name = "CATLY", type = String.class),
      @ColumnResult(name = "CATPH", type = String.class),
      @ColumnResult(name = "CABAD5", type = String.class),
      @ColumnResult(name = "CASWB", type = String.class),
      @ColumnResult(name = "CACNAS", type = String.class),
      @ColumnResult(name = "CASWL", type = String.class),
      @ColumnResult(name = "CASWBR", type = String.class),
      @ColumnResult(name = "TIBICN", type = String.class),
      @ColumnResult(name = "MNT_IN_BO", type = String.class),
      @ColumnResult(name = "PARENT_BRN", type = String.class),
      @ColumnResult(name = "BASECCY", type = String.class),
      @ColumnResult(name = "LOCALCCY", type = String.class),
      @ColumnResult(name = "SWIFT_BRN", type = String.class),
      @ColumnResult(name = "COUNTRY", type = String.class),
      @ColumnResult(name = "FURTHERID", type = String.class),
      @ColumnResult(name = "BRANCHENT", type = Long.class),
      @ColumnResult(name = "TIMEZONE", type = String.class),
      @ColumnResult(name = "MAINBANK", type = String.class),
      @ColumnResult(name = "NOTRANS", type = String.class),
      @ColumnResult(name = "BRCHLEVEL", type = Integer.class),
      @ColumnResult(name = "CHILDREN", type = String.class),
      @ColumnResult(name = "MAINBRANCH", type = String.class),
      @ColumnResult(name = "ULTPARENT", type = String.class),
      @ColumnResult(name = "FULLNAME", type = String.class),
      @ColumnResult(name = "CITY", type = String.class),
      @ColumnResult(name = "EMAIL", type = String.class),
      @ColumnResult(name = "TELEPHONE", type = String.class),
      @ColumnResult(name = "FAX", type = String.class),
      @ColumnResult(name = "TELEX", type = String.class),
      @ColumnResult(name = "TELEXAB", type = String.class),
      @ColumnResult(name = "BANKGROUP", type = String.class),
      @ColumnResult(name = "BUSINESS", type = String.class),
      @ColumnResult(name = "AUTONOMOUS", type = String.class),
      @ColumnResult(name = "RATEFORMAT", type = String.class),
      @ColumnResult(name = "TOLERANCE", type = Integer.class),
      @ColumnResult(name = "PARAMSET", type = String.class),
      @ColumnResult(name = "SERVICES", type = String.class),
      @ColumnResult(name = "OPTPARSET", type = Long.class),
      @ColumnResult(name = "INHERITCDP", type = String.class),
      @ColumnResult(name = "RF_STATUS", type = String.class),
      @ColumnResult(name = "BHOPENING", type = String.class),
      @ColumnResult(name = "BHCLOSING", type = String.class),
      @ColumnResult(name = "SWIFTGPI", type = String.class)
    }
  )
)
public class BranchInquiry {

  @Id
  @NotBlank(message = "CABRNM is mandatory")
  @Size(max = 8, message = "CABRNM must be size 8 characters")
  private String cabrnm;

  @Size(max = 35, message = "CABAD1 must be size 35 characters")
  private String cabad1;

  @Size(max = 35, message = "CABAD2 must be size 35 characters")
  private String cabad2;

  @Size(max = 35, message = "CABAD3 must be size 35 characters")
  private String cabad3;

  @Size(max = 35, message = "CABAD4 must be size 35 characters")
  private String cabad4;

  @Size(max = 4, message = "CABBN must be size 4 characters")
  private String cabbn;

  @Size(max = 35, message = "CABRN must be size 35 characters")
  private String cabrn;

  @Size(max = 16, message = "CATLY must be size 16 characters")
  private String catly;

  @Size(max = 16, message = "CATPH must be size 16 characters")
  private String catph;

  @Size(max = 35, message = "CABAD5 must be size 35 characters")
  private String cabad5;

  @Size(max = 4, message = "CASWB must be size 4 characters")
  private String caswb;

  @Size(max = 2, message = "CACNAS must be size 2 characters")
  private String cacnas;

  @Size(max = 2, message = "CASWL must be size 2 characters")
  private String caswl;

  @Size(max = 3, message = "CASWBR must be size 3 characters")
  private String caswbr;

  @Size(max = 20, message = "TIBICN must be size 20 characters")
  private String tibicn;

  @Size(max = 1, message = "MNT_IN_BO must be size 1 character")
  private String mntInBo;

  @Size(max = 8, message = "PARENT_BRN must be size 8 characters")
  private String parentBrn;

  @Size(max = 3, message = "BASECCY must be size 3 characters")
  private String baseCcy;

  @Size(max = 3, message = "LOCALCCY must be size 3 characters")
  private String localCcy;

  @Size(max = 1, message = "SWIFT_BRN must be size 1 character")
  private String swiftBrn;

  @Size(max = 2, message = "COUNTRY must be size 2 characters")
  private String country;

  @Size(max = 35, message = "FURTHERID must be size 35 characters")
  private String furtherId;

  private Long branchEnt;

  @Size(max = 100, message = "TIMEZONE must be size 100 characters")
  private String timezone;

  @Size(max = 1, message = "MAINBANK must be size 1 character")
  private String mainBank;

  @Size(max = 1, message = "NOTRANS must be size 1 character")
  private String noTrans;

  private Integer brchLevel;

  @Size(max = 1, message = "CHILDREN must be size 1 character")
  private String children;

  @Size(max = 8, message = "MAINBRANCH must be size 8 characters")
  private String mainBranch;

  @Size(max = 8, message = "ULTPARENT must be size 8 characters")
  private String ultParent;

  @Size(max = 70, message = "FULLNAME must be size 70 characters")
  private String fullName;

  @Size(max = 35, message = "CITY must be size 35 characters")
  private String city;

  @Size(max = 128, message = "EMAIL must be size 128 characters")
  private String email;

  @Size(max = 20, message = "TELEPHONE must be size 20 characters")
  private String telephone;

  @Size(max = 20, message = "FAX must be size 20 characters")
  private String fax;

  @Size(max = 20, message = "TELEX must be size 20 characters")
  private String telex;

  @Size(max = 8, message = "TELEXAB must be size 8 characters")
  private String telexAb;

  @Size(max = 1, message = "BANKGROUP must be size 1 character")
  private String bankGroup;

  @Size(max = 1, message = "BUSINESS must be size 1 character")
  private String business;

  @Size(max = 1, message = "AUTONOMOUS must be size 1 character")
  private String autonomous;

  @Size(max = 3, message = "RATEFORMAT must be size 3 characters")
  private String rateFormat;

  private Integer tolerance;

  @Size(max = 1, message = "PARAMSET must be size 1 character")
  private String paramSet;

  @Size(max = 1, message = "SERVICES must be size 1 character")
  private String services;

  private Long optParSet;

  @Size(max = 1, message = "INHERITCDP must be size 1 character")
  private String inheritCdp;

  @Size(max = 1, message = "RF_STATUS must be size 1 character")
  private String rfStatus;

  @Size(max = 5, message = "BHOPENING must be size 5 characters")
  private String bhOpening;

  @Size(max = 5, message = "BHCLOSING must be size 5 characters")
  private String bhClosing;

  @Size(max = 1, message = "SWIFTGPI must be size 1 character")
  private String swiftGpi;

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

  public String getMntInBo() {
    return mntInBo;
  }

  public void setMntInBo(String mntInBo) {
    this.mntInBo = mntInBo;
  }

  public String getParentBrn() {
    return parentBrn;
  }

  public void setParentBrn(String parentBrn) {
    this.parentBrn = parentBrn;
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

  public String getSwiftBrn() {
    return swiftBrn;
  }

  public void setSwiftBrn(String swiftBrn) {
    this.swiftBrn = swiftBrn;
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

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
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

  public String getRfStatus() {
    return rfStatus;
  }

  public void setRfStatus(String rfStatus) {
    this.rfStatus = rfStatus;
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

  public void setSwiftGpi(String swiftGpi) {
    this.swiftGpi = swiftGpi;
  }
}
