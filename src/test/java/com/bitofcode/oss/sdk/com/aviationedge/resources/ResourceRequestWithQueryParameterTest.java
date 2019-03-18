package com.bitofcode.oss.sdk.com.aviationedge.resources;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

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

}
