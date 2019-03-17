package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This represents the Aircraft Model.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AircraftDto {

  @JsonProperty("planeTypeId")
  private String planeTypeId;

  @JsonProperty("nameAircraft")
  private String nameAircraft;

  @JsonProperty("codeIataAircraft")
  private String codeIataAircraft;

  public String getPlaneTypeId() {
    return planeTypeId;
  }

  public void setPlaneTypeId(final String typeId) {
    this.planeTypeId = typeId;
  }

  public String getNameAircraft() {
    return nameAircraft;
  }

  public void setNameAircraft(final String name) {
    this.nameAircraft = name;
  }

  public String getCodeIataAircraft() {
    return codeIataAircraft;
  }

  public void setCodeIataAircraft(final String iataCode) {
    this.codeIataAircraft = iataCode;
  }

  @Override
  public boolean equals(final Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof AircraftDto)) {
      return false;
    }
    AircraftDto that = (AircraftDto) other;
    return Objects.equals(getPlaneTypeId(), that.getPlaneTypeId())
      && Objects.equals(getNameAircraft(), that.getNameAircraft())
      && Objects.equals(getCodeIataAircraft(), that.getCodeIataAircraft());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPlaneTypeId(),
      getNameAircraft(),
      getCodeIataAircraft());
  }
}
