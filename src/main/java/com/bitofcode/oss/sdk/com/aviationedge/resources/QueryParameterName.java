package com.bitofcode.oss.sdk.com.aviationedge.resources;

public enum QueryParameterName {
  API_KEY("key"),
  AIRLINE_IATA_CODE_NAME("codeIataAirline"),
  AIRPORT_IATA_CODE_NAME("codeIataAirport"),
  COUNTRY_ISO_2_CODE("codeIso2Country");

  private final String name;

  QueryParameterName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}
