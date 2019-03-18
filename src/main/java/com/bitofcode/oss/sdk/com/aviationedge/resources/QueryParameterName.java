package com.bitofcode.oss.sdk.com.aviationedge.resources;

public enum QueryParameterName {
  API_KEY("key"),
  AIRLINE_IATA_CODE("codeIataAirline"),
  AIRPORT_IATA_CODE("codeIataAirport"),
  COUNTRY_ISO_2_CODE("codeIso2Country"),
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
