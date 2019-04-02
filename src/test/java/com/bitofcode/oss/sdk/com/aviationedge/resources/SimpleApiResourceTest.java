package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;
import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePostRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.callbacks.AePreRequestCallback;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpClientFactory;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpResponseConverter;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.AirportDto;
import com.bitofcode.oss.sdk.com.aviationedge.tests.JsonApiTestUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.*;

class SimpleApiResourceTest {

  private SimpleApiResource<AirportDto> airportResource;

  private HttpClientFactory httpClientFactory;
  private CloseableHttpClient closeableHttpClient;
  private HttpResponseConverter<AirportDto> httpResponseConverter;
  private HttpEntity httpEntity;
  private String allAirports;
  private CloseableHttpResponse httpResponse;

  @SuppressWarnings("unchecked")
  @BeforeEach
  void setUp() throws URISyntaxException, IOException {
    allAirports = JsonApiTestUtil.get("json-test-data/airports/all-airports.json").toString();

    URI resourceUrl = new URI("https://localhost/v2/public/airportsDatabase");
    String apiKey = UUID.randomUUID().toString();
    httpClientFactory = mock(HttpClientFactory.class);
    closeableHttpClient = mock(CloseableHttpClient.class);
    httpResponseConverter = spy(new SimpleHttpResponseConverter<>(new TypeReference<List<AirportDto>>() {
    }, new ObjectMapper()));
    httpResponse = mock(CloseableHttpResponse.class);
    httpEntity = mock(HttpEntity.class);

    doReturn(new ByteArrayInputStream(allAirports.getBytes(StandardCharsets.UTF_8))).
      when(httpEntity).getContent();
    doReturn((httpEntity)).when(httpResponse).getEntity();
    doReturn((httpResponse)).when(closeableHttpClient).execute(any());
    doReturn((closeableHttpClient)).when(httpClientFactory).createHttpClient();

    airportResource = spy(new SimpleApiResource(resourceUrl, apiKey, httpClientFactory, httpResponseConverter));
  }

  @Test
  void retrieveAllAirports() throws IOException {
    List<AirportDto> airports = airportResource.retrieveAll();

    verify(httpClientFactory).createHttpClient();
    verify(closeableHttpClient).execute(ArgumentMatchers.any(HttpGet.class));
    verify(httpResponseConverter).convertCollection(allAirports);

    assertThat(airports.size(), greaterThan(0));
  }

  @Test
  void retrieveAllThrowExceptionIfJsonStringIsMalformatted() throws IOException {
    String malFormattedJsonAirlines = "[}";
    when(httpEntity.getContent()).thenReturn(new ByteArrayInputStream(malFormattedJsonAirlines.getBytes()));
    assertThrows(AeException.class, () -> airportResource.retrieveAll());
  }

  @Test
  void retrieveAirportWithEmptyParametersLeadToRetrieveAllAirports() {
    ResourceRequestWithQueryParameter airlineResourceRequest = new ResourceRequestWithQueryParameter();
    airlineResourceRequest.reset();

    airportResource.retrieve(airlineResourceRequest);
    verify(airportResource).retrieveAll();
  }

  @Test
  void retrieveAirportWithNullParametersLeadToRetrieveAllAirports() {
    airportResource.retrieve(null);

    verify(airportResource).retrieveAll();
  }

  @Test
  void throwsAEExceptioenWhenUriBuilderFail() throws URISyntaxException {
    URIBuilder mockURIBuilder = mock(URIBuilder.class);
    when(mockURIBuilder.build()).thenThrow(new RuntimeException());
    when(airportResource.createUriBuilderWithApiKey()).thenReturn(mockURIBuilder);

    assertThrows(AeException.class, () ->
      airportResource
        .retrieve(new ResourceRequestWithQueryParameter()
          .with(QueryParameterName.AIRPORT_COUNTRY_ISO_2_CODE, "AA")));
  }

  @Test
  void throwsAEExceptioenWhenCreateUriBuilderWithApiKeyFail() {
    when(airportResource.createUriBuilderWithApiKey()).thenThrow(new RuntimeException());

    assertThrows(AeException.class, () -> airportResource.getResourceUriForWithoutFilter());
  }

  @Test
  void retrieveAirportWitAirportResourceRequest() throws IOException {
    ResourceRequestWithQueryParameter resourceRequestWithQueryParameter = new ResourceRequestWithQueryParameter();
    resourceRequestWithQueryParameter
      .with(QueryParameterName.AIRPORT_IATA_CODE, "AA")
      .with(QueryParameterName.AIRPORT_COUNTRY_ISO_2_CODE, "US");

    airportResource.retrieve(resourceRequestWithQueryParameter);

    verify(closeableHttpClient).execute(argThat((HttpUriRequest httpRequest) -> {
      String query = httpRequest.getURI().getQuery();

      assertThat(query,
        allOf(
          containsString(QueryParameterName.AIRPORT_IATA_CODE.getName() + "=AA"),
          containsString(QueryParameterName.AIRPORT_COUNTRY_ISO_2_CODE.getName() + "=US")
        )
      );
      return true;
    }));

  }

  @Test
  void canAddPreRequestCallback() {
    AePreRequestCallback callback = mock(AePreRequestCallback.class);
    airportResource.addPreRequestCallback(callback);

    airportResource.retrieveAll();

    verify(callback).handle(any(HttpRequestBase.class));
  }

  @Test
  void canNotAddPreRequestCallbackTwice() {
    AePreRequestCallback callback = mock(AePreRequestCallback.class);
    airportResource.addPreRequestCallback(callback);
    airportResource.addPreRequestCallback(callback);

    airportResource.retrieveAll();

    verify(callback).handle(any(HttpRequestBase.class));
  }

  @Test
  void addPreRequestCallbackThrowExceptionWhenCallbackIsNull() {
    assertThrows(IllegalArgumentException.class, () -> airportResource.addPreRequestCallback(null));
  }

  @Test
  void canAddPostRequestCallback() {
    AePostRequestCallback callback = mock(AePostRequestCallback.class);
    airportResource.addPostRequestCallback(callback);

    airportResource.retrieveAll();

    verify(callback).handle(eq(httpResponse), any(HttpRequestBase.class));
  }

  @Test
  void canNotAddPostRequestCallbackTwice() {
    AePostRequestCallback callback = mock(AePostRequestCallback.class);
    airportResource.addPostRequestCallback(callback);
    airportResource.addPostRequestCallback(callback);

    airportResource.retrieveAll();

    verify(callback).handle(eq(httpResponse), any(HttpRequestBase.class));
  }

  @Test
  void addPostRequestCallbackThrowExceptionWhenCallbackIsNull() {
    assertThrows(IllegalArgumentException.class, () -> airportResource.addPostRequestCallback(null));
  }
}