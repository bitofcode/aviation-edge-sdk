package com.bitofcode.oss.sdk.com.aviationedge.callbacks;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

public interface AePostRequestCallback {
  void handle(HttpResponse response, HttpRequestBase request);
}
