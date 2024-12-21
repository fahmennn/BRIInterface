package com.nttdata.id.briinterface.model.db2;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.ConstructorResult;
import javax.persistence.ColumnResult;
import javax.persistence.Table;

import com.nttdata.id.briinterface.dtos.ReleaseItemDocumentDTO;

import javax.persistence.Column;
import java.io.Serializable;

@Entity
@Table(name = "CMS_META", schema = "TRADEIN1")
@SqlResultSetMapping(
	    name = "ReleaseItemDocumentDTOMapping",
	    classes = @ConstructorResult(
	        targetClass = ReleaseItemDocumentDTO.class,
	        columns = {
	            @ColumnResult(name = "reference", type = String.class),
	            @ColumnResult(name = "event", type = String.class),
	            @ColumnResult(name = "file_type", type = String.class),
	            @ColumnResult(name = "item", type = byte[].class),
	            @ColumnResult(name = "file_name", type = String.class),
	        }
	    )
	)
@NamedNativeQuery(
		name = "CmsMeta.findReleaseItemDocumentsByEventAndReference",
	    query = "SELECT cm2.META_VALUE AS reference, cm.META_VALUE AS event, SUBSTR(ci.MIME_TYPE, LOCATE('/', ci.MIME_TYPE) + 1) AS file_type, ci.ITEM AS item, cm3.META_VALUE AS file_name  " +
	            "FROM CMS_META cm2 " +
	            "INNER JOIN CMS_META cm ON cm.ITEM_ID = cm2.ITEM_ID AND (cm.META_NAME = 'EVENT_REFERENCE' AND cm.META_VALUE = :event) " +
	            "INNER JOIN CMS_ITEM ci ON ci.ITEM_ID = cm2.ITEM_ID " +
	            "INNER JOIN CMS_META cm3 ON cm3.META_NAME  = 'DESCRIPTION' AND cm3.ITEM_ID  = cm.ITEM_ID " +
	            "WHERE (cm2.META_NAME = 'OUR_REFERENCE' AND cm2.META_VALUE = :reference) " +
	            "ORDER BY cm2.META_VALUE DESC",
	    resultSetMapping = "ReleaseItemDocumentDTOMapping"
	)
public class CmsMeta implements Serializable {

    @Id
    @Column(name = "ITEM_ID", length = 128)
    private String itemId;

    @Column(name = "META_NAME", length = 32, nullable = false)
    private String metaName;

    @Column(name = "META_VALUE", length = 128)
    private String metaValue;

    // Getters and setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }
}