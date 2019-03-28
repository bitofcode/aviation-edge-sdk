package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This represents airport model retrieved from the Aviation-Edge Web API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirportDto {

  /**
   * The airport id.
   */
  @JsonProperty("airportId")
  private String airportId;

  /**
   * The airport name.
   */
  @JsonProperty("nameAirport")
  private String nameAirport;

  /**
   * The airport IATA code.
   */
  @JsonProperty("codeIataAirport")
  private String codeIataAirport;

  /**
   * The airport ICAO code.
   */
  @JsonProperty("codeIcaoAirport")
  private String codeIcaoAirport;

  /**
   * The translation names.
   */
  @JsonProperty("nameTranslations")
  private String nameTranslations;

  /**
   * The airport latitude.
   */
  @JsonProperty("latitudeAirport")
  private String latitudeAirport;

  /**
   * The airport longitude.
   */
  @JsonProperty("longitudeAirport")
  private String longitudeAirport;

  /**
   * The geo name id.
   */
  @JsonProperty("geonameId")
  private String geonameId;

  /**
   * The timezone.
   */
  @JsonProperty("timezone")
  private String timezone;

  /**
   * The GMT difference.
   */
  @JsonProperty("GMT")
  private String gmt;

  /**
   * The phone number.
   */
  @JsonProperty("phone")
  private String phone;

  /**
   * The country name.
   */
  @JsonProperty("nameCountry")
  private String nameCountry;

  /**
   * The country ISO 2 code.
   */
  @JsonProperty("codeIso2Country")
  private String codeIso2Country;

  /**
   * The city ISO code.
   */
  @JsonProperty("codeIataCity")
  private String codeIataCity;

  /**
   * Returns the airport id.
   *
   * @return the airport id.
   */
  public String getAirportId() {
    return airportId;
  }

  /**
   * Sets the airport id.
   *
   * @param airportId the airport id.
   */
  public void setAirportId(String airportId) {
    this.airportId = airportId;
  }

  /**
   * Returns the airport name.
   *
   * @return the airport name.
   */
  public String getNameAirport() {
    return nameAirport;
  }

  /**
   * Sets the airport name.
   *
   * @param nameAirport the airport name to be set.
   */
  public void setNameAirport(String nameAirport) {
    this.nameAirport = nameAirport;
  }

  /**
   * Returns the airport IATA code.
   *
   * @return the airport IATA code.
   */
  public String getCodeIataAirport() {
    return codeIataAirport;
  }

  /**
   * Sets the airport IATA code.
   *
   * @param codeIataAirport the airport IATA code to be set.
   */
  public void setCodeIataAirport(String codeIataAirport) {
    this.codeIataAirport = codeIataAirport;
  }

  /**
   * Returns the airport ICAO code.
   *
   * @return the airport ICAO code.
   */
  public String getCodeIcaoAirport() {
    return codeIcaoAirport;
  }

  /**
   * Sets the airport ICAO code.
   *
   * @param codeIcaoAirport the airport ICAO code to be set.
   */
  public void setCodeIcaoAirport(String codeIcaoAirport) {
    this.codeIcaoAirport = codeIcaoAirport;
  }

  /**
   * Returns the translation names.
   *
   * @return the translation names.
   */
  public String getNameTranslations() {
    return nameTranslations;
  }

  /**
   * Sets the translation names.
   *
   * @param nameTranslations the translation names to be set.
   */
  public void setNameTranslations(String nameTranslations) {
    this.nameTranslations = nameTranslations;
  }

  /**
   * Retruns the airport latitude.
   *
   * @return the airport latitude.
   */
  public String getLatitudeAirport() {
    return latitudeAirport;
  }

  /**
   * Sets the airport latitude.
   *
   * @param latitudeAirport the airport latitude to be set.
   */
  public void setLatitudeAirport(String latitudeAirport) {
    this.latitudeAirport = latitudeAirport;
  }

  /**
   * Returns the airport longitude.
   *
   * @return the airport longitude.
   */
  public String getLongitudeAirport() {
    return longitudeAirport;
  }

  /**
   * Sets the airport longitude.
   *
   * @param longitudeAirport the airport longitude to be set.
   */
  public void setLongitudeAirport(String longitudeAirport) {
    this.longitudeAirport = longitudeAirport;
  }

  /**
   * Returns the geo name id.
   *
   * @return the geo name id.
   */
  public String getGeonameId() {
    return geonameId;
  }

  /**
   * Sets the geo name id.
   *
   * @param geonameId the geo name id to be set.
   */
  public void setGeonameId(String geonameId) {
    this.geonameId = geonameId;
  }

  /**
   * Returns the timezone.
   *
   * @return the timezone.
   */
  public String getTimezone() {
    return timezone;
  }

  /**
   * Sets the timezone.
   *
   * @param timezone the timezone to be set.
   */
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * Returns the GMT difference.
   *
   * @return the GMT difference.
   */
  public String getGmt() {
    return gmt;
  }

  /**
   * Sets the GMT difference.
   *
   * @param gmt the GMT difference to be set.
   */
  public void setGmt(String gmt) {
    this.gmt = gmt;
  }

  /**
   * Returns the phone number.
   *
   * @return the phone number.
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Sets the phone number.
   *
   * @param phone the phone number to be set.
   */
  public void setPhone(String phone) {
    this.phone = phone;
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
   * @param nameCountry the country name ti be set.
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
   * @param codeIso2Country the country ISO 2 code to be set.
   */
  public void setCodeIso2Country(String codeIso2Country) {
    this.codeIso2Country = codeIso2Country;
  }

  /**
   * Returns the city ISO code.
   *
   * @return the city ISO code.
   */
  public String getCodeIataCity() {
    return codeIataCity;
  }

  /**
   * Sets the city ISO code.
   *
   * @param codeIataCity the city ISO code to be set.
   */
  public void setCodeIataCity(String codeIataCity) {
    this.codeIataCity = codeIataCity;
  }

  /**
   * Returns string representation.
   *
   * @return string representation.
   */
  @Override
  public String toString() {
    //noinspection Duplicates
    return new StringBuilder()
      .append("AirportDto{")
      .append("airportId='")
      .append(airportId)
      .append('\'')
      .append(", nameAirport='")
      .append(nameAirport)
      .append('\'')
      .append(", codeIataAirport='")
      .append(codeIataAirport)
      .append('\'')
      .append(", codeIcaoAirport='")
      .append(codeIcaoAirport)
      .append('\'')
      .append(", nameTranslations='")
      .append(nameTranslations)
      .append('\'')
      .append(", latitudeAirport='")
      .append(latitudeAirport)
      .append('\'')
      .append(", longitudeAirport='")
      .append(longitudeAirport)
      .append('\'')
      .append(", geonameId='")
      .append(geonameId)
      .append('\'')
      .append(", timezone='")
      .append(timezone)
      .append('\'')
      .append(", gmt='")
      .append(gmt)
      .append('\'')
      .append(", phone='")
      .append(phone)
      .append('\'')
      .append(", nameCountry='")
      .append(nameCountry)
      .append('\'')
      .append(", codeIso2Country='")
      .append(codeIso2Country)
      .append('\'')
      .append(", codeIataCity='")
      .append(codeIataCity)
      .append('\'')
      .append('}').toString();
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
    if (!(obj instanceof AirportDto)) {
      return false;
    }
    AirportDto that = (AirportDto) obj;
    return getAirportId().equals(that.getAirportId())
      && getNameAirport().equals(that.getNameAirport())
      && getCodeIataAirport().equals(that.getCodeIataAirport())
      && getCodeIcaoAirport().equals(that.getCodeIcaoAirport())
      && getNameTranslations().equals(that.getNameTranslations())
      && getLatitudeAirport().equals(that.getLatitudeAirport())
      && getLongitudeAirport().equals(that.getLongitudeAirport())
      && getGeonameId().equals(that.getGeonameId())
      && getTimezone().equals(that.getTimezone())
      && getGmt().equals(that.getGmt())
      && getPhone().equals(that.getPhone())
      && getNameCountry().equals(that.getNameCountry())
      && getCodeIso2Country().equals(that.getCodeIso2Country())
      && getCodeIataCity().equals(that.getCodeIataCity());
  }

  /**
   * Generates hash code.
   *
   * @return hash code.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getAirportId(),
      getNameAirport(),
      getCodeIataAirport(),
      getCodeIcaoAirport(),
      getNameTranslations(),
      getLatitudeAirport(),
      getLongitudeAirport(),
      getGeonameId(),
      getTimezone(),
      getGmt(),
      getPhone(),
      getNameCountry(),
      getCodeIso2Country(),
      getCodeIataCity());
  }
}
