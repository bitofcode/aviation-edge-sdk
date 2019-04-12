package com.bitofcode.oss.sdk.com.aviationedge.events;

import org.apache.http.client.methods.HttpRequestBase;

public class AePreRequestEvent extends AeEvent<HttpRequestBase> {

  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @param data
   * @throws IllegalArgumentException if source is null.
   */
  public AePreRequestEvent(Object source, HttpRequestBase data) {
    super(source, data);
  }
}
