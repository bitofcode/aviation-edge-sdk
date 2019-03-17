package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirportDto {

  @JsonProperty("airportId")
  private String airportId;

  @JsonProperty("nameAirport")
  private String nameAirport;

  @JsonProperty("codeIataAirport")
  private String codeIataAirport;

  @JsonProperty("codeIcaoAirport")
  private String codeIcaoAirport;

  @JsonProperty("nameTranslations")
  private String nameTranslations;

  @JsonProperty("latitudeAirport")
  private String latitudeAirport;

  @JsonProperty("longitudeAirport")
  private String longitudeAirport;

  @JsonProperty("geonameId")
  private String geonameId;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("GMT")
  private String gmt;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("nameCountry")
  private String nameCountry;

  @JsonProperty("codeIso2Country")
  private String codeIso2Country;

  @JsonProperty("codeIataCity")
  private String codeIataCity;

  public String getAirportId() {
    return airportId;
  }

  public void setAirportId(String airportId) {
    this.airportId = airportId;
  }

  public String getNameAirport() {
    return nameAirport;
  }

  public void setNameAirport(String nameAirport) {
    this.nameAirport = nameAirport;
  }

  public String getCodeIataAirport() {
    return codeIataAirport;
  }

  public void setCodeIataAirport(String codeIataAirport) {
    this.codeIataAirport = codeIataAirport;
  }

  public String getCodeIcaoAirport() {
    return codeIcaoAirport;
  }

  public void setCodeIcaoAirport(String codeIcaoAirport) {
    this.codeIcaoAirport = codeIcaoAirport;
  }

  public String getNameTranslations() {
    return nameTranslations;
  }

  public void setNameTranslations(String nameTranslations) {
    this.nameTranslations = nameTranslations;
  }

  public String getLatitudeAirport() {
    return latitudeAirport;
  }

  public void setLatitudeAirport(String latitudeAirport) {
    this.latitudeAirport = latitudeAirport;
  }

  public String getLongitudeAirport() {
    return longitudeAirport;
  }

  public void setLongitudeAirport(String longitudeAirport) {
    this.longitudeAirport = longitudeAirport;
  }

  public String getGeonameId() {
    return geonameId;
  }

  public void setGeonameId(String geonameId) {
    this.geonameId = geonameId;
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  public String getCodeIataCity() {
    return codeIataCity;
  }

  public void setCodeIataCity(String codeIataCity) {
    this.codeIataCity = codeIataCity;
  }

  @Override
  public String toString() {
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
