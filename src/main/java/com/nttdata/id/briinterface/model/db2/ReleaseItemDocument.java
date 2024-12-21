package com.nttdata.id.briinterface.model.db2;

public class ReleaseItemDocument {
	
	private String reference;
    private String event;
    private String fileType;
    private byte[] item;
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
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public byte[] getItem() {
		return item;
	}
	public void setItem(byte[] item) {
		this.item = item;
	}	

}
