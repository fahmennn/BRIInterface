package com.nttdata.id.briinterface.model.db2;

import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nttdata.id.briinterface.dtos.MasterResponseDTO;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ConstructorResult;
import javax.persistence.ColumnResult;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MASTER", schema = "TRADEIN1")
@NamedNativeQuery(
    name = "Master.findMasterByRef",
    query = "",
    resultSetMapping = "MasterResponseMappingDTO"
)

@SqlResultSetMapping(
    name = "MasterResponseMappingDTO",
    classes = @ConstructorResult(
        targetClass = MasterResponseDTO.class,
        columns = {
            @ColumnResult(name = "KEY97", type = Long.class),
            @ColumnResult(name = "REFNO_MBE", type = String.class),
            @ColumnResult(name = "REFNO_PFIX", type = String.class),
            @ColumnResult(name = "REFNO_BRN", type = String.class),
            @ColumnResult(name = "REFNO_SERL", type = Integer.class),
            @ColumnResult(name = "PRINAME_L1", type = String.class),
            @ColumnResult(name = "EXEMPLAR", type = Long.class),
            @ColumnResult(name = "STATUS", type = String.class),
            @ColumnResult(name = "PRDCLASS", type = String.class),
            @ColumnResult(name = "UTILIS_AMT", type = BigDecimal.class),
            @ColumnResult(name = "UTILIS_CCY", type = String.class),
            @ColumnResult(name = "ORIG_REF", type = String.class),
            @ColumnResult(name = "PARENT_EV", type = Long.class),
            @ColumnResult(name = "INPUT_BRN", type = String.class),
            @ColumnResult(name = "BHALF_BRN", type = String.class),
            @ColumnResult(name = "EXPIRY_DAT", type = String.class),
            @ColumnResult(name = "EXPIRY_LOC", type = String.class),
            @ColumnResult(name = "AMOUNT", type = BigDecimal.class),
            @ColumnResult(name = "CCY", type = String.class),
            @ColumnResult(name = "AMT_O_S", type = BigDecimal.class),
            @ColumnResult(name = "DFLT_WKGRP", type = String.class),
            @ColumnResult(name = "PCP_PTY", type = Long.class),
            @ColumnResult(name = "NPCP_PTY", type = Long.class),
            @ColumnResult(name = "CHARGE_FOR", type = String.class),
            @ColumnResult(name = "USERCODE1", type = String.class),
            @ColumnResult(name = "USERCODE2", type = String.class),
            @ColumnResult(name = "USERCODE3", type = String.class),
            @ColumnResult(name = "RESP_USER", type = Long.class),
            @ColumnResult(name = "CTRCT_DATE", type = String.class),
            @ColumnResult(name = "WORKGROUP", type = String.class),
            @ColumnResult(name = "LIAB_AMT", type = BigDecimal.class),
            @ColumnResult(name = "LIAB_CCY", type = String.class),
            @ColumnResult(name = "TFR_MTHD", type = String.class),
            @ColumnResult(name = "SHAREDLIAB", type = String.class),
            @ColumnResult(name = "MAILTOBRN", type = String.class),
            @ColumnResult(name = "RELMSTRKEY", type = Long.class),
            @ColumnResult(name = "RELMSTRREF", type = String.class),
            @ColumnResult(name = "PRODTYPE", type = Long.class),
            @ColumnResult(name = "PRIMARYCUS", type = Long.class),
            @ColumnResult(name = "USEROPTN1", type = Long.class),
            @ColumnResult(name = "USEROPTN2", type = Long.class),
            @ColumnResult(name = "USEROPTN3", type = Long.class),
            @ColumnResult(name = "USEROPTN4", type = Long.class),
            @ColumnResult(name = "USEROPTN5", type = Long.class),
            @ColumnResult(name = "TOTLIABAMT", type = BigDecimal.class),
            @ColumnResult(name = "TOTLIABCCY", type = String.class),
            @ColumnResult(name = "REIMB_CHGS", type = String.class),
            @ColumnResult(name = "BILLLEVEL", type = String.class),
            @ColumnResult(name = "BOOKOFFDAT", type = String.class),
            @ColumnResult(name = "ECFLNK_KEY", type = Long.class),
            @ColumnResult(name = "ECFLNK_REF", type = String.class),
            @ColumnResult(name = "DEACT_DATE", type = String.class),
            @ColumnResult(name = "DATATAKEON", type = String.class),
            @ColumnResult(name = "ACTIVE", type = String.class),
            @ColumnResult(name = "PREV_STS", type = String.class),
            @ColumnResult(name = "MASTER_REF", type = String.class),
            @ColumnResult(name = "REF_LOCK", type = String.class),
            @ColumnResult(name = "PRICUSTSBB", type = String.class),
            @ColumnResult(name = "PRICUSTMNM", type = String.class),
            @ColumnResult(name = "VERLEVEL", type = Integer.class),
            @ColumnResult(name = "CANOURREF", type = String.class),
            @ColumnResult(name = "EV_COUNT", type = Integer.class),
            @ColumnResult(name = "EXTFIELD", type = Long.class),
            @ColumnResult(name = "NO_BROWSE", type = String.class),
            @ColumnResult(name = "PRI_REF", type = String.class),
            @ColumnResult(name = "CANPRNREF", type = String.class),
            @ColumnResult(name = "NPR_REF", type = String.class),
            @ColumnResult(name = "CANNPRNREF", type = String.class),
            @ColumnResult(name = "TAKEON", type = String.class),
            @ColumnResult(name = "TAKE_AMDNO", type = Integer.class),
            @ColumnResult(name = "TAKE_DATE", type = String.class),
            @ColumnResult(name = "TAKE_PAYNO", type = Integer.class),
            @ColumnResult(name = "ORIGNAME", type = String.class),
            @ColumnResult(name = "ORIGTEAM", type = String.class),
            @ColumnResult(name = "ORIGISUSER", type = String.class),
            @ColumnResult(name = "ORIGBRANCH", type = String.class),
            @ColumnResult(name = "ORIGUSER", type = Long.class),
            @ColumnResult(name = "ORIGREF", type = String.class),
            @ColumnResult(name = "EBANKMSREF", type = String.class),
            @ColumnResult(name = "NPRCUSTSBB", type = String.class),
            @ColumnResult(name = "NPRCUSTMNM", type = String.class),
            @ColumnResult(name = "NPRNAME_L1", type = String.class),
            @ColumnResult(name = "PCP_SW_BIC", type = String.class),
            @ColumnResult(name = "NPC_SW_BIC", type = String.class)
        }
    )
)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Master implements Serializable {

	@Id
    @Column(name = "KEY97")
    @NotBlank(message = "KEY97 is mandatory")
    private Long key97;

    @Column(name = "REFNO_MBE")
    private String refnoMbe;

    @Column(name = "REFNO_PFIX")
    private String refnoPfix;

    @Column(name = "REFNO_BRN")
    private String refnoBrn;

    @Column(name = "REFNO_SERL")
    private Integer refnoSerl;

    @Column(name = "PRINAME_L1")
    private String prinameL1;

    @Column(name = "EXEMPLAR")
    private Long exemplar;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PRDCLASS")
    private String prdclass;

    @Column(name = "UTILIS_AMT")
    private BigDecimal utilisAmt;

    @Column(name = "UTILIS_CCY")
    private String utilisCcy;

    @Column(name = "ORIG_REF")
    private String orig_Ref;

    @Column(name = "PARENT_EV")
    private Long parentEv;

    @Column(name = "INPUT_BRN")
    private String inputBrn;

    @Column(name = "BHALF_BRN")
    private String bhalfBrn;

    @Column(name = "EXPIRY_DAT")
    private Date expiryDat;

    @Column(name = "EXPIRY_LOC")
    private String expiryLoc;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "CCY")
    private String ccy;

    @Column(name = "AMT_O_S")
    private BigDecimal amtOS;

    @Column(name = "DFLT_WKGRP")
    private String dfltWkgrp;

    @Column(name = "PCP_PTY")
    private Long pcpPty;

    @Column(name = "NPCP_PTY")
    private Long npcpPty;

    @Column(name = "CHARGE_FOR")
    private String chargeFor;

    @Column(name = "USERCODE1")
    private String userCode1;

    @Column(name = "USERCODE2")
    private String userCode2;

    @Column(name = "USERCODE3")
    private String userCode3;

    @Column(name = "RESP_USER")
    private Long respUser;

    @Column(name = "CTRCT_DATE")
    private Date ctrctDate;

    @Column(name = "WORKGROUP")
    private String workgroup;

    @Column(name = "LIAB_AMT")
    private BigDecimal liabAmt;

    @Column(name = "LIAB_CCY")
    private String liabCcy;

    @Column(name = "TFR_MTHD")
    private String tfrMthd;

    @Column(name = "SHARED_LIAB")
    private String sharedLiab;

    @Column(name = "MAILTOBRN")
    private String mailToBrn;

    @Column(name = "RELMSTRKEY")
    private Long relmstrKey;

    @Column(name = "RELMSTRREF")
    private String relmstrRef;

    @Column(name = "PRODTYPE")
    private Long prodtype;

    @Column(name = "PRIMARYCUS")
    private Long primaryCus;

    @Column(name = "USEROPTN1")
    private Long userOptn1;

    @Column(name = "USEROPTN2")
    private Long userOptn2;

    @Column(name = "USEROPTN3")
    private Long userOptn3;

    @Column(name = "USEROPTN4")
    private Long userOptn4;

    @Column(name = "USEROPTN5")
    private Long userOptn5;

    @Column(name = "TOTLIABAMT")
    private BigDecimal totLiabAmt;

    @Column(name = "TOTLIABCCY")
    private String totLiabCcy;

    @Column(name = "REIMB_CHGS")
    private String reimbChgs;

    @Column(name = "BILLLEVEL")
    private String billLevel;

    @Column(name = "BOOKOFFDAT")
    private Date bookOffDat;

    @Column(name = "ECFLNK_KEY")
    private Long ecflnkKey;

    @Column(name = "ECFLNK_REF")
    private String ecflnkRef;

    @Column(name = "DEACT_DATE")
    private Date deactDate;

    @Column(name = "DATATAKEON")
    private String dataTakeOn;

    @Column(name = "ACTIVE")
    private String active;

    @Column(name = "PREV_STS")
    private String prevSts;

    @Column(name = "MASTER_REF")
    private String masterRef;

    @Column(name = "REF_LOCK")
    private String refLock;

    @Column(name = "PRICUSTSBB")
    private String priCustSbb;

    @Column(name = "PRICUSTMNM")
    private String priCustMnm;

    @Column(name = "VERLEVEL")
    private Integer verLevel;

    @Column(name = "CANOURREF")
    private String canOurRef;

    @Column(name = "EV_COUNT")
    private Integer evCount;

    @Column(name = "EXTFIELD")
    private Long extField;

    @Column(name = "NO_BROWSE")
    private String noBrowse;

    @Column(name = "PRI_REF")
    private String priRef;

    @Column(name = "CANPRNREF")
    private String canPrnRef;

    @Column(name = "NPR_REF")
    private String nprRef;

    @Column(name = "CANNPRNREF")
    private String canNprnRef;

    @Column(name = "TAKEON")
    private String takeOn;

    @Column(name = "TAKE_AMDNO")
    private Integer takeAmdno;

    @Column(name = "TAKE_DATE")
    private Date takeDate;

    @Column(name = "TAKE_PAYNO")
    private Integer takePayno;

    @Column(name = "ORIGNAME")
    private String origName;

    @Column(name = "ORIGTEAM")
    private String origTeam;

    @Column(name = "ORIGISUSER")
    private String origIsUser;

    @Column(name = "ORIGBRANCH")
    private String origBranch;

    @Column(name = "ORIGUSER")
    private Long origUser;

    @Column(name = "ORIGREF")
    private String origRef;

    @Column(name = "EBANKMASREF")
    private String ebankMasRef;

    @Column(name = "NPRCUSTSBB")
    private String nprCustSbb;

    @Column(name = "NPRCUSTMNM")
    private String nprCustMnm;

    @Column(name = "NPRNAME_L1")
    private String nprNameL1;

    @Column(name = "PCP_SW_BIC")
    private String pcpSwBic;

    @Column(name = "NPC_SW_BIC")
    private String npcSwBic;

    // Getter & Setter
    public Long getKey97() {
        return key97;
    }

    public void setKey97(Long key97) {
        this.key97 = key97;
    }

    public String getRefnoMbe() {
        return refnoMbe;
    }

    public void setRefnoMbe(String refnoMbe) {
        this.refnoMbe = refnoMbe;
    }

    public String getRefnoPfix() {
        return refnoPfix;
    }

    public void setRefnoPfix(String refnoPfix) {
        this.refnoPfix = refnoPfix;
    }

    public String getRefnoBrn() {
        return refnoBrn;
    }

    public void setRefnoBrn(String refnoBrn) {
        this.refnoBrn = refnoBrn;
    }

    public Integer getRefnoSerl() {
        return refnoSerl;
    }

    public void setRefnoSerl(Integer refnoSerl) {
        this.refnoSerl = refnoSerl;
    }

    public String getPrinameL1() {
        return prinameL1;
    }

    public void setPrinameL1(String prinameL1) {
        this.prinameL1 = prinameL1;
    }

    public Long getExemplar() {
        return exemplar;
    }

    public void setExemplar(Long exemplar) {
        this.exemplar = exemplar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrdclass() {
        return prdclass;
    }

    public void setPrdclass(String prdclass) {
        this.prdclass = prdclass;
    }

    public BigDecimal getUtilisAmt() {
        return utilisAmt;
    }

    public void setUtilisAmt(BigDecimal utilisAmt) {
        this.utilisAmt = utilisAmt;
    }

    public String getUtilisCcy() {
        return utilisCcy;
    }

    public void setUtilisCcy(String utilisCcy) {
        this.utilisCcy = utilisCcy;
    }

    public String getOrig_Ref() {
        return orig_Ref;
    }

    public void setOrig_Ref(String orig_Ref) {
        this.orig_Ref = orig_Ref;
    }

    public Long getParentEv() {
        return parentEv;
    }

    public void setParentEv(Long parentEv) {
        this.parentEv = parentEv;
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

    public Date getExpiryDat() {
        return expiryDat;
    }

    public void setExpiryDat(Date expiryDat) {
        this.expiryDat = expiryDat;
    }

    public String getExpiryLoc() {
        return expiryLoc;
    }

    public void setExpiryLoc(String expiryLoc) {
        this.expiryLoc = expiryLoc;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public BigDecimal getAmtOS() {
        return amtOS;
    }

    public void setAmtOS(BigDecimal amtOS) {
        this.amtOS = amtOS;
    }

    public String getChargeFor() {
        return chargeFor;
    }

    public void setChargeFor(String chargeFor) {
        this.chargeFor = chargeFor;
    }

    public Date getCtrctDate() {
        return ctrctDate;
    }

    public void setCtrctDate(Date ctrctDate) {
        this.ctrctDate = ctrctDate;
    }

    public String getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(String workgroup) {
        this.workgroup = workgroup;
    }

    public Long getRelmstrKey() {
        return relmstrKey;
    }

    public void setRelmstrKey(Long relmstrKey) {
        this.relmstrKey = relmstrKey;
    }

    public String getRelmstrRef() {
        return relmstrRef;
    }

    public void setRelmstrRef(String relmstrRef) {
        this.relmstrRef = relmstrRef;
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

    public Long getUserOptn1() {
        return userOptn1;
    }

    public void setUserOptn1(Long userOptn1) {
        this.userOptn1 = userOptn1;
    }

    public Long getUserOptn2() {
        return userOptn2;
    }

    public void setUserOptn2(Long userOptn2) {
        this.userOptn2 = userOptn2;
    }

    public Long getUserOptn3() {
        return userOptn3;
    }

    public void setUserOptn3(Long userOptn3) {
        this.userOptn3 = userOptn3;
    }

    public Long getUserOptn4() {
        return userOptn4;
    }

    public void setUserOptn4(Long userOptn4) {
        this.userOptn4 = userOptn4;
    }

    public Long getUserOptn5() {
        return userOptn5;
    }

    public void setUserOptn5(Long userOptn5) {
        this.userOptn5 = userOptn5;
    }

    public String getReimbChgs() {
        return reimbChgs;
    }

    public void setReimbChgs(String reimbChgs) {
        this.reimbChgs = reimbChgs;
    }

    public Date getBookOffDat() {
        return bookOffDat;
    }

    public void setBookOffDat(Date bookOffDat) {
        this.bookOffDat = bookOffDat;
    }

    public Date getDeactDate() {
        return deactDate;
    }

    public void setDeactDate(Date deactDate) {
        this.deactDate = deactDate;
    }

    public String getDataTakeOn() {
        return dataTakeOn;
    }

    public void setDataTakeOn(String dataTakeOn) {
        this.dataTakeOn = dataTakeOn;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getMasterRef() {
        return masterRef;
    }

    public void setMasterRef(String masterRef) {
        this.masterRef = masterRef;
    }

    public String getRefLock() {
        return refLock;
    }

    public void setRefLock(String refLock) {
        this.refLock = refLock;
    }

    public String getPriCustSbb() {
        return priCustSbb;
    }

    public void setPriCustSbb(String priCustSbb) {
        this.priCustSbb = priCustSbb;
    }

    public String getPriCustMnm() {
        return priCustMnm;
    }

    public void setPriCustMnm(String priCustMnm) {
        this.priCustMnm = priCustMnm;
    }

    public Integer getVerLevel() {
        return verLevel;
    }

    public void setVerLevel(Integer verLevel) {
        this.verLevel = verLevel;
    }

    public String getCanOurRef() {
        return canOurRef;
    }

    public void setCanOurRef(String canOurRef) {
        this.canOurRef = canOurRef;
    }

    public Integer getEvCount() {
        return evCount;
    }

    public void setEvCount(Integer evCount) {
        this.evCount = evCount;
    }

    public Long getExtField() {
        return extField;
    }

    public void setExtField(Long extField) {
        this.extField = extField;
    }

    public String getNoBrowse() {
        return noBrowse;
    }

    public void setNoBrowse(String noBrowse) {
        this.noBrowse = noBrowse;
    }

    public String getPriRef() {
        return priRef;
    }

    public void setPriRef(String priRef) {
        this.priRef = priRef;
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

    public String getCanNprnRef() {
        return canNprnRef;
    }

    public void setCanNprnRef(String canNprnRef) {
        this.canNprnRef = canNprnRef;
    }

    public String getTakeOn() {
        return takeOn;
    }

    public void setTakeOn(String takeOn) {
        this.takeOn = takeOn;
    }

    public String getNprCustSbb() {
        return nprCustSbb;
    }

    public void setNprCustSbb(String nprCustSbb) {
        this.nprCustSbb = nprCustSbb;
    }

    public String getNprCustMnm() {
        return nprCustMnm;
    }

    public void setNprCustMnm(String nprCustMnm) {
        this.nprCustMnm = nprCustMnm;
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
}
