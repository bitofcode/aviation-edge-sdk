package com.bitofcode.oss.sdk.com.aviationedge.resources;

import java.util.List;

/**
 * This define the API Resource interface.
 *
 * @param <T> the type of the model.
 */
public interface ApiResource<T> {
  List<T> retrieveAll();

  List<T> retrieve(ResourceRequest resourceRequest);
}
