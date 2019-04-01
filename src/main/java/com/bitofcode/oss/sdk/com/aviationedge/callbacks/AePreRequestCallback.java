package com.bitofcode.oss.sdk.com.aviationedge.callbacks;

import org.apache.http.client.methods.HttpRequestBase;

public interface AePreRequestCallback {
  void handle(HttpRequestBase request);
}
