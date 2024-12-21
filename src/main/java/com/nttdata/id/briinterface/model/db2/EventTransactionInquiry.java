package com.nttdata.id.briinterface.model.db2;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.nttdata.id.briinterface.dtos.EventTransactionInquiryDTO;

@Entity
@Table(name = "BASEEVENT", schema = "TRADEIN1")
@NamedNativeQuery(
		name = "EventTransaction.filterEventTransaction",
	    query = "",
	    resultSetMapping = "EventTransactionMapping"
	)
@SqlResultSetMapping(
	    name = "EventTransactionMapping",
	    classes = @ConstructorResult(
	        targetClass = EventTransactionInquiryDTO.class,
	        columns = {
	        		@ColumnResult(name = "KEY97", type = Long.class),
							@ColumnResult(name = "REFNO_PFIX", type = String.class),
							@ColumnResult(name = "REFNO_SERL", type = Integer.class),
							@ColumnResult(name = "MASTER_REF", type = String.class),
							@ColumnResult(name = "START_DATE", type = String.class),
							@ColumnResult(name = "START_TIME", type = String.class),
							@ColumnResult(name = "TIMESTART", type = String.class),
							@ColumnResult(name = "STATUS", type = String.class),
							@ColumnResult(name = "TOUCHED", type = String.class),
							@ColumnResult(name = "FINISHED", type = String.class),
							@ColumnResult(name = "FINISHTIME", type = String.class),
							@ColumnResult(name = "TIMEFINISH", type = String.class),
							@ColumnResult(name = "EXEMPLAR", type = Long.class),
							@ColumnResult(name = "THEIR_REF", type = String.class),
							@ColumnResult(name = "AMOUNT", type = BigDecimal.class),
							@ColumnResult(name = "CCY", type = String.class),
							@ColumnResult(name = "TFR_METHOD", type = String.class),
							@ColumnResult(name = "STATUS_EV", type = String.class),
							@ColumnResult(name = "CROSS_REF", type = String.class),
							@ColumnResult(name = "USER_INP", type = Long.class),
							@ColumnResult(name = "USER_REV", type = Long.class),
							@ColumnResult(name = "USER_AUT", type = Long.class),
							@ColumnResult(name = "CREATNMTHD", type = String.class),
							@ColumnResult(name = "SLADATA", type = Long.class),
							@ColumnResult(name = "LAST_STEP", type = Long.class),
							@ColumnResult(name = "PSBBCODE", type = String.class),
							@ColumnResult(name = "PRIMNM", type = String.class),
							@ColumnResult(name = "EBANKEVREF", type = String.class),
							@ColumnResult(name = "ANCIL_MST", type = Long.class),
							@ColumnResult(name = "VERLEVEL", type = Integer.class),
							@ColumnResult(name = "OFAC", type = Long.class),
							@ColumnResult(name = "EV_INDEX", type = Integer.class),
							@ColumnResult(name = "REPAIR", type = String.class),
							@ColumnResult(name = "POST_WGRP", type = String.class),
							@ColumnResult(name = "EXTFIELD", type = Long.class),
							@ColumnResult(name = "BPHASEK", type = String.class),
							@ColumnResult(name = "FXRATESET", type = String.class),
							@ColumnResult(name = "FIX2DAY", type = String.class),
							@ColumnResult(name = "NEEDCHECK", type = String.class),
							@ColumnResult(name = "NO_BROWSE", type = String.class),
							@ColumnResult(name = "SWONCEREL", type = String.class),
							@ColumnResult(name = "PRIADLINE", type = String.class),
							@ColumnResult(name = "ENRRESSTAT", type = String.class),
							@ColumnResult(name = "ATTACHD_EV", type = Long.class),
							@ColumnResult(name = "ORIGNAME", type = String.class),
							@ColumnResult(name = "ORIGTEAM", type = String.class),
							@ColumnResult(name = "ORIGISUSER", type = String.class),
							@ColumnResult(name = "ORIGBRANCH", type = String.class),
							@ColumnResult(name = "ORIGUSER", type = Long.class),
							@ColumnResult(name = "ORIGREF", type = String.class),
							@ColumnResult(name = "NPSBBCODE", type = String.class),
							@ColumnResult(name = "NPRIMNM", type = String.class),
							@ColumnResult(name = "VIOLATION", type = String.class),
							@ColumnResult(name = "ORCH_DEFN", type = Long.class),
							@ColumnResult(name = "ORCH_STEP", type = Long.class),
							@ColumnResult(name = "NPRIADLINE", type = String.class ),
							@ColumnResult(name = "STEPPHASE", type = String.class),
							@ColumnResult(name = "EXTRAINFO", type = String.class),
							@ColumnResult(name = "FURTHERID", type = String.class),
							@ColumnResult(name = "TYPEFLAG", type = Integer.class),
							@ColumnResult(name = "TSTAMP", type = Integer.class),
							@ColumnResult(name = "EVTREFUSED", type = String.class),
							@ColumnResult(name = "ISPROVISEV", type = String.class),
							@ColumnResult(name = "AUTONEXTEV", type = String.class),
							@ColumnResult(name = "PROVCONTBY", type = Long.class),
							@ColumnResult(name = "DOCSPREP", type = String.class),
							@ColumnResult(name = "DOCSPREPRQ", type = String.class),
							@ColumnResult(name = "PCP_SW_BIC", type = String.class),
							@ColumnResult(name = "NPC_SW_BIC", type = String.class),
							@ColumnResult(name = "EVTREFSTOR", type = String.class),
							@ColumnResult(name = "SWIFTVERSN", type = Integer.class),
							@ColumnResult(name = "CORPACCESS", type = Long.class)
	        }
	    )
	)
	
