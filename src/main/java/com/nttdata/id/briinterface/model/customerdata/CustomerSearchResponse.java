package com.nttdata.id.briinterface.model.customerdata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "CustomerSearchResponse")
public class CustomerSearchResponse {
  @JacksonXmlElementWrapper(localName = "CustomerSearchResults", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "CustomerSearchResult")
  private List<CustomerSearchResult> customerSearchResults;

  @JacksonXmlProperty(localName = "AdditionalResults", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean additionalResults;

  // Getter & Setter

  public List<CustomerSearchResult> getCustomerSearchResults() {
    return customerSearchResults;
  }

  public void setCustomerSearchResults(List<CustomerSearchResult> customerSearchResults) {
    this.customerSearchResults = customerSearchResults;
  }

  public Boolean getAdditionalResults() {
    return additionalResults;
  }

  public void setAdditionalResults(Boolean additionalResults) {
    this.additionalResults = additionalResults;
  }
}
