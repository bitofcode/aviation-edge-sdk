package com.bitofcode.oss.sdk.com.aviationedge.resources;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class KeyValuePairTest {

  @Test
  void equalsReturnTrueWhenSameObject() {
    KeyValuePair keyValuePair = new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA");

    assertEquals(keyValuePair, keyValuePair);
  }

  @Test
  void equalsReturnTrueWhenSameObjectContent() {
    KeyValuePair keyValuePair1 = new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA");
    KeyValuePair keyValuePair2 = new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA");
    assertEquals(keyValuePair1, keyValuePair2);
  }

  @Test
  void equalsReturnFalseWhenObjectNotInstanceOfKeyValuePair() {
    KeyValuePair keyValuePair1 = new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA");
    Object keyValuePair2 = new Object();
    assertNotEquals(keyValuePair1, keyValuePair2);
  }

  @Test
  void equalsReturnFalseWhenObjectHasDifferentParameterNameButSameParameterValue() {
    KeyValuePair keyValuePair1 = new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA");
    Object keyValuePair2 = new KeyValuePair(QueryParameterName.AIRPORT_IATA_CODE_NAME, "AA");
    assertNotEquals(keyValuePair1, keyValuePair2);
  }

  @Test
  void equalsReturnFalseWhenObjectHasDifferentParameterValueButSameParameterName() {
    KeyValuePair keyValuePair1 = new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "AA");
    KeyValuePair keyValuePair2 = new KeyValuePair(QueryParameterName.AIRLINE_IATA_CODE_NAME, "BB");
    assertNotEquals(keyValuePair1, keyValuePair2);
  }
}
