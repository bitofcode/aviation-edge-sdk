package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxDto {

  @JsonProperty("taxId")
  private String taxId;

  @JsonProperty("nameTax")
  private String nameTax;

  @JsonProperty("codeIataTax")
  private String codeIataTax;

  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public String getNameTax() {
    return nameTax;
  }

  public void setNameTax(String nameTax) {
    this.nameTax = nameTax;
  }

  public String getCodeIataTax() {
    return codeIataTax;
  }

  public void setCodeIataTax(String codeIataTax) {
    this.codeIataTax = codeIataTax;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof TaxDto)) {
      return false;
    }
    TaxDto taxDto = (TaxDto) obj;
    return Objects.equals(getTaxId(), taxDto.getTaxId())
      && Objects.equals(getNameTax(), taxDto.getNameTax())
      && Objects.equals(getCodeIataTax(), taxDto.getCodeIataTax());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTaxId(), getNameTax(), getCodeIataTax());
  }
}
