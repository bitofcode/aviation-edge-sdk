package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpClientFactory;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpResponseConverter;
import com.bitofcode.oss.sdk.com.aviationedge.dtos.AirportDto;
import com.bitofcode.oss.sdk.com.aviationedge.tests.JsonApiTestUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
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

import static com.bitofcode.oss.sdk.com.aviationedge.resources.QueryParameterName.AIRPORT_IATA_CODE;
import static com.bitofcode.oss.sdk.com.aviationedge.resources.QueryParameterName.COUNTRY_ISO_2_CODE;
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
    CloseableHttpResponse httpResponse = mock(CloseableHttpResponse.class);
    httpEntity = mock(HttpEntity.class);

    when(httpEntity.getContent()).thenReturn(new ByteArrayInputStream(allAirports.getBytes(StandardCharsets.UTF_8)));

    when(httpResponse.getEntity()).thenReturn(httpEntity);
    when(closeableHttpClient.execute(any())).thenReturn(httpResponse);
    when(httpClientFactory.createHttpClient()).thenReturn(closeableHttpClient);
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

    assertThrows(AeException.class, () -> airportResource.retrieve(new ResourceRequestWithQueryParameter().with(COUNTRY_ISO_2_CODE, "AA")));
  }


  @Test
  void throwsAEExceptioenWhenCreateUriBuilderWithApiKeyFail() {
    when(airportResource.createUriBuilderWithApiKey()).thenThrow(new RuntimeException());

    assertThrows(AeException.class, () -> airportResource.getResourceUriForWithoutFilter());
  }


  @Test
  void retrieveAirportWitAirportResourceRequest() throws IOException {
    ResourceRequestWithQueryParameter resourceRequestWithQueryParameter = new ResourceRequestWithQueryParameter();
    resourceRequestWithQueryParameter.with(AIRPORT_IATA_CODE,"AA").with(COUNTRY_ISO_2_CODE,"US");

    airportResource.retrieve(resourceRequestWithQueryParameter);

    verify(closeableHttpClient).execute(argThat((HttpUriRequest httpRequest) -> {
      String query = httpRequest.getURI().getQuery();

      assertThat(query,
        allOf(
          containsString(AIRPORT_IATA_CODE.getName() + "=AA"),
          containsString(COUNTRY_ISO_2_CODE.getName() + "=US")
        )
      );
      return true;
    }));

  }


}