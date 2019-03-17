package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDto {

  @JsonProperty("error")
  private ErrorText error;

  public String getErrorText() {
    return error != null ? error.getText() : "";
  }

  public ErrorText getError() {
    return error;
  }

  public void setError(ErrorText error) {
    this.error = error;
  }

  static class ErrorText {
    @JsonProperty("text")
    private String text;

    public String getText() {
      return text;
    }

    public void setText(String text) {
      this.text = text;
    }
  }


}
