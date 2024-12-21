package com.nttdata.id.briinterface.dtos;

public class EventTransactionInquiryRequestDTO {

	private String masterRef;
	
	private String refNoPfix;
	
	private String refNoSerl;
	
	private String timeStart;
	
	private String status;
	
	private String timeFinish;
	
	private String theirRef;
	
	private Double amount;
	
	private String ccy;
	
	private String statusEV;
	
	private String crossRef;

	private String startDate;

	private String finished;
	
	private PaginationRequest pagination;

	public String getMasterRef() {
		return masterRef;
	}

	public void setMasterRef(String masterRef) {
		this.masterRef = masterRef;
	}

	public String getRefNoPfix() {
		return refNoPfix;
	}

	public void setRefNoPfix(String refNoPfix) {
		this.refNoPfix = refNoPfix;
	}

	public String getRefNoSerl() {
		return refNoSerl;
	}

	public void setRefNoSerl(String refNoSerl) {
		this.refNoSerl = refNoSerl;
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

	public String getTimeFinish() {
		return timeFinish;
	}

	public void setTimeFinish(String timeFinish) {
		this.timeFinish = timeFinish;
	}

	public String getTheirRef() {
		return theirRef;
	}

	public void setTheirRef(String theirRef) {
		this.theirRef = theirRef;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getStatusEV() {
		return statusEV;
	}

	public void setStatusEV(String statusEV) {
		this.statusEV = statusEV;
	}

	public String getCrossRef() {
		return crossRef;
	}

	public void setCrossRef(String crossRef) {
		this.crossRef = crossRef;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getFinished() {
		return finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
	}

	public PaginationRequest getPagination() {
		return pagination;
	}

	public void setPagination(PaginationRequest pagination) {
		this.pagination = pagination;
	}
	
}
