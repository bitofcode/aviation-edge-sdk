package com.bitofcode.oss.sdk.com.aviationedge.common;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggingUtilsTest {

  public static final String HTTP_HALLO_WORL_API = "http://hallo.worl?api=";

  @Test
  public void obfuscateNullUriReturnsEmptyString() {
    String obfuscatedUri = LoggingUtils.obfuscate((URI) null, "");
    assertEquals("", obfuscatedUri);
  }

  @Test
  public void obfuscateNullStringReturnsEmptyString() {
    String obfuscatedUri = LoggingUtils.obfuscate((String) null, "");
    assertEquals("", obfuscatedUri);
  }

  @Test
  public void obfuscateNonNullUriReturnsObfuscatedUriString() throws URISyntaxException {
    String obfuscatedUri = LoggingUtils.obfuscate(new URI(HTTP_HALLO_WORL_API + "API_KEY"), "API_KEY");
    assertEquals(HTTP_HALLO_WORL_API + LoggingUtils.REPLACEMENT, obfuscatedUri);
  }

  @Test
  public void obfuscateNonNullUriReturnsNotContaingValueObfuscatedUriString() throws URISyntaxException {
    String obfuscatedUri = LoggingUtils.obfuscate(new URI(HTTP_HALLO_WORL_API + "API_KEY"), "NOT_API_KEY");
    assertEquals(HTTP_HALLO_WORL_API + "API_KEY", obfuscatedUri);
  }

  @Test
  public void obfuscateNonNullStringReturnsObfuscatedString() {
    String obfuscatedUri = LoggingUtils.obfuscate(HTTP_HALLO_WORL_API + "API_KEY", "API_KEY");
    assertEquals(HTTP_HALLO_WORL_API + LoggingUtils.REPLACEMENT, obfuscatedUri);
  }

}