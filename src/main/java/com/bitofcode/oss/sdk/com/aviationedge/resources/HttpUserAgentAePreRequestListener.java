package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.events.AePreRequestEvent;
import com.bitofcode.oss.sdk.com.aviationedge.events.AePreRequestListener;
import org.apache.http.HttpHeaders;

public class HttpUserAgentAePreRequestListener implements AePreRequestListener {
  private final String userAgentValue;

  public HttpUserAgentAePreRequestListener(String userAgentValue) {
    this.userAgentValue = userAgentValue;
  }

  @Override
  public void handleAePreRequest(AePreRequestEvent request) {
    request.getData().addHeader(HttpHeaders.USER_AGENT, userAgentValue);
  }
}
