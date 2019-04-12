package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.events.AePostRequestListener;
import com.bitofcode.oss.sdk.com.aviationedge.events.AePreRequestListener;
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
  private final AePreRequestListener aePreRequestListener;

  public ApiResourceFactoryImpl(ApiConfigurationRepository uriRepository) {
    this.uriRepository = uriRepository;
    this.httpClientFactory = HttpClients::createDefault;
    aePreRequestListener = new HttpUserAgentAePreRequestListener(String.format("%s/%s | %s | %s"
      , "BitOfCode Aviation-Java-SDK"
      , getClass().getPackage().getImplementationVersion()
      , System.getProperty("os.name")
      , System.getProperty("os.arch")));
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource() {
    return createAirlineResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource(AePreRequestListener callback) {
    return createAirlineResource(callback, null);
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource(AePostRequestListener callback) {
    return createAirlineResource(null, callback);
  }

  @Override
  public ApiResource<AirlineDto> createAirlineResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<AirlineDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRLINE_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirlineDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  private void setCallbacks(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback, ResourceBase<?> apiResource) {
    if (preRequestCallback != null) {
      apiResource.addPreRequestCallback(preRequestCallback);
    }
    if (postRequestCallback != null) {
      apiResource.addPostRequestCallback(postRequestCallback);
    }
  }

  @Override
  public ApiResource<AirportDto> createAirportResource() {
    return createAirportResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<AirportDto> createAirportResource(AePreRequestListener callback) {
    return createAirportResource(callback, null);
  }

  @Override
  public ApiResource<AirportDto> createAirportResource(AePostRequestListener callback) {
    return createAirportResource(null, callback);
  }

  @Override
  public ApiResource<AirportDto> createAirportResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<AirportDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRPORT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirportDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource() {
    return createAircraftDtoResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestListener callback) {
    return createAircraftDtoResource(callback, null);
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource(AePostRequestListener callback) {
    return createAircraftDtoResource(null, callback);
  }

  @Override
  public ApiResource<AircraftDto> createAircraftDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<AircraftDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRCRAFT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AircraftDto>>() {
      }, objectMapper));

    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource() {
    return createAirplaneDtoResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestListener callback) {
    return createAirplaneDtoResource(callback, null);
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource(AePostRequestListener callback) {
    return createAirplaneDtoResource(null, callback);
  }

  @Override
  public ApiResource<AirplaneDto> createAirplaneDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<AirplaneDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.AIRPLANE_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<AirplaneDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource() {
    return createCityDtoResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource(AePreRequestListener callback) {
    return createCityDtoResource(callback, null);
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource(AePostRequestListener callback) {
    return createCityDtoResource(null, callback);
  }

  @Override
  public ApiResource<CityDto> createCityDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<CityDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.CITY_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<CityDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource() {
    return createCountryDtoResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource(AePreRequestListener callback) {
    return createCountryDtoResource(callback, null);
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource(AePostRequestListener callback) {
    return createCountryDtoResource(null, callback);
  }

  @Override
  public ApiResource<CountryDto> createCountryDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<CountryDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.COUNTRY_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<CountryDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource() {
    return createTaxDtoResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource(AePreRequestListener callback) {
    return createTaxDtoResource(callback, null);
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource(AePostRequestListener callback) {
    return createTaxDtoResource(null, callback);
  }

  @Override
  public ApiResource<TaxDto> createTaxDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<TaxDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.TAX_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<TaxDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource() {
    return createFlightDtoResource(aePreRequestListener, null);
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource(AePreRequestListener preRequestCallback) {
    return createFlightDtoResource(preRequestCallback, null);
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource(AePostRequestListener postRequestCallback) {
    return createFlightDtoResource(null, postRequestCallback);
  }

  @Override
  public ApiResource<FlightDto> createFlightDtoResource(AePreRequestListener preRequestCallback, AePostRequestListener postRequestCallback) {
    final SimpleApiResource<FlightDto> apiResource = new SimpleApiResource<>(uriRepository.getUri(Resource.FLIGHT_RESOURCE.id),
      uriRepository.getApiKey(), httpClientFactory,
      new SimpleHttpResponseConverter<>(new TypeReference<List<FlightDto>>() {
      }, objectMapper));
    setCallbacks(preRequestCallback, postRequestCallback, apiResource);
    return apiResource;
  }

}
