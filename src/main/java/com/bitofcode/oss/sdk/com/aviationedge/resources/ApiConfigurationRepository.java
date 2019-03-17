package com.bitofcode.oss.sdk.com.aviationedge.resources;

import org.apache.commons.lang3.StringUtils;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Basic Configuration which hold the API-Key and the URI for each Resource.
 */
public class ApiConfigurationRepository {

  private final Map<String, URI> apiResourceUris = new HashMap<>();
  private String apiKey;

  /**
   * create an instance of {@link ApiConfigurationRepository} with an api key.
   *
   * @param apiKey the api key.
   */
  public ApiConfigurationRepository(String apiKey) {
    if (StringUtils.isBlank(apiKey)) {
      throw new IllegalArgumentException("ApiKey can not be null or empty");
    }

    this.apiKey = apiKey;
    for (Resource resource : Resource.values()) {
      apiResourceUris.put(resource.id, URI.create(resource.url));
    }

  }

  URI getUri(String resourceName) {
    return apiResourceUris.get(resourceName);
  }

  String getApiKey() {
    return apiKey;
  }

  public enum Resource {
    AIRLINE_RESOURCE("AirlineResource", "https://aviation-edge.com/v2/public/airlineDatabase"),
    AIRPORT_RESOURCE("AirportResource", "https://aviation-edge.com/v2/public/airportDatabase"),
    AIRCRAFT_RESOURCE("AircraftResource", "https://aviation-edge.com/v2/public/planeTypeDatabase"),
    AIRPLANE_RESOURCE("AirplaneResource", "https://aviation-edge.com/v2/public/airplaneDatabase"),
    CITY_RESOURCE("CityResource", "https://aviation-edge.com/v2/public/cityDatabase"),
    COUNTRY_RESOURCE("CountryResource", "https://aviation-edge.com/v2/public/countryDatabase"),
    TAX_RESOURCE("TaxResource", "https://aviation-edge.com/v2/public/taxDatabase"),
    ;

    public final String id;
    public final String url;

    Resource(String id, String url) {
      this.id = id;
      this.url = url;
    }

    @Override
    public String toString() {
      return new StringBuilder()
        .append("Resource{")
        .append("id='")
        .append(id)
        .append('\'')
        .append(", url='")
        .append(url)
        .append('\'')
        .append('}')
        .toString();
    }
  }


}
