package com.nttdata.id.briinterface.model.lc;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AdditionalParties")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AdditionalParties {
  @JacksonXmlElementWrapper(localName = "AdditionalPartiesToAdds", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "AdditionalPartiesToAdd", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  public List<Parties> additionalPartiesToAdds;

  @JacksonXmlElementWrapper(localName = "AdditionalPartiesToUpdates", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "AdditionalPartiesToUpdate", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  public List<Parties> additionalPartiesToUpdates;

  @JacksonXmlElementWrapper(localName = "AdditionalPartiesToDeletes", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  @JacksonXmlProperty(localName = "AdditionalPartiesToDelete", namespace = "urn:common.service.ti.apps.tiplus2.misys.com")
  public List<Parties> additionalPartiesToDeletes;

  // Getter & Setter
  public List<Parties> getAdditionalPartiesToAdds() {
    return additionalPartiesToAdds;
  }

  public void setAdditionalPartiesToAdds(List<Parties> additionalPartiesToAdds) {
    this.additionalPartiesToAdds = additionalPartiesToAdds;
  }

  public List<Parties> getAdditionalPartiesToUpdates() {
    return additionalPartiesToUpdates;
  }

  public void setAdditionalPartiesToUpdates(List<Parties> additionalPartiesToUpdates) {
    this.additionalPartiesToUpdates = additionalPartiesToUpdates;
  }

  public List<Parties> getAdditionalPartiesToDeletes() {
    return additionalPartiesToDeletes;
  }

  public void setAdditionalPartiesToDeletes(List<Parties> additionalPartiesToDeletes) {
    this.additionalPartiesToDeletes = additionalPartiesToDeletes;
  }

}
