package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This represents an airline model retrieved from the Aviation-Edge Web API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirlineDto {

  /**
   * The Aviation-Edge airline id.
   */
  @JsonProperty("airlineId")
  private String airlineId;

  /**
   * The airline name.
   */
  @JsonProperty("nameAirline")
  private String nameAirline;

  /**
   * The airline IATA code.
   */
  @JsonProperty("codeIataAirline")
  private String codeIataAirline;

  /**
   * The IATA accounting prefix.
   */
  @JsonProperty("iataPrefixAccounting")
  private String iataPrefixAccounting;

  /**
   * The ICAO airline code.
   */
  @JsonProperty("codeIcaoAirline")
  private String codeIcaoAirline;

  /**
   * The call sign.
   */
  @JsonProperty("callsign")
  private String callsign;

  /**
   * The type.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The airline status.
   */
  @JsonProperty("statusAirline")
  private String statusAirline;

  /**
   * The airline size.
   */
  @JsonProperty("sizeAirline")
  private String sizeAirline;

  /**
   * the fleet age.
   */
  @JsonProperty("ageFleet")
  private String ageFleet;

  /**
   * the founding year.
   */
  @JsonProperty("founding")
  private String founding;

  /**
   * The hub code.
   */
  @JsonProperty("codeHub")
  private String codeHub;

  /**
   * the country name.
   */
  @JsonProperty("nameCountry")
  private String nameCountry;

  /**
   * the country ISO 2 code.
   */
  @JsonProperty("codeIso2Country")
  private String codeIso2Country;

  /**
   * Returns the Aviation-Edge airline id.
   *
   * @return
   */
  public String getAirlineId() {
    return airlineId;
  }

  /**
   * Sets the Aviation-Edge airline id.
   *
   * @param airlineId the Aviation-Edge airline id to be set.
   */
  public void setAirlineId(String airlineId) {
    this.airlineId = airlineId;
  }

  /**
   * Returns the airline name.
   *
   * @return the airline name
   */
  public String getNameAirline() {
    return nameAirline;
  }

  /**
   * Sets the airline name.
   *
   * @param nameAirline the airline name to be set.
   */
  public void setNameAirline(String nameAirline) {
    this.nameAirline = nameAirline;
  }

  /**
   * Returns the airline IATA code.
   *
   * @return the airline IATA code.
   */
  public String getCodeIataAirline() {
    return codeIataAirline;
  }

  /**
   * Sets the airline IATA code.
   *
   * @param codeIataAirline the airline IATA code to be set.
   */
  public void setCodeIataAirline(String codeIataAirline) {
    this.codeIataAirline = codeIataAirline;
  }

  /**
   * Returns the IATA accounting prefix.
   *
   * @return the IATA accounting prefix.
   */
  public String getIataPrefixAccounting() {
    return iataPrefixAccounting;
  }

  /**
   * Sets the IATA accounting prefix.
   *
   * @param iataPrefixAccounting the IATA accounting prefix to be set.
   */
  public void setIataPrefixAccounting(String iataPrefixAccounting) {
    this.iataPrefixAccounting = iataPrefixAccounting;
  }

  /**
   * Returns the airline ICAO code.
   *
   * @return the airline ICAO code.
   */
  public String getCodeIcaoAirline() {
    return codeIcaoAirline;
  }

  /**
   * Sets the airline ICAO code.
   *
   * @param codeIcaoAirline the airline ICAO code to be set.
   */
  public void setCodeIcaoAirline(String codeIcaoAirline) {
    this.codeIcaoAirline = codeIcaoAirline;
  }

  /**
   * Returns the call sign.
   *
   * @return the call sign.
   */
  public String getCallsign() {
    return callsign;
  }

  /**
   * Sets the call sign.
   *
   * @param callsign the call sign to be set.
   */
  public void setCallsign(String callsign) {
    this.callsign = callsign;
  }

  /**
   * Returns the type.
   *
   * @return the type.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the type to be set.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Returns the airline status.
   *
   * @return the airline status.
   */
  public String getStatusAirline() {
    return statusAirline;
  }

  /**
   * Sets the airline status.
   *
   * @param statusAirline the airline status to be set.
   */
  public void setStatusAirline(String statusAirline) {
    this.statusAirline = statusAirline;
  }

  /**
   * Returns the airline size.
   *
   * @return the airline size.
   */
  public String getSizeAirline() {
    return sizeAirline;
  }

  /**
   * Sets the airline size.
   *
   * @param sizeAirline the airline size to be set.
   */
  public void setSizeAirline(String sizeAirline) {
    this.sizeAirline = sizeAirline;
  }

  /**
   * Returns the fleet age.
   *
   * @return the fleet age.
   */
  public String getAgeFleet() {
    return ageFleet;
  }

  /**
   * Sets the fleet age.
   *
   * @param ageFleet the fleet age to be set.
   */
  public void setAgeFleet(String ageFleet) {
    this.ageFleet = ageFleet;
  }

  /**
   * Returns the founding year.
   *
   * @return the founding year.
   */
  public String getFounding() {
    return founding;
  }

  /**
   * Sets the founding year.
   *
   * @param founding the founding year.
   */
  public void setFounding(String founding) {
    this.founding = founding;
  }

  /**
   * Returns the hube code.
   *
   * @return the hube code.
   */
  public String getCodeHub() {
    return codeHub;
  }

  /**
   * Sets the hube code.
   *
   * @param codeHub the hube code to be set.
   */
  public void setCodeHub(String codeHub) {
    this.codeHub = codeHub;
  }

  /**
   * Returns the country name.
   *
   * @return the country name.
   */
  public String getNameCountry() {
    return nameCountry;
  }

  /**
   * Sets the country name.
   *
   * @param nameCountry the country name to be set.
   */
  public void setNameCountry(String nameCountry) {
    this.nameCountry = nameCountry;
  }

  /**
   * Returns the country ISO 2 code.
   *
   * @return the country ISO 2 code.
   */
  public String getCodeIso2Country() {
    return codeIso2Country;
  }

  /**
   * Sets the country ISO 2 code.
   *
   * @param codeIso2Country the country ISO 2 code.
   */
  public void setCodeIso2Country(String codeIso2Country) {
    this.codeIso2Country = codeIso2Country;
  }

  /**
   * Returns true if all properties of two Instances are equal, else false.
   * Check {@link Object#equals(Object)}.
   *
   * @param obj th instance to compare with
   * @return true if all properties of two Instances are equal, else false.
   */
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

  /**
   * Generates hash code.
   *
   * @return hash code.
   */
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
