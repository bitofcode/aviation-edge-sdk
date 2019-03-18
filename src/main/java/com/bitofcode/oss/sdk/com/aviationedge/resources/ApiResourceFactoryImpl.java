package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpClientFactory;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.*;
import com.bitofcode.oss.sdk.com.aviationedge.resources.ApiConfigurationRepository.Resource;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.impl.client.HttpClients;

import java.util.List;

/**
 * Basic Implementation of the {@link ApiResourceFactory}.
 */
public class ApiResourceFactoryImpl implements ApiResourceFactory {

  private final ApiConfigurationRepository uriRepository;
  private final ObjectMapper objectMapper = new ObjectMapper();
  private final HttpClientFactory httpClientFactory;

  public ApiResourceFactoryImpl(ApiConfigurationRepository uriRepository) {
    this.uriRepository = uriRepository;
    this.httpClientFactory = HttpClients::createDefault;
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.AIRLINE_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirlineDto>>() {
      }, objectMapper));
  }

  @Override
  public ApiResource<AirportDto> createAirportResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.AIRPORT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirportDto>>() {
      }, objectMapper));
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.AIRCRAFT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AircraftDto>>() {
      }, objectMapper));
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.AIRPLANE_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirplaneDto>>() {
      }, objectMapper));
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.CITY_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<CityDto>>() {
      }, objectMapper));
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.COUNTRY_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<CountryDto>>() {
      }, objectMapper));
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.TAX_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<TaxDto>>() {
      }, objectMapper));
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource() {
    return new SimpleApiResource<>(uriRepository.getUri(Resource.FLIGHT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<FlightDto>>() {
      }, objectMapper));
  }

}
