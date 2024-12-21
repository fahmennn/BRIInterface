package com.nttdata.id.briinterface.model.lc;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "SpecialPaymentConditionsAmendments")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SpecialPaymentConditionsAmendments {

  @JacksonXmlProperty(localName = "ForBeneficiaryAmendmentInstructions", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private ForBeneficiaryAmendmentInstructions forBeneficiaryAmendmentInstructions;

  @JacksonXmlProperty(localName = "ForReceivingBankAmendmentInstructions", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private ForReceivingBankAmendmentInstructions forReceivingBankAmendmentInstructions;

  // Getter & Setter

  public ForBeneficiaryAmendmentInstructions getForBeneficiaryAmendmentInstructions() {
    return forBeneficiaryAmendmentInstructions;
  }

  public void setForBeneficiaryAmendmentInstructions(ForBeneficiaryAmendmentInstructions forBeneficiaryAmendmentInstructions) {
    this.forBeneficiaryAmendmentInstructions = forBeneficiaryAmendmentInstructions;
  }

  public ForReceivingBankAmendmentInstructions getForReceivingBankAmendmentInstructions() {
    return forReceivingBankAmendmentInstructions;
  }

  public void setForReceivingBankAmendmentInstructions(ForReceivingBankAmendmentInstructions forReceivingBankAmendmentInstructions) {
    this.forReceivingBankAmendmentInstructions = forReceivingBankAmendmentInstructions;
  }

  // Inner Class
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  public static class ForBeneficiaryAmendmentInstructions{
    @JacksonXmlProperty(localName = "Instruction", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Instruction> instruction;

    public List<Instruction> getInstruction() {
      return instruction;
    }

    public void setInstruction(List<Instruction> instruction) {
      this.instruction = instruction;
    }
  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  public static class ForReceivingBankAmendmentInstructions{
    @JacksonXmlProperty(localName = "Instruction", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Instruction> instruction;

    public List<Instruction> getInstruction() {
      return instruction;
    }

    public void setInstruction(List<Instruction> instruction) {
      this.instruction = instruction;
    }
  }

}
