package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityDto {

  @JsonProperty("cityId")
  private String cityId;

  @JsonProperty("nameCity")
  private String nameCity;

  @JsonProperty("codeIataCity")
  private String codeIataCity;

  @JsonProperty("codeIso2Country")
  private String codeIso2Country;

  @JsonProperty("nameTranslations")
  private String nameTranslations;

  @JsonProperty("latitudeCity")
  private String latitudeCity;

  @JsonProperty("longitudeCity")
  private String longitudeCity;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("GMT")
  private String gmt;

  @JsonProperty("geonameId")
  private String geonameId;

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getNameCity() {
    return nameCity;
  }

  public void setNameCity(String nameCity) {
    this.nameCity = nameCity;
  }

  public String getCodeIataCity() {
    return codeIataCity;
  }

  public void setCodeIataCity(String codeIataCity) {
    this.codeIataCity = codeIataCity;
  }

  public String getCodeIso2Country() {
    return codeIso2Country;
  }

  public void setCodeIso2Country(String codeIso2Country) {
    this.codeIso2Country = codeIso2Country;
  }

  public String getNameTranslations() {
    return nameTranslations;
  }

  public void setNameTranslations(String nameTranslations) {
    this.nameTranslations = nameTranslations;
  }

  public String getLatitudeCity() {
    return latitudeCity;
  }

  public void setLatitudeCity(String latitudeCity) {
    this.latitudeCity = latitudeCity;
  }

  public String getLongitudeCity() {
    return longitudeCity;
  }

  public void setLongitudeCity(String longitudeCity) {
    this.longitudeCity = longitudeCity;
  }

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public String getGmt() {
    return gmt;
  }

  public void setGmt(String gmt) {
    this.gmt = gmt;
  }

  public String getGeonameId() {
    return geonameId;
  }

  public void setGeonameId(String geonameId) {
    this.geonameId = geonameId;
  }

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