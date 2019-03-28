package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This represents the aircraft model retrieved from the Aviation-Edge Web API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AircraftDto {

  /**
   * The id of the plane type.
   */
  @JsonProperty("planeTypeId")
  private String planeTypeId;

  /**
   * The name of the aircraft.
   */
  @JsonProperty("nameAircraft")
  private String nameAircraft;

  /**
   * The IATA code of the aircraft.
   */
  @JsonProperty("codeIataAircraft")
  private String codeIataAircraft;

  /**
   * Returns the id of the plane type.
   *
   * @return the id of the plane type.
   */
  public String getPlaneTypeId() {
    return planeTypeId;
  }

  /**
   * Sets the id of the plane type.
   *
   * @param typeId the id of the plane type to be set.
   */
  public void setPlaneTypeId(final String typeId) {
    this.planeTypeId = typeId;
  }

  /**
   * Returns the name of the aircraft.
   *
   * @return the name of the aircraft.
   */
  public String getNameAircraft() {
    return nameAircraft;
  }

  /**
   * Sets the name of the aircraft.
   *
   * @param name the name of the aircraft to be set.
   */
  public void setNameAircraft(final String name) {
    this.nameAircraft = name;
  }

  /**
   * Returns the IATA code of the aircraft.
   *
   * @return the IATA code of the aircraft.
   */
  public String getCodeIataAircraft() {
    return codeIataAircraft;
  }

  /**
   * Sets the IATA code of the aircraft.
   *
   * @param iataCode the IATA code of the aircraft to be set.
   */
  public void setCodeIataAircraft(final String iataCode) {
    this.codeIataAircraft = iataCode;
  }

  /**
   * Returns true if all properties of two Instances are equal, else false.
   * Check {@link Object#equals(Object)}.
   *
   * @param other th instance to compare with
   * @return true if all properties of two Instances are equal, else false.
   */
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

  /**
   * Generates hash code.
   *
   * @return hash code.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getPlaneTypeId(),
      getNameAircraft(),
      getCodeIataAircraft());
  }
}
