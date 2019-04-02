package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePostRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePreRequestCallback;

import java.util.List;

/**
 * This define the API Resource interface.
 *
 * @param <T> the type of the model.
 */
public interface ApiResource<T> {
  List<T> retrieveAll();

  List<T> retrieve(ResourceRequest resourceRequest);

  void addPreRequestCallback(AePreRequestCallback callback);

  void addPostRequestCallback(AePostRequestCallback callback);
}
