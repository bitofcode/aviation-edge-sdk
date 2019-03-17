package com.bitofcode.oss.sdk.com.aviationedge.resources;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ResourceRequestWithQueryParameterTest {


  private ResourceRequestWithQueryParameter resourceRequest;

  @BeforeEach
  void setUp() {
    resourceRequest = new ResourceRequestWithQueryParameter();
  }

  @Test
  void queryParametersReturnsEmptyCollectionAfterAirlineResourceRequestIsCreated() {
    Collection<KeyValuePair> queryParameters = resourceRequest.queryParameters();

    assertTrue(queryParameters.isEmpty());
  }

  @Test
  void queryParametersReturnsCollectionWithAirlineIataCodeAfterIataCodeWasProvided() {
    Collection<KeyValuePair> queryParameters = resourceRequest.withAirlineIataCodeName("AA").queryParameters();

    assertFalse(queryParameters.isEmpty());
    assertThat(queryParameters, hasItem(new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA")));
  }

  @Test
  void queryParametersReturnsCollectionWithCountryIso2CodeAfterCountryIso2CodeProvided() {
    Collection<KeyValuePair> queryParameters = resourceRequest.withCountryIso2Code("US").queryParameters();

    assertThat(queryParameters.isEmpty(), is(false));
    assertThat(queryParameters, hasItem(new KeyValuePair(QueryParameterName.COUNTRY_ISO_2_CODE, "US")));
  }

  @Test
  void queryParametersReturnsCollectionWithAllProvidedParametersAfterAllParameterWhereProvided() {
    Collection<KeyValuePair> queryParameters = resourceRequest
      .withCountryIso2Code("US")
      .withAirlineIataCodeName("AA")
      .queryParameters();

    assertThat(queryParameters.size(), is(2));
    assertThat(queryParameters, hasItem(new KeyValuePair(QueryParameterName.COUNTRY_ISO_2_CODE, "US")));
    assertThat(queryParameters, hasItem(new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA")));
  }

  @Test
  void queryParametersReturnsEmptyCollectionAfterResettingTheParameters() {
    Collection<KeyValuePair> queryParameters = resourceRequest
      .withCountryIso2Code("US")
      .withAirlineIataCodeName("AA")
      .queryParameters();


    Collection<KeyValuePair> clearedQueryParameters = resourceRequest
      .reset()
      .queryParameters();

    assertThat(queryParameters.size(), is(2));
    assertThat(queryParameters, hasItem(new KeyValuePair(QueryParameterName.COUNTRY_ISO_2_CODE, "US")));
    assertThat(queryParameters, hasItem(new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA")));

    assertThat(clearedQueryParameters.isEmpty(), is(true));
  }

}
