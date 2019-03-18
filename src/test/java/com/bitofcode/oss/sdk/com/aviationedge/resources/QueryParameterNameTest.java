package com.bitofcode.oss.sdk.com.aviationedge.resources;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class QueryParameterNameTest {

  private final Map<QueryParameterName, String> possibleParameters;

  QueryParameterNameTest() {
    Map<QueryParameterName, String> temPam = new HashMap<>();
    temPam.put(QueryParameterName.API_KEY, "key");
    temPam.put(QueryParameterName.AIRLINE_IATA_CODE, "codeIataAirline");
    temPam.put(QueryParameterName.AIRPORT_IATA_CODE, "codeIataAirport");
    temPam.put(QueryParameterName.COUNTRY_ISO_2_CODE, "codeIso2Country");
    temPam.put(QueryParameterName.FLIGHT_DEP_IATA, "depIata");
    temPam.put(QueryParameterName.FLIGHT_DEP_ICAO, "depIcao");
    temPam.put(QueryParameterName.FLIGHT_ARR_IATA, "arrIata");
    temPam.put(QueryParameterName.FLIGHT_ARR_ICAO, "arrIcao");
    temPam.put(QueryParameterName.FLIGHT_AIRCRAFT_ICAO, "aircraftIcao");
    temPam.put(QueryParameterName.FLIGHT_AIRCRAFT_ICAO_24, "aircraftIcao24");
    temPam.put(QueryParameterName.FLIGHT_REG_NUMBER, "regNum");
    temPam.put(QueryParameterName.FLIGHT_AIRLINE_IATA, "airlineIata");
    temPam.put(QueryParameterName.FLIGHT_AIRLINE_ICAO, "airlineIcao");
    temPam.put(QueryParameterName.FLIGHT_IATA, "flightIata");
    temPam.put(QueryParameterName.FLIGHT_ICAO, "flightIcao");
    temPam.put(QueryParameterName.FLIGHT_NUMBER, "flightNum");
    temPam.put(QueryParameterName.FLIGHT_STATUS, "status");
    temPam.put(QueryParameterName.FLIGHT_LIMIT, "limit");

    possibleParameters = Collections.unmodifiableMap(temPam);
  }

  @ParameterizedTest
  @EnumSource(QueryParameterName.class)
  void dummy(QueryParameterName queryParameterName) {
    String parameterName = possibleParameters.get(queryParameterName);
    assertNotNull(parameterName);
    assertThat(parameterName, equalTo(queryParameterName.getName()));
  }

}