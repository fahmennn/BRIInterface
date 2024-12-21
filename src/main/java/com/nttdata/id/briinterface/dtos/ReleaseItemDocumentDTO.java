package com.nttdata.id.briinterface.dtos;

public class ReleaseItemDocumentDTO {
    private String reference;
    private String event;
    private String fileType;
    private byte[] item;
    private String filename;

    public ReleaseItemDocumentDTO(String reference, String event, String fileType, byte[] item, String filename) {
        this.reference = reference;
        this.event = event;
        this.fileType = fileType;
        this.item = item;
        this.filename = filename;
    }
    // Getters and setters

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

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}