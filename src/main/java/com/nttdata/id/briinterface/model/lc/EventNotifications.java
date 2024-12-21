package com.nttdata.id.briinterface.model.lc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "EventNotifications")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EventNotifications {
  @JacksonXmlProperty(localName = "MessageData", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MessageData is mandatory")
  @Size(max = 32700, message = "MessageData maximum 32700 characters")
  private String messageData;
  
  @JacksonXmlProperty(localName = "MessageDescription", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MessageDescription is mandatory")
  @Size(max = 50, message = "MessageDescription maximum 50 characters")
  private String messageDescription;
  
  @JacksonXmlProperty(localName = "MessageInfo", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MessageInfo is mandatory")
  @Size(max = 222, message = "MessageInfo maximum 222 characters")
  private String messageInfo;
  
  @JacksonXmlProperty(localName = "MessageNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "MessageNumber is mandatory")
  @Size(max = 10, message = "MessageNumber maximum 10 characters")
  private String messageNumber;
  
  @JacksonXmlProperty(localName = "Actioned", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com")
  @NotBlank(message = "Actioned is mandatory")
  private boolean actioned;

  // getters and setters
  public String getMessageData() {
    return messageData;
  }
  public void setMessageData(String messageData) {
    this.messageData = messageData;
  }
  public String getMessageDescription() {
    return messageDescription;
  }
  public void setMessageDescription(String messageDescription) {
    this.messageDescription = messageDescription;
  }
  public String getMessageInfo() {
    return messageInfo;
  }
  public void setMessageInfo(String messageInfo) {
    this.messageInfo = messageInfo;
  }
  public String getMessageNumber() {
    return messageNumber;
  }
  public void setMessageNumber(String messageNumber) {
    this.messageNumber = messageNumber;
  }
  public boolean isActioned() {
    return actioned;
  }
  public void setActioned(boolean actioned) {
    this.actioned = actioned;
  }
}
