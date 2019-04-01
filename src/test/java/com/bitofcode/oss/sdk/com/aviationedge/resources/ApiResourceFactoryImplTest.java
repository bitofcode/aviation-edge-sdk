package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePostRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePreRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class ApiResourceFactoryImplTest {


  private ApiResourceFactory apiResourceFactory;
  private ApiConfigurationRepository uriRepository;

  @BeforeEach
  void setUp() {
    String apiKey = UUID.randomUUID().toString();
    uriRepository = new ApiConfigurationRepository(apiKey);

    uriRepository = spy(uriRepository);
    apiResourceFactory = new ApiResourceFactoryImpl(uriRepository);
  }

  @Test
  void canCreateAirlineResource() {
    ApiResource<AirlineDto> re = apiResourceFactory.createAirlineResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRLINE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirlineResourceWithPreRequestCallback() {
    ApiResource<AirlineDto> re = apiResourceFactory.createAirlineResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRLINE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirlineResourceWithPostRequestCallback() {
    ApiResource<AirlineDto> re = apiResourceFactory.createAirlineResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRLINE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirlineResourceWithPreAndPostRequestCallback() {
    ApiResource<AirlineDto> re = apiResourceFactory.createAirlineResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRLINE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirportResource() {
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPORT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirportResourceWithPreRequestCallback() {
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPORT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirportResourceWithPostRequestCallback() {
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPORT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirportResourceWithPreAndPostRequestCallback() {
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPORT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAircraftDtoResource() {
    ApiResource<AircraftDto> re = apiResourceFactory.createAircraftDtoResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRCRAFT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAircraftDtoResourceWithPreRequestCallback() {
    ApiResource<AircraftDto> re = apiResourceFactory.createAircraftDtoResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRCRAFT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAircraftDtoResourceWithPostRequestCallback() {
    ApiResource<AircraftDto> re = apiResourceFactory.createAircraftDtoResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRCRAFT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAircraftDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<AircraftDto> re = apiResourceFactory.createAircraftDtoResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRCRAFT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirplaneDtoResource() {
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPLANE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirplaneDtoResourceWithPreRequestCallback() {
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPLANE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirplaneDtoResourceWithPostRequestCallback() {
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPLANE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirplaneDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPLANE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCityDtoResource() {
    ApiResource<CityDto> re = apiResourceFactory.createCityDtoResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.CITY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCityDtoResourceWithPreRequestCallback() {
    ApiResource<CityDto> re = apiResourceFactory.createCityDtoResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.CITY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCityDtoResourceWithPostRequestCallback() {
    ApiResource<CityDto> re = apiResourceFactory.createCityDtoResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.CITY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCityDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<CityDto> re = apiResourceFactory.createCityDtoResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.CITY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCountryDtoResource() {
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.COUNTRY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCountryDtoResourceWithPreRequestCallback() {
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.COUNTRY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCountryDtoResourceWithPostRequestCallback() {
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.COUNTRY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCountryDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.COUNTRY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateTaxDtoResource() {
    ApiResource<TaxDto> re = apiResourceFactory.createTaxDtoResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.TAX_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateTaxDtoResourceWithPreRequestCallback() {
    ApiResource<TaxDto> re = apiResourceFactory.createTaxDtoResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.TAX_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateTaxDtoResourceWithPostRequestCallback() {
    ApiResource<TaxDto> re = apiResourceFactory.createTaxDtoResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.TAX_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateTaxDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<TaxDto> re = apiResourceFactory.createTaxDtoResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.TAX_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateFlightDtoResource() {
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateFlightDtoResourceWithPreRequestCallback() {
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource(mock(AePreRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateFlightDtoResourceWithPostRequestCallback() {
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource(mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateFlightDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource(mock(AePreRequestCallback.class),
      mock(AePostRequestCallback.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }
}
