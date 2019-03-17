package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.dtos.AircraftDto;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.AirlineDto;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.AirplaneDto;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.AirportDto;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.CityDto;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.CountryDto;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.TaxDto;

/**
 * This define the an API-Resource Factory interface.
 */
interface ApiResourceFactory {
  ApiResource<AirlineDto> createAirlineResource();

  ApiResource<AirportDto> createAirportResource();

  ApiResource<AircraftDto> createAircraftDtoResource();

  ApiResource<AirplaneDto> createAirplaneDtoResource();

  ApiResource<CityDto> createCityDtoResource();

  ApiResource<CountryDto> createCountryDtoResource();

  ApiResource<TaxDto> createTaxDtoResource();
}
