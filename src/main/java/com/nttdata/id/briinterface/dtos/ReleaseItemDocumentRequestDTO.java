package com.nttdata.id.briinterface.dtos;

public class ReleaseItemDocumentRequestDTO {
    private String reference;
    private String event;

    // Getter dan Setter
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
}