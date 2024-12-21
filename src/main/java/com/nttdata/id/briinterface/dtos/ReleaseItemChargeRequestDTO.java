package com.nttdata.id.briinterface.dtos;

public class ReleaseItemChargeRequestDTO {
	
	private String reference;
	
	private String event;
	
	private PaginationRequest pagination;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public PaginationRequest getPagination() {
		return pagination;
	}

	public void setPagination(PaginationRequest pagination) {
		this.pagination = pagination;
	}

}
