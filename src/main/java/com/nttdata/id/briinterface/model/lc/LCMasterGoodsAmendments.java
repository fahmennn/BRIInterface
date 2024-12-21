package com.nttdata.id.briinterface.model.lc;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "LCMasterGoodsAmendments")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LCMasterGoodsAmendments {
  @JacksonXmlProperty(localName = "GoodsDescriptionAmendmentInstructions", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private GoodsDescriptionAmendmentInstructions goodsDescriptionAmendmentInstructions;

  @JacksonXmlProperty(localName = "DocumentsRequiredAmendmentInstructions", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private DocumentsRequiredAmendmentInstructions documentsRequiredAmendmentInstructions;

  @JacksonXmlProperty(localName = "AdditionalConditionsAmendmentInstructions", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  private AdditionalConditionsAmendmentInstructions additionalConditionsAmendmentInstructions;

  // Getter & Setter

  public GoodsDescriptionAmendmentInstructions getGoodsDescriptionAmendmentInstructions() {
    return goodsDescriptionAmendmentInstructions;
  }

  public void setGoodsDescriptionAmendmentInstructions(GoodsDescriptionAmendmentInstructions goodsDescriptionAmendmentInstructions) {
    this.goodsDescriptionAmendmentInstructions = goodsDescriptionAmendmentInstructions;
  }

  public DocumentsRequiredAmendmentInstructions getDocumentsRequiredAmendmentInstructions() {
    return documentsRequiredAmendmentInstructions;
  }

  public void setDocumentsRequiredAmendmentInstructions(DocumentsRequiredAmendmentInstructions documentsRequiredAmendmentInstructions) {
    this.documentsRequiredAmendmentInstructions = documentsRequiredAmendmentInstructions;
  }

  public AdditionalConditionsAmendmentInstructions getAdditionalConditionsAmendmentInstructions() {
    return additionalConditionsAmendmentInstructions;
  }

  public void setAdditionalConditionsAmendmentInstructions(AdditionalConditionsAmendmentInstructions additionalConditionsAmendmentInstructions) {
    this.additionalConditionsAmendmentInstructions = additionalConditionsAmendmentInstructions;
  }

  // Inner Class
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  public static class GoodsDescriptionAmendmentInstructions {
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
  public static class DocumentsRequiredAmendmentInstructions{
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
  public static class AdditionalConditionsAmendmentInstructions{
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
