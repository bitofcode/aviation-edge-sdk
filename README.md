##### Release status:
[![Build Status](https://travis-ci.org/bitofcode/aviation-edge-sdk.svg?branch=master)](https://travis-ci.org/bitofcode/aviation-edge-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.bitofcode.oss.sdk/aviation-edge-sdk/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.bitofcode.oss.sdk/aviation-edge-sdk)

##### Development status:
[![Build Status](https://travis-ci.org/bitofcode/aviation-edge-sdk.svg?branch=develop)](https://travis-ci.org/bitofcode/aviation-edge-sdk)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=bitofcode_aviation-edge-sdk&metric=alert_status)](https://sonarcloud.io/dashboard?id=bitofcode_aviation-edge-sdk)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=bitofcode_aviation-edge-sdk&metric=coverage)](https://sonarcloud.io/dashboard?id=bitofcode_aviation-edge-sdk)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=bitofcode_aviation-edge-sdk&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=bitofcode_aviation-edge-sdk)

# Aviation Edge SDK 

Java SDK for the Aviation-Edge Web API (https://aviation-edge.com)

**Project is in the early development phase. The Repository is changing often. The Documentation and this readme file will be updated soon** 


## License
aviation-edge-sdk is **licensed** under the **[MIT License]**. The terms of the license are as follows:
```
MIT License

Copyright (c) 2019 Wassim Akachi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## Installation and Getting Started

### Add to your Dependency
Project is not yet published to a public Maven-Repository.
```xml
<dependency>
  <groupId>com.bitofcode.oss.sdk</groupId>
  <artifactId>aviation-edge-sdk</artifactId>
  <version>0.4.0</version>
</dependency>
```

### Example Java Class

```java
package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.events.AePostRequestListener;
import com.bitofcode.oss.sdk.com.aviationedge.events.AePreRequestListener;
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
    ApiResource<AirlineDto> re = apiResourceFactory.createAirlineResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRLINE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirlineResourceWithPostRequestCallback() {
    ApiResource<AirlineDto> re = apiResourceFactory.createAirlineResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRLINE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirlineResourceWithPreAndPostRequestCallback() {
    ApiResource<AirlineDto> re = apiResourceFactory.createAirlineResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
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
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPORT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirportResourceWithPostRequestCallback() {
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPORT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirportResourceWithPreAndPostRequestCallback() {
    ApiResource<AirportDto> re = apiResourceFactory.createAirportResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
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
    ApiResource<AircraftDto> re = apiResourceFactory.createAircraftDtoResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRCRAFT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAircraftDtoResourceWithPostRequestCallback() {
    ApiResource<AircraftDto> re = apiResourceFactory.createAircraftDtoResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRCRAFT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAircraftDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<AircraftDto> re = apiResourceFactory.createAircraftDtoResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
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
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPLANE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirplaneDtoResourceWithPostRequestCallback() {
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.AIRPLANE_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateAirplaneDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<AirplaneDto> re = apiResourceFactory.createAirplaneDtoResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
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
    ApiResource<CityDto> re = apiResourceFactory.createCityDtoResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.CITY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCityDtoResourceWithPostRequestCallback() {
    ApiResource<CityDto> re = apiResourceFactory.createCityDtoResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.CITY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCityDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<CityDto> re = apiResourceFactory.createCityDtoResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
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
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.COUNTRY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCountryDtoResourceWithPostRequestCallback() {
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.COUNTRY_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateCountryDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<CountryDto> re = apiResourceFactory.createCountryDtoResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
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
    ApiResource<TaxDto> re = apiResourceFactory.createTaxDtoResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.TAX_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateTaxDtoResourceWithPostRequestCallback() {
    ApiResource<TaxDto> re = apiResourceFactory.createTaxDtoResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.TAX_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateTaxDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<TaxDto> re = apiResourceFactory.createTaxDtoResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
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
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource(mock(AePreRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateFlightDtoResourceWithPostRequestCallback() {
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource(mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }

  @Test
  void canCreateFlightDtoResourceWithPreAndPostRequestCallback() {
    ApiResource<FlightDto> re = apiResourceFactory.createFlightDtoResource(mock(AePreRequestListener.class),
      mock(AePostRequestListener.class));
    assertNotNull(re);
    verify(uriRepository).getUri(ApiConfigurationRepository.Resource.FLIGHT_RESOURCE.id);
    //noinspection ResultOfMethodCallIgnored
    verify(uriRepository).getApiKey();
  }
}

```
