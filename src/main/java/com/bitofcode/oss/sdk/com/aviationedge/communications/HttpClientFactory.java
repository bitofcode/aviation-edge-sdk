package com.bitofcode.oss.sdk.com.aviationedge.communications;

import org.apache.http.impl.client.CloseableHttpClient;

/**
 * This interface represents a factory for creating a HttpClient.
 */
public interface HttpClientFactory {

  /**
   * Creates a HttpClient.
   *
   * @return Instance of {@link CloseableHttpClient}
   */
  CloseableHttpClient createHttpClient();
}
