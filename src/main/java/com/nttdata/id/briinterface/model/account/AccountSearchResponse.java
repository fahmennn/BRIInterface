package com.nttdata.id.briinterface.model.account;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AccountSearchResponse")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AccountSearchResponse {
  @JacksonXmlElementWrapper(localName = "AccountSearchResults", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "AccountSearchResult")
  private List<AccountSearchResult> accountSearchResults;

  @JacksonXmlProperty(localName = "AdditionalResults", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  private Boolean additionalResults;

  // Constructor
  public AccountSearchResponse(){
  }

  public AccountSearchResponse(List<AccountSearchResult> accountSearchResult, Boolean additionalResult){
    this.accountSearchResults = accountSearchResult;
    this.additionalResults = additionalResult;
  }

  // Getter & Setter

  public List<AccountSearchResult> getAccountSearchResults() {
    return accountSearchResults;
  }

  public void setAccountSearchResults(List<AccountSearchResult> accountSearchResults) {
    this.accountSearchResults = accountSearchResults;
  }

  public Boolean getAdditionalResults() {
    return additionalResults;
  }

  public void setAdditionalResults(Boolean additionalResults) {
    this.additionalResults = additionalResults;
  }
}
