package com.nttdata.id.briinterface.dtos;

import java.math.BigDecimal;

import com.nttdata.id.briinterface.utils.DateTimeUtils;
import com.nttdata.id.briinterface.utils.TrimUtils;

public class EventTransactionInquiryDTO {
	
    private Long key97;
    private String refNoPfix;
    private Integer refNoSerl;
    private String masterRef;
    private String startDate;
    private String startTime;
    private String timeStart;
    private String status;
    private String touched;
    private String finished;
    private String finishTime;
    private String timeFinish;
    private Long exemplar;
    private String theirRef;
    private BigDecimal amount;
    private String ccy;
    private String tfrMethod;
    private String statusEv;
    private String crossRef;
    private Long userInp;
    private Long userRev;
    private Long userAut;
    private String creatnMthd;
    private Long slaData;
    private Long lastStep;
    private String psbbCode;
    private String primNm;
    private String ebanKevRef;
    private Long ancilMst;
    private Integer verLevel;
    private Long ofac;
    private Integer evIndex;
    private String repair;
    private String postWgrp;
    private Long extField;
    private String bphaseK;
    private String fxRateSet;
    private String fix2Day;
    private String needCheck;
    private String noBrowse;
    private String swoNcerel;
    private String priAdLine;
    private String enrResStat;
    private Long attachdEv;
    private String origName;
    private String origTeam;
    private String origIsUser ;
    private String origBranch;
    private Long origUser ;
    private String origRef;
    private String npsbbCode;
    private String nprimNm;
    private String violation;
    private Long orchDefn;
    private Long orchStep;
    private String npriAdLine;
    private String stepPhase;
    private String extraInfo;
    private String furtherId;
    private Integer typeFlag;
    private Integer tstmp;
    private String evtRefused;
    private String isProvisev;
    private String autoNextEv;
    private Long provContBy;
    private String docSpRep;
    private String docSpRq;
    private String pcpSwBic;
    private String npcSwBic;
    private String evtRefStor;
    private Integer swiftVersn;
    private Long corpAccess;

    public EventTransactionInquiryDTO(Long key97, String refNoPfix, Integer refNoSerl, String masterRef, String startDate, String startTime, 
    				String timeStart, String status, String touched, String finished, String finishTime, 
						String timeFinish, Long exemplar, String theirRef, BigDecimal amount, String ccy, 
						String tfrMethod, String statusEv, String crossRef, Long userInp, Long userRev, 
						Long userAut, String creatnMthd, Long slaData, Long lastStep, String psbbCode, 
						String primNm, String ebanKevRef, Long ancilMst, Integer verLevel, Long ofac, 
						Integer evIndex, String repair, String postWgrp, Long extField, String bphaseK, 
						String fxRateSet, String fix2Day, String needCheck, String noBrowse, String swoNcerel, 
						String priAdLine, String enrResStat, Long attachdEv, String origName, String origTeam, 
						String origIsUser , String origBranch, Long origUser , String origRef, String npsbbCode, 
						String nprimNm, String violation, Long orchDefn, Long orchStep, String npriAdLine, 
						String stepPhase, String extraInfo, String furtherId, Integer typeFlag, Integer tstmp, 
						String evtRefused, String isProvisev, String autoNextEv, Long provContBy, String docSpRep, 
						String docSpRq, String pcpSwBic, String npcSwBic, String evtRefStor, Integer swiftVersn, 
						Long corpAccess) {
        this.key97 = key97;
        this.refNoPfix = TrimUtils.trim(refNoPfix);
        this.refNoSerl = refNoSerl;
        this.masterRef = TrimUtils.trim(masterRef);
        this.startDate = startDate;
        this.startTime = startTime;
        this.timeStart = DateTimeUtils.convertDateTimeFormat(timeStart);
        this.status = TrimUtils.trim(status);
        this.touched = touched;
        this.finished = finished;
        this.finishTime = TrimUtils.trim(finishTime);
        this.timeFinish = DateTimeUtils.convertDateTimeFormat(timeFinish);
        this.exemplar = exemplar;
        this.theirRef = TrimUtils.trim(theirRef);
        this.amount = amount;
        this.ccy = TrimUtils.trim(ccy) ;
        this.tfrMethod = TrimUtils.trim(tfrMethod);
        this.statusEv = TrimUtils.trim(statusEv);
        this.crossRef = TrimUtils.trim(crossRef);
        this.userInp = userInp;
        this.userRev = userRev;
        this.userAut = userAut;
        this.creatnMthd = TrimUtils.trim(creatnMthd);
        this.slaData = slaData;
        this.lastStep = lastStep;
        this.psbbCode = TrimUtils.trim(psbbCode);
        this.primNm = TrimUtils.trim(primNm);
        this.ebanKevRef = TrimUtils.trim(ebanKevRef);
        this.ancilMst = ancilMst;
        this.verLevel = verLevel;
        this.ofac = ofac;
        this.evIndex = evIndex;
        this.repair = TrimUtils.trim(repair);
        this.postWgrp = TrimUtils.trim(postWgrp);
        this.extField = extField;
        this.bphaseK = TrimUtils.trim(bphaseK);
        this.fxRateSet = TrimUtils.trim(fxRateSet);
        this.fix2Day = TrimUtils.trim(fix2Day);
        this.needCheck = TrimUtils.trim(needCheck);
        this.noBrowse = TrimUtils.trim(noBrowse);
        this.swoNcerel = TrimUtils.trim(swoNcerel);
        this.priAdLine = TrimUtils.trim(priAdLine);
        this.enrResStat = TrimUtils.trim(enrResStat);
        this.attachdEv = attachdEv;
        this.origName = TrimUtils.trim(origName);
        this.origTeam = TrimUtils.trim(origTeam);
        this.origIsUser  = TrimUtils.trim(origIsUser);
        this.origBranch = TrimUtils.trim(origBranch);
        this.origUser  = origUser;
        this.origRef = TrimUtils.trim(origRef);
        this.npsbbCode = TrimUtils.trim(npsbbCode);
        this.nprimNm = TrimUtils.trim(nprimNm);
        this.violation = TrimUtils.trim(violation);
        this.orchDefn = orchDefn;
        this.orchStep = orchStep;
        this.npriAdLine = TrimUtils.trim(npriAdLine);
        this.stepPhase = TrimUtils.trim(stepPhase);
        this.extraInfo = TrimUtils.trim(extraInfo);
        this.furtherId = TrimUtils.trim(furtherId);
        this.typeFlag = typeFlag;
        this.tstmp = tstmp;
        this.evtRefused = TrimUtils.trim(evtRefused);
        this.isProvisev = TrimUtils.trim(isProvisev);
        this.autoNextEv = TrimUtils.trim(autoNextEv);
        this.provContBy = provContBy;
        this.docSpRep = TrimUtils.trim(docSpRep);
        this.docSpRq = TrimUtils.trim(docSpRq);
        this.pcpSwBic = TrimUtils.trim(pcpSwBic);
        this.npcSwBic = TrimUtils.trim(npcSwBic);
        this.evtRefStor = TrimUtils.trim(evtRefStor);
        this.swiftVersn = swiftVersn;
        this.corpAccess = corpAccess;
    }
	
	public EventTransactionInquiryDTO() {
	}

	public Long getKey97() {
		return key97;
	}

	public void setKey97(Long key97) {
		this.key97 = key97;
	}

	public String getRefNoPfix() {
		return refNoPfix;
	}

	public void setRefNoPfix(String refNoPfix) {
		this.refNoPfix = refNoPfix;
	}

	public Integer getRefNoSerl() {
		return refNoSerl;
	}

	public void setRefNoSerl(Integer refNoSerl) {
		this.refNoSerl = refNoSerl;
	}

	public String getMasterRef() {
		return masterRef;
	}

	public void setMasterRef(String masterRef) {
		this.masterRef = masterRef;
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

