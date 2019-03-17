package com.bitofcode.oss.sdk.com.aviationedge.common;

import com.google.common.annotations.VisibleForTesting;

import java.net.URI;

/**
 * Utils for logging.
 */
public final class LoggingUtils {

  @VisibleForTesting
  public static final String REPLACEMENT = "SECRET_SECRET";

  private LoggingUtils() {

  }

  /**
   * obfuscate the given value in the uri and return the string
   * representation of the obfuscated uri.
   *
   * @param uri   the uri to search for term in.
   * @param value the search string.
   * @return the obfuscated uri string.
   */
  public static String obfuscate(URI uri, String value) {
    if (uri == null) {
      return "";
    }
    return obfuscate(uri.toString(), value);
  }

  /**
   * obfuscate the given value in the string and return the obfuscated string.
   *
   * @param string the string to search for term in.
   * @param value  the search string.
   * @return the obfuscated string.
   */
  public static String obfuscate(String string, String value) {
    if (string == null) {
      return "";
    }

    StringBuilder str = new StringBuilder(string);
    obfuscate(str, value);

    return str.toString();
  }

  private static void obfuscate(StringBuilder str, String value) {
    int indexOf = str.indexOf(value);
    if (indexOf >= 0) {
      str.replace(indexOf, indexOf + value.length(), REPLACEMENT);
    }
  }

}
