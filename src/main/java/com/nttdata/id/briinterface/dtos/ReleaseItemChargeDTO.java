package com.nttdata.id.briinterface.dtos;

import java.math.BigDecimal;

import com.nttdata.id.briinterface.utils.TrimUtils;


public class ReleaseItemChargeDTO {
	
	private String masterRef;
	private String event;
	private Long linkedChg;
    private String amdChg;
    private String appText;
    private String oldAction;
    private String hasNewTcs;
    private BigDecimal appOrAmt;
    private String appOrCcy;
    private BigDecimal appScAmt;
    private String appScCcy;
    private String appLock;
    private String appWaive;
    private String calcText;
    private String chgForLck;
    private Long chgPty;
    private Long chgSch;
    private Long tChgSch;
    private String ccyLck;
    private BigDecimal origAmt;
    private String origCcy;
    private Long splitSrc;
    private String codeLckC;
    private String rateLck;
    private String rateLckC;
    private String chgSplit;
    private String consChg;
    private BigDecimal chgOsAmt;
    private String chgOsCcy;
    private Integer totlChgs;
    private String chgRecPty;
    private String chgToDate;
    private String particChg;
    private String chgStrDat;
    private String chgEndDat;
    private BigDecimal minAppAmt;
    private String minAppCcy;
    private BigDecimal maxAppAmt;
    private String maxAppCcy;
    private Long pPayKey;
    private Long chqKey;
    private Long evtDoc;
    private Long draftKey;
    private Long key97;

    // Constructor
    public ReleaseItemChargeDTO(String masterRef, String event, Long linkedChg, String amdChg, String appText, 
						String oldAction, String hasNewTcs, BigDecimal appOrAmt, String appOrCcy,
            BigDecimal appScAmt, String appScCcy, String appLock, String appWaive, String calcText,
            String chgForLck, Long chgPty, Long chgSch, Long tChgSch, String ccyLck,
            BigDecimal origAmt, String origCcy,Long splitSrc, String codeLckC, String rateLck,
            String rateLckC, String chgSplit, String consChg, String chgOnAmt, BigDecimal chgBasAmt, String chgBasCcy,
            BigDecimal chgOsAmt, String chgOsCcy, Integer totlChgs, String chgRecPty,
            String chgToDate, String particChg, String chgStrDat, String chgEndDat, BigDecimal minAppAmt,
            String minAppCcy, BigDecimal maxAppAmt, String maxAppCcy, Long pPayKey, Long chqKey,
            Long evtDoc, Long draftKey, Long key97) {
		this.masterRef = TrimUtils.trim(masterRef);
		this.event = TrimUtils.trim(event);
		this.linkedChg = linkedChg;
		this.amdChg = TrimUtils.trim(amdChg);
		this.appText = TrimUtils.trim(appText);
		this.oldAction = TrimUtils.trim(oldAction);
		this.hasNewTcs = TrimUtils.trim(hasNewTcs);
		this.appOrAmt = appOrAmt;
		this.appOrCcy = TrimUtils.trim(appOrCcy);
		this.appScAmt = appScAmt;
		this.appScCcy = TrimUtils.trim(appScCcy);
		this.appLock = TrimUtils.trim(appLock);
		this.appWaive = TrimUtils.trim(appWaive);
		this.calcText = TrimUtils.trim(calcText);
		this.chgForLck = TrimUtils.trim(chgForLck);
		this.chgPty = chgPty;
		this.chgSch = chgSch;
		this.tChgSch = tChgSch;
		this.ccyLck = TrimUtils.trim(ccyLck);
		this.origAmt = origAmt;
		this.origCcy = TrimUtils.trim(origCcy);
		this.splitSrc = splitSrc;
		this.codeLckC = TrimUtils.trim(codeLckC);
		this.rateLck = TrimUtils.trim(rateLck);
		this.rateLckC = TrimUtils.trim(rateLckC);
		this.chgSplit = TrimUtils.trim(chgSplit);
		this.consChg = TrimUtils.trim(consChg);
		this.chgOsAmt = chgOsAmt;
		this.chgOsCcy = TrimUtils.trim(chgOsCcy);
		this.totlChgs = totlChgs;
		this.chgRecPty = TrimUtils.trim(chgRecPty);
		this.chgToDate = TrimUtils.trim(chgToDate);
		this.particChg = TrimUtils.trim(particChg);
		this.chgStrDat = TrimUtils.trim(chgStrDat);
		this.chgEndDat = TrimUtils.trim(chgEndDat);
		this.minAppAmt = minAppAmt;
		this.minAppCcy = TrimUtils.trim(minAppCcy);
		this.maxAppAmt = maxAppAmt;
		this.maxAppCcy = TrimUtils.trim(maxAppCcy);
		this.pPayKey = pPayKey;
		this.chqKey = chqKey;
		this.evtDoc = evtDoc;
		this.draftKey = draftKey;
		this.key97 = key97;
	}

	public String getMasterRef() {
		return masterRef;
	}

	public void setMasterRef(String masterRef) {
		this.masterRef = masterRef;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Long getLinkedChg() {
		return linkedChg;
	}

	public void setLinkedChg(Long linkedChg) {
		this.linkedChg = linkedChg;
	}

	public String getAmdChg() {
		return amdChg;
	}

	public void setAmdChg(String amdChg) {
		this.amdChg = amdChg;
	}

	public String getAppText() {
		return appText;
	}

	public void setAppText(String appText) {
		this.appText = appText;
	}

	public String getOldAction() {
		return oldAction;
	}

	public void setOldAction(String oldAction) {
		this.oldAction = oldAction;
	}

	public String getHasNewTcs() {
		return hasNewTcs;
	}

	public void setHasNewTcs(String hasNewTcs) {
		this.hasNewTcs = hasNewTcs;
	}

	public BigDecimal getAppOrAmt() {
		return appOrAmt;
	}

	public void setAppOrAmt(BigDecimal appOrAmt) {
		this.appOrAmt = appOrAmt;
	}

	public String getAppOrCcy() {
		return appOrCcy;
	}

	public void setAppOrCcy(String appOrCcy) {
		this.appOrCcy = appOrCcy;
	}

	public BigDecimal getAppScAmt() {
		return appScAmt;
	}

	public void setAppScAmt(BigDecimal appScAmt) {
		this.appScAmt = appScAmt;
	}

	public String getAppScCcy() {
		return appScCcy;
	}

	public void setAppScCcy(String appScCcy) {
		this.appScCcy = appScCcy;
	}

	public String getAppLock() {
		return appLock;
	}

	public void setAppLock(String appLock) {
		this.appLock = appLock;
	}

	public String getAppWaive() {
		return appWaive;
	}

	public void setAppWaive(String appWaive) {
		this.appWaive = appWaive;
	}

	public String getCalcText() {
		return calcText;
	}

	public void setCalcText(String calcText) {
		this.calcText = calcText;
	}

	public String getChgForLck() {
		return chgForLck;
	}

	public void setChgForLck(String chgForLck) {
		this.chgForLck = chgForLck;
	}

	public Long getChgPty() {
		return chgPty;
	}

	public void setChgPty(Long chgPty) {
		this.chgPty = chgPty;
	}

	public Long getChgSch() {
		return chgSch;
	}

	public void setChgSch(Long chgSch) {
		this.chgSch = chgSch;
	}

	public Long gettChgSch() {
		return tChgSch;
	}

	public void settChgSch(Long tChgSch) {
		this.tChgSch = tChgSch;
	}

	public String getCcyLck() {
		return ccyLck;
	}

	public void setCcyLck(String ccyLck) {
		this.ccyLck = ccyLck;
	}

	public BigDecimal getOrigAmt() {
		return origAmt;
	}

	public void setOrigAmt(BigDecimal origAmt) {
		this.origAmt = origAmt;
	}

	public String getOrigCcy() {
		return origCcy;
	}

	public void setOrigCcy(String origCcy) {
		this.origCcy = origCcy;
	}

	public Long getSplitSrc() {
		return splitSrc;
	}

	public void setSplitSrc(Long splitSrc) {
		this.splitSrc = splitSrc;
	}

	public String getCodeLckC() {
		return codeLckC;
	}

	public void setCodeLckC(String codeLckC) {
		this.codeLckC = codeLckC;
	}

	public String getRateLck() {
		return rateLck;
	}

	public void setRateLck(String rateLck) {
		this.rateLck = rateLck;
	}

	public String getRateLckC() {
		return rateLckC;
	}

	public void setRateLckC(String rateLckC) {
		this.rateLckC = rateLckC;
	}

	public String getChgSplit() {
		return chgSplit;
	}

	public void setChgSplit(String chgSplit) {
		this.chgSplit = chgSplit;
	}

	public String getConsChg() {
		return consChg;
	}

	public void setConsChg(String consChg) {
		this.consChg = consChg;
	}

	public BigDecimal getChgOsAmt() {
		return chgOsAmt;
	}

	public void setChgOsAmt(BigDecimal chgOsAmt) {
		this.chgOsAmt = chgOsAmt;
	}

	public String getChgOsCcy() {
		return chgOsCcy;
	}

	public void setChgOsCcy(String chgOsCcy) {
		this.chgOsCcy = chgOsCcy;
	}

	public Integer getTotlChgs() {
		return totlChgs;
	}

	public void setTotlChgs(Integer totlChgs) {
		this.totlChgs = totlChgs;
	}

	public String getChgRecPty() {
		return chgRecPty;
	}

	public void setChgRecPty(String chgRecPty) {
		this.chgRecPty = chgRecPty;
	}

	public String getChgToDate() {
		return chgToDate;
	}

	public void setChgToDate(String chgToDate) {
		this.chgToDate = chgToDate;
	}

	public String getParticChg() {
		return particChg;
	}

	public void setParticChg(String particChg) {
		this.particChg = particChg;
	}

	public String getChgStrDat() {
		return chgStrDat;
	}

	public void setChgStrDat(String chgStrDat) {
		this.chgStrDat = chgStrDat;
	}

	public String getChgEndDat() {
		return chgEndDat;
	}

	public void setChgEndDat(String chgEndDat) {
		this.chgEndDat = chgEndDat;
	}

	public BigDecimal getMinAppAmt() {
		return minAppAmt;
	}

	public void setMinAppAmt(BigDecimal minAppAmt) {
		this.minAppAmt = minAppAmt;
	}

	public String getMinAppCcy() {
		return minAppCcy;
	}

	public void setMinAppCcy(String minAppCcy) {
		this.minAppCcy = minAppCcy;
	}

	public BigDecimal getMaxAppAmt() {
		return maxAppAmt;
	}

	public void setMaxAppAmt(BigDecimal maxAppAmt) {
		this.maxAppAmt = maxAppAmt;
	}

	public String getMaxAppCcy() {
		return maxAppCcy;
	}

	public void setMaxAppCcy(String maxAppCcy) {
		this.maxAppCcy = maxAppCcy;
	}

	public Long getpPayKey() {
		return pPayKey;
	}

	public void setpPayKey(Long pPayKey) {
		this.pPayKey = pPayKey;
	}

	public Long getChqKey() {
		return chqKey;
	}

	public void setChqKey(Long chqKey) {
		this.chqKey = chqKey;
	}

	public Long getEvtDoc() {
		return evtDoc;
	}

	public void setEvtDoc(Long evtDoc) {
		this.evtDoc = evtDoc;
	}

	public Long getDraftKey() {
		return draftKey;
	}

	public void setDraftKey(Long draftKey) {
		this.draftKey = draftKey;
	}

	public Long getKey97() {
		return key97;
	}

	public void setKey97(Long key97) {
		this.key97 = key97;
	}

}

