package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.events.AePreRequestEvent;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class HttpUserAgentAePreRequestListenerTest {
  private static final String USER_AGENT_VALUE = "TEST AGENT";
  HttpUserAgentAePreRequestListener httpUserAgentAePreRequestListener;
  private AePreRequestEvent aePreReEvent;
  private HttpRequestBase httpRequest;

  @BeforeEach
  public void setUp(){
    httpUserAgentAePreRequestListener = new HttpUserAgentAePreRequestListener(USER_AGENT_VALUE);
    httpRequest = mock(HttpRequestBase.class);
    aePreReEvent = new AePreRequestEvent(this, httpRequest);
  }


  @Test
  public void handleAePreRequestSetsHttpUserAgentHeader(){
    httpUserAgentAePreRequestListener.handleAePreRequest(aePreReEvent);

    verify(httpRequest).addHeader(HttpHeaders.USER_AGENT, USER_AGENT_VALUE);
  }
}