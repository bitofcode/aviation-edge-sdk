package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * This represents airplane model retrieved from the Aviation-Edge Web API.
 */
@SuppressWarnings({"SpellCheckingInspection", "unused"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirplaneDto {

  /**
   * The airplane id.
   */
  @JsonProperty("airplaneId")
  private String airplaneId;

  /**
   * The registration number.
   */
  @JsonProperty("numberRegistration")
  private String numberRegistration;

  /**
   * The production line.
   */
  @JsonProperty("productionLine")
  private String productionLine;

  /**
   * The IATA airplane type.
   */
  @JsonProperty("airplaneIataType")
  private String airplaneIataType;

  /**
   * The plane model.
   */
  @JsonProperty("planeModel")
  private String planeModel;

  /**
   * The model code.
   */
  @JsonProperty("modelCode")
  private String modelCode;

  /**
   * The airplane ICAO hex code.
   */
  @JsonProperty("hexIcaoAirplane")
  private String hexIcaoAirplane;

  /**
   * The plane short IATA code.
   */
  @JsonProperty("codeIataPlaneShort")
  private String codeIataPlaneShort;

  /**
   * The plane long IATA code.
   */
  @JsonProperty("codeIataPlaneLong")
  private String codeIataPlaneLong;

  /**
   * The construction number.
   */
  @JsonProperty("constructionNumber")
  private String constructionNumber;

  /**
   * The registration test number.
   */
  @JsonProperty("numberTestRgistration")
  private String numberTestRgistration;

  /**
   * The rollout date.
   */
  @JsonProperty("rolloutDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate rolloutDate;

  /**
   * The first flight.
   */
  @JsonProperty("firstFlight")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
  private LocalDate firstFlight;

  /**
   * The delivery date.
   */
  @JsonProperty("deliveryDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
  private LocalDate deliveryDate;

  /**
   * The registration date.
   */
  @JsonProperty("registrationDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
  private LocalDate registrationDate;

  /**
   * The line number.
   */
  @JsonProperty("lineNumber")
  private String lineNumber;

  /**
   * The plane series.
   */
  @JsonProperty("planeSeries")
  private String planeSeries;

  /**
   * The airline IATA code.
   */
  @JsonProperty("codeIataAirline")
  private String codeIataAirline;

  /**
   * The airline ICAO code.
   */
  @JsonProperty("codeIcaoAirline")
  private String codeIcaoAirline;

  /**
   * The plane owner.
   */
  @JsonProperty("planeOwner")
  private String planeOwner;

  /**
   * The engines count.
   */
  @JsonProperty("enginesCount")
  private String enginesCount;

  /**
   * The engines type.
   */
  @JsonProperty("enginesType")
  private String enginesType;

  /**
   * The plane age.
   */
  @JsonProperty("planeAge")
  private String planeAge;

  /**
   * The plane status.
   */
  @JsonProperty("planeStatus")
  private String planeStatus;

  /**
   * The plane class.
   */
  @JsonProperty("planeClass")
  private String planeClass;

  /**
   * Returns the airplane id.
   *
   * @return the airplane id.
   */
  public String getAirplaneId() {
    return airplaneId;
  }

  /**
   * Sets the airplane id.
   *
   * @param airplaneId the airplane id to be set.
   */
  public void setAirplaneId(String airplaneId) {
    this.airplaneId = airplaneId;
  }

  /**
   * Returns the registration number.
   *
   * @return the registration number.
   */
  public String getNumberRegistration() {
    return numberRegistration;
  }

  /**
   * Sets the registration number.
   *
   * @param numberRegistration the registration number to be set.
   */
  public void setNumberRegistration(String numberRegistration) {
    this.numberRegistration = numberRegistration;
  }

  /**
   * Returns the production line.
   *
   * @return the production line.
   */
  public String getProductionLine() {
    return productionLine;
  }

  /**
   * Sets the production line.
   *
   * @param productionLine the production line to be set.
   */
  public void setProductionLine(String productionLine) {
    this.productionLine = productionLine;
  }

  /**
   * Returns the IATA airplane type.
   *
   * @return the IATA airplane type.
   */
  public String getAirplaneIataType() {
    return airplaneIataType;
  }

  /**
   * Sets the IATA airplane type.
   *
   * @param airplaneIataType the IATA airplane type to set.
   */
  public void setAirplaneIataType(String airplaneIataType) {
    this.airplaneIataType = airplaneIataType;
  }

  /**
   * Returns the plane model.
   *
   * @return the plane model.
   */
  public String getPlaneModel() {
    return planeModel;
  }

  /**
   * Sets the plane model.
   *
   * @param planeModel the plane model to be set.
   */
  public void setPlaneModel(String planeModel) {
    this.planeModel = planeModel;
  }

  /**
   * Returns the model code.
   *
   * @return the model code.
   */
  public String getModelCode() {
    return modelCode;
  }

  /**
   * Sets the model code.
   *
   * @param modelCode the model code to be set.
   */
  public void setModelCode(String modelCode) {
    this.modelCode = modelCode;
  }

  /**
   * Returns the airplane ICAO hex code.
   *
   * @return the airplane ICAO hex code.
   */
  public String getHexIcaoAirplane() {
    return hexIcaoAirplane;
  }

  /**
   * Sets the airplane ICAO hex code.
   *
   * @param hexIcaoAirplane the airplane ICAO hex code to be set.
   */
  public void setHexIcaoAirplane(String hexIcaoAirplane) {
    this.hexIcaoAirplane = hexIcaoAirplane;
  }

  /**
   * Returns the plane short IATA code.
   *
   * @return the plane short IATA code.
   */
  public String getCodeIataPlaneShort() {
    return codeIataPlaneShort;
  }

  /**
   * Sets the plane short IATA code.
   *
   * @param codeIataPlaneShort the plane short IATA code to be set.
   */
  public void setCodeIataPlaneShort(String codeIataPlaneShort) {
    this.codeIataPlaneShort = codeIataPlaneShort;
  }

  /**
   * Returns the plane long IATA code.
   *
   * @return the plane long IATA code.
   */
  public String getCodeIataPlaneLong() {
    return codeIataPlaneLong;
  }

  /**
   * Sets the plane long IATA code.
   *
   * @param codeIataPlaneLong the plane long IATA code to be set.
   */
  public void setCodeIataPlaneLong(String codeIataPlaneLong) {
    this.codeIataPlaneLong = codeIataPlaneLong;
  }

  /**
   * Returns the construction number.
   *
   * @return the construction number.
   */
  public String getConstructionNumber() {
    return constructionNumber;
  }

  /**
   * Sets the construction number.
   *
   * @param constructionNumber the construction number to be set.
   */
  public void setConstructionNumber(String constructionNumber) {
    this.constructionNumber = constructionNumber;
  }

  /**
   * Returns the registration test number.
   *
   * @return the registration test number.
   */
  public String getNumberTestRgistration() {
    return numberTestRgistration;
  }

  /**
   * Sets the registration test number.
   *
   * @param numberTestRgistration the registration test number to be set.
   */
  public void setNumberTestRgistration(String numberTestRgistration) {
    this.numberTestRgistration = numberTestRgistration;
  }

  /**
   * Returns the rollout date.
   *
   * @return the rollout date.
   */
  public LocalDate getRolloutDate() {
    return rolloutDate;
  }

  /**
   * Sets the rollout date.
   *
   * @param rolloutDate the rollout date to be set.
   */
  public void setRolloutDate(LocalDate rolloutDate) {
    this.rolloutDate = rolloutDate;
  }

  /**
   * Returns the first flight.
   *
   * @return the first flight.
   */
  public LocalDate getFirstFlight() {
    return firstFlight;
  }

  /**
   * Sets the first flight.
   *
   * @param firstFlight the first flight to be sets.
   */
  public void setFirstFlight(LocalDate firstFlight) {
    this.firstFlight = firstFlight;
  }

  /**
   * Returns the delivery date.
   *
   * @return the delivery date.
   */
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  /**
   * Sets the delivery date.
   *
   * @param deliveryDate the delivery date to be set.
   */
  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  /**
   * Returns the registration date.
   *
   * @return the registration date.
   */
  public LocalDate getRegistrationDate() {
    return registrationDate;
  }

  /**
   * Sets the registration date.
   *
   * @param registrationDate the registration date to be set.
   */
  public void setRegistrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
  }

  /**
   * Returns the line number.
   *
   * @return the line number.
   */
  public String getLineNumber() {
    return lineNumber;
  }

  /**
   * Sets the line number.
   *
   * @param lineNumber the line number to be set.
   */
  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Returns the plane series.
   *
   * @return the plane series.
   */
  public String getPlaneSeries() {
    return planeSeries;
  }

  /**
   * Sets the plane series.
   *
   * @param planeSeries the plane series to be set.
   */
  public void setPlaneSeries(String planeSeries) {
    this.planeSeries = planeSeries;
  }

  /**
   * Returns the airline IATA code.
   *
   * @return the airline IATA code.
   */
  public String getCodeIataAirline() {
    return codeIataAirline;
  }

  /**
   * Sets the airline IATA code.
   *
   * @param codeIataAirline the airline IATA code to be set.
   */
  public void setCodeIataAirline(String codeIataAirline) {
    this.codeIataAirline = codeIataAirline;
  }

  /**
   * Returns the airline ICAO code.
   *
   * @return the airline ICAO code.
   */
  public String getCodeIcaoAirline() {
    return codeIcaoAirline;
  }

  /**
   * Sets the airline ICAO code.
   *
   * @param codeIcaoAirline the airline ICAO code to be set.
   */
  public void setCodeIcaoAirline(String codeIcaoAirline) {
    this.codeIcaoAirline = codeIcaoAirline;
  }

  /**
   * Returns the plane owner.
   *
   * @return the plane owner.
   */
  public String getPlaneOwner() {
    return planeOwner;
  }

  /**
   * Sets the plane owner.
   *
   * @param planeOwner the plane owner to be set.
   */
  public void setPlaneOwner(String planeOwner) {
    this.planeOwner = planeOwner;
  }

  /**
   * Returns the engines count.
   *
   * @return the engines count.
   */
  public String getEnginesCount() {
    return enginesCount;
  }

  /**
   * Sets the engines count.
   *
   * @param enginesCount the engines count to be set.
   */
  public void setEnginesCount(String enginesCount) {
    this.enginesCount = enginesCount;
  }

  /**
   * Returns the engines type.
   *
   * @return the engines type.
   */
  public String getEnginesType() {
    return enginesType;
  }

  /**
   * Sets the engines type.
   *
   * @param enginesType the engines type to be set.
   */
  public void setEnginesType(String enginesType) {
    this.enginesType = enginesType;
  }

  /**
   * Returns the plane age.
   *
   * @return the plane age.
   */
  public String getPlaneAge() {
    return planeAge;
  }

  /**
   * Sets the plane age.
   *
   * @param planeAge the plane age to be set.
   */
  public void setPlaneAge(String planeAge) {
    this.planeAge = planeAge;
  }

  /**
   * Returns the plane status.
   *
   * @return the plane status.
   */
  public String getPlaneStatus() {
    return planeStatus;
  }

  /**
   * Sets the plane status.
   *
   * @param planeStatus the plane status.
   */
  public void setPlaneStatus(String planeStatus) {
    this.planeStatus = planeStatus;
  }

  /**
   * Returns the plane class.
   * @return the plane class.
   */
  public String getPlaneClass() {
    return planeClass;
  }

  /**
   * Sets the plane class.
   * @param planeClass the plane class to be set.
   */
  public void setPlaneClass(String planeClass) {
    this.planeClass = planeClass;
  }

  /**
   * Returns true if all properties of two Instances are equal, else false.
   * Check {@link Object#equals(Object)}.
   *
   * @param obj th instance to compare with
   * @return true if all properties of two Instances are equal, else false.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof AirplaneDto)) {
      return false;
    }
    AirplaneDto that = (AirplaneDto) obj;
    return Objects.equals(getAirplaneId(), that.getAirplaneId())
      && Objects.equals(getNumberRegistration(), that.getNumberRegistration())
      && Objects.equals(getProductionLine(), that.getProductionLine())
      && Objects.equals(getAirplaneIataType(), that.getAirplaneIataType())
      && Objects.equals(getPlaneModel(), that.getPlaneModel())
      && Objects.equals(getModelCode(), that.getModelCode())
      && Objects.equals(getHexIcaoAirplane(), that.getHexIcaoAirplane())
      && Objects.equals(getCodeIataPlaneShort(), that.getCodeIataPlaneShort())
      && Objects.equals(getCodeIataPlaneLong(), that.getCodeIataPlaneLong())
      && Objects.equals(getConstructionNumber(), that.getConstructionNumber())
      && Objects.equals(getNumberTestRgistration(), that.getNumberTestRgistration())
      && Objects.equals(getRolloutDate(), that.getRolloutDate())
      && Objects.equals(getFirstFlight(), that.getFirstFlight())
      && Objects.equals(getDeliveryDate(), that.getDeliveryDate())
      && Objects.equals(getRegistrationDate(), that.getRegistrationDate())
      && Objects.equals(getLineNumber(), that.getLineNumber())
      && Objects.equals(getPlaneSeries(), that.getPlaneSeries())
      && Objects.equals(getCodeIataAirline(), that.getCodeIataAirline())
      && Objects.equals(getCodeIcaoAirline(), that.getCodeIcaoAirline())
      && Objects.equals(getPlaneOwner(), that.getPlaneOwner())
      && Objects.equals(getEnginesCount(), that.getEnginesCount())
      && Objects.equals(getEnginesType(), that.getEnginesType())
      && Objects.equals(getPlaneAge(), that.getPlaneAge())
      && Objects.equals(getPlaneStatus(), that.getPlaneStatus())
      && Objects.equals(getPlaneClass(), that.getPlaneClass());
  }

  /**
   * Generates hash code.
   *
   * @return hash code.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getAirplaneId(),
      getNumberRegistration(),
      getProductionLine(),
      getAirplaneIataType(),
      getPlaneModel(),
      getModelCode(),
      getHexIcaoAirplane(),
      getCodeIataPlaneShort(),
      getCodeIataPlaneLong(),
      getConstructionNumber(),
      getNumberTestRgistration(),
      getRolloutDate(),
      getFirstFlight(),
      getDeliveryDate(),
      getRegistrationDate(),
      getLineNumber(),
      getPlaneSeries(),
      getCodeIataAirline(),
      getCodeIcaoAirline(),
      getPlaneOwner(),
      getEnginesCount(),
      getEnginesType(),
      getPlaneAge(),
      getPlaneStatus(),
      getPlaneClass());
  }
}