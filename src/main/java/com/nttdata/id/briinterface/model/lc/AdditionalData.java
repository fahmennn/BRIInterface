package com.nttdata.id.briinterface.model.lc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AdditionalData")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AdditionalData {

	@JacksonXmlProperty(localName = "DataItem", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private DataItem dataItem;

  // getters and setters
  public DataItem getDataItem() {
		return dataItem;
	}

	public void setDataItem(DataItem dataItem) {
		this.dataItem = dataItem;
	}
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class DataItem {
		
		@JacksonXmlProperty(localName = "Name", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	  private String name;
		
		@JacksonXmlProperty(localName = "Value", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	  private String value;

	    // getters and setters
	  public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
}
