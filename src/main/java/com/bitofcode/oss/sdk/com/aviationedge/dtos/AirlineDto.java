package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This represents an Airline.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirlineDto {

  @JsonProperty("airlineId")
  private String airlineId;

  @JsonProperty("nameAirline")
  private String nameAirline;

  @JsonProperty("codeIataAirline")
  private String codeIataAirline;

  @JsonProperty("iataPrefixAccounting")
  private String iataPrefixAccounting;

  @JsonProperty("codeIcaoAirline")
  private String codeIcaoAirline;

  @JsonProperty("callsign")
  private String callsign;

  @JsonProperty("type")
  private String type;

  @JsonProperty("statusAirline")
  private String statusAirline;

  @JsonProperty("sizeAirline")
  private String sizeAirline;

  @JsonProperty("ageFleet")
  private String ageFleet;

  @JsonProperty("founding")
  private String founding;

  @JsonProperty("codeHub")
  private String codeHub;

  @JsonProperty("nameCountry")
  private String nameCountry;

  @JsonProperty("codeIso2Country")
  private String codeIso2Country;

  public String getAirlineId() {
    return airlineId;
  }

  public void setAirlineId(String airlineId) {
    this.airlineId = airlineId;
  }

  public String getNameAirline() {
    return nameAirline;
  }

  public void setNameAirline(String nameAirline) {
    this.nameAirline = nameAirline;
  }

  public String getCodeIataAirline() {
    return codeIataAirline;
  }

  public void setCodeIataAirline(String codeIataAirline) {
    this.codeIataAirline = codeIataAirline;
  }

  public String getIataPrefixAccounting() {
    return iataPrefixAccounting;
  }

  public void setIataPrefixAccounting(String iataPrefixAccounting) {
    this.iataPrefixAccounting = iataPrefixAccounting;
  }

  public String getCodeIcaoAirline() {
    return codeIcaoAirline;
  }

  public void setCodeIcaoAirline(String codeIcaoAirline) {
    this.codeIcaoAirline = codeIcaoAirline;
  }

  public String getCallsign() {
    return callsign;
  }

  public void setCallsign(String callsign) {
    this.callsign = callsign;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStatusAirline() {
    return statusAirline;
  }

  public void setStatusAirline(String statusAirline) {
    this.statusAirline = statusAirline;
  }

  public String getSizeAirline() {
    return sizeAirline;
  }

  public void setSizeAirline(String sizeAirline) {
    this.sizeAirline = sizeAirline;
  }

  public String getAgeFleet() {
    return ageFleet;
  }

  public void setAgeFleet(String ageFleet) {
    this.ageFleet = ageFleet;
  }

  public String getFounding() {
    return founding;
  }

  public void setFounding(String founding) {
    this.founding = founding;
  }

  public String getCodeHub() {
    return codeHub;
  }

  public void setCodeHub(String codeHub) {
    this.codeHub = codeHub;
  }

  public String getNameCountry() {
    return nameCountry;
  }

  public void setNameCountry(String nameCountry) {
    this.nameCountry = nameCountry;
  }

  public String getCodeIso2Country() {
    return codeIso2Country;
  }

  public void setCodeIso2Country(String codeIso2Country) {
    this.codeIso2Country = codeIso2Country;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof AirlineDto)) {
      return false;
    }
    AirlineDto that = (AirlineDto) obj;
    return getAirlineId().equals(that.getAirlineId())
      && getNameAirline().equals(that.getNameAirline())
      && getCodeIataAirline().equals(that.getCodeIataAirline())
      && getIataPrefixAccounting().equals(that.getIataPrefixAccounting())
      && getCodeIcaoAirline().equals(that.getCodeIcaoAirline())
      && getCallsign().equals(that.getCallsign())
      && getType().equals(that.getType())
      && getStatusAirline().equals(that.getStatusAirline())
      && getSizeAirline().equals(that.getSizeAirline())
      && getAgeFleet().equals(that.getAgeFleet())
      && getFounding().equals(that.getFounding())
      && getCodeHub().equals(that.getCodeHub())
      && getNameCountry().equals(that.getNameCountry())
      && getCodeIso2Country().equals(that.getCodeIso2Country());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAirlineId(),
      getNameAirline(),
      getCodeIataAirline(),
      getIataPrefixAccounting(),
      getCodeIcaoAirline(),
      getCallsign(),
      getType(),
      getStatusAirline(),
      getSizeAirline(),
      getAgeFleet(),
      getFounding(),
      getCodeHub(),
      getNameCountry(),
      getCodeIso2Country());
  }
}
