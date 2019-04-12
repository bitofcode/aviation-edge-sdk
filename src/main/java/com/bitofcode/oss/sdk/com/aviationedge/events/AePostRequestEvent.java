package com.bitofcode.oss.sdk.com.aviationedge.events;

public class AePostRequestEvent extends AeEvent<AePostRequest> {

  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @param data
   * @throws IllegalArgumentException if source is null.
   */
  public AePostRequestEvent(Object source, AePostRequest data) {
    super(source, data);
  }
}
