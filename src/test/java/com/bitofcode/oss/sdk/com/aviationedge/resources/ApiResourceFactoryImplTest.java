package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.dtos.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

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
  void canCreateAirportResource() {
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource();
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
  void canCreateAirplaneDtoResource() {
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource();
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
  void canCreateCountryDtoResource() {
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource();
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
  void canCreateFlightDtoResource() {
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource();
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }
}
