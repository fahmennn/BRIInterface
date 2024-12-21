package com.nttdata.id.briinterface.model.lc;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Revolving")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Revolving {

	@JacksonXmlProperty(localName = "Revolving", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean revolving;
	
	@JacksonXmlProperty(localName = "Cumulative", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean cumulative;
	
	@JacksonXmlProperty(localName = "Period", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@NotBlank(message = "Period is mandatory")
	@Size(max = 6, message = "Period must be maximum 6 characters")
  private String period;

	@JacksonXmlProperty(localName = "Revolutions", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	private Integer revolutions;
	
	@JacksonXmlProperty(localName = "NextDate", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date nextDate;
	
	@JacksonXmlProperty(localName = "NoticeDays", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Integer noticeDays;
	
	@JacksonXmlProperty(localName = "ChargeToFirstPeriod", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private Boolean chargeToFirstPeriod;

	public Boolean getRevolving() {
		return revolving;
	}

	public void setRevolving(Boolean revolving) {
		this.revolving = revolving;
	}

	public Boolean getCumulative() {
		return cumulative;
	}

	public void setCumulative(Boolean cumulative) {
		this.cumulative = cumulative;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getRevolutions() {
		return revolutions;
	}

	public void setRevolutions(Integer revolutions) {
		this.revolutions = revolutions;
	}

	public Date getNextDate() {
		return nextDate;
	}

	public void setNextDate(Date nextDate) {
		this.nextDate = nextDate;
	}

	public Integer getNoticeDays() {
		return noticeDays;
	}

	public void setNoticeDays(Integer noticeDays) {
		this.noticeDays = noticeDays;
	}

	public Boolean getChargeToFirstPeriod() {
		return chargeToFirstPeriod;
	}

	public void setChargeToFirstPeriod(Boolean chargeToFirstPeriod) {
		this.chargeToFirstPeriod = chargeToFirstPeriod;
	}
	
}
