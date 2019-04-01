package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePostRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePreRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.*;

/**
 * This define the an API-Resource Factory interface.
 */
public interface ApiResourceFactory {
  ApiResource<AirlineDto> createAirlineResource();

  ApiResource<AirlineDto> createAirlineResource(AePreRequestCallback callback);

  ApiResource<AirlineDto> createAirlineResource(AePostRequestCallback callback);

  ApiResource<AirlineDto> createAirlineResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);

  ApiResource<AirportDto> createAirportResource();

  ApiResource<AirportDto> createAirportResource(AePreRequestCallback callback);

  ApiResource<AirportDto> createAirportResource(AePostRequestCallback callback);

  ApiResource<AirportDto> createAirportResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);

  ApiResource<AircraftDto> createAircraftDtoResource();

  ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestCallback callback);

  ApiResource<AircraftDto> createAircraftDtoResource(AePostRequestCallback callback);

  ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);

  ApiResource<AirplaneDto> createAirplaneDtoResource();

  ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestCallback callback);

  ApiResource<AirplaneDto> createAirplaneDtoResource(AePostRequestCallback callback);

  ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);

  ApiResource<CityDto> createCityDtoResource();

  ApiResource<CityDto> createCityDtoResource(AePreRequestCallback callback);

  ApiResource<CityDto> createCityDtoResource(AePostRequestCallback callback);

  ApiResource<CityDto> createCityDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);

  ApiResource<CountryDto> createCountryDtoResource();

  ApiResource<CountryDto> createCountryDtoResource(AePreRequestCallback callback);

  ApiResource<CountryDto> createCountryDtoResource(AePostRequestCallback callback);

  ApiResource<CountryDto> createCountryDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);

  ApiResource<TaxDto> createTaxDtoResource();

  ApiResource<TaxDto> createTaxDtoResource(AePreRequestCallback callback);

  ApiResource<TaxDto> createTaxDtoResource(AePostRequestCallback callback);

  ApiResource<TaxDto> createTaxDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);

  ApiResource<FlightDto> createFlightDtoResource();

  ApiResource<FlightDto> createFlightDtoResource(AePreRequestCallback preRequestCallback);

  ApiResource<FlightDto> createFlightDtoResource(AePostRequestCallback postRequestCallback);

  ApiResource<FlightDto> createFlightDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback);
}
