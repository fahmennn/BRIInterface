package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AmendmentDetails")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AmendmentDetails {
	
	@JacksonXmlProperty(localName = "AmendmentNumber", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Integer amendmentNumber;

	@JacksonXmlProperty(localName = "AmendmentChargesBy", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private AmendmentChargesBy amendmentChargesBy;
    
  // getters and setters
  public Integer getAmendmentNumber() {
		return amendmentNumber;
	}

	public void setAmendmentNumber(Integer amendmentNumber) {
		this.amendmentNumber = amendmentNumber;
	}

	public AmendmentChargesBy getAmendmentChargesBy() {
		return amendmentChargesBy;
	}

	public void setAmendmentChargesBy(AmendmentChargesBy amendmentChargesBy) {
		this.amendmentChargesBy = amendmentChargesBy;
	}

	public static class AmendmentChargesBy {
		
		@JacksonXmlProperty(localName = "Code", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
		@Size(min = 1, max = 1, message = "Code must be minimum and maximum 1 character")
		private String code;
		
		@JacksonXmlProperty(localName = "OtherText", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
		@NotBlank(message = "OtherText is mandatory")
		@Size(max = 222, message = "OtherText must be maximum 222 characters")
		private String otherText;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getOtherText() {
			return otherText;
		}

		public void setOtherText(String otherText) {
			this.otherText = otherText;
		}
		
	
	}
	
}
