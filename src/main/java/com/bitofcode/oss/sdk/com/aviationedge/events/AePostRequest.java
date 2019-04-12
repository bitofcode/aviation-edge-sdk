package com.bitofcode.oss.sdk.com.aviationedge.events;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

public class AePostRequest {
  private final HttpResponse httpResponse;
  private final HttpGet request;

  public AePostRequest(HttpResponse httpResponse, HttpGet request) {
    this.httpResponse = httpResponse;
    this.request = request;
  }

  public HttpResponse getHttpResponse() {
    return httpResponse;
  }

  public HttpGet getRequest() {
    return request;
  }
}
