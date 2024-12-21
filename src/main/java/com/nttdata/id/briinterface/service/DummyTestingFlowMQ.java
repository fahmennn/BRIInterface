package com.nttdata.id.briinterface.service;

import org.springframework.stereotype.Service;

@Service
public class DummyTestingFlowMQ {
  
  public String searchAccountResponse() {
    return "<?xml version=\"1.0\" standalone=\"yes\"?>\r\n" + //
            "<ServiceResponse xmlns:m=\"urn:messages.service.ti.apps.tiplus2.misys.com\" xmlns=\"urn:control.services.tiplus2.misys.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\r\n" + //
            "    <ResponseHeader>\r\n" + //
            "        <Service>Account</Service>\r\n" + //
            "        <Operation>AccountSearch</Operation>\r\n" + //
            "        <Status>SUCCEEDED</Status>\r\n" + //
            "        <Details>\r\n" + //
            "            <Error></Error>\r\n" + //
            "            <Warning></Warning>\r\n" + //
            "            <Info>Information message here</Info>\r\n" + //
            "        </Details>\r\n" + //
            "        <CorrelationId>123456789</CorrelationId>\r\n" + //
            "        <TargetSystem>SystemX</TargetSystem>\r\n" + //
            "        <SourceSystem>SystemY</SourceSystem>\r\n" + //
            "    </ResponseHeader>\r\n" + //
            "    <m:AccountSearchResponse>\r\n" + //
            "        <m:AccountSearchResults>\r\n" + //
            "            <m:AccountSearchResult>\r\n" + //
            "                <m:Branch>001</m:Branch>\r\n" + //
            "                <m:BranchNumber>1001</m:BranchNumber>\r\n" + //
            "                <m:Customer>John Doe</m:Customer>\r\n" + //
            "                <m:CustomerNumber>123456789012</m:CustomerNumber>\r\n" + //
            "                <m:SystemParameter>Param1</m:SystemParameter>\r\n" + //
            "                <m:ChargeCode>CC</m:ChargeCode>\r\n" + //
            "                <m:CategoryCode>CAT001</m:CategoryCode>\r\n" + //
            "                <m:AccountType>Savings</m:AccountType>\r\n" + //
            "                <m:Currency>USD</m:Currency>\r\n" + //
            "                <m:OtherCurrency>EUR</m:OtherCurrency>\r\n" + //
            "                <m:BackOfficeAccount>1234567890123</m:BackOfficeAccount>\r\n" + //
            "                <m:ShortName>John</m:ShortName>\r\n" + //
            "                <m:ExternalAccount>EXT123</m:ExternalAccount>\r\n" + //
            "                <m:IBAN>US123456789012345</m:IBAN>\r\n" + //
            "            </m:AccountSearchResult>\r\n" + //
            "        </m:AccountSearchResults>\r\n" + //
            "        <m:AdditionalResults>false</m:AdditionalResults>\r\n" + //
            "    </m:AccountSearchResponse>\r\n" + //
            "</ServiceResponse>\r\n" + //
            "";
  }

  public String customerSearchResponse(){
    return "<?xml version=\"1.0\" standalone=\"yes\"?>\r\n" + //
            "<ServiceResponse xmlns:m='urn:messages.service.ti.apps.tiplus2.misys.com' xmlns='urn:control.services.tiplus2.misys.com' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>\r\n" + //
            "\t<ResponseHeader>\r\n" + //
            "\t\t<Service>Customer</Service>\r\n" + //
            "\t\t<Operation>CustomerSearch</Operation>\r\n" + //
            "\t\t<Status>SUCCEEDED</Status>\r\n" + //
            "\t\t<Details>\r\n" + //
            "\t\t\t<Error>No error</Error>\r\n" + //
            "\t\t\t<Warning>No warning</Warning>\r\n" + //
            "\t\t\t<Info>Request processed successfully</Info>\r\n" + //
            "\t\t</Details>\r\n" + //
            "\t\t<CorrelationId>12345</CorrelationId>\r\n" + //
            "\t\t<TargetSystem>TGT_SYSTEM</TargetSystem>\r\n" + //
            "\t\t<SourceSystem>SRC_SYSTEM</SourceSystem>\r\n" + //
            "\t</ResponseHeader>\r\n" + //
            "\t<m:CustomerSearchResponse>\r\n" + //
            "\t\t<m:CustomerSearchResults>\r\n" + //
            "\t\t\t<m:CustomerSearchResult>\r\n" + //
            "\t\t\t\t<m:CustomerMnemonic>MNEMONIC12345</m:CustomerMnemonic>\r\n" + //
            "\t\t\t\t<m:FullName>John Doe</m:FullName>\r\n" + //
            "\t\t\t\t<m:CustomerNumber>123456789012</m:CustomerNumber>\r\n" + //
            "\t\t\t\t<m:CountryOfResidence>ID</m:CountryOfResidence>\r\n" + //
            "\t\t\t\t<m:AccountOfficer>ACCT_OFF</m:AccountOfficer>\r\n" + //
            "\t\t\t\t<m:Blocked>false</m:Blocked>\r\n" + //
            "\t\t\t\t<m:Group>GROUP1</m:Group>\r\n" + //
            "\t\t\t\t<m:Location>Main Office - Jakarta</m:Location>\r\n" + //
            "\t\t\t</m:CustomerSearchResult>\r\n" + //
            "\t\t</m:CustomerSearchResults>\r\n" + //
            "\t\t<m:AdditionalResults>false</m:AdditionalResults>\r\n" + //
            "\t</m:CustomerSearchResponse>\r\n" + //
            "</ServiceResponse>\r\n" + //
            "";
  }

  public String responseHeader() {
    return "\t<ResponseHeader>\r\n" + //
            "\t\t<Service>Account</Service>\r\n" + //
            "\t\t<Operation>AccountSearch</Operation>\r\n" + //
            "\t\t<Status>SUCCEEDED</Status>\r\n" + //
            "\t\t<Details>\r\n" + //
            "\t\t\t<Error>Error</Error>\r\n" + //
            "\t\t\t<Warning>Warning</Warning>\r\n" + //
            "\t\t\t<Info>Info</Info>\r\n" + //
            "\t\t</Details>\r\n" + //
            "\t\t<CorrelationId>CorrelationId</CorrelationId>\r\n" + //
            "\t\t<TargetSystem>TargetSystem</TargetSystem>\r\n" + //
            "\t\t<SourceSystem>SourceSystem</SourceSystem>\r\n" + //
            "\t</ResponseHeader>";
  }
}
