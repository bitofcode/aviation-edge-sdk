package com.bitofcode.oss.sdk.com.aviationedge;

/**
 * This represent the SDK Base Exception.
 */
public class AeException extends RuntimeException {

  /**
   * Creates an {@link AeException} instance.
   *
   * @param message the detail message.
   * @param cause   the cause.
   * @since 1.0
   */
  public AeException(final String message, final Exception cause) {
    super(message, cause);
  }

  /**
   * Creates an {@link AeException} instance.
   *
   * @param cause the cause.
   */
  public AeException(final Throwable cause) {
    super(cause);
  }

}
