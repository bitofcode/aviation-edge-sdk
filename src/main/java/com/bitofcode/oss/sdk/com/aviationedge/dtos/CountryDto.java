package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This represents the country model retrieved from the Aviation-Edge Web API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryDto {

  /**
   * The country id.
   */
  @JsonProperty("countryId")
  private String countryId;

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
   * the country ISO 3 code.
   */
  @JsonProperty("codeIso3Country")
  private String codeIso3Country;

  /**
   * the numeric ISO code.
   */
  @JsonProperty("numericIso")
  private String numericIso;

  /**
   * The population.
   */
  @JsonProperty("population")
  private String population;

  /**
   * The capital.
   */
  @JsonProperty("capital")
  private String capital;

  /**
   * The continent.
   */
  @JsonProperty("continent")
  private String continent;

  /**
   * The currency name.
   */
  @JsonProperty("nameCurrency")
  private String nameCurrency;

  /**
   * The currency code.
   */
  @JsonProperty("codeCurrency")
  private String codeCurrency;

  /**
   * the fips code.
   */
  @JsonProperty("codeFips")
  private String codeFips;

  /**
   * The phone prefix.
   */
  @JsonProperty("phonePrefix")
  private String phonePrefix;

  /**
   * Returns country id.
   *
   * @return country id.
   */
  public String getCountryId() {
    return countryId;
  }

  /**
   * Sets country id.
   *
   * @param countryId country id to be set.
   */
  public void setCountryId(String countryId) {
    this.countryId = countryId;
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
   * @param codeIso2Country the country ISO 2 code to be set.
   */
  public void setCodeIso2Country(String codeIso2Country) {
    this.codeIso2Country = codeIso2Country;
  }

  /**
   * Returns the country ISO 3 code.
   *
   * @return the country ISO 3 code.
   */
  public String getCodeIso3Country() {
    return codeIso3Country;
  }

  /**
   * Sets the country ISO 3 code.
   *
   * @param codeIso3Country the country ISO 3 code to be set.
   */
  public void setCodeIso3Country(String codeIso3Country) {
    this.codeIso3Country = codeIso3Country;
  }

  /**
   * Returns the numeric ISO code.
   *
   * @return the numeric ISO code.
   */
  public String getNumericIso() {
    return numericIso;
  }

  /**
   * Sets the numeric ISO code.
   *
   * @param numericIso the numeric ISO code to be set.
   */
  public void setNumericIso(String numericIso) {
    this.numericIso = numericIso;
  }

  /**
   * Returns the population.
   *
   * @return the population.
   */
  public String getPopulation() {
    return population;
  }

  /**
   * Sets the population.
   *
   * @param population the population to be set.
   */
  public void setPopulation(String population) {
    this.population = population;
  }

  /**
   * Returns the capital.
   *
   * @return the capital .
   */
  public String getCapital() {
    return capital;
  }

  /**
   * Sets the capital.
   *
   * @param capital the capital to be set.
   */
  public void setCapital(String capital) {
    this.capital = capital;
  }

  /**
   * Returns the continent.
   *
   * @return the continent.
   */
  public String getContinent() {
    return continent;
  }

  /**
   * Sets the continent.
   *
   * @param continent the continent to be set.
   */
  public void setContinent(String continent) {
    this.continent = continent;
  }

  /**
   * Returns the currency name.
   *
   * @return the currency name.
   */
  public String getNameCurrency() {
    return nameCurrency;
  }

  /**
   * Sets the currency name.
   *
   * @param nameCurrency the currency name to be set.
   */
  public void setNameCurrency(String nameCurrency) {
    this.nameCurrency = nameCurrency;
  }

  /**
   * Returns the currency code.
   *
   * @return the currency code.
   */
  public String getCodeCurrency() {
    return codeCurrency;
  }

  /**
   * Sets the currency code.
   *
   * @param codeCurrency the currency code to be set.
   */
  public void setCodeCurrency(String codeCurrency) {
    this.codeCurrency = codeCurrency;
  }

  /**
   * Returns the FIPS code.
   *
   * @return the FIPS code.
   */
  public String getCodeFips() {
    return codeFips;
  }

  /**
   * Sets the FIPS code.
   *
   * @param codeFips the FIPS code to be set.
   */
  public void setCodeFips(String codeFips) {
    this.codeFips = codeFips;
  }

  /**
   * Returns the phone prefix.
   *
   * @return the phone prefix.
   */
  public String getPhonePrefix() {
    return phonePrefix;
  }

  /**
   * Sets the phone prefix.
   *
   * @param phonePrefix the phone prefix to bne set.
   */
  public void setPhonePrefix(String phonePrefix) {
    this.phonePrefix = phonePrefix;
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

  /**
   * Generates hash code.
   *
   * @return hash code.
   */
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
