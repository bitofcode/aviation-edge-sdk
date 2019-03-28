package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This represents the city model retrieved from the Aviation-Edge Web API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityDto {

  /**
   * The city id.
   */
  @JsonProperty("cityId")
  private String cityId;

  /**
   * The city name.
   */
  @JsonProperty("nameCity")
  private String nameCity;

  /**
   * The city IATA code.
   */
  @JsonProperty("codeIataCity")
  private String codeIataCity;

  /**
   * The country ISO 2 code.
   */
  @JsonProperty("codeIso2Country")
  private String codeIso2Country;

  /**
   * The translation names.
   */
  @JsonProperty("nameTranslations")
  private String nameTranslations;

  /**
   * The city latitude.
   */
  @JsonProperty("latitudeCity")
  private String latitudeCity;

  /**
   * The city longitude.
   */
  @JsonProperty("longitudeCity")
  private String longitudeCity;

  /**
   * The timezone.
   */
  @JsonProperty("timezone")
  private String timezone;

  /**
   * The GMT offset.
   */
  @JsonProperty("GMT")
  private String gmt;

  /**
   * The geo-name id.
   */
  @JsonProperty("geonameId")
  private String geonameId;

  /**
   * Returns the city id.
   *
   * @returnt he city id.
   */
  public String getCityId() {
    return cityId;
  }

  /**
   * Sets the city id.
   *
   * @param cityId the city id to be set.
   */
  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  /**
   * Returns the city name.
   *
   * @return the city name.
   */
  public String getNameCity() {
    return nameCity;
  }

  /**
   * Sets the city name.
   *
   * @param nameCity the city name to be set.
   */
  public void setNameCity(String nameCity) {
    this.nameCity = nameCity;
  }

  /**
   * Returns the city IATA code.
   *
   * @return the city IATA code..
   */
  public String getCodeIataCity() {
    return codeIataCity;
  }

  /**
   * Returns the city IATA code.
   *
   * @param codeIataCity the city IATA code to be set
   */
  public void setCodeIataCity(String codeIataCity) {
    this.codeIataCity = codeIataCity;
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
   * @param nameTranslations the translation names  to be set.
   */
  public void setNameTranslations(String nameTranslations) {
    this.nameTranslations = nameTranslations;
  }

  /**
   * Returns the city latitude.
   *
   * @return the city latitude.
   */
  public String getLatitudeCity() {
    return latitudeCity;
  }

  /**
   * Sets the city latitude.
   *
   * @param latitudeCity the city latitude to be set.
   */
  public void setLatitudeCity(String latitudeCity) {
    this.latitudeCity = latitudeCity;
  }

  /**
   * Returns the city longitude.
   *
   * @return the city longitude.
   */
  public String getLongitudeCity() {
    return longitudeCity;
  }

  /**
   * Sets the city longitude.
   *
   * @param longitudeCity the city longitude to be set.
   */
  public void setLongitudeCity(String longitudeCity) {
    this.longitudeCity = longitudeCity;
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
   * Returns the GMT offset.
   *
   * @return the GMT offset.
   */
  public String getGmt() {
    return gmt;
  }

  /**
   * Sets the GMT offset.
   *
   * @param gmt the GMT offset.
   */
  public void setGmt(String gmt) {
    this.gmt = gmt;
  }

  /**
   * Returns the geo-name id.
   *
   * @return the geo-name id.
   */
  public String getGeonameId() {
    return geonameId;
  }

  /**
   * Sets the geo-name id.
   *
   * @param geonameId the geo-name id to be set.
   */
  public void setGeonameId(String geonameId) {
    this.geonameId = geonameId;
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
    if (!(obj instanceof CityDto)) {
      return false;
    }
    CityDto cityDto = (CityDto) obj;
    return Objects.equals(getCityId(), cityDto.getCityId())
      && Objects.equals(getNameCity(), cityDto.getNameCity())
      && Objects.equals(getCodeIataCity(), cityDto.getCodeIataCity())
      && Objects.equals(getCodeIso2Country(), cityDto.getCodeIso2Country())
      && Objects.equals(getNameTranslations(), cityDto.getNameTranslations())
      && Objects.equals(getLatitudeCity(), cityDto.getLatitudeCity())
      && Objects.equals(getLongitudeCity(), cityDto.getLongitudeCity())
      && Objects.equals(getTimezone(), cityDto.getTimezone())
      && Objects.equals(getGmt(), cityDto.getGmt())
      && Objects.equals(getGeonameId(), cityDto.getGeonameId());
  }

  /**
   * Generates hash code.
   *
   * @return hash code.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getCityId(),
      getNameCity(),
      getCodeIataCity(),
      getCodeIso2Country(),
      getNameTranslations(),
      getLatitudeCity(),
      getLongitudeCity(),
      getTimezone(),
      getGmt(),
      getGeonameId());
  }
}