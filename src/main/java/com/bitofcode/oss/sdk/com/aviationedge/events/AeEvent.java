package com.bitofcode.oss.sdk.com.aviationedge.events;

import java.util.EventObject;

public abstract class AeEvent<T> extends EventObject {
  private transient T data;
  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @param data Data contained nin the Event
   * @throws IllegalArgumentException if source is null.
   */
  AeEvent(Object source, T data) {
    super(source);
    this.data = data;
  }

  public T getData() {
    return data;
  }
}
