package com.bitofcode.oss.sdk.com.aviationedge.communications;

import java.util.List;

/**
 * This interface represent a Http converter.
 *
 * @param <A> the target type of the conversion.
 */
public interface HttpResponseConverter<A> {

  /**
   * Converts a given String to a {@link List}&lt;A&gt;.
   *
   * @param content The content which shoud be tranformed to a {@link List}&lt;A&gt;.
   * @return The transformed {@link List}&lt;A&gt;.
   */
  List<A> convertCollection(String content);
}
