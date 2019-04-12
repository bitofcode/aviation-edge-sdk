package com.bitofcode.oss.sdk.com.aviationedge.events;

import java.util.EventListener;

public interface AePreRequestListener extends EventListener {
  void handleAePreRequest(AePreRequestEvent request);
}
