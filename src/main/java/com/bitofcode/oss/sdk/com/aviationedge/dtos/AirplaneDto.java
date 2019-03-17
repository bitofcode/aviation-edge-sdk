package com.bitofcode.oss.sdk.com.aviationedge.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

@SuppressWarnings("SpellCheckingInspection")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirplaneDto {

  @JsonProperty("airplaneId")
  private String airplaneId;

  @JsonProperty("numberRegistration")
  private String numberRegistration;

  @JsonProperty("productionLine")
  private String productionLine;

  @JsonProperty("airplaneIataType")
  private String airplaneIataType;

  @JsonProperty("planeModel")
  private String planeModel;

  @JsonProperty("modelCode")
  private String modelCode;

  @JsonProperty("hexIcaoAirplane")
  private String hexIcaoAirplane;

  @JsonProperty("codeIataPlaneShort")
  private String codeIataPlaneShort;

  @JsonProperty("codeIataPlaneLong")
  private String codeIataPlaneLong;

  @JsonProperty("constructionNumber")
  private String constructionNumber;

  @JsonProperty("numberTestRgistration")
  private String numberTestRgistration;

  @JsonProperty("rolloutDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate rolloutDate;

  @JsonProperty("firstFlight")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
  private LocalDate firstFlight;

  @JsonProperty("deliveryDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
  private LocalDate deliveryDate;

  @JsonProperty("registrationDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
  private LocalDate registrationDate;

  @JsonProperty("lineNumber")
  private String lineNumber;

  @JsonProperty("planeSeries")
  private String planeSeries;

  @JsonProperty("codeIataAirline")
  private String codeIataAirline;

  @JsonProperty("codeIcaoAirline")
  private String codeIcaoAirline;

  @JsonProperty("planeOwner")
  private String planeOwner;

  @JsonProperty("enginesCount")
  private String enginesCount;

  @JsonProperty("enginesType")
  private String enginesType;

  @JsonProperty("planeAge")
  private String planeAge;

  @JsonProperty("planeStatus")
  private String planeStatus;

  @JsonProperty("planeClass")
  private String planeClass;

  public String getAirplaneId() {
    return airplaneId;
  }

  public void setAirplaneId(String airplaneId) {
    this.airplaneId = airplaneId;
  }

  public String getNumberRegistration() {
    return numberRegistration;
  }

  public void setNumberRegistration(String numberRegistration) {
    this.numberRegistration = numberRegistration;
  }

  public String getProductionLine() {
    return productionLine;
  }

  public void setProductionLine(String productionLine) {
    this.productionLine = productionLine;
  }

  public String getAirplaneIataType() {
    return airplaneIataType;
  }

  public void setAirplaneIataType(String airplaneIataType) {
    this.airplaneIataType = airplaneIataType;
  }

  public String getPlaneModel() {
    return planeModel;
  }

  public void setPlaneModel(String planeModel) {
    this.planeModel = planeModel;
  }

  public String getModelCode() {
    return modelCode;
  }

  public void setModelCode(String modelCode) {
    this.modelCode = modelCode;
  }

  public String getHexIcaoAirplane() {
    return hexIcaoAirplane;
  }

  public void setHexIcaoAirplane(String hexIcaoAirplane) {
    this.hexIcaoAirplane = hexIcaoAirplane;
  }

  public String getCodeIataPlaneShort() {
    return codeIataPlaneShort;
  }

  public void setCodeIataPlaneShort(String codeIataPlaneShort) {
    this.codeIataPlaneShort = codeIataPlaneShort;
  }

  public String getCodeIataPlaneLong() {
    return codeIataPlaneLong;
  }

  public void setCodeIataPlaneLong(String codeIataPlaneLong) {
    this.codeIataPlaneLong = codeIataPlaneLong;
  }

  public String getConstructionNumber() {
    return constructionNumber;
  }

  public void setConstructionNumber(String constructionNumber) {
    this.constructionNumber = constructionNumber;
  }

  public String getNumberTestRgistration() {
    return numberTestRgistration;
  }

  public void setNumberTestRgistration(String numberTestRgistration) {
    this.numberTestRgistration = numberTestRgistration;
  }

  public LocalDate getRolloutDate() {
    return rolloutDate;
  }

  public void setRolloutDate(LocalDate rolloutDate) {
    this.rolloutDate = rolloutDate;
  }

  public LocalDate getFirstFlight() {
    return firstFlight;
  }

  public void setFirstFlight(LocalDate firstFlight) {
    this.firstFlight = firstFlight;
  }

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public LocalDate getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
  }

  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }

  public String getPlaneSeries() {
    return planeSeries;
  }

  public void setPlaneSeries(String planeSeries) {
    this.planeSeries = planeSeries;
  }

  public String getCodeIataAirline() {
    return codeIataAirline;
  }

  public void setCodeIataAirline(String codeIataAirline) {
    this.codeIataAirline = codeIataAirline;
  }

  public String getCodeIcaoAirline() {
    return codeIcaoAirline;
  }

  public void setCodeIcaoAirline(String codeIcaoAirline) {
    this.codeIcaoAirline = codeIcaoAirline;
  }

  public String getPlaneOwner() {
    return planeOwner;
  }

  public void setPlaneOwner(String planeOwner) {
    this.planeOwner = planeOwner;
  }

  public String getEnginesCount() {
    return enginesCount;
  }

  public void setEnginesCount(String enginesCount) {
    this.enginesCount = enginesCount;
  }

  public String getEnginesType() {
    return enginesType;
  }

  public void setEnginesType(String enginesType) {
    this.enginesType = enginesType;
  }

  public String getPlaneAge() {
    return planeAge;
  }

  public void setPlaneAge(String planeAge) {
    this.planeAge = planeAge;
  }

  public String getPlaneStatus() {
    return planeStatus;
  }

  public void setPlaneStatus(String planeStatus) {
    this.planeStatus = planeStatus;
  }

  public String getPlaneClass() {
    return planeClass;
  }

  public void setPlaneClass(String planeClass) {
    this.planeClass = planeClass;
  }

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