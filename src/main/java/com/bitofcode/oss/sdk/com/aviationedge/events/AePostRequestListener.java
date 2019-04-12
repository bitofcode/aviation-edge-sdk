package com.bitofcode.oss.sdk.com.aviationedge.events;

import java.util.EventListener;

public interface AePostRequestListener extends EventListener {
  void handlePostRequest(AePostRequestEvent event);
}
