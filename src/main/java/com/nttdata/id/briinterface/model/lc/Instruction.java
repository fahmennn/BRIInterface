package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Instruction")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Instruction {
	@JacksonXmlProperty(localName = "Type", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 1, message = "Type must be minimum and maximum 1 character")
  private String type;
	
	@JacksonXmlProperty(localName = "Text", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "Text is mandatory")
  private String text;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
