package com.bitofcode.oss.sdk.com.aviationedge;

/**
 * This represents record not found exception.
 */
public class AeNotFoundException extends AeException {

  /**
   * Creates an {@link AeNotFoundException} instance.
   *
   * @param message   the details.
   * @param exception the cause
   * @since 1.0
   */
  public AeNotFoundException(final String message, final Exception exception) {
    super(message, exception);
  }
}
