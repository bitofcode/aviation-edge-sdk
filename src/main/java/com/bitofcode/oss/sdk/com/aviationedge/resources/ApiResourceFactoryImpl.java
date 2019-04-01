package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePostRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePreRequestCallback;
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
    return createAirlineResource(null, null);
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource(AePreRequestCallback callback) {
    return createAirlineResource(callback, null);
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource(AePostRequestCallback callback) {
    return createAirlineResource(null, callback);
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<AirlineDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRLINE_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirlineDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  private void setCallbacks(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback, ResourceBase<?> apiResource) {
    if (preRequestCallback != null) {
      apiResource.addPreRequestCallback(preRequestCallback);
    }
    if (postRequestCallback != null) {
      apiResource.addPostRequestCallback(postRequestCallback);
    }
  }

  @Override
  public ApiResource<AirportDto> createAirportResource() {
    return createAirportResource(null, null);
  }

  @Override
  public ApiResource<AirportDto> createAirportResource(AePreRequestCallback callback) {
    return createAirportResource(callback, null);
  }

  @Override
  public ApiResource<AirportDto> createAirportResource(AePostRequestCallback callback) {
    return createAirportResource(null, callback);
  }

  @Override
  public ApiResource<AirportDto> createAirportResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<AirportDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRPORT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirportDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource() {
    return createAircraftDtoResource(null, null);
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestCallback callback) {
    return createAircraftDtoResource(callback, null);
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource(AePostRequestCallback callback) {
    return createAircraftDtoResource(null, callback);
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<AircraftDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRCRAFT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AircraftDto>>() {
      }, objectMapper));

    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource() {
    return createAirplaneDtoResource(null, null);
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestCallback callback) {
    return createAirplaneDtoResource(callback, null);
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource(AePostRequestCallback callback) {
    return createAirplaneDtoResource(null, callback);
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<AirplaneDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRPLANE_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirplaneDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource() {
    return createCityDtoResource(null, null);
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource(AePreRequestCallback callback) {
    return createCityDtoResource(callback, null);
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource(AePostRequestCallback callback) {
    return createCityDtoResource(null, callback);
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<CityDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.CITY_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<CityDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource() {
    return createCountryDtoResource(null, null);
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource(AePreRequestCallback callback) {
    return createCountryDtoResource(callback, null);
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource(AePostRequestCallback callback) {
    return createCountryDtoResource(null, callback);
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<CountryDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.COUNTRY_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<CountryDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource() {
    return createTaxDtoResource(null, null);
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource(AePreRequestCallback callback) {
    return createTaxDtoResource(callback, null);
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource(AePostRequestCallback callback) {
    return createTaxDtoResource(null, callback);
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<TaxDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.TAX_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<TaxDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource() {
    return createFlightDtoResource(null, null);
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource(AePreRequestCallback preRequestCallback) {
    return createFlightDtoResource(preRequestCallback, null);
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource(AePostRequestCallback postRequestCallback) {
    return createFlightDtoResource(null, postRequestCallback);
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource(AePreRequestCallback preRequestCallback, AePostRequestCallback postRequestCallback) {
    final SimpleApiResource<FlightDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.FLIGHT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<FlightDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

}
