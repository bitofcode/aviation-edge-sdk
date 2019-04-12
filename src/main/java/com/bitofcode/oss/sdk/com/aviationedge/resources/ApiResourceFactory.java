package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.events.AePostRequestListener;
import com.bitofcode.oss.sdk.com.aviationedge.events.AePreRequestListener;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.*;

/**
 * This define the an API-Resource Factory interface.
 */
public interface ApiResourceFactory {
  ApiResource<AirlineDto> createAirlineResource();

  ApiResource<AirlineDto> createAirlineResource(AePreRequestListener callback);

  ApiResource<AirlineDto> createAirlineResource(AePostRequestListener callback);

  ApiResource<AirlineDto> createAirlineResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);

  ApiResource<AirportDto> createAirportResource();

  ApiResource<AirportDto> createAirportResource(AePreRequestListener callback);

  ApiResource<AirportDto> createAirportResource(AePostRequestListener callback);

  ApiResource<AirportDto> createAirportResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);

  ApiResource<AircraftDto> createAircraftDtoResource();

  ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestListener callback);

  ApiResource<AircraftDto> createAircraftDtoResource(AePostRequestListener callback);

  ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);

  ApiResource<AirplaneDto> createAirplaneDtoResource();

  ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestListener callback);

  ApiResource<AirplaneDto> createAirplaneDtoResource(AePostRequestListener callback);

  ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);

  ApiResource<CityDto> createCityDtoResource();

  ApiResource<CityDto> createCityDtoResource(AePreRequestListener callback);

  ApiResource<CityDto> createCityDtoResource(AePostRequestListener callback);

  ApiResource<CityDto> createCityDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);

  ApiResource<CountryDto> createCountryDtoResource();

  ApiResource<CountryDto> createCountryDtoResource(AePreRequestListener callback);

  ApiResource<CountryDto> createCountryDtoResource(AePostRequestListener callback);

  ApiResource<CountryDto> createCountryDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);

  ApiResource<TaxDto> createTaxDtoResource();

  ApiResource<TaxDto> createTaxDtoResource(AePreRequestListener callback);

  ApiResource<TaxDto> createTaxDtoResource(AePostRequestListener callback);

  ApiResource<TaxDto> createTaxDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);

  ApiResource<FlightDto> createFlightDtoResource();

  ApiResource<FlightDto> createFlightDtoResource(AePreRequestListener preRequestCallback);

  ApiResource<FlightDto> createFlightDtoResource(AePostRequestListener postRequestCallback);

  ApiResource<FlightDto> createFlightDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback);
}
