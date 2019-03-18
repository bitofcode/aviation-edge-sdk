package com.bitofcode.oss.sdk.com.aviationedge.resources;

import java.util.Objects;

/**
 * This store a QueryParameterName and its value.
 */
class KeyValuePair {
  private final String key;
  private final String value;

  /**
   * Creates Instance of {@link KeyValuePair}.
   *
   * @param key   the key
   * @param value the value
   */
  @SuppressWarnings("WeakerAccess")
  public KeyValuePair(String key, String value) {
    this.key = key;
    this.value = value;
  }

  /**
   * Creates Instance of {@link KeyValuePair}.
   * The same implementation is like:
   * <pre>
   *   this(parameterName.getName(), value);
   * </pre>
   *
   * @param parameterName the key.
   * @param value         the value.
   */
  public KeyValuePair(QueryParameterName parameterName, String value) {
    this(parameterName.getName(), value);
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof KeyValuePair)) {
      return false;
    }
    KeyValuePair that = (KeyValuePair) obj;
    return getKey().equals(that.getKey())
      && getValue().equals(that.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getKey(), getValue());
  }
}
