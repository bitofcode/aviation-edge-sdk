package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;
import com.bitofcode.oss.sdk.com.aviationedge.AeNotFoundException;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpResponseConverter;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.ErrorDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Abstract implementation of the {@link HttpResponseConverter}.
 *
 * @param <T> the target type of the conversion.
 */
public abstract class HttpResponseConverterBase<T> implements HttpResponseConverter<T> {

  private final ObjectMapper objectMapper;

  HttpResponseConverterBase(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
    if (objectMapper == null) {
      throw new IllegalArgumentException("objectMapper can not be null");
    }
  }


  @Override
  public List<T> convertCollection(String content) {
    if (StringUtils.isBlank(content)) {
      return new LinkedList<>();
    }

    try {
      return objectMapper.readValue(content, getValueTypeRef());
    } catch (Exception exception) {
      throw handleError(exception, content);
    }

  }

  protected abstract TypeReference<List<T>> getValueTypeRef();

  private AeException handleError(Exception exceptionToHandle, String content) {
    AeException result = new AeException(exceptionToHandle);

    if (isErrorResponse(content)) {
      try {
        ErrorDto error = objectMapper.readValue(content, ErrorDto.class);
        if (isNotFoundResponse(error)) {
          result = new AeNotFoundException(error.getErrorText(), exceptionToHandle);
        } else {
          result = new AeException(error.getErrorText(), exceptionToHandle);
        }
      } catch (IOException e1) {
        result = new AeException(
          String.format("Unexpected and/or unserializable Response from the API '%s'", content),
          exceptionToHandle);
      }
    }
    return result;
  }

  private boolean isNotFoundResponse(ErrorDto error) {
    return error.getErrorText().contains("No Record Found");
  }

  private boolean isErrorResponse(String content) {
    return content.contains("\"error\"") && content.contains("\"text\"");
  }
}
