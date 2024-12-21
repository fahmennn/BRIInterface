package com.nttdata.id.briinterface.dtos;

public class MasterDTO {
  private Long prodtype;
  private Long pcp_pty;
  private Long npcp_pty;
  private String master_ref;

  // Constructor
  public MasterDTO(Long prodtype, Long pcp_pty, Long npcp_pty, String master_ref) {
    this.prodtype = prodtype;
    this.pcp_pty = pcp_pty;
    this.npcp_pty = npcp_pty;
    this.master_ref = master_ref;
  }

  // Getters & Setters
  public Long getProdtype() {
    return prodtype;
  }

  public void setProdtype(Long prodtype) {
    this.prodtype = prodtype;
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

  public String getMaster_ref() {
    return master_ref;
  }

  public void setMaster_ref(String master_ref) {
    this.master_ref = master_ref;
  }
}
