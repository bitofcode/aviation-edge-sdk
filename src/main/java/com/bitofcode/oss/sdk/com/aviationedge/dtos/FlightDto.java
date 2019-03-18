package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightDto {

  @JsonProperty("geography")
  private Geography geography;
  @JsonProperty("speed")
  private Speed speed;
  @JsonProperty("departure")
  private Departure departure;
  @JsonProperty("arrival")
  private Arrival arrival;
  @JsonProperty("aircraft")
  private Aircraft aircraft;
  @JsonProperty("airline")
  private Airline airline;
  @JsonProperty("flight")
  private Flight flight;
  @JsonProperty("system")
  private System system;
  @JsonProperty("status")
  private String status;

  @JsonProperty("geography")
  public Geography getGeography() {
    return geography;
  }

  @JsonProperty("geography")
  public void setGeography(Geography geography) {
    this.geography = geography;
  }

  @JsonProperty("speed")
  public Speed getSpeed() {
    return speed;
  }

  @JsonProperty("speed")
  public void setSpeed(Speed speed) {
    this.speed = speed;
  }

  @JsonProperty("departure")
  public Departure getDeparture() {
    return departure;
  }

  @JsonProperty("departure")
  public void setDeparture(Departure departure) {
    this.departure = departure;
  }

  @JsonProperty("arrival")
  public Arrival getArrival() {
    return arrival;
  }

  @JsonProperty("arrival")
  public void setArrival(Arrival arrival) {
    this.arrival = arrival;
  }

  @JsonProperty("aircraft")
  public Aircraft getAircraft() {
    return aircraft;
  }

  @JsonProperty("aircraft")
  public void setAircraft(Aircraft aircraft) {
    this.aircraft = aircraft;
  }

  @JsonProperty("airline")
  public Airline getAirline() {
    return airline;
  }

  @JsonProperty("airline")
  public void setAirline(Airline airline) {
    this.airline = airline;
  }

  @JsonProperty("flight")
  public Flight getFlight() {
    return flight;
  }

  @JsonProperty("flight")
  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  @JsonProperty("system")
  public System getSystem() {
    return system;
  }

  @JsonProperty("system")
  public void setSystem(System system) {
    this.system = system;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Aircraft {

    @JsonProperty("icaoCode")
    private String icaoCode;
    @JsonProperty("regNumber")
    private String regNumber;
    @JsonProperty("icao24")
    private String icao24;

    @JsonProperty("icaoCode")
    public String getIcaoCode() {
      return icaoCode;
    }

    @JsonProperty("icaoCode")
    public void setIcaoCode(String icaoCode) {
      this.icaoCode = icaoCode;
    }

    @JsonProperty("regNumber")
    public String getRegNumber() {
      return regNumber;
    }

    @JsonProperty("regNumber")
    public void setRegNumber(String regNumber) {
      this.regNumber = regNumber;
    }

    @JsonProperty("icao24")
    public String getIcao24() {
      return icao24;
    }

    @JsonProperty("icao24")
    public void setIcao24(String icao24) {
      this.icao24 = icao24;
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Airline {

    @JsonProperty("iataCode")
    private String iataCode;
    @JsonProperty("icaoCode")
    private String icaoCode;

    @JsonProperty("iataCode")
    public String getIataCode() {
      return iataCode;
    }

    @JsonProperty("iataCode")
    public void setIataCode(String iataCode) {
      this.iataCode = iataCode;
    }

    @JsonProperty("icaoCode")
    public String getIcaoCode() {
      return icaoCode;
    }

    @JsonProperty("icaoCode")
    public void setIcaoCode(String icaoCode) {
      this.icaoCode = icaoCode;
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Arrival {

    @JsonProperty("iataCode")
    private String iataCode;
    @JsonProperty("icaoCode")
    private String icaoCode;

    @JsonProperty("iataCode")
    public String getIataCode() {
      return iataCode;
    }

    @JsonProperty("iataCode")
    public void setIataCode(String iataCode) {
      this.iataCode = iataCode;
    }

    @JsonProperty("icaoCode")
    public String getIcaoCode() {
      return icaoCode;
    }

    @JsonProperty("icaoCode")
    public void setIcaoCode(String icaoCode) {
      this.icaoCode = icaoCode;
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Departure {

    @JsonProperty("iataCode")
    private String iataCode;
    @JsonProperty("icaoCode")
    private String icaoCode;

    @JsonProperty("iataCode")
    public String getIataCode() {
      return iataCode;
    }

    @JsonProperty("iataCode")
    public void setIataCode(String iataCode) {
      this.iataCode = iataCode;
    }

    @JsonProperty("icaoCode")
    public String getIcaoCode() {
      return icaoCode;
    }

    @JsonProperty("icaoCode")
    public void setIcaoCode(String icaoCode) {
      this.icaoCode = icaoCode;
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Flight {

    @JsonProperty("iataNumber")
    private String iataNumber;
    @JsonProperty("icaoNumber")
    private String icaoNumber;
    @JsonProperty("number")
    private String number;

    @JsonProperty("iataNumber")
    public String getIataNumber() {
      return iataNumber;
    }

    @JsonProperty("iataNumber")
    public void setIataNumber(String iataNumber) {
      this.iataNumber = iataNumber;
    }

    @JsonProperty("icaoNumber")
    public String getIcaoNumber() {
      return icaoNumber;
    }

    @JsonProperty("icaoNumber")
    public void setIcaoNumber(String icaoNumber) {
      this.icaoNumber = icaoNumber;
    }

    @JsonProperty("number")
    public String getNumber() {
      return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
      this.number = number;
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Geography {

    @JsonProperty("latitude")
    private Float latitude;
    @JsonProperty("longitude")
    private Float longitude;
    @JsonProperty("altitude")
    private Float altitude;
    @JsonProperty("direction")
    private Long direction;

    @JsonProperty("latitude")
    public Float getLatitude() {
      return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Float latitude) {
      this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Float getLongitude() {
      return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Float longitude) {
      this.longitude = longitude;
    }

    @JsonProperty("altitude")
    public Float getAltitude() {
      return altitude;
    }

    @JsonProperty("altitude")
    public void setAltitude(Float altitude) {
      this.altitude = altitude;
    }

    @JsonProperty("direction")
    public Long getDirection() {
      return direction;
    }

    @JsonProperty("direction")
    public void setDirection(Long direction) {
      this.direction = direction;
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Speed {

    @JsonProperty("horizontal")
    private Float horizontal;
    @JsonProperty("isGround")
    private Long isGround;
    @JsonProperty("vertical")
    private Long vertical;

    @JsonProperty("horizontal")
    public Float getHorizontal() {
      return horizontal;
    }

    @JsonProperty("horizontal")
    public void setHorizontal(Float horizontal) {
      this.horizontal = horizontal;
    }

    @JsonProperty("isGround")
    public Long getIsGround() {
      return isGround;
    }

    @JsonProperty("isGround")
    public void setIsGround(Long isGround) {
      this.isGround = isGround;
    }

    @JsonProperty("vertical")
    public Long getVertical() {
      return vertical;
    }

    @JsonProperty("vertical")
    public void setVertical(Long vertical) {
      this.vertical = vertical;
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class System {

    @JsonProperty("updated")
    private Long updated;
    @JsonProperty("squawk")
    private String squawk;

    @JsonProperty("updated")
    public Long getUpdated() {
      return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(Long updated) {
      this.updated = updated;
    }

    @JsonProperty("squawk")
    public String getSquawk() {
      return squawk;
    }

    @JsonProperty("squawk")
    public void setSquawk(String squawk) {
      this.squawk = squawk;
    }

  }
}
