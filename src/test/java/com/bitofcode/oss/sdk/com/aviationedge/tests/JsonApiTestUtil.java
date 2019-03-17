package com.bitofcode.oss.sdk.com.aviationedge.tests;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class JsonApiTestUtil {

  private static final Map<String, Object> cache;
  private static final Object cacheMonitor;

  static {
    cacheMonitor = new Object();
    cache = new ConcurrentHashMap<>();
  }

  public static Object get(String resourceName) {
    Object result = cache.get(resourceName);

    if (result == null) {
      synchronized (cacheMonitor) {
        result = cache.get(resourceName);
        if (result == null) {
          result = doGetContentOf(resourceName);
          cache.put(resourceName, result);
        }
      }
    }
    return result;
  }

  private static String doGetContentOf(String resourceName) {
    File file = new File("target/test-classes/" + resourceName);

    try {
      List<String> allLines = Files.readAllLines(file.toPath());

      StringBuilder strBuilder = new StringBuilder();

      for (String string : allLines) {
        strBuilder.append(string);
      }

      return strBuilder.toString();
    } catch (IOException e) {
      throw new AeException("Can not URI", e);
    }
  }
}
