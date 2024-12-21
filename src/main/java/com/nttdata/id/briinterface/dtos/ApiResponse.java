package com.nttdata.id.briinterface.dtos;

public class ApiResponse<T> {

  private Integer status;

  private String statusDesc;

  private String message;

  private T data;

  //  Constructor
  public ApiResponse(Integer status, String statusDesc, String message, T data) {
    this.status = status;
    this.statusDesc = statusDesc;
    this.message = message;
    this.data = data;
  }

  public ApiResponse(){}

  // Getters & Setters

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data; 
  }
}

