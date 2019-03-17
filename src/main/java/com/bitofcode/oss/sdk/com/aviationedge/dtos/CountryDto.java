package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryDto {

  @JsonProperty("countryId")
  private String countryId;

  @JsonProperty("nameCountry")
  private String nameCountry;

  @JsonProperty("codeIso2Country")
  private String codeIso2Country;

  @JsonProperty("codeIso3Country")
  private String codeIso3Country;

  @JsonProperty("numericIso")
  private String numericIso;

  @JsonProperty("population")
  private String population;

  @JsonProperty("capital")
  private String capital;

  @JsonProperty("continent")
  private String continent;

  @JsonProperty("nameCurrency")
  private String nameCurrency;

  @JsonProperty("codeCurrency")
  private String codeCurrency;

  @JsonProperty("codeFips")
  private String codeFips;

  @JsonProperty("phonePrefix")
  private String phonePrefix;

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
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

  public String getCodeIso3Country() {
    return codeIso3Country;
  }

  public void setCodeIso3Country(String codeIso3Country) {
    this.codeIso3Country = codeIso3Country;
  }

  public String getNumericIso() {
    return numericIso;
  }

  public void setNumericIso(String numericIso) {
    this.numericIso = numericIso;
  }

  public String getPopulation() {
    return population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public String getNameCurrency() {
    return nameCurrency;
  }

  public void setNameCurrency(String nameCurrency) {
    this.nameCurrency = nameCurrency;
  }

  public String getCodeCurrency() {
    return codeCurrency;
  }

  public void setCodeCurrency(String codeCurrency) {
    this.codeCurrency = codeCurrency;
  }

  public String getCodeFips() {
    return codeFips;
  }

  public void setCodeFips(String codeFips) {
    this.codeFips = codeFips;
  }

  public String getPhonePrefix() {
    return phonePrefix;
  }

  public void setPhonePrefix(String phonePrefix) {
    this.phonePrefix = phonePrefix;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof CountryDto)) {
      return false;
    }
    CountryDto that = (CountryDto) obj;
    return Objects.equals(getCountryId(), that.getCountryId())
      && Objects.equals(getNameCountry(), that.getNameCountry())
      && Objects.equals(getCodeIso2Country(), that.getCodeIso2Country())
      && Objects.equals(getCodeIso3Country(), that.getCodeIso3Country())
      && Objects.equals(getNumericIso(), that.getNumericIso())
      && Objects.equals(getPopulation(), that.getPopulation())
      && Objects.equals(getCapital(), that.getCapital())
      && Objects.equals(getContinent(), that.getContinent())
      && Objects.equals(getNameCurrency(), that.getNameCurrency())
      && Objects.equals(getCodeCurrency(), that.getCodeCurrency())
      && Objects.equals(getCodeFips(), that.getCodeFips())
      && Objects.equals(getPhonePrefix(), that.getPhonePrefix());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCountryId(),
      getNameCountry(),
      getCodeIso2Country(),
      getCodeIso3Country(),
      getNumericIso(),
      getPopulation(),
      getCapital(),
      getContinent(),
      getNameCurrency(),
      getCodeCurrency(),
      getCodeFips(),
      getPhonePrefix());
  }
}
