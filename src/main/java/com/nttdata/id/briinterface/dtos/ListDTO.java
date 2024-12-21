package com.nttdata.id.briinterface.dtos;

public class ListDTO<T> {
  private Long total;
  private Integer page;
  private Integer size;
  private String sortType;
  private String sortBy;
  private T data;

  public ListDTO() {
  }

  public ListDTO(Long total, Integer page, Integer size, String sortType, String sortBy, T data) {
    this.total = total;
    this.page = page;
    this.size = size;
    this.sortType = sortType;
    this.sortBy = sortBy;
    this.data = data;
  }

  // Getter & Setter
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

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

  public void setSort(String sortType) {
    this.sortType = sortType;
  }

  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
