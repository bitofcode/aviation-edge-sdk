package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.dtos.*;

/**
 * This define the an API-Resource Factory interface.
 */
public interface ApiResourceFactory {
  ApiResource<AirlineDto> createAirlineResource();

  ApiResource<AirportDto> createAirportResource();

  ApiResource<AircraftDto> createAircraftDtoResource();

  ApiResource<AirplaneDto> createAirplaneDtoResource();

  ApiResource<CityDto> createCityDtoResource();

  ApiResource<CountryDto> createCountryDtoResource();

  ApiResource<TaxDto> createTaxDtoResource();

  ApiResource<FlightDto> createFlightDtoResource();
}
