package com.nttdata.id.briinterface.dtos;

public class BranchInquiryRequestDTO {
  private String cabbn;
  private String fullName;
  private String city;
  private PaginationRequest pagination;

  // Getter & Setter

  public String getCabbn() {
    return cabbn;
  }

  public void setCabbn(String cabbn) {
    this.cabbn = cabbn;
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

  public PaginationRequest getPagination() {
    return pagination;
  }

  public void setPagination(PaginationRequest pagination) {
    this.pagination = pagination;
  }
}
