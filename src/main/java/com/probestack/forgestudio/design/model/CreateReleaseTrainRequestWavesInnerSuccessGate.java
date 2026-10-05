package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Conditions required before moving to the next wave.
 */
@Schema(name = "createReleaseTrain_request_waves_inner_successGate", description = "Conditions required before moving to the next wave.")
@JsonTypeName("createReleaseTrain_request_waves_inner_successGate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class CreateReleaseTrainRequestWavesInnerSuccessGate {

  private BigDecimal minSuccessRatePercent;

  private BigDecimal maxErrorRatePercent;

  private Integer observationMinutes;

  public CreateReleaseTrainRequestWavesInnerSuccessGate minSuccessRatePercent(BigDecimal minSuccessRatePercent) {
    this.minSuccessRatePercent = minSuccessRatePercent;
    return this;
  }

  /**
   * Get minSuccessRatePercent
   * @return minSuccessRatePercent
  */
  @Valid   @Schema(name = "minSuccessRatePercent", example = "99.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minSuccessRatePercent")
  public BigDecimal getMinSuccessRatePercent() {
    return minSuccessRatePercent;
  }

  public void setMinSuccessRatePercent(BigDecimal minSuccessRatePercent) {
    this.minSuccessRatePercent = minSuccessRatePercent;
  }

  public CreateReleaseTrainRequestWavesInnerSuccessGate maxErrorRatePercent(BigDecimal maxErrorRatePercent) {
    this.maxErrorRatePercent = maxErrorRatePercent;
    return this;
  }

  /**
   * Get maxErrorRatePercent
   * @return maxErrorRatePercent
  */
  @Valid   @Schema(name = "maxErrorRatePercent", example = "0.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxErrorRatePercent")
  public BigDecimal getMaxErrorRatePercent() {
    return maxErrorRatePercent;
  }

  public void setMaxErrorRatePercent(BigDecimal maxErrorRatePercent) {
    this.maxErrorRatePercent = maxErrorRatePercent;
  }

  public CreateReleaseTrainRequestWavesInnerSuccessGate observationMinutes(Integer observationMinutes) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReleaseTrainRequestWavesInnerSuccessGate createReleaseTrainRequestWavesInnerSuccessGate = (CreateReleaseTrainRequestWavesInnerSuccessGate) o;
    return Objects.equals(this.minSuccessRatePercent, createReleaseTrainRequestWavesInnerSuccessGate.minSuccessRatePercent) &&
        Objects.equals(this.maxErrorRatePercent, createReleaseTrainRequestWavesInnerSuccessGate.maxErrorRatePercent) &&
        Objects.equals(this.observationMinutes, createReleaseTrainRequestWavesInnerSuccessGate.observationMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minSuccessRatePercent, maxErrorRatePercent, observationMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReleaseTrainRequestWavesInnerSuccessGate {\n");
    sb.append("    minSuccessRatePercent: ").append(toIndentedString(minSuccessRatePercent)).append("\n");
    sb.append("    maxErrorRatePercent: ").append(toIndentedString(maxErrorRatePercent)).append("\n");
    sb.append("    observationMinutes: ").append(toIndentedString(observationMinutes)).append("\n");
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

