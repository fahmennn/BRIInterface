package com.nttdata.id.briinterface.model.db2;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.sql.Timestamp;
import java.io.Serializable;

@Entity
@Table(name = "CMS_ITEM", schema = "TRADEIN1")
public class CmsItem implements Serializable {

    @Id
    @Column(name = "ITEM_ID", length = 128)
    private String itemId;

    @Column(name = "MIME_TYPE", length = 128)
    private String mimeType;

    @Column(name = "ITEM")
    private byte[] item;

    @Column(name = "UPDATED", nullable = false)
    private Timestamp updated;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "ATTACHED", length = 1)
    private String attached;

    // Getters and setters
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

    public byte[] getItem() {
        return item;
    }

    public void setItem(byte[] item) {
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

    public String getAttached() {
        return attached;
    }

    public void setAttached(String attached) {
        this.attached = attached;
    }
}