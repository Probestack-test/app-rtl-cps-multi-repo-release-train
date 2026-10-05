package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Result of the success gate for this wave.
 */
@Schema(name = "ReleaseTrain_waves_inner_gateResult", description = "Result of the success gate for this wave.")
@JsonTypeName("ReleaseTrain_waves_inner_gateResult")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class ReleaseTrainWavesInnerGateResult {

  private Boolean passed;

  private BigDecimal successRatePercent;

  private BigDecimal errorRatePercent;

  private Integer observationMinutes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime evaluatedAt;

  public ReleaseTrainWavesInnerGateResult passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * Get passed
   * @return passed
  */
    @Schema(name = "passed", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passed")
  public Boolean getPassed() {
    return passed;
  }

  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

  public ReleaseTrainWavesInnerGateResult successRatePercent(BigDecimal successRatePercent) {
    this.successRatePercent = successRatePercent;
    return this;
  }

  /**
   * Get successRatePercent
   * @return successRatePercent
  */
  @Valid   @Schema(name = "successRatePercent", example = "99.8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successRatePercent")
  public BigDecimal getSuccessRatePercent() {
    return successRatePercent;
  }

  public void setSuccessRatePercent(BigDecimal successRatePercent) {
    this.successRatePercent = successRatePercent;
  }

  public ReleaseTrainWavesInnerGateResult errorRatePercent(BigDecimal errorRatePercent) {
    this.errorRatePercent = errorRatePercent;
    return this;
  }

  /**
   * Get errorRatePercent
   * @return errorRatePercent
  */
  @Valid   @Schema(name = "errorRatePercent", example = "0.05", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorRatePercent")
  public BigDecimal getErrorRatePercent() {
    return errorRatePercent;
  }

  public void setErrorRatePercent(BigDecimal errorRatePercent) {
    this.errorRatePercent = errorRatePercent;
  }

  public ReleaseTrainWavesInnerGateResult observationMinutes(Integer observationMinutes) {
    this.observationMinutes = observationMinutes;
    return this;
  }

  /**
   * Get observationMinutes
   * @return observationMinutes
  */
    @Schema(name = "observationMinutes", example = "15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observationMinutes")
  public Integer getObservationMinutes() {
    return observationMinutes;
  }

  public void setObservationMinutes(Integer observationMinutes) {
    this.observationMinutes = observationMinutes;
  }

  public ReleaseTrainWavesInnerGateResult evaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
    return this;
  }

  /**
   * Get evaluatedAt
   * @return evaluatedAt
  */
  @Valid   @Schema(name = "evaluatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluatedAt")
  public OffsetDateTime getEvaluatedAt() {
    return evaluatedAt;
  }

  public void setEvaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseTrainWavesInnerGateResult releaseTrainWavesInnerGateResult = (ReleaseTrainWavesInnerGateResult) o;
    return Objects.equals(this.passed, releaseTrainWavesInnerGateResult.passed) &&
        Objects.equals(this.successRatePercent, releaseTrainWavesInnerGateResult.successRatePercent) &&
        Objects.equals(this.errorRatePercent, releaseTrainWavesInnerGateResult.errorRatePercent) &&
        Objects.equals(this.observationMinutes, releaseTrainWavesInnerGateResult.observationMinutes) &&
        Objects.equals(this.evaluatedAt, releaseTrainWavesInnerGateResult.evaluatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passed, successRatePercent, errorRatePercent, observationMinutes, evaluatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTrainWavesInnerGateResult {\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    successRatePercent: ").append(toIndentedString(successRatePercent)).append("\n");
    sb.append("    errorRatePercent: ").append(toIndentedString(errorRatePercent)).append("\n");
    sb.append("    observationMinutes: ").append(toIndentedString(observationMinutes)).append("\n");
    sb.append("    evaluatedAt: ").append(toIndentedString(evaluatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

