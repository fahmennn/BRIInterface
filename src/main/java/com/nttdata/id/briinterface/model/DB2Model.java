package com.nttdata.id.briinterface.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import java.sql.Blob;
import java.sql.Timestamp;

@Entity
@Table(name = "CMS_ITEM")
public class DB2Model {
	
	@Id
    @Column(name = "ITEM_ID", nullable = false, length = 128)
    private String itemId;

    @Column(name = "MIME_TYPE", length = 128)
    private String mimeType;

    @Lob
    @Column(name = "ITEM")
    private Blob item;

    @Column(name = "UPDATED", nullable = false)
    private Timestamp updated;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "ATTACHED", length = 1)
    private Character attached;

    // Getters and Setters

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Blob getItem() {
        return item;
    }

    public void setItem(Blob item) {
        this.item = item;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Character getAttached() {
        return attached;
    }

    public void setAttached(Character attached) {
        this.attached = attached;
    }

}
