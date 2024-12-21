package com.nttdata.id.briinterface.dtos;

import java.math.BigDecimal;

public class MasterResponseDTO {
  private Long key97;
  private String refno_mbe;
  private String refno_pfix;
  private String refno_brn;
  private Integer refno_serl;
  private String priname_l1;
  private Long exemplar;
  private String status;
  private String prdclass;
  private BigDecimal utilis_amt;
  private String utilis_ccy;
  private String orig_ref;
  private Long parent_ev;
  private String input_brn;
  private String bhalf_brn;
  private String expiry_dat;
  private String expiry_loc;
  private BigDecimal amount;
  private String ccy;
  private BigDecimal amt_o_s;
  private String dflt_wkgrp;
  private Long pcp_pty;
  private Long npcp_pty;
  private String charge_for;
  private String usercode1;
  private String usercode2;
  private String usercode3;
  private Long resp_user;
  private String ctrct_date;
  private String workgroup;
  private BigDecimal liab_amt;
  private String liab_ccy;
  private String tfr_mthd;
  private String shared_liab;
  private String mailto_brn;
  private Long relmstr_key;
  private String relmstr_ref;
  private Long prodtype;
  private Long primarycus;
  private Long useroptn1;
  private Long useroptn2;
  private Long useroptn3;
  private Long useroptn4;
  private Long useroptn5;
  private BigDecimal totliabamt;
  private String totliabccy;
  private String reimb_chgs;
  private String billlevel;
  private String bookoffdat;
  private Long ecflnk_key;
  private String ecflnk_ref;
  private String deact_date;
  private String datatakeon;
  private String active;
  private String prev_sts;
  private String master_ref;
  private String ref_lock;
  private String pricustsbb;
  private String pricustmnm;
  private Integer verlevel;
  private String canourref;
  private Integer ev_count;
  private Long extfield;
  private String no_browse;
  private String pri_ref;
  private String canprnref;
  private String npr_ref;
  private String cannprnref;
  private String takeon;
  private Integer take_amdno;
  private String take_date;
  private Integer take_payno;
  private String origname;
  private String origteam;
  private String origisuser;
  private String origbranch;
  private Long origuser;
  private String origref;
  private String ebankmsref;
  private String nprcustsbb;
  private String nprcustmnm;
  private String nprname_l1;
  private String pcp_sw_bic;
  private String npcp_sw_bic;

  // Constructor
  public MasterResponseDTO(Long key97, String refno_mbe, String refno_pfix, String refno_brn, Integer refno_serl, String priname_l1, 
                    Long exemplar, String status, String prdclass, BigDecimal utilis_amt, String utilis_ccy, String orig_ref, 
                    Long parent_ev, String input_brn, String bhalf_brn, String expiry_dat, String expiry_loc, BigDecimal amount, 
                    String ccy, BigDecimal amt_o_s, String dflt_wkgrp, Long pcp_pty, Long npcp_pty, String charge_for, String usercode1, 
                    String usercode2, String usercode3, Long resp_user, String ctrct_date, String workgroup, BigDecimal liab_amt, 
                    String liab_ccy, String tfr_mthd, String shared_liab, String mailto_brn, Long relmstr_key, String relmstr_ref, 
                    Long prodtype, Long primarycus, Long useroptn1, Long useroptn2, Long useroptn3, Long useroptn4, Long useroptn5, 
                    BigDecimal totliabamt, String totliabccy, String reimb_chgs, String billlevel, String bookoffdat, Long ecflnk_key, 
                    String ecflnk_ref, String deact_date, String datatakeon, String active, String prev_sts, String master_ref, 
                    String ref_lock, String pricustsbb, String pricustmnm, Integer verlevel, String canourref, Integer ev_count, 
                    Long extfield, String no_browse, String pri_ref, String canprnref, String npr_ref, String cannprnref, String takeon, 
                    Integer take_amdno, String take_date, Integer take_payno, String origname, String origteam, String origisuser, 
                    String origbranch, Long origuser, String origref, String ebankmsref, String nprcustsbb, String nprcustmnm, 
                    String nprname_l1, String pcp_sw_bic, String npcp_sw_bic) {
      this.key97 = key97;
      this.refno_mbe = refno_mbe != null ? refno_mbe.trim() : null;
      this.refno_pfix = refno_pfix != null ? refno_pfix.trim() : null;
      this.refno_brn = refno_brn != null ? refno_brn.trim() : null;
      this.refno_serl = refno_serl;
      this.priname_l1 = priname_l1 != null ? priname_l1.trim() : null;
      this.exemplar = exemplar;
      this.status = status != null ? status.trim() : null;
      this.prdclass = prdclass != null ? prdclass.trim() : null;
      this.utilis_amt = utilis_amt;
      this.utilis_ccy = utilis_ccy != null ? utilis_ccy.trim() : null;
      this.orig_ref = orig_ref != null ? orig_ref.trim() : null;
      this.parent_ev = parent_ev;
      this.input_brn = input_brn != null ? input_brn.trim() : null;
      this.bhalf_brn = bhalf_brn != null ? bhalf_brn.trim() : null;
      this.expiry_dat = expiry_dat != null ? expiry_dat.trim() : null;
      this.expiry_loc = expiry_loc != null ? expiry_loc.trim() : null;
      this.amount = amount;
      this.ccy = ccy != null ? ccy.trim() : null;
      this.amt_o_s = amt_o_s;
      this.dflt_wkgrp = dflt_wkgrp != null ? dflt_wkgrp.trim() : null;
      this.pcp_pty = pcp_pty;
      this.npcp_pty = npcp_pty;
      this.charge_for = charge_for != null ? charge_for.trim() : null;
      this.usercode1 = usercode1 != null ? usercode1.trim() : null;
      this.usercode2 = usercode2 != null ? usercode2.trim() : null;
      this.usercode3 = usercode3 != null ? usercode3.trim() : null;
      this.resp_user = resp_user;
      this.ctrct_date = ctrct_date != null ? ctrct_date.trim() : null;
      this.workgroup = workgroup != null ? workgroup.trim() : null;
      this.liab_amt = liab_amt;
      this.liab_ccy = liab_ccy != null ? liab_ccy.trim() : null;
      this.tfr_mthd = tfr_mthd != null ? tfr_mthd.trim() : null;
      this.shared_liab = shared_liab != null ? shared_liab.trim() : null;
      this.mailto_brn = mailto_brn != null ? mailto_brn.trim() : null;
      this.relmstr_key = relmstr_key;
      this.relmstr_ref = relmstr_ref != null ? relmstr_ref.trim() : null;
      this.prodtype = prodtype;
      this.primarycus = primarycus;
      this.useroptn1 = useroptn1;
      this.useroptn2 = useroptn2;
      this.useroptn3 = useroptn3;
      this.useroptn4 = useroptn4;
      this.useroptn5 = useroptn5;
      this.totliabamt = totliabamt;
      this.totliabccy = totliabccy != null ? totliabccy.trim() : null;
      this.reimb_chgs = reimb_chgs != null ? reimb_chgs.trim() : null;
      this.billlevel = billlevel != null ? billlevel.trim() : null;
      this.bookoffdat = bookoffdat != null ? bookoffdat.trim() : null;
      this.ecflnk_key = ecflnk_key;
      this.ecflnk_ref = ecflnk_ref != null ? ecflnk_ref.trim() : null;
      this.deact_date = deact_date != null ? deact_date.trim() : null;
      this.datatakeon = datatakeon != null ? datatakeon.trim() : null;
      this.active = active != null ? active.trim() : null;
      this.prev_sts = prev_sts != null ? prev_sts.trim() : null;
      this.master_ref = master_ref != null ? master_ref.trim() : null;
      this.ref_lock = ref_lock != null ? ref_lock.trim() : null;
      this.pricustsbb = pricustsbb != null ? pricustsbb.trim() : null;
      this.pricustmnm = pricustmnm != null ? pricustmnm.trim() : null;
      this.verlevel = verlevel;
      this.canourref = canourref != null ? canourref.trim() : null;
      this.ev_count = ev_count;
      this.extfield = extfield;
      this.no_browse = no_browse != null ? no_browse.trim() : null;
      this.pri_ref = pri_ref != null ? pri_ref.trim() : null;
      this.canprnref = canprnref != null ? canprnref.trim() : null;
      this.npr_ref = npr_ref != null ? npr_ref.trim() : null;
      this.cannprnref = cannprnref != null ? cannprnref.trim() : null;
      this.takeon = takeon != null ? takeon.trim() : null;
      this.take_amdno = take_amdno;
      this.take_date = take_date != null ? take_date.trim() : null;
      this.take_payno = take_payno;
      this.origname = origname != null ? origname.trim() : null;
      this.origteam = origteam != null ? origteam.trim() : null;
      this.origisuser = origisuser != null ? origisuser.trim() : null;
      this.origbranch = origbranch != null ? origbranch.trim() : null;
      this.origuser = origuser;
      this.origref = origref != null ? origref.trim() : null;
      this.ebankmsref = ebankmsref != null ? ebankmsref.trim() : null;
      this.nprcustsbb = nprcustsbb != null ? nprcustsbb.trim() : null;
      this.nprcustmnm = nprcustmnm != null ? nprcustmnm.trim() : null;
      this.nprname_l1 = nprname_l1 != null ? nprname_l1.trim() : null;
      this.pcp_sw_bic = pcp_sw_bic != null ? pcp_sw_bic.trim() : null;
      this.npcp_sw_bic = npcp_sw_bic != null ? npcp_sw_bic.trim() : null;
  }

  // Getter & Setter
  public Long getKey97() {
    return key97;
  }

  public void setKey97(Long key97) {
    this.key97 = key97;
  }

  public String getRefno_mbe() {
    return refno_mbe;
  }

  public void setRefno_mbe(String refno_mbe) {
    this.refno_mbe = refno_mbe;
  }

  public String getRefno_pfix() {
    return refno_pfix;
  }

  public void setRefno_pfix(String refno_pfix) {
    this.refno_pfix = refno_pfix;
  }

  public String getRefno_brn() {
    return refno_brn;
  }

  public void setRefno_brn(String refno_brn) {
    this.refno_brn = refno_brn;
  }

  public Integer getRefno_serl() {
    return refno_serl;
  }

  public void setRefno_serl(Integer refno_serl) {
    this.refno_serl = refno_serl;
  }

  public String getPriname_l1() {
    return priname_l1;
  }

  public void setPriname_l1(String priname_l1) {
    this.priname_l1 = priname_l1;
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

  public BigDecimal getUtilis_amt() {
    return utilis_amt;
  }

  public void setUtilis_amt(BigDecimal utilis_amt) {
    this.utilis_amt = utilis_amt;
  }

  public String getUtilis_ccy() {
    return utilis_ccy;
  }

  public void setUtilis_ccy(String utilis_ccy) {
    this.utilis_ccy = utilis_ccy;
  }

  public String getOrig_ref() {
    return orig_ref;
  }

  public void setOrig_ref(String orig_ref) {
    this.orig_ref = orig_ref;
  }

  public Long getParent_ev() {
    return parent_ev;
  }

  public void setParent_ev(Long parent_ev) {
    this.parent_ev = parent_ev;
  }

  public String getInput_brn() {
    return input_brn;
  }

  public void setInput_brn(String input_brn) {
    this.input_brn = input_brn;
  }

  public String getBhalf_brn() {
    return bhalf_brn;
  }

  public void setBhalf_brn(String bhalf_brn) {
    this.bhalf_brn = bhalf_brn;
  }

  public String getExpiry_dat() {
    return expiry_dat;
  }

  public void setExpiry_dat(String expiry_dat) {
    this.expiry_dat = expiry_dat;
  }

  public String getExpiry_loc() {
    return expiry_loc;
  }

  public void setExpiry_loc(String expiry_loc) {
    this.expiry_loc = expiry_loc;
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

  public BigDecimal getAmt_o_s() {
    return amt_o_s;
  }

  public void setAmt_o_s(BigDecimal amt_o_s) {
    this.amt_o_s = amt_o_s;
  }

  public String getDflt_wkgrp() {
    return dflt_wkgrp;
  }

  public void setDflt_wkgrp(String dflt_wkgrp) {
    this.dflt_wkgrp = dflt_wkgrp;
  }

  public Long getPcp_pty() {
    return pcp_pty;
  }

  public void setPcp_pty(Long pcp_pty) {
    this.pcp_pty = pcp_pty;
  }

  public Long getNpcp_pty() {
    return npcp_pty;
  }

  public void setNpcp_pty(Long npcp_pty) {
    this.npcp_pty = npcp_pty;
  }

  public String getCharge_for() {
    return charge_for;
  }

  public void setCharge_for(String charge_for) {
    this.charge_for = charge_for;
  }

  public String getUsercode1() {
    return usercode1;
  }

  public void setUsercode1(String usercode1) {
    this.usercode1 = usercode1;
  }

  public String getUsercode2() {
    return usercode2;
  }

  public void setUsercode2(String usercode2) {
    this.usercode2 = usercode2;
  }

  public String getUsercode3() {
    return usercode3;
  }

  public void setUsercode3(String usercode3) {
    this.usercode3 = usercode3;
  }

  public Long getResp_user() {
    return resp_user;
  }

  public void setResp_user(Long resp_user) {
    this.resp_user = resp_user;
  }

  public String getCtrct_date() {
    return ctrct_date;
  }

  public void setCtrct_date(String ctrct_date) {
    this.ctrct_date = ctrct_date;
  }

  public String getWorkgroup() {
    return workgroup;
  }

  public void setWorkgroup(String workgroup) {
    this.workgroup = workgroup;
  }

  public BigDecimal getLiab_amt() {
    return liab_amt;
  }

  public void setLiab_amt(BigDecimal liab_amt) {
    this.liab_amt = liab_amt;
  }

  public String getLiab_ccy() {
    return liab_ccy;
  }

  public void setLiab_ccy(String liab_ccy) {
    this.liab_ccy = liab_ccy;
  }

  public String getTfr_mthd() {
    return tfr_mthd;
  }

  public void setTfr_mthd(String tfr_mthd) {
    this.tfr_mthd = tfr_mthd;
  }

  public String getShared_liab() {
    return shared_liab;
  }

  public void setShared_liab(String shared_liab) {
    this.shared_liab = shared_liab;
  }

  public String getMailto_brn() {
    return mailto_brn;
  }

  public void setMailto_brn(String mailto_brn) {
    this.mailto_brn = mailto_brn;
  }

  public Long getRelmstr_key() {
    return relmstr_key;
  }

  public void setRelmstr_key(Long relmstr_key) {
    this.relmstr_key = relmstr_key;
  }

  public String getRelmstr_ref() {
    return relmstr_ref;
  }

  public void setRelmstr_ref(String relmstr_ref) {
    this.relmstr_ref = relmstr_ref;
  }

  public Long getProdtype() {
    return prodtype;
  }

  public void setProdtype(Long prodtype) {
    this.prodtype = prodtype;
  }

  public Long getPrimarycus() {
    return primarycus;
  }

  public void setPrimarycus(Long primarycus) {
    this.primarycus = primarycus;
  }

  public Long getUseroptn1() {
    return useroptn1;
  }

  public void setUseroptn1(Long useroptn1) {
    this.useroptn1 = useroptn1;
  }

  public Long getUseroptn2() {
    return useroptn2;
  }

  public void setUseroptn2(Long useroptn2) {
    this.useroptn2 = useroptn2;
  }

  public Long getUseroptn3() {
    return useroptn3;
  }

  public void setUseroptn3(Long useroptn3) {
    this.useroptn3 = useroptn3;
  }

  public Long getUseroptn4() {
    return useroptn4;
  }

  public void setUseroptn4(Long useroptn4) {
    this.useroptn4 = useroptn4;
  }

  public Long getUseroptn5() {
    return useroptn5;
  }

  public void setUseroptn5(Long useroptn5) {
    this.useroptn5 = useroptn5;
  }

  public BigDecimal getTotliabamt() {
    return totliabamt;
  }

  public void setTotliabamt(BigDecimal totliabamt) {
    this.totliabamt = totliabamt;
  }

  public String getTotliabccy() {
    return totliabccy;
  }

  public void setTotliabccy(String totliabccy) {
    this.totliabccy = totliabccy;
  }


  public String getReimb_chgs() {
    return reimb_chgs;
  }

  public void setReimb_chgs(String reimb_chgs) {
    this.reimb_chgs = reimb_chgs;
  }

  public String getBilllevel() {
    return billlevel;
  }

  public void setBilllevel(String billlevel) {
    this.billlevel = billlevel;
  }

  public String getBookoffdat() {
    return bookoffdat;
  }

  public void setBookoffdat(String bookoffdat) {
    this.bookoffdat = bookoffdat;
  }

  public Long getEcflnk_key() {
    return ecflnk_key;
  }
  
  public void setEcflnk_key(Long ecflnk_key) {
    this.ecflnk_key = ecflnk_key;
  }

  public String getEcflnk_ref() {
    return ecflnk_ref;
  }

  public void setEcflnk_ref(String ecflnk_ref) {
    this.ecflnk_ref = ecflnk_ref;
  }

  public String getDeact_date() {
    return deact_date;
  }

  public void setDeact_date(String deact_date) {
    this.deact_date = deact_date;
  }

  public String getDatatakeon() {
    return datatakeon;
  }

  public void setDatatakeon(String datatakeon) {
    this.datatakeon = datatakeon;
  }

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public String getPrev_sts() {
    return prev_sts;
  }

  public void setPrev_sts(String prev_sts) {
    this.prev_sts = prev_sts;
  }

  public String getMaster_ref() {
    return master_ref;
  }

  public void setMaster_ref(String master_ref) {
    this.master_ref = master_ref;
  }

  public String getRef_lock() {
    return ref_lock;
  }

  public void setRef_lock(String ref_lock) {
    this.ref_lock = ref_lock;
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

  public Integer getVerlevel() {
    return verlevel;
  }

  public void setVerlevel(Integer verlevel) {
    this.verlevel = verlevel;
  }

  public String getCanourref() {
    return canourref;
  }

  public void setCanourref(String canourref) {
    this.canourref = canourref;
  }

  public Integer getEv_count() {
    return ev_count;
  }

  public void setEv_count(Integer ev_count) {
    this.ev_count = ev_count;
  }

  public Long getExtfield() {
    return extfield;
  }

  public void setExtfield(Long extfield) {
    this.extfield = extfield;
  }

  public String getNo_browse() {
    return no_browse;
  }

  public void setNo_browse(String no_browse) {
    this.no_browse = no_browse;
  }

  public String getPri_ref() {
    return pri_ref;
  }

  public void setPri_ref(String pri_ref) {
    this.pri_ref = pri_ref;
  }

  public String getCanprnref() {
    return canprnref;
  }

  public void setCanprnref(String canprnref) {
    this.canprnref = canprnref;
  }

  public String getNpr_ref() {
    return npr_ref;
  }

  public void setNpr_ref(String npr_ref) {
    this.npr_ref = npr_ref;
  }

  public String getCannprnref() {
    return cannprnref;
  }

  public void setCannprnref(String cannprnref) {
    this.cannprnref = cannprnref;
  }

  public String getTakeon() {
    return takeon;
  }

  public void setTakeon(String takeon) {
    this.takeon = takeon;
  }

  public Integer getTake_amdno() {
    return take_amdno;
  }

  public void setTake_amdno(Integer take_amdno) {
    this.take_amdno = take_amdno;
  }

  public String getTake_date() {
    return take_date;
  }

  public void setTake_date(String take_date) {
    this.take_date = take_date;
  }

  public Integer getTake_payno() {
    return take_payno;
  }

  public void setTake_payno(Integer take_payno) {
    this.take_payno = take_payno;
  }

  public String getOrigname() {
    return origname;
  }

  public void setOrigname(String origname) {
    this.origname = origname;
  }

  public String getOrigteam() {
    return origteam;
  }

  public void setOrigteam(String origteam) {
    this.origteam = origteam;
  }

  public String getOrigisuser() {
    return origisuser;
  }

  public void setOrigisuser(String origisuser) {
    this.origisuser = origisuser;
  }

  public String getOrigbranch() {
    return origbranch;
  }

  public void setOrigbranch(String origbranch) {
    this.origbranch = origbranch;
  }

  public Long getOriguser() {
    return origuser;
  }

  public void setOriguser(Long origuser) {
    this.origuser = origuser;
  }

  public String getOrigref() {
    return origref;
  }

  public void setOrigref(String origref) {
    this.origref = origref;
  }

  public String getEbankmsref() {
    return ebankmsref;
  }

  public void setEbankmsref(String ebankmsref) {
    this.ebankmsref = ebankmsref;
  }

  public String getNprcustsbb() {
    return nprcustsbb;
  }

  public void setNprcustsbb(String nprcustsbb) {
    this.nprcustsbb = nprcustsbb;
  }

  public String getNprcustmnm() {
    return nprcustmnm;
  }

  public void setNprcustmnm(String nprcustmnm) {
    this.nprcustmnm = nprcustmnm;
  }

  public String getNprname_l1() {
    return nprname_l1;
  }

  public void setNprname_l1(String nprname_l1) {
    this.nprname_l1 = nprname_l1;
  }

  public String getPcp_sw_bic() {
    return pcp_sw_bic;
  }

  public void setPcp_sw_bic(String pcp_sw_bic) {
    this.pcp_sw_bic = pcp_sw_bic;
  }

  public String getNpcp_sw_bic() {
    return npcp_sw_bic;
  }

  public void setNpcp_sw_bic(String npcp_sw_bic) {
    this.npcp_sw_bic = npcp_sw_bic;
  }

}
