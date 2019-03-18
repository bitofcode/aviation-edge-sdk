package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;
import com.bitofcode.oss.sdk.com.aviationedge.AeNotFoundException;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.TaxDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;

class SimpleHttpResponseConverterTest {
  private HttpResponseConverterBase<TaxDto> converter;
  private ObjectMapper objectMapper;
  private TypeReference<List<TaxDto>> typeReference;

  @BeforeEach
  void setUp() {
    objectMapper = spy(new ObjectMapper());
    typeReference = new TypeReference<List<TaxDto>>() {
    };

    converter = spy(new HttpResponseConverterBase<TaxDto>(objectMapper) {
      @Override
      protected TypeReference<List<TaxDto>> getValueTypeRef() {
        return typeReference;
      }
    });
  }

  @Test
  void constructorThrowsExceptionIfObjectMapperIsNull() {

    IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () ->
      converter = spy(new HttpResponseConverterBase<TaxDto>(null) {
        @Override
        protected TypeReference<List<TaxDto>> getValueTypeRef() {
          return typeReference;
        }
      }));

    assertEquals("objectMapper can not be null", illegalArgumentException.getMessage());
  }

  @Nested
  @DisplayName("convertCollection")
  class WhenNew {

    @Test
    @DisplayName("returns empty list by providing empty string-content")
    void convertBlankStringReturnsEmptyList() {
      String content = "";

      List<TaxDto> taxDtos = converter.convertCollection(content);

      assertNotNull(taxDtos);
      Assertions.assertEquals(0, taxDtos.size());
    }


    @Test
    @DisplayName("return a list")
    void retunsEmptyList() {
      String content = "[]";
      List<TaxDto> taxDtos = converter.convertCollection(content);
      assertNotNull(taxDtos);
      assertEquals(0, taxDtos.size());
    }

    @Test
    @DisplayName("throws AeException with Error text by providing error-json containing the words '\"error\"' and '\"text\"'")
    void throwsAEExceptionWithErrorTextByProvidingErrorJson() {
      String errorMessage = "the error message";
      String content = "{\"error\": {\"text\": \"" + errorMessage + "\"}}";
      AeException aeException = assertThrows(AeException.class, () -> converter.convertCollection(content));
      assertEquals(aeException.getMessage(), errorMessage);
    }


    @Test
    @DisplayName("throws AeException with Error text containing JSON-Message containing the words '\"error\"' and '\"text\"'")
    void throwsAEExceptionWithErrorJSONContentByProvidingErrorJson() {
      String errorMessage = "the error message";
      String content = "{\"error\": {\"text\": \"" + errorMessage + "\"}";
      AeException aeException = assertThrows(AeException.class, () -> converter.convertCollection(content));
      assertEquals(aeException.getMessage(), "Unexpected and/or unserializable Response from the API '" + content + "'");
    }


    @Test
    @DisplayName("throws AeException with Error text containing JSON-Message containing the words '\"error\"' and '\"text\"'")
    void throwsAEExceptionWithErrorJSONContentByProvidingErrorJsonB() {
      String errorMessage = "the error message";
      String content = "{\"error\": {\"tax\": \"" + errorMessage + "\"}";
      AeException aeException = assertThrows(AeException.class, () -> converter.convertCollection(content));
    }

    @Test
    @DisplayName("throws AeException text containing JSON-Message when Unexpected and/or unserializable Response from the API")
    void throwsAEExceptionWithUnexpectedResponseByProvidingErrorJson() {
      String errorMessage = "the message";
      String content = "{\"hallo\": {\"msg\": \"" + errorMessage + "\"}";
      AeException aeException = assertThrows(AeException.class, () -> converter.convertCollection(content));
      assertThat(aeException.getMessage(), StringContains.containsString(content));
    }

    @Test
    @DisplayName("throws AeException text containing JSON-Message not  containing the words '\"error\"' and '\"text\"'")
    void throwsAEExceptionWithErrorJSONContentByProvidingErrorJsonA() {
      String errorMessage = "No Record Found";
      String content = "{\"error\": {\"text\": \"" + errorMessage + "\"}}";
      AeNotFoundException aeNotFoundException = assertThrows(AeNotFoundException.class, () -> converter.convertCollection(content));
      assertEquals(aeNotFoundException.getMessage(), errorMessage);
    }
  }

}