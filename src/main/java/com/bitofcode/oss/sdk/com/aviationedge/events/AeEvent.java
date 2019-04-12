package com.bitofcode.oss.sdk.com.aviationedge.events;

import java.util.EventObject;

public abstract class AeEvent<T> extends EventObject {
  private T data;
  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @param data
   * @throws IllegalArgumentException if source is null.
   */
  public AeEvent(Object source, T data) {
    super(source);
    this.data = data;
  }

  public T getData() {
    return data;
  }
}
