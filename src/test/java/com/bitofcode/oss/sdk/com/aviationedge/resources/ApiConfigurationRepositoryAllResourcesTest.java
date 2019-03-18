package com.bitofcode.oss.sdk.com.aviationedge.resources;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ApiConfigurationRepositoryAllResourcesTest {

  private final ApiConfigurationRepository apiConfigurationRepository = new ApiConfigurationRepository("api-key");

  @ParameterizedTest
  @EnumSource(ApiConfigurationRepository.Resource.class)
  void getUri(ApiConfigurationRepository.Resource resource) {
    assertEquals(apiConfigurationRepository.getUri(resource.id), URI.create(resource.url));
  }

}