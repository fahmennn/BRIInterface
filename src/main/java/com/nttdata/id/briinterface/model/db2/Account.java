package com.nttdata.id.briinterface.model.db2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.ColumnResult;

import com.nttdata.id.briinterface.dtos.AccountResultResponseDTO;

@Entity
@Table(name = "ACCOUNT", schema = "TRADEIN1")
@NamedNativeQuery(
  name = "Account.getAccountResponse",
  query = "",
  resultSetMapping = "AccountSearchResultMapping"
)

@SqlResultSetMapping(
  name = "AccountSearchResultMapping",
  classes = @ConstructorResult(
    targetClass = AccountResultResponseDTO.class,
    columns = {
      @ColumnResult(name = "BRANCH", type = String.class),
      @ColumnResult(name = "BRANCHNUMBER", type = String.class),
      @ColumnResult(name = "CUSTOMER", type = String.class),
      @ColumnResult(name = "CUSTOMERNUMBER", type = String.class),
      @ColumnResult(name = "CATEGORYCODE", type = String.class),
      @ColumnResult(name = "ACCOUNTTYPE", type = String.class),
      @ColumnResult(name = "CURRENCY", type = String.class),
      @ColumnResult(name = "OTHERCURRENCY", type = String.class),
      @ColumnResult(name = "BACKOFFICEACCOUNT", type = String.class),
      @ColumnResult(name = "SHORTNAME", type = String.class),
      @ColumnResult(name = "EXTERNALACCOUNT", type = String.class),
      @ColumnResult(name = "IBAN", type = String.class),
    }
  )
)
public class Account {

  @Column(name = "MNT_IN_BO")
  private String mntInBo;

  @Id
  @Column(name = "ACCT_KEY")
  private String acctKey;

  @Column(name = "BRCH_MNM")
  private String brchMnm;

  @Column(name = "CUS_SBB")
  private String cusSbb;

  @Column(name = "CUS_MNM")
  private String cusMnm;

  @Column(name = "ACCT_TYPE")
  private String accType;

  @Column(name = "ACCT_SEQNO")
  private Integer accSeqNo;

  @Column(name = "CATEGORY")
  private String category;

  @Column(name = "CURRENCY")
  private String currency;

  @Column(name = "OTHER_CCY")
  private String otherCcy;

  @Column(name = "CONTINGENT")
  private String contingent;

  @Column(name = "INTRNAL")
  private String intrnal;

  @Column(name = "SHORTNAME")
  private String shortName;

  @Column(name = "BO_ACCTNO")
  private String boAcctNo;

  @Column(name = "EXT_ACCTNO")
  private String extAcctNo;

  @Column(name = "IBAN")
  private String iban;

  @Column(name = "COUNTRY")
  private String country;

  @Column(name = "DATEOPENED")
  private Date dateOpened;

  @Column(name = "DATECLOSED")
  private Date dateClosed;

  @Column(name = "DATEMAINT")
  private Date dateMaint;

  @Column(name = "DATE_DWNL")
  private Date dateDwnl;

  @Column(name = "DESCR1")
  private String descr1;

  @Column(name = "DESCR2")
  private String descr2;

  @Column(name = "TYPEFLAG")
  private Integer typeFlag;

  @Column(name = "TSTAMP")
  private Integer tstamp;

  @Column(name = "ACCT_ID")
  private String acctID;

  // Getter & Setter

  public String getMntInBo() {
    return mntInBo;
  }

  public void setMntInBo(String mntInBo) {
    this.mntInBo = mntInBo;
  }

  public String getAcctKey() {
    return acctKey;
  }

  public void setAcctKey(String acctKey) {
    this.acctKey = acctKey;
  }

  public String getBrchMnm() {
    return brchMnm;
  }

  public void setBrchMnm(String brchMnm) {
    this.brchMnm = brchMnm;
  }

  public String getCusSbb() {
    return cusSbb;
  }

  public void setCusSbb(String cusSbb) {
    this.cusSbb = cusSbb;
  }

  public String getCusMnm() {
    return cusMnm;
  }

  public void setCusMnm(String cusMnm) {
    this.cusMnm = cusMnm;
  }

  public String getAccType() {
    return accType;
  }

  public void setAccType(String accType) {
    this.accType = accType;
  }

  public Integer getAccSeqNo() {
    return accSeqNo;
  }

  public void setAccSeqNo(Integer accSeqNo) {
    this.accSeqNo = accSeqNo;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getOtherCcy() {
    return otherCcy;
  }

  public void setOtherCcy(String otherCcy) {
    this.otherCcy = otherCcy;
  }

  public String getContingent() {
    return contingent;
  }

  public void setContingent(String contingent) {
    this.contingent = contingent;
  }

  public String getIntrnal() {
    return intrnal;
  }

  public void setIntrnal(String intrnal) {
    this.intrnal = intrnal;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getBoAcctNo() {
    return boAcctNo;
  }

  public void setBoAcctNo(String boAcctNo) {
    this.boAcctNo = boAcctNo;
  }

  public String getExtAcctNo() {
    return extAcctNo;
  }

  public void setExtAcctNo(String extAcctNo) {
    this.extAcctNo = extAcctNo;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Date getDateOpened() {
    return dateOpened;
  }

  public void setDateOpened(Date dateOpened) {
    this.dateOpened = dateOpened;
  }

  public Date getDateClosed() {
    return dateClosed;
  }

  public void setDateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
  }

  public Date getDateMaint() {
    return dateMaint;
  }

  public void setDateMaint(Date dateMaint) {
    this.dateMaint = dateMaint;
  }

  public Date getDateDwnl() {
    return dateDwnl;
  }

  public void setDateDwnl(Date dateDwnl) {
    this.dateDwnl = dateDwnl;
  }

  public String getDescr1() {
    return descr1;
  }

  public void setDescr1(String descr1) {
    this.descr1 = descr1;
  }

  public String getDescr2() {
    return descr2;
  }

  public void setDescr2(String descr2) {
    this.descr2 = descr2;
  }

  public Integer getTypeFlag() {
    return typeFlag;
  }

  public void setTypeFlag(Integer typeFlag) {
    this.typeFlag = typeFlag;
  }

  public Integer getTstamp() {
    return tstamp;
  }

  public void setTstamp(Integer tstamp) {
    this.tstamp = tstamp;
  }

  public String getAcctID() {
    return acctID;
  }

  public void setAcctID(String acctID) {
    this.acctID = acctID;
  }

}
