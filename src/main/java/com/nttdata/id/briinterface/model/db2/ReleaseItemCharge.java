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

import com.nttdata.id.briinterface.dtos.ReleaseItemChargeDTO;

@Entity
@Table(name = "EVENTCHG", schema = "TRADEIN1")
@SqlResultSetMapping(
	    name = "ReleaseItemChargeMapping",
	    classes = @ConstructorResult(
	        targetClass = ReleaseItemChargeDTO.class, 
	        columns = {
	        		@ColumnResult(name = "MASTER_REF", type = String.class),
	        		@ColumnResult(name = "EVENT", type = String.class),
		        	@ColumnResult(name = "LINKED_CHG", type = Long.class),
		            @ColumnResult(name = "AMD_CHG", type = String.class),
		            @ColumnResult(name = "APP_TEXT", type = String.class),
		            @ColumnResult(name = "OLD_ACTION", type = String.class),
		            @ColumnResult(name = "HASNEWTCS", type = String.class),
		            @ColumnResult(name = "APPCH_SCH", type = Long.class),
		            @ColumnResult(name = "CALCTODATE", type = String.class), 
		            @ColumnResult(name = "TAPPCH_SCH", type = Long.class),
		            @ColumnResult(name = "APP_ORAMT", type = BigDecimal.class),
		            @ColumnResult(name = "APP_ORCCY", type = String.class),
		            @ColumnResult(name = "APP_SCAMT", type = BigDecimal.class),
		            @ColumnResult(name = "APP_SCCCY", type = String.class),
		            @ColumnResult(name = "APP_LOCK", type = String.class),
		            @ColumnResult(name = "APP_WAIVE", type = String.class),
		            @ColumnResult(name = "CALCTEXT", type = String.class),
		            @ColumnResult(name = "CHGFOR_LCK", type = String.class),
		            @ColumnResult(name = "CHG_PTY", type = Long.class),
		            @ColumnResult(name = "CHG_SCH", type = Long.class),
		            @ColumnResult(name = "TCHG_SCH", type = Long.class),
		            @ColumnResult(name = "CCY_LCK", type = String.class),
		            @ColumnResult(name = "DEFER_LCK", type = String.class),
		            @ColumnResult(name = "RATECODE_C", type = String.class),
		            @ColumnResult(name = "FXRTEFLG_C", type = String.class),
		            @ColumnResult(name = "ORIG_AMT", type = BigDecimal.class),
		            @ColumnResult(name = "ORIG_CCY", type = String.class),
		            @ColumnResult(name = "PERIOD", type = String.class),
		            @ColumnResult(name = "CODE_LCK", type = String.class),
		            @ColumnResult(name = "SPLIT_SRC", type = Long.class),
		            @ColumnResult(name = "CODE_LCK_C", type = String.class),
		            @ColumnResult(name = "RATE_LCK", type = String.class),
		            @ColumnResult(name = "RATE_LCK_C", type = String.class),
		            @ColumnResult(name = "SCH_AMT", type = BigDecimal.class),
		            @ColumnResult(name = "SCH_CCY", type = String.class),
		            @ColumnResult(name = "SCHAMT_LCK", type = String.class),
		            @ColumnResult(name = "CHG_SPLIT", type = String.class),
		            @ColumnResult(name = "CONS_CHG", type = String.class),
		            @ColumnResult(name = "CHG_ON_AMT", type = String.class),
		            @ColumnResult(name = "CHGBAS_AMT", type = BigDecimal.class),
		            @ColumnResult(name = "CHGBAS_CCY", type = String.class),
		            @ColumnResult(name = "CHG_OS_AMT", type = BigDecimal.class),
		            @ColumnResult(name = "CHG_OS_CCY", type = String.class),
		            @ColumnResult(name = "TOTL_CHGS", type = Integer.class),
		            @ColumnResult(name = "CHGRECPTY", type = String.class),
		            @ColumnResult(name = "CHGTODATE", type = String.class),
		            @ColumnResult(name = "CHGFRDATE", type = String.class),
		            @ColumnResult(name = "RATECODE_T", type = String.class),
		            @ColumnResult(name = "CODE_LCK_T", type = String.class),
		            @ColumnResult(name = "RATE_LCK_T", type = String.class),
		            @ColumnResult(name = "CHG_SHARE", type = String.class),
		            @ColumnResult(name = "SHARE_INC", type = String.class),
		            @ColumnResult(name = "TAXAMT_LCK", type = String.class),
		            @ColumnResult(name = "PARTIC_CHG", type = String.class),
		            @ColumnResult(name = "OWNSCHED", type = String.class),
		            @ColumnResult(name = "EV_CHGPART", type = Long.class),
		            @ColumnResult(name = "OLD_STATUS", type = String.class),
		            @ColumnResult(name = "CANAMDBAS", type = String.class),
		            @ColumnResult(name = "AMDBAS_AMT", type = BigDecimal.class),
		            @ColumnResult(name = "AMDBAS_CCY", type = String.class),
		            @ColumnResult(name = "AMENDBASIS", type = String.class),
		            @ColumnResult(name = "CHGSTRDAT", type = String.class),
		            @ColumnResult(name = "CHGENDDAT", type = String.class),
		            @ColumnResult(name = "TIER1_DTLS", type = String.class),
		            @ColumnResult(name = "TIER2_DTLS", type = String.class),
		            @ColumnResult(name = "TIER3_DTLS", type = String.class),
		            @ColumnResult(name = "TIER4_DTLS", type = String.class),
		            @ColumnResult(name = "MINAPP_AMT", type = BigDecimal.class),
		            @ColumnResult(name = "MINAPP_CCY", type = String.class),
		            @ColumnResult(name = "MAXAPP_AMT", type = BigDecimal.class),
		            @ColumnResult(name = "MAXAPP_CCY", type = String.class),
		            @ColumnResult(name = "PPAY_KEY", type = Long.class),
		            @ColumnResult(name = "CHQ_KEY", type = Long.class),
		            @ColumnResult(name = "EVT_DOC", type = Long.class),
		            @ColumnResult(name = "DRAFT_KEY", type = Long.class),
		            @ColumnResult(name = "KEY97", type = Long.class),
		            @ColumnResult(name = "CHG_ON_CNT", type = String.class),
		            @ColumnResult(name = "CHGCOUNT", type = Integer.class),
		            @ColumnResult(name = "ATTACHITEM", type = Long.class),
		            @ColumnResult(name = "BOOK_RATE", type = BigDecimal.class)
	        }
	    )
	)
