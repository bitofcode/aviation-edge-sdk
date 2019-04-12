package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;
import com.bitofcode.oss.sdk.com.aviationedge.events.*;
import com.bitofcode.oss.sdk.com.aviationedge.common.LoggingUtils;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpClientFactory;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpResponseConverter;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

/**
 * Abstract implementation of {@link ApiResource}.
 *
 * @param <T> the type of the Resource's model.
 */
public abstract class ResourceBase<T> implements ApiResource<T> {

  private static final Logger LOGGER = LoggerFactory.getLogger(ResourceBase.class);

  private final HttpClientFactory httpClientFactory;
  private final HttpResponseConverter<T> httpResponseConverter;
  private final String apiKey;
  private final List<AePreRequestListener> preRequestCallbacks = new LinkedList<>();
  private final List<AePostRequestListener> postRequestCallbacks = new LinkedList<>();

  /**
   * Create the {@link ApiResource}.
   *
   * @param httpClientFactory     instance of {@link HttpClientFactory}.
   * @param httpResponseConverter instance of {@link HttpResponseConverter}
   *                              which convert the HttpResponse to the model.
   * @param apiKey                the API key.
   */
  ResourceBase(HttpClientFactory httpClientFactory,
               HttpResponseConverter<T> httpResponseConverter,
               String apiKey) {
    this.httpClientFactory = httpClientFactory;
    this.httpResponseConverter = httpResponseConverter;
    this.apiKey = apiKey;
  }

  @Override
  public List<T> retrieveAll() {
    LOGGER.debug("try to retrieve all of {}", getClass().getSimpleName());
    return doHttpGetRequest();
  }

  private List<T> doHttpGetRequest() {
    return doHttpGetRequest(this.getResourceUriForWithoutFilter());
  }

  private List<T> doHttpGetRequest(URI uriSupplier) {
    String uriAsLogString = LoggingUtils.obfuscate(uriSupplier, apiKey);
    LOGGER.debug("try to sent HTTP GET for {}", uriAsLogString);

    try (CloseableHttpClient httpClient = httpClientFactory.createHttpClient()) {
      CloseableHttpResponse httpResponse = execute(uriSupplier, httpClient);
      String content = EntityUtils.toString(httpResponse.getEntity(), StandardCharsets.UTF_8);

      return httpResponseConverter.convertCollection(content);
    } catch (Exception exception) {
      String errorMessage = String.format("Error while processing the HTTP GET of %s", uriAsLogString);
      LOGGER.error(errorMessage);
      throw new AeException(errorMessage, exception);
    }
  }

  private CloseableHttpResponse execute(URI uriSupplier, CloseableHttpClient httpClient) throws IOException {
    final HttpGet request = new HttpGet(uriSupplier);
    preProcess(request);
    final CloseableHttpResponse httpResponse = httpClient.execute(request);
    postProcess(httpResponse, request);
    return httpResponse;
  }

  private void postProcess(HttpResponse httpResponse, HttpGet request) {
    for (AePostRequestListener callback : postRequestCallbacks) {
      LOGGER.debug("Start AePostRequestListener instance of {} {}", callback.getClass(), callback);
      callback.handlePostRequest(new AePostRequestEvent(this, new AePostRequest(httpResponse, request)));
      LOGGER.debug("Finish AePostRequestListener instance of {} {}", callback.getClass(), callback);
    }
  }

  private void preProcess(HttpGet request) {
    for (AePreRequestListener callback : preRequestCallbacks) {
      LOGGER.debug("Start AePreRequestListener instance of {} {}", callback.getClass(), callback);
      callback.handleAePreRequest(new AePreRequestEvent(this, request));
      LOGGER.debug("Finish AePreRequestListener instance of {} {}", callback.getClass(), callback);

    }
  }

  URIBuilder createUriBuilderWithApiKey() {
    return new URIBuilder(getResourceUri())
      .addParameter(QueryParameterName.API_KEY.getName(), apiKey);
  }

  private URI getUriSupplier(ResourceRequest resourceRequest) {
    URIBuilder uriBuilder = createUriBuilderWithApiKey();

    for (KeyValuePair queryParameter : resourceRequest.queryParameters()) {
      uriBuilder.addParameter(queryParameter.getKey(), queryParameter.getValue());
    }

    try {
      return uriBuilder.build();
    } catch (Exception exception) {
      String message = "Can not build URI";
      LOGGER.error(message);
      throw new AeException(message, exception);
    }
  }

  protected abstract URI getResourceUri();

  protected abstract URI getResourceUriForWithoutFilter();

  @Override
  public List<T> retrieve(ResourceRequest resourceRequest) {

    if (resourceRequest == null || resourceRequest.queryParameters().isEmpty()) {
      return retrieveAll();
    }
    return doHttpGetRequest(getUriSupplier(resourceRequest));
  }

  @Override
  public void addPreRequestCallback(AePreRequestListener callback) {
    if (callback == null) {
      throw new IllegalArgumentException("callback can not be null.");
    }
    if (!this.preRequestCallbacks.contains(callback)) {
      preRequestCallbacks.add(callback);
    }
  }

  @Override
  public void addPostRequestCallback(AePostRequestListener callback) {
    if (callback == null) {
      throw new IllegalArgumentException("callback can not be null.");
    }
    if (!this.postRequestCallbacks.contains(callback)) {
      postRequestCallbacks.add(callback);
    }
  }
}
