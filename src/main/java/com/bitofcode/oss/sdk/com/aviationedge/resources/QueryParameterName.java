package com.bitofcode.oss.sdk.com.aviationedge.resources;

public enum QueryParameterName {
  API_KEY("key"),

  AIRLINE_IATA_CODE("codeIataAirline"),
  AIRLINE_COUNTRY_ISO_2_CODE("codeIso2Country"),

  AIRCRAFT_IATA_CODE("codeIataAircraft"),

  AIRPLANE_NUMBER_REGISTRATION("numberRegistration"),
  AIRPLANE_HEX_ICAO("hexIcaoAirplane"),
  AIRPLANE_IATA_CODE("codeIataAirline"),

  AIRPORT_IATA_CODE("codeIataAirport"),
  AIRPORT_COUNTRY_ISO_2_CODE("codeIso2Country"),

  CITY_IATA_CODE("codeIataCity"),
  CITY_COUNTRY_ISO_2_CODE("codeIso2Country"),

  COUNTRY_ISO_2_CODE("codeIso2Country"),
  COUNTRY_NAME("nameCountry"),

  FLIGHT_DEP_IATA("depIata"),
  FLIGHT_DEP_ICAO("depIcao"),
  FLIGHT_ARR_IATA("arrIata"),
  FLIGHT_ARR_ICAO("arrIcao"),
  FLIGHT_AIRCRAFT_ICAO("aircraftIcao"),
  FLIGHT_AIRCRAFT_ICAO_24("aircraftIcao24"),
  FLIGHT_REG_NUMBER("regNum"),
  FLIGHT_AIRLINE_IATA("airlineIata"),
  FLIGHT_AIRLINE_ICAO("airlineIcao"),
  FLIGHT_IATA("flightIata"),
  FLIGHT_ICAO("flightIcao"),
  FLIGHT_NUMBER("flightNum"),
  FLIGHT_STATUS("status"),
  FLIGHT_LIMIT("limit"),

  TAX_IATA_CODE("codeIataTax"),
  ;

  private final String name;

  QueryParameterName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "QueryParameterName{" + "name='" + name + '\'' + '}';
  }
}