@NamedNativeQuery(
		name = "ReleaseItemCharge.filterReleaseItemCharge",
	    query = "",
	    resultSetMapping = "ReleaseItemChargeMapping"
)
public class ReleaseItemCharge {

    @Column(name = "LINKED_CHG")
    private Long linkedChg;

    @Column(name = "AMD_CHG", length = 1)
    private String amdChg;

    @Column(name = "APP_TEXT")
    private String appText;

    @Column(name = "OLD_ACTION", length = 1)
    private String oldAction;

    @Column(name = "HASNEWTCS", length = 1)
    private String hasNewTcs;

    @Column(name = "APPCH_SCH")
    private Long appChSch;

    @Column(name = "CALCTODATE")
    private String calcToDate;

    @Column(name = "TAPPCH_SCH")
    private Long tapChSch;

    @Column(name = "APP_ORAMT", precision = 15, scale = 0)
    private BigDecimal appOrAmt;

    @Column(name = "APP_ORCCY", length = 3)
    private String appOrCcy;

    @Column(name = "APP_SCAMT", precision = 15, scale = 0)
    private BigDecimal appScAmt;

    @Column(name = "APP_SCCCY", length = 3)
    private String appScCcy;

    @Column(name = "APP_LOCK", length = 1)
    private String appLock;

