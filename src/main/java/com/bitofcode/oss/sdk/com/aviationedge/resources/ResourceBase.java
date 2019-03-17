package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;
import com.bitofcode.oss.sdk.com.aviationedge.common.LoggingUtils;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpClientFactory;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpResponseConverter;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Abstract implementation of {@link ApiResource}.
 *
 * @param <T> the type of the Resource's model.
 */
public abstract class ResourceBase<T> implements ApiResource<T> {

  private static final Logger log = LoggerFactory.getLogger(ResourceBase.class);

  private final HttpClientFactory httpClientFactory;
  private final HttpResponseConverter<T> httpResponseConverter;
  private final String apiKey;

  /**
   * Create the {@link ApiResource}.
   *
   * @param httpClientFactory     instance of {@link HttpClientFactory}.
   * @param httpResponseConverter instance of {@link HttpResponseConverter}
   *                              which convert the HttpResponse to the model.
   * @param apiKey                the API key.
   */
  ResourceBase(HttpClientFactory httpClientFactory,
               HttpResponseConverter<T> httpResponseConverter, String apiKey) {
    this.httpClientFactory = httpClientFactory;
    this.httpResponseConverter = httpResponseConverter;
    this.apiKey = apiKey;
  }

  @Override
  public List<T> retrieveAll() {
    log.debug("try to retrieve all of {}", getClass().getSimpleName());
    return doHttpGetRequest();
  }

  private List<T> doHttpGetRequest() {
    return doHttpGetRequest(this.getResourceUriForWithoutFilter());
  }

  private List<T> doHttpGetRequest(URI uriSupplier) {
    String uriAsLogString = LoggingUtils.obfuscate(uriSupplier, apiKey);
    log.debug("try to sent HTTP GET for {}", uriAsLogString);

    try (CloseableHttpClient httpClient = httpClientFactory.createHttpClient()) {
      CloseableHttpResponse httpResponse = httpClient.execute(new HttpGet(uriSupplier));
      String content = EntityUtils.toString(httpResponse.getEntity(), StandardCharsets.UTF_8);

      return httpResponseConverter.convertCollection(content);
    } catch (Exception exception) {
      log.error(
          String.format("Error while processing the HTTP GET of %s", uriAsLogString),
          exception);
      throw new AeException(exception);
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
      log.error(message, exception);
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
}
