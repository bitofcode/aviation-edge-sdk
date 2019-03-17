package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpResponseConverter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * Simple Http to Model converter which extends {@link HttpResponseConverterBase} and
 * implements the {@link HttpResponseConverter}.
 *
 * @param <T> the target model of the conversion.
 */
public class SimpleHttpResponseConverter<T> extends HttpResponseConverterBase<T> {

  private final TypeReference<List<T>> typeReference;

  public SimpleHttpResponseConverter(TypeReference<List<T>> typeReference,
                                     ObjectMapper objectMapper) {
    super(objectMapper);
    this.typeReference = typeReference;
  }

  @Override
  protected TypeReference<List<T>> getValueTypeRef() {
    return typeReference;
  }
}
