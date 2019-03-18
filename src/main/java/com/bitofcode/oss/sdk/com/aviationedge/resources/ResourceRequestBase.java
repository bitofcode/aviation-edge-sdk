package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Abstract implementation of the {@link ResourceRequest}.
 */
public abstract class ResourceRequestBase implements ResourceRequest {

  private final Set<KeyValuePair> parameters = new LinkedHashSet<>();

  @SuppressWarnings("WeakerAccess")
  public void add(KeyValuePair keyValuePair) {
    parameters.add(keyValuePair);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T extends ResourceRequest> T with(QueryParameterName parameterName, String value) {
    add(new KeyValuePair(parameterName, value));
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T extends ResourceRequest> T reset() {
    parameters.clear();
    return (T) this;
  }

  @Override
  public Collection<KeyValuePair> queryParameters() {
    return Collections.unmodifiableSet(Sets.newHashSet(parameters));
  }

}