public class EventTransactionInquiry {
	
    @Id
    @Column(name = "KEY97")
    private Long key97;

    @Column(name = "REFNO_PFIX", length = 3)
    private String refnoPfix;

    @Column(name = "REFNO_SERL")
    private Integer refnoSerl;

    @Column(name = "MASTER_KEY")
    private String masterKey;

    @Column(name = "START_DATE")
    private String startDate;

    @Column(name = "START_TIME", length = 8)
    private String startTime;

    @Column(name = "TIMESTART")
    private String timeStart;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "TOUCHED")
    private String touched;

    @Column(name = "FINISHED")
    private String finished;

    @Column(name = "FINISHTIME", length = 8)
    private String finishTime;

    @Column(name = "TIMEFINISH")
    private String timeFinish;

    @Column(name = "EXEMPLAR")
    private Long exemplar;

    @Column(name = "THEIR_REF", length = 34)
    private String theirRef;

    @Column(name = "AMOUNT", precision = 15, scale = 0)
    private BigDecimal amount;

    @Column(name = "CCY", length = 3)
    private String ccy;

    @Column(name = "TFR_METHOD", length = 1)
    private String tfrMethod;

    @Column(name = "STATUS_EV", length = 45)
    private String statusEv;

    @Column(name = "CROSS_REF", length = 30)
    private String crossRef;

    @Column(name = "USER_INP")
    private Long userInp;

    @Column(name = "USER_REV")
    private Long userRev;

    @Column(name = "USER_AUT")
    private Long userAut;

    @Column(name = "CREATNMTHD", length = 1)
    private String creatnMthd;

    @Column(name = "SLADATA")
    private Long slaData;

    @Column(name = "LAST_STEP")
    private Long lastStep;

    @Column(name = "PSBBCODE", length = 8)
    private String psbbCode;

    @Column(name = "PRIMNM", length = 20)
    private String primNm;

    @Column(name = "EBANKEVREF", length = 20)
    private String ebanKevRef;

    @Column(name = "ANCIL_MST")
    private Long ancilMst;

    @Column(name = "VERLEVEL")
    private Integer verLevel;

    @Column(name = "OFAC")
    private Long ofac;

    @Column(name = "EV_INDEX")
    private Integer evIndex;

    @Column(name = "REPAIR", length = 1)
    private String repair;

    @Column(name = "POST_WGRP", length = 15)
    private String postWgrp;

    @Column(name = "EXTFIELD")
    private Long extField;

    @Column(name = "BPHASEK", length = 10)
    private String bphaseK;

    @Column(name = "FXRATESET", length = 1)
    private String fxRateSet;

    @Column(name = "FIX2DAY", length = 1)
    private String fix2Day;

    @Column(name = "NEEDCHECK", length = 1)
    private String needCheck;

    @Column(name = "NO_BROWSE", length = 1)
    private String noBrowse;

    @Column(name = "SWONCEREL", length = 1)
    private String swoNcerel;

    @Column(name = "PRIADLINE", length = 35)
    private String priAdLine;

    @Column(name = "ENRRESSTAT", length = 1)
    private String enrResStat;

    @Column(name = "ATTACHD_EV")
    private Long attachdEv;

    @Column(name = "ORIGNAME", length = 20)
    private String origName;

    @Column(name = "ORIGTEAM", length = 15)
    private String origTeam;

    @Column(name = "ORIGISUSER", length = 1)
    private String origIsUser ;

    @Column(name = "ORIGBRANCH", length = 8)
    private String origBranch;

    @Column(name = "ORIGUSER")
    private Long origUser ;

    @Column(name = "ORIGREF", length = 34)
    private String origRef;

    @Column(name = "NPSBBCODE", length = 8)
    private String npsbbCode;

    @Column(name = "NPRIMNM", length = 20)
    private String nprimNm;

    @Column(name = "VIOLATION", length = 1)
    private String violation;

    @Column(name = "ORCH_DEFN")
    private Long orchDefn;

    @Column(name = "ORCH_STEP")
    private Long orchStep;

    @Column(name = "NPRIADLINE", length = 35)
    private String npriAdLine;

    @Column(name = "STEPPHASE", length = 1)
    private String stepPhase;

    @Column(name = "EXTRAINFO", length = 35)
    private String extraInfo;

    @Column(name = "FURTHERID", length = 5)
    private String furtherId;

    @Column(name = "TYPEFLAG")
    private Integer typeFlag;

    @Column(name = "TSTAMP")
    private Integer tstmp;

    @Column(name = "EVTREFUSED", length = 1)
    private String evtRefused;

    @Column(name = "ISPROVISEV", length = 1)
    private String isProvisev;

    @Column(name = "AUTONEXTEV", length = 1)
    private String autoNextEv;

    @Column(name = "PROVCONTBY")
    private Long provContBy;

    @Column(name = "DOCSPREP", length = 1)
    private String docSpRep;

    @Column(name = "DOCSPREPRQ", length = 1)
    private String docSpRq;

    @Column(name = "PCP_SW_BIC", length = 11)
    private String pcpSwBic;

    @Column(name = "NPC_SW_BIC", length = 11)
    private String npcSwBic;

    @Column(name = "EVTREFSTOR", length = 222)
    private String evtRefStor;

    @Column(name = "SWIFTVERSN")
    private Integer swiftVersn;

    @Column(name = "CORPACCESS")
    private Long corpAccess;

	public Long getKey97() {
		return key97;
	}

	public void setKey97(Long key97) {
		this.key97 = key97;
	}

	public String getRefnoPfix() {
		return refnoPfix;
	}

	public void setRefnoPfix(String refnoPfix) {
		this.refnoPfix = refnoPfix;
	}

	public Integer getRefnoSerl() {
		return refnoSerl;
	}

	public void setRefnoSerl(Integer refnoSerl) {
		this.refnoSerl = refnoSerl;
	}

	public String getMasterKey() {
		return masterKey;
	}

	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTouched() {
		return touched;
	}

	public void setTouched(String touched) {
		this.touched = touched;
	}

	public String getFinished() {
		return finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getTimeFinish() {
		return timeFinish;
	}

	public void setTimeFinish(String timeFinish) {
		this.timeFinish = timeFinish;
	}

	public Long getExemplar() {
		return exemplar;
	}

	public void setExemplar(Long exemplar) {
		this.exemplar = exemplar;
	}

	public String getTheirRef() {
		return theirRef;
	}

	public void setTheirRef(String theirRef) {
		this.theirRef = theirRef;
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

	public String getTfrMethod() {
		return tfrMethod;
	}

	public void setTfrMethod(String tfrMethod) {
		this.tfrMethod = tfrMethod;
	}

	public String getStatusEv() {
		return statusEv;
	}

	public void setStatusEv(String statusEv) {
		this.statusEv = statusEv;
	}

	public String getCrossRef() {
		return crossRef;
	}

	public void setCrossRef(String crossRef) {
		this.crossRef = crossRef;
	}

	public Long getUserInp() {
		return userInp;
	}

	public void setUserInp(Long userInp) {
		this.userInp = userInp;
	}

	public Long getUserRev() {
		return userRev;
	}

	public void setUserRev(Long userRev) {
		this.userRev = userRev;
	}

	public Long getUserAut() {
		return userAut;
	}

	public void setUserAut(Long userAut) {
		this.userAut = userAut;
	}

	public String getCreatnMthd() {
		return creatnMthd;
	}

	public void setCreatnMthd(String creatnMthd) {
		this.creatnMthd = creatnMthd;
	}

	public Long getSlaData() {
		return slaData;
	}

	public void setSlaData(Long slaData) {
		this.slaData = slaData;
	}

	public Long getLastStep() {
		return lastStep;
	}

	public void setLastStep(Long lastStep) {
		this.lastStep = lastStep;
	}

	public String getPsbbCode() {
		return psbbCode;
	}

	public void setPsbbCode(String psbbCode) {
		this.psbbCode = psbbCode;
	}

	public String getPrimNm() {
		return primNm;
	}

	public void setPrimNm(String primNm) {
		this.primNm = primNm;
	}

	public String getEbanKevRef() {
		return ebanKevRef;
	}

	public void setEbanKevRef(String ebanKevRef) {
		this.ebanKevRef = ebanKevRef;
	}

	public Long getAncilMst() {
		return ancilMst;
	}

	public void setAncilMst(Long ancilMst) {
		this.ancilMst = ancilMst;
	}

	public Integer getVerLevel() {
		return verLevel;
	}

	public void setVerLevel(Integer verLevel) {
		this.verLevel = verLevel;
	}

	public Long getOfac() {
		return ofac;
	}

	public void setOfac(Long ofac) {
		this.ofac = ofac;
	}

	public Integer getEvIndex() {
		return evIndex;
	}

	public void setEvIndex(Integer evIndex) {
		this.evIndex = evIndex;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

	public String getPostWgrp() {
		return postWgrp;
	}

	public void setPostWgrp(String postWgrp) {
		this.postWgrp = postWgrp;
	}

	public Long getExtField() {
		return extField;
	}

	public void setExtField(Long extField) {
		this.extField = extField;
	}

	public String getBphaseK() {
		return bphaseK;
	}

	public void setBphaseK(String bphaseK) {
		this.bphaseK = bphaseK;
	}

	public String getFxRateSet() {
		return fxRateSet;
	}

	public void setFxRateSet(String fxRateSet) {
		this.fxRateSet = fxRateSet;
	}

	public String getFix2Day() {
		return fix2Day;
	}

	public void setFix2Day(String fix2Day) {
		this.fix2Day = fix2Day;
	}

	public String getNeedCheck() {
		return needCheck;
	}

	public void setNeedCheck(String needCheck) {
		this.needCheck = needCheck;
	}

	public String getNoBrowse() {
		return noBrowse;
	}

	public void setNoBrowse(String noBrowse) {
		this.noBrowse = noBrowse;
	}

	public String getSwoNcerel() {
		return swoNcerel;
	}

	public void setSwoNcerel(String swoNcerel) {
		this.swoNcerel = swoNcerel;
	}

	public String getPriAdLine() {
		return priAdLine;
	}

	public void setPriAdLine(String priAdLine) {
		this.priAdLine = priAdLine;
	}

	public String getEnrResStat() {
		return enrResStat;
	}

	public void setEnrResStat(String enrResStat) {
		this.enrResStat = enrResStat;
	}

	public Long getAttachdEv() {
		return attachdEv;
	}

	public void setAttachdEv(Long attachdEv) {
		this.attachdEv = attachdEv;
	}

	public String getOrigName() {
		return origName;
	}

	public void setOrigName(String origName) {
		this.origName = origName;
	}

	public String getOrigTeam() {
		return origTeam;
	}

	public void setOrigTeam(String origTeam) {
		this.origTeam = origTeam;
	}

	public String getOrigIsUser() {
		return origIsUser;
	}

	public void setOrigIsUser(String origIsUser) {
		this.origIsUser = origIsUser;
	}

	public String getOrigBranch() {
		return origBranch;
	}

	public void setOrigBranch(String origBranch) {
		this.origBranch = origBranch;
	}

	public Long getOrigUser() {
		return origUser;
	}

	public void setOrigUser(Long origUser) {
		this.origUser = origUser;
	}

	public String getOrigRef() {
		return origRef;
	}

	public void setOrigRef(String origRef) {
		this.origRef = origRef;
	}

	public String getNpsbbCode() {
		return npsbbCode;
	}

	public void setNpsbbCode(String npsbbCode) {
		this.npsbbCode = npsbbCode;
	}

	public String getNprimNm() {
		return nprimNm;
	}

	public void setNprimNm(String nprimNm) {
		this.nprimNm = nprimNm;
	}

	public String getViolation() {
		return violation;
	}

	public void setViolation(String violation) {
		this.violation = violation;
	}

	public Long getOrchDefn() {
		return orchDefn;
	}

	public void setOrchDefn(Long orchDefn) {
		this.orchDefn = orchDefn;
	}

	public Long getOrchStep() {
		return orchStep;
	}

	public void setOrchStep(Long orchStep) {
		this.orchStep = orchStep;
	}

	public String getNpriAdLine() {
		return npriAdLine;
	}

	public void setNpriAdLine(String npriAdLine) {
		this.npriAdLine = npriAdLine;
	}

	public String getStepPhase() {
		return stepPhase;
	}

	public void setStepPhase(String stepPhase) {
		this.stepPhase = stepPhase;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getFurtherId() {
		return furtherId;
	}

	public void setFurtherId(String furtherId) {
		this.furtherId = furtherId;
	}

	public Integer getTypeFlag() {
		return typeFlag;
	}

	public void setTypeFlag(Integer typeFlag) {
		this.typeFlag = typeFlag;
	}

	public Integer getTstmp() {
		return tstmp;
	}

	public void setTstmp(Integer tstmp) {
		this.tstmp = tstmp;
	}

	public String getEvtRefused() {
		return evtRefused;
	}

	public void setEvtRefused(String evtRefused) {
		this.evtRefused = evtRefused;
	}

	public String getIsProvisev() {
		return isProvisev;
	}

	public void setIsProvisev(String isProvisev) {
		this.isProvisev = isProvisev;
	}

	public String getAutoNextEv() {
		return autoNextEv;
	}

	public void setAutoNextEv(String autoNextEv) {
		this.autoNextEv = autoNextEv;
	}

	public Long getProvContBy() {
		return provContBy;
	}

	public void setProvContBy(Long provContBy) {
		this.provContBy = provContBy;
	}

	public String getDocSpRep() {
		return docSpRep;
	}

	public void setDocSpRep(String docSpRep) {
		this.docSpRep = docSpRep;
	}

	public String getDocSpRq() {
		return docSpRq;
	}

	public void setDocSpRq(String docSpRq) {
		this.docSpRq = docSpRq;
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

	public String getEvtRefStor() {
		return evtRefStor;
	}

	public void setEvtRefStor(String evtRefStor) {
		this.evtRefStor = evtRefStor;
	}

	public Integer getSwiftVersn() {
		return swiftVersn;
	}

	public void setSwiftVersn(Integer swiftVersn) {
		this.swiftVersn = swiftVersn;
	}

	public Long getCorpAccess() {
		return corpAccess;
	}

	public void setCorpAccess(Long corpAccess) {
		this.corpAccess = corpAccess;
	}

}
