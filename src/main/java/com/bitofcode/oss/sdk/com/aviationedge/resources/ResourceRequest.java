package com.bitofcode.oss.sdk.com.aviationedge.resources;

import java.util.Collection;

/**
 * This represent an Api Request interface.
 */
interface ResourceRequest {
  Collection<KeyValuePair> queryParameters();

  void add(KeyValuePair keyValuePair);

  @SuppressWarnings("unused")
  <T extends ResourceRequest> T reset();

  @SuppressWarnings("unused")
  <T extends ResourceRequest> T with(QueryParameterName parameterName, String value);
}