    @Column(name = "APP_WAIVE", length = 1)
    private String appWaive;

    @Column(name = "CALCTEXT")
    private String calcText;

    @Column(name = "CHGFOR_LCK", length = 1)
    private String chgForLck;

    @Column(name = "CHG_PTY")
    private Long chgPty;

    @Column(name = "CHG_SCH")
    private Long chgSch;

    @Column(name = "TCHG_SCH")
    private Long tChgSch;

    @Column(name = "CCY_LCK", length = 1)
    private String ccyLck;

    @Column(name = "DEFER_LCK", length = 1)
    private String deferLck;

    @Column(name = "RATECODE_C", length = 6)
    private String rateCodeC;

    @Column(name = "FXRTEFLG_C", length = 1)
    private String fxrteFlgC;

    @Column(name = "ORIG_AMT", precision = 15, scale = 0)
    private BigDecimal origAmt;

    @Column(name = "ORIG_CCY", length = 3)
    private String origCcy;

    @Column(name = "PERIOD", length = 1)
    private String period;

    @Column(name = "CODE_LCK", length = 1)
    private String codeLck;

    @Column(name = "SPLIT_SRC")
    private Long splitSrc;

    @Column(name = "CODE_LCK_C", length = 1)
    private String codeLckC;

    @Column(name = "RATE_LCK", length = 1)
    private String rateLck;

    @Column(name = "RATE_LCK_C", length = 1)
    private String rateLckC;

    @Column(name = "SCH_AMT", precision = 15, scale = 0)
    private BigDecimal schAmt;

    @Column(name = "SCH_CCY", length = 3)
    private String schCcy;

    @Column(name = "SCHAMT_LCK", length = 1)
    private String schAmtLck;

    @Column(name = "CHG_SPLIT", length = 1)
    private String chgSplit;

    @Column(name = "CONS_CHG", length = 1)
    private String consChg;

    @Column(name = "CHG_ON_AMT", length = 10)
    private String chgOnAmt;

    @Column(name = "CHGBAS_AMT", precision = 15, scale = 0)
    private BigDecimal chgBasAmt;

    @Column(name = "CHGBAS_CCY", length = 3)
    private String chgBasCcy;

    @Column(name = "CHG_OS_AMT", precision = 15, scale = 0)
    private BigDecimal chgOsAmt;

    @Column(name = "CHG_OS_CCY", length = 3)
    private String chgOsCcy;

    @Column(name = "TOTL_CHGS")
    private Integer totlChgs;

    @Column(name = "CHGRECPTY", length = 9)
    private String chgRecPty;

    @Column(name = "CHGTODATE", length = 10)
    private String chgToDate; // Diubah menjadi String

    @Column(name = "CHGFRDATE", length = 10)
    private String chgFrDate; // Diubah menjadi String

    @Column(name = "RATECODE_T", length = 6)
    private String rateCodeT;

    @Column(name = "CODE_LCK_T", length = 1)
    private String codeLckT;

    @Column(name = "RATE_LCK_T", length = 1)
    private String rateLckT;

    @Column(name = "CHG_SHARE", length = 1)
    private String chgShare;

    @Column(name = "SHARE_INC", length = 1)
    private String shareInc;

    @Column(name = "TAXAMT_LCK", length = 1)
    private String taxAmtLck;

    @Column(name = "PARTIC_CHG", length = 1)
    private String particChg;

    @Column(name = "OWNSCHED", length = 1)
    private String ownSched;

    @Column(name = "EV_CHGPART")
    private Long evChgPart;

    @Column(name = "OLD_STATUS", length = 1)
    private String oldStatus;

    @Column(name = "CANAMDBAS", length = 1)
    private String canAmdBas;

    @Column(name = "AMDBAS_AMT", precision = 15, scale = 0)
    private BigDecimal amdBasAmt;

    @Column(name = "AMDBAS_CCY", length = 3)
    private String amdBasCcy;

    @Column(name = "AMENDBASIS", length = 1)
    private String amendBas;

    @Column(name = "CHGSTRDAT")
    private String chgStrDat; // Diubah menjadi String

    @Column(name = "CHGENDDAT")
    private String chgEndDat; // Diubah menjadi String

    @Column(name = "TIER1_DTLS", length = 100)
    private String tier1Dtls;

    @Column(name = "TIER2_DTLS", length = 100)
    private String tier2Dtls;

    @Column(name = "TIER3_DTLS", length = 100)
    private String tier3Dtls;

    @Column(name = "TIER4_DTLS", length = 100)
    private String tier4Dtls;

    @Column(name = "MINAPP_AMT", precision = 15, scale = 0)
    private BigDecimal minAppAmt;

    @Column(name = "MINAPP_CCY", length = 3)
    private String minAppCcy;

    @Column(name = "MAXAPP_AMT", precision = 15, scale = 0)
    private BigDecimal maxAppAmt;

    @Column(name = "MAXAPP_CCY", length = 3)
    private String maxAppCcy;

    @Column(name = "PPAY_KEY")
    private Long pPayKey;

    @Column(name = "CHQ_KEY")
    private Long chqKey;

    @Column(name = "EVT_DOC")
    private Long evtDoc;

    @Column(name = "DRAFT_KEY")
    private Long draftKey;

    @Id
    @Column(name = "KEY97")
    private Long key97;

    @Column(name = "CHG_ON_CNT", length = 10)
    private String chgOnCnt;

    @Column(name = "CHGCOUNT")
    private Integer chgCount;

    @Column(name = "ATTACHITEM")
    private Long attachItem;

    @Column(name = "BOOK_RATE", precision = 28, scale = 20)
    private BigDecimal bookRate;

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

	public Long getAppChSch() {
		return appChSch;
	}

	public void setAppChSch(Long appChSch) {
		this.appChSch = appChSch;
	}

	public String getCalcToDate() {
		return calcToDate;
	}

	public void setCalcToDate(String calcToDate) {
		this.calcToDate = calcToDate;
	}

	public Long getTapChSch() {
		return tapChSch;
	}

