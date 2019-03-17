package com.bitofcode.oss.sdk.com.aviationedge.resources;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ApiConfigurationRepositoryTest {

  private ApiConfigurationRepository apiConfigurationRepository;
  private String apiKey;

  @BeforeEach
  void setUp() {
    apiKey = UUID.randomUUID().toString();
    apiConfigurationRepository = new ApiConfigurationRepository(apiKey);
  }

  @Test
  void constructorRequireNonNullApiKey() {
    assertThrows(IllegalArgumentException.class, () -> new ApiConfigurationRepository(null));
  }

  @Test
  void constructorRequireNonEmptyApiKey() {
    assertThrows(IllegalArgumentException.class, () -> new ApiConfigurationRepository("  "));
  }

  @Test
  void getApiKeyReturnApiKeyFromConstructor() {
    assertEquals(apiConfigurationRepository.getApiKey(), apiKey);
  }

}