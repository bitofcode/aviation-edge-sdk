package com.bitofcode.oss.sdk.com.aviationedge.resources;

import com.bitofcode.oss.sdk.com.aviationedge.AeException;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpClientFactory;
import com.bitofcode.oss.sdk.com.aviationedge.communications.HttpResponseConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * Simple implementation of the {@link ApiResource}.
 *
 * @param <T> the type of the resource's model.
 */
public class SimpleApiResource<T> extends ResourceBase<T> {

  private static final Logger log = LoggerFactory.getLogger(SimpleApiResource.class);

  private final URI resourceUri;

  public SimpleApiResource(URI resourceUri,
                           String apiKey,
                           HttpClientFactory httpClientFactory,
                           HttpResponseConverter<T> httpResponseConverter) {
    super(httpClientFactory, httpResponseConverter, apiKey);
    this.resourceUri = resourceUri;
  }

  @Override
  protected URI getResourceUri() {
    return resourceUri;
  }

  @Override
  protected URI getResourceUriForWithoutFilter() {
    try {
      return createUriBuilderWithApiKey().build();
    } catch (Exception exception) {
      String logMessage = "Can not create URIBuilder with provided URI of value " + resourceUri;
      log.error(logMessage);
      throw new AeException(logMessage, exception);
    }
  }
}