	public void setTapChSch(Long tapChSch) {
		this.tapChSch = tapChSch;
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

	public String getDeferLck() {
		return deferLck;
	}

	public void setDeferLck(String deferLck) {
		this.deferLck = deferLck;
	}

	public String getRateCodeC() {
		return rateCodeC;
	}

	public void setRateCodeC(String rateCodeC) {
		this.rateCodeC = rateCodeC;
	}

	public String getFxrteFlgC() {
		return fxrteFlgC;
	}

	public void setFxrteFlgC(String fxrteFlgC) {
		this.fxrteFlgC = fxrteFlgC;
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

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getCodeLck() {
		return codeLck;
	}

	public void setCodeLck(String codeLck) {
		this.codeLck = codeLck;
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

	public BigDecimal getSchAmt() {
		return schAmt;
	}

	public void setSchAmt(BigDecimal schAmt) {
		this.schAmt = schAmt;
	}

	public String getSchCcy() {
		return schCcy;
	}

	public void setSchCcy(String schCcy) {
		this.schCcy = schCcy;
	}

	public String getSchAmtLck() {
		return schAmtLck;
	}

	public void setSchAmtLck(String schAmtLck) {
		this.schAmtLck = schAmtLck;
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

	public String getChgOnAmt() {
		return chgOnAmt;
	}

	public void setChgOnAmt(String chgOnAmt) {
		this.chgOnAmt = chgOnAmt;
	}

	public BigDecimal getChgBasAmt() {
		return chgBasAmt;
	}

	public void setChgBasAmt(BigDecimal chgBasAmt) {
		this.chgBasAmt = chgBasAmt;
	}

	public String getChgBasCcy() {
		return chgBasCcy;
	}

	public void setChgBasCcy(String chgBasCcy) {
		this.chgBasCcy = chgBasCcy;
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

	public String getChgFrDate() {
		return chgFrDate;
	}

	public void setChgFrDate(String chgFrDate) {
		this.chgFrDate = chgFrDate;
	}

	public String getRateCodeT() {
		return rateCodeT;
	}

	public void setRateCodeT(String rateCodeT) {
		this.rateCodeT = rateCodeT;
	}

	public String getCodeLckT() {
		return codeLckT;
	}

	public void setCodeLckT(String codeLckT) {
		this.codeLckT = codeLckT;
	}

	public String getRateLckT() {
		return rateLckT;
	}

	public void setRateLckT(String rateLckT) {
		this.rateLckT = rateLckT;
	}

	public String getChgShare() {
		return chgShare;
	}

	public void setChgShare(String chgShare) {
		this.chgShare = chgShare;
	}

	public String getShareInc() {
		return shareInc;
	}

	public void setShareInc(String shareInc) {
		this.shareInc = shareInc;
	}

	public String getTaxAmtLck() {
		return taxAmtLck;
	}

	public void setTaxAmtLck(String taxAmtLck) {
		this.taxAmtLck = taxAmtLck;
	}

	public String getParticChg() {
		return particChg;
	}

	public void setParticChg(String particChg) {
		this.particChg = particChg;
	}

	public String getOwnSched() {
		return ownSched;
	}

	public void setOwnSched(String ownSched) {
		this.ownSched = ownSched;
	}

	public Long getEvChgPart() {
		return evChgPart;
	}

	public void setEvChgPart(Long evChgPart) {
		this.evChgPart = evChgPart;
	}

	public String getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}

	public String getCanAmdBas() {
		return canAmdBas;
	}

	public void setCanAmdBas(String canAmdBas) {
		this.canAmdBas = canAmdBas;
	}

	public BigDecimal getAmdBasAmt() {
		return amdBasAmt;
	}

	public void setAmdBasAmt(BigDecimal amdBasAmt) {
		this.amdBasAmt = amdBasAmt;
	}

	public String getAmdBasCcy() {
		return amdBasCcy;
	}

	public void setAmdBasCcy(String amdBasCcy) {
		this.amdBasCcy = amdBasCcy;
	}

	public String getAmendBas() {
		return amendBas;
	}

	public void setAmendBas(String amendBas) {
		this.amendBas = amendBas;
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

	public String getTier1Dtls() {
		return tier1Dtls;
	}

	public void setTier1Dtls(String tier1Dtls) {
		this.tier1Dtls = tier1Dtls;
	}

	public String getTier2Dtls() {
		return tier2Dtls;
	}

	public void setTier2Dtls(String tier2Dtls) {
		this.tier2Dtls = tier2Dtls;
	}

	public String getTier3Dtls() {
		return tier3Dtls;
	}

	public void setTier3Dtls(String tier3Dtls) {
		this.tier3Dtls = tier3Dtls;
	}

	public String getTier4Dtls() {
		return tier4Dtls;
	}

	public void setTier4Dtls(String tier4Dtls) {
		this.tier4Dtls = tier4Dtls;
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

	public String getChgOnCnt() {
		return chgOnCnt;
	}

	public void setChgOnCnt(String chgOnCnt) {
		this.chgOnCnt = chgOnCnt;
	}

	public Integer getChgCount() {
		return chgCount;
	}

	public void setChgCount(Integer chgCount) {
		this.chgCount = chgCount;
	}

	public Long getAttachItem() {
		return attachItem;
	}

	public void setAttachItem(Long attachItem) {
		this.attachItem = attachItem;
	}

	public BigDecimal getBookRate() {
		return bookRate;
	}

	public void setBookRate(BigDecimal bookRate) {
		this.bookRate = bookRate;
	}
	
}
