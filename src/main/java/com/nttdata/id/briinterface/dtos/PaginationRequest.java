package com.nttdata.id.briinterface.dtos;

public class PaginationRequest {
  private Integer page;
  private Integer size;
  private String sortType;
  private String sortBy;

  public PaginationRequest() {
  }

  public PaginationRequest(Integer page, Integer size, String sortType, String sortBy) {
    this.page = page;
    this.size = size;
    this.sortType = sortType;
    this.sortBy = sortBy;
  }

  // Getter & Setter
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getSortType() {
    return sortType;
  }

  public void setSortType(String sortType) {
    this.sortType = sortType;
  }

  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }
}
