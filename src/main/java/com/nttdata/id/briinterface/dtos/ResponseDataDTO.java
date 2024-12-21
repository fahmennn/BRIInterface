package com.nttdata.id.briinterface.dtos;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDataDTO {
  private Map<String, Object> data = new LinkedHashMap<>();

  // Constructor
  public ResponseDataDTO() {}

  // Getters and Setters

  @JsonAnyGetter
  public Map<String, Object> getData() {
    return data;
  }

  @JsonAnySetter
  public void setResponseData(String key, Object value) {
      data.put(key, value);
  }

}
