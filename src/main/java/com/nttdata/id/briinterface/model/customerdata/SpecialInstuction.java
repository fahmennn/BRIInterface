package com.nttdata.id.briinterface.model.customerdata;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "SpecialInstuction")
public class SpecialInstuction {
  @JacksonXmlProperty(localName = "Severity", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 1, message = "Severity must be 1 character")
  private String severity;

  @JacksonXmlProperty(localName = "Code", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "Code must be 1-10 characters")
  private String code;

  @JacksonXmlProperty(localName = "Details", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 70, message = "Details must be 1-70 characters")
  private String details;

  @JacksonXmlProperty(localName = "Style", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "Style must be 1-10 characters")
  private String style;

  @JacksonXmlProperty(localName = "Emphasis", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "Emphasis must be 1-10 character")
  private String emphasis;

  @JacksonXmlProperty(localName = "Type", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(max = 35, message = "Type must be maximum 35 characters")
  private String type;

  @JacksonXmlProperty(localName = "BusinessArea", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @Size(min = 1, max = 10, message = "BusinessArea must be 1-10 characters")
  private String businessArea;

  // Getter and Setter
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getEmphasis() {
    return emphasis;
  }

  public void setEmphasis(String emphasis) {
    this.emphasis = emphasis;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getBusinessArea() {
    return businessArea;
  }

  public void setBusinessArea(String businessArea) {
    this.businessArea = businessArea;
  }
}
