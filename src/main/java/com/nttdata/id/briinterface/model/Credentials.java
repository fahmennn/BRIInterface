package com.nttdata.id.briinterface.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Credentials")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Credentials {
  @JacksonXmlProperty(localName = "Name")
  private String name;

  @JacksonXmlProperty(localName = "Password")
  private String password;

  @JacksonXmlProperty(localName = "Certificate")
  private String certificate;

  @JacksonXmlProperty(localName = "Digest")
  private String digest;

  // Constructor
  public Credentials() {
  }

  public Credentials(String name) {
    this.name = name;
  }

  // Getters and Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }
}
