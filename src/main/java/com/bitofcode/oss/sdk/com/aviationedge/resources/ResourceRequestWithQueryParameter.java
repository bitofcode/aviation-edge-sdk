package com.bitofcode.oss.sdk.com.aviationedge.resources;

public class ResourceRequestWithQueryParameter extends ResourceRequestBase
    implements ResourceRequest {

  public ResourceRequestWithQueryParameter withCountryIso2Code(String value) {
    return with(QueryParameterName.COUNTRY_ISO_2_CODE, value);
  }

  public ResourceRequestWithQueryParameter withAirlineIataCodeName(String value) {
    return with(QueryParameterName.AIRLINE_IATA_CODE_NAME, value);
  }

  public ResourceRequestWithQueryParameter withAirportIataCodeName(String value) {
    return with(QueryParameterName.AIRPORT_IATA_CODE_NAME, value);
  }

}
