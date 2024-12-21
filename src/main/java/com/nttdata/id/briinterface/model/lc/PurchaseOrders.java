package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "PurchaseOrders")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PurchaseOrders {

	@JacksonXmlProperty(localName = "Number", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 14, message = "Number must be between 1 and 14 characters")
	private String number;
	
	@JacksonXmlProperty(localName = "POAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 16, message = "POAmount must be between 1 and 16 characters")
	private String poAmount;
	
	@JacksonXmlProperty(localName = "POCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 3, message = "POCurrency must be between 1 and 3 characters")
	private String poCurrency;
	
	@JacksonXmlProperty(localName = "POFxRateCode", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 6, message = "POFxRateCode must be between 1 and 6 characters")
	private String poFxRateCode;
	
	@JacksonXmlProperty(localName = "PORate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 14, message = "PORate must be between 1 and 14 characters")
	private String poRate;
	
	@JacksonXmlProperty(localName = "SequenceNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 4, message = "SequenceNumber must be between 1 and 4 characters")
	private String sequenceNumber;
	
	@JacksonXmlProperty(localName = "Description", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 70, message = "Description must be between 1 and 70 characters")
	private String description;
	
	@JacksonXmlProperty(localName = "Style", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 12, message = "Style must be between 1 and 12 characters")
	private String style;
	
	@JacksonXmlProperty(localName = "Color", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 15, message = "Color must be between 1 and 15 characters")
	private String color;
	
	@JacksonXmlProperty(localName = "Department", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 10, message = "Department must be between 1 and 10 characters")
	private String department;
	
	@JacksonXmlProperty(localName = "Quantity", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 5, message = "Quantity must be between 1 and 5 characters")
	private String quantity;
	
	@JacksonXmlProperty(localName = "QuantityVariance", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 5, message = "QuantityVariance must be between 1 and 5 characters")
	private String quantityVariance;

	@JacksonXmlProperty(localName = "UnitOfMeasure", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 20, message = "UnitOfMeasure must be between 1 and 20 characters")
	private String unitOfMeasure;
	
	@JacksonXmlProperty(localName = "UnitPrice", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 16, message = "UnitPrice must be between 1 and 16 characters")
	private String unitPrice;
	
	@JacksonXmlProperty(localName = "PriceVariance", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 16, message = "PriceVariance must be between 1 and 16 characters")
	private String priceVariance;
	
	@JacksonXmlProperty(localName = "UnitPriceCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 3, message = "UnitPriceCurrency must be between 1 and 3 characters")
	private String unitPriceCurrency;
	
	@JacksonXmlProperty(localName = "TotalPrice", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 16, message = "TotalPrice must be between 1 and 16 characters")
	private String totalPrice;
	
	@JacksonXmlProperty(localName = "MaximumTotalPrice", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 16, message = "MaximumTotalPrice must be between 1 and 16 characters")
	private String maximumTotalPrice;
	
	@JacksonXmlProperty(localName = "EarliestShipmentDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 10, message = "EarliestShipmentDate must be between 1 and 10 characters")
	private String earliestShipmentDate;
	
	@JacksonXmlProperty(localName = "LatestShipmentDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 10, message = "LatestShipmentDate must be between 1 and 10 characters")
	private String latestShipmentDate;
	
	@JacksonXmlProperty(localName = "Country", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 2, message = "Country must be between 1 and 2 characters")
	private String country;
	
	@JacksonXmlProperty(localName = "AdjustmentAmount", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 16, message = "AdjustmentAmount must be between 1 and 16 characters")
	private String adjustmentAmount;
	
	@JacksonXmlProperty(localName = "AdjustmentCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 3, message = "AdjustmentCurrency must be between 1 and 3 characters")
	private String adjustmentCurrency;
	
	@JacksonXmlProperty(localName = "AdjustmentDescription", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 35, message = "AdjustmentDescription must be between 1 and 35 characters")
	private String adjustmentDescription;
	
	@JacksonXmlProperty(localName = "UserDefined1", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 65, message = "UserDefined1 must be between 1 and 65 characters")
	private String userDefined1;
	
	@JacksonXmlProperty(localName = "UserDefined2", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 15, message = "UserDefined2 must be between 1 and 15 characters")
	private String userDefined2;
	
	@JacksonXmlProperty(localName = "UserDefined3", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 15, message = "UserDefined3 must be between 1 and 15 characters")
	private String userDefined3;
	
	@JacksonXmlProperty(localName = "UserDefined4", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 15, message = "UserDefined4 must be between 1 and 15 characters")
	private String userDefined4;
	
	@JacksonXmlProperty(localName = "UserDefined5", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
	@Size(min = 1, max = 15, message = "UserDefined5 must be between 1 and 15 characters")
	private String userDefined5;

	// Getter & Setter

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPoAmount() {
		return poAmount;
	}

	public void setPoAmount(String poAmount) {
		this.poAmount = poAmount;
	}

	public String getPoCurrency() {
		return poCurrency;
	}

	public void setPoCurrency(String poCurrency) {
		this.poCurrency = poCurrency;
	}

	public String getPoFxRateCode() {
		return poFxRateCode;
	}

	public void setPoFxRateCode(String poFxRateCode) {
		this.poFxRateCode = poFxRateCode;
	}

	public String getPoRate() {
		return poRate;
	}

	public void setPoRate(String poRate) {
		this.poRate = poRate;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getQuantityVariance() {
		return quantityVariance;
	}

	public void setQuantityVariance(String quantityVariance) {
		this.quantityVariance = quantityVariance;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPriceVariance() {
		return priceVariance;
	}

	public void setPriceVariance(String priceVariance) {
		this.priceVariance = priceVariance;
	}

	public String getUnitPriceCurrency() {
		return unitPriceCurrency;
	}

	public void setUnitPriceCurrency(String unitPriceCurrency) {
		this.unitPriceCurrency = unitPriceCurrency;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getMaximumTotalPrice() {
		return maximumTotalPrice;
	}

	public void setMaximumTotalPrice(String maximumTotalPrice) {
		this.maximumTotalPrice = maximumTotalPrice;
	}

	public String getEarliestShipmentDate() {
		return earliestShipmentDate;
	}

	public void setEarliestShipmentDate(String earliestShipmentDate) {
		this.earliestShipmentDate = earliestShipmentDate;
	}

	public String getLatestShipmentDate() {
		return latestShipmentDate;
	}

	public void setLatestShipmentDate(String latestShipmentDate) {
		this.latestShipmentDate = latestShipmentDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAdjustmentAmount() {
		return adjustmentAmount;
	}

	public void setAdjustmentAmount(String adjustmentAmount) {
		this.adjustmentAmount = adjustmentAmount;
	}

	public String getAdjustmentCurrency() {
		return adjustmentCurrency;
	}

	public void setAdjustmentCurrency(String adjustmentCurrency) {
		this.adjustmentCurrency = adjustmentCurrency;
	}

	public String getAdjustmentDescription() {
		return adjustmentDescription;
	}

	public void setAdjustmentDescription(String adjustmentDescription) {
		this.adjustmentDescription = adjustmentDescription;
	}

	public String getUserDefined1() {
		return userDefined1;
	}

	public void setUserDefined1(String userDefined1) {
		this.userDefined1 = userDefined1;
	}

	public String getUserDefined2() {
		return userDefined2;
	}

	public void setUserDefined2(String userDefined2) {
		this.userDefined2 = userDefined2;
	}

	public String getUserDefined3() {
		return userDefined3;
	}

	public void setUserDefined3(String userDefined3) {
		this.userDefined3 = userDefined3;
	}

	public String getUserDefined4() {
		return userDefined4;
	}

	public void setUserDefined4(String userDefined4) {
		this.userDefined4 = userDefined4;
	}

	public String getUserDefined5() {
		return userDefined5;
	}

	public void setUserDefined5(String userDefined5) {
		this.userDefined5 = userDefined5;
	}


}
