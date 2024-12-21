package com.nttdata.id.briinterface.model.db2;

import javax.persistence.Column;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.nttdata.id.briinterface.dtos.CustomerSearchResponseDTO;

import javax.persistence.ColumnResult;

@Entity
@Table(name = "GFPF", schema = "TRADEIN1")
@NamedNativeQuery(
  name = "Customer.getCustomerResponse",
  query = "",
  resultSetMapping = "CustomerSearchMapping"
)
@SqlResultSetMapping(
  name = "CustomerSearchMapping",
  classes = @ConstructorResult(
    targetClass = CustomerSearchResponseDTO.class,
    columns = {
      @ColumnResult(name = "CUSTOMERMNEMONIC", type = String.class),
      @ColumnResult(name = "FULLNAME", type = String.class),
      @ColumnResult(name = "CUSTOMERNUMBER", type = String.class),
      @ColumnResult(name = "COUNTRYOFRESIDENCE", type = String.class),
      @ColumnResult(name = "ACCOUNTOFFICER", type = String.class),
      @ColumnResult(name = "BLOCKED", type = String.class),
      @ColumnResult(name = "CUSTOMERGROUP", type = String.class),
      @ColumnResult(name = "LOCATION", type = String.class),
    }
  )
)

// Customer
public class Customer {

  @Column(name = "GFCUS")
  private String gfcus;

  @Column(name = "GFCLC")
  private String gfclc;

  @Column(name = "GFCUN")
  private String gfcun;

  @Column(name = "GFCPNC")
  private String gfcpnc;

  @Column(name = "GFDAS")
  private String gfdas;

  @Column(name = "GFCTP")
  private  String gfctp;

  @Column(name = "GFCUB")
  private String gfcub;

  @Column(name = "GFCUC")
  private String gfcuc;

  @Column(name = "GFCUD")
  private String gfcud;

  @Column(name = "GFCUZ")
  private String gfcuz;

  @Column(name = "GFACO")
  private String gfaco;

  @Column(name = "GFCRF")
  private String gfcrf;

  @Column(name = "GFLNM")
  private String gflnm;

  @Column(name = "GFCA2")
  private String gfca2;

  @Column(name = "GFCNAP")
  private String gfcnap;

  @Column(name = "GFCNAR")
  private String gfcnar;

  @Column(name = "GFCNAL")
  private String gfcnal;

  @Column(name = "GFGRP")
  private String gfgrp;

  @Column(name = "GFMTB")
  private String gfmtb;

  @Column(name = "GFDLM")
  private Integer gfdlm;

  @Id
  @Column(name = "GFCUS1")
  private String gfcus1;

  @Column(name = "GFCUS2")
  private String gfctp1;

  @Column(name = "GFC201")
  private String gfc201;

  @Column(name = "GFC101")
  private String gfc101;

  @Column(name = "GFPCUS")
  private String gfpcus;

  @Column(name = "GFPCLC")
  private String gfpclc;

  @Column(name = "GFPCUS1")
  private String gfpcus1;

  @Column(name = "TIFCMF")
  private String tifcmf;

  @Column(name = "DATE_DL")
  private Integer dateDl;

  @Column(name = "SOURCE")
  private String source;

  @Column(name = "CLRNUMBER")
  private String clrNumber;

  @Column(name = "MNT_IN_BO")
  private String mntInBo;

  @Column(name = "GFCUS1SBB")
  private String gfcus1Sbb;

  @Column(name = "TICUSTLOC")
  private String tiCustLoc;

  @Column(name = "GFBRNM")
  private String gfbrnm;

  @Column(name = "PRIME4SWIFT")
  private String prime4Swift;

  // Getter & Setter

  public String getGfcus() {
    return gfcus;
  }

  public void setGfcus(String gfcus) {
    this.gfcus = gfcus;
  }

  public String getGfclc() {
    return gfclc;
  }

  public void setGfclc(String gfclc) {
    this.gfclc = gfclc;
  }

  public String getGfcun() {
    return gfcun;
  }

  public void setGfcun(String gfcun) {
    this.gfcun = gfcun;
  }

  public String getGfcpnc() {
    return gfcpnc;
  }

  public void setGfcpnc(String gfcpnc) {
    this.gfcpnc = gfcpnc;
  }

  public String getGfdas() {
    return gfdas;
  }

  public void setGfdas(String gfdas) {
    this.gfdas = gfdas;
  }

  public String getGfctp() {
    return gfctp;
  }

  public void setGfctp(String gfctp) {
    this.gfctp = gfctp;
  }

  public String getGfcub() {
    return gfcub;
  }

  public void setGfcub(String gfcub) {
    this.gfcub = gfcub;
  }

  public String getGfcuc() {
    return gfcuc;
  }

  public void setGfcuc(String gfcuc) {
    this.gfcuc = gfcuc;
  }

  public String getGfcud() {
    return gfcud;
  }

  public void setGfcud(String gfcud) {
    this.gfcud = gfcud;
  }

  public String getGfcuz() {
    return gfcuz;
  }

  public void setGfcuz(String gfcuz) {
    this.gfcuz = gfcuz;
  }

  public String getGfaco() {
    return gfaco;
  }

  public void setGfaco(String gfaco) {
    this.gfaco = gfaco;
  }

  public String getGfcrf() {
    return gfcrf;
  }

  public void setGfcrf(String gfcrf) {
    this.gfcrf = gfcrf;
  }

  public String getGflnm() {
    return gflnm;
  }

  public void setGflnm(String gflnm) {
    this.gflnm = gflnm;
  }

  public String getGfca2() {
    return gfca2;
  }

  public void setGfca2(String gfca2) {
    this.gfca2 = gfca2;
  }

  public String getGfcnap() {
    return gfcnap;
  }

  public void setGfcnap(String gfcnap) {
    this.gfcnap = gfcnap;
  }

  public String getGfcnar() {
    return gfcnar;
  }

  public void setGfcnar(String gfcnar) {
    this.gfcnar = gfcnar;
  }

  public String getGfcnal() {
    return gfcnal;
  }

  public void setGfcnal(String gfcnal) {
    this.gfcnal = gfcnal;
  }

  public String getGfgrp() {
    return gfgrp;
  }

  public void setGfgrp(String gfgrp) {
    this.gfgrp = gfgrp;
  }

  public String getGfmtb() {
    return gfmtb;
  }

  public void setGfmtb(String gfmtb) {
    this.gfmtb = gfmtb;
  }

  public Integer getGfdlm() {
    return gfdlm;
  }

  public void setGfdlm(Integer gfdlm) {
    this.gfdlm = gfdlm;
  }

  public String getGfcus1() {
    return gfcus1;
  }

  public void setGfcus1(String gfcus1) {
    this.gfcus1 = gfcus1;
  }

  public String getGfctp1() {
    return gfctp1;
  }

  public void setGfctp1(String gfctp1) {
    this.gfctp1 = gfctp1;
  }

  public String getGfc201() {
    return gfc201;
  }

  public void setGfc201(String gfc201) {
    this.gfc201 = gfc201;
  }

  public String getGfc101() {
    return gfc101;
  }

  public void setGfc101(String gfc101) {
    this.gfc101 = gfc101;
  }

  public String getGfpcus() {
    return gfpcus;
  }

  public void setGfpcus(String gfpcus) {
    this.gfpcus = gfpcus;
  }

  public String getGfpclc() {
    return gfpclc;
  }

  public void setGfpclc(String gfpclc) {
    this.gfpclc = gfpclc;
  }

  public String getGfpcus1() {
    return gfpcus1;
  }

  public void setGfpcus1(String gfpcus1) {
    this.gfpcus1 = gfpcus1;
  }

  public String getTifcmf() {
    return tifcmf;
  }

  public void setTifcmf(String tifcmf) {
    this.tifcmf = tifcmf;
  }

  public Integer getDateDl() {
    return dateDl;
  }

  public void setDateDl(Integer dateDl) {
    this.dateDl = dateDl;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getClrNumber() {
    return clrNumber;
  }

  public void setClrNumber(String clrNumber) {
    this.clrNumber = clrNumber;
  }

  public String getMntInBo() {
    return mntInBo;
  }

  public void setMntInBo(String mntInBo) {
    this.mntInBo = mntInBo;
  }

  public String getGfcus1Sbb() {
    return gfcus1Sbb;
  }

  public void setGfcus1Sbb(String gfcus1Sbb) {
    this.gfcus1Sbb = gfcus1Sbb;
  }

  public String getTiCustLoc() {
    return tiCustLoc;
  }

  public void setTiCustLoc(String tiCustLoc) {
    this.tiCustLoc = tiCustLoc;
  }

  public String getGfbrnm() {
    return gfbrnm;
  }

  public void setGfbrnm(String gfbrnm) {
    this.gfbrnm = gfbrnm;
  }

  public String getPrime4Swift() {
    return prime4Swift;
  }

  public void setPrime4Swift(String prime4Swift) {
    this.prime4Swift = prime4Swift;
  }

}
