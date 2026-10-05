package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.ReleaseTrainWavesInnerGateResult;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReleaseTrainWavesInner
 */
@JsonTypeName("ReleaseTrain_waves_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class ReleaseTrainWavesInner {

  private Integer waveNumber;

  private String name;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    RUNNING("RUNNING"),
    
    AWAITING_GATE("AWAITING_GATE"),
    
    PASSED("PASSED"),
    
    FAILED("FAILED"),
    
    ROLLED_BACK("ROLLED_BACK"),
    
    SKIPPED("SKIPPED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  @Valid
  private List<String> repositories = new ArrayList<>();

  /**
   * Gets or Sets strategy
   */
  public enum StrategyEnum {
    SEQUENTIAL("SEQUENTIAL"),
    
    PARALLEL("PARALLEL"),
    
    CANARY_5_PERCENT("CANARY_5_PERCENT"),
    
    CANARY_25_PERCENT("CANARY_25_PERCENT"),
    
    BLUE_GREEN("BLUE_GREEN");

    private String value;

    StrategyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StrategyEnum strategy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private ReleaseTrainWavesInnerGateResult gateResult;

  public ReleaseTrainWavesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReleaseTrainWavesInner(Integer waveNumber, String name, StatusEnum status, List<String> repositories) {
    this.waveNumber = waveNumber;
    this.name = name;
    this.status = status;
    this.repositories = repositories;
  }

  public ReleaseTrainWavesInner waveNumber(Integer waveNumber) {
    this.waveNumber = waveNumber;
    return this;
  }

  /**
   * Get waveNumber
   * @return waveNumber
  */
  @NotNull   @Schema(name = "waveNumber", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("waveNumber")
  public Integer getWaveNumber() {
    return waveNumber;
  }

  public void setWaveNumber(Integer waveNumber) {
    this.waveNumber = waveNumber;
  }

  public ReleaseTrainWavesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull   @Schema(name = "name", example = "foundation-libs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReleaseTrainWavesInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "PASSED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ReleaseTrainWavesInner repositories(List<String> repositories) {
    this.repositories = repositories;
    return this;
  }

  public ReleaseTrainWavesInner addRepositoriesItem(String repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

  /**
   * Get repositories
   * @return repositories
  */
  @NotNull   @Schema(name = "repositories", example = "[\"forgesphere/discount-engine\"]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("repositories")
  public List<String> getRepositories() {
    return repositories;
  }

  public void setRepositories(List<String> repositories) {
    this.repositories = repositories;
  }

  public ReleaseTrainWavesInner strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
  */
    @Schema(name = "strategy", example = "CANARY_5_PERCENT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("strategy")
  public StrategyEnum getStrategy() {
    return strategy;
  }

  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }

  public ReleaseTrainWavesInner startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @Valid   @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public ReleaseTrainWavesInner completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public ReleaseTrainWavesInner gateResult(ReleaseTrainWavesInnerGateResult gateResult) {
    this.gateResult = gateResult;
    return this;
  }

  /**
   * Get gateResult
   * @return gateResult
  */
  @Valid   @Schema(name = "gateResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gateResult")
  public ReleaseTrainWavesInnerGateResult getGateResult() {
    return gateResult;
  }

  public void setGateResult(ReleaseTrainWavesInnerGateResult gateResult) {
    this.gateResult = gateResult;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseTrainWavesInner releaseTrainWavesInner = (ReleaseTrainWavesInner) o;
    return Objects.equals(this.waveNumber, releaseTrainWavesInner.waveNumber) &&
        Objects.equals(this.name, releaseTrainWavesInner.name) &&
        Objects.equals(this.status, releaseTrainWavesInner.status) &&
        Objects.equals(this.repositories, releaseTrainWavesInner.repositories) &&
        Objects.equals(this.strategy, releaseTrainWavesInner.strategy) &&
        Objects.equals(this.startedAt, releaseTrainWavesInner.startedAt) &&
        Objects.equals(this.completedAt, releaseTrainWavesInner.completedAt) &&
        Objects.equals(this.gateResult, releaseTrainWavesInner.gateResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waveNumber, name, status, repositories, strategy, startedAt, completedAt, gateResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTrainWavesInner {\n");
    sb.append("    waveNumber: ").append(toIndentedString(waveNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    gateResult: ").append(toIndentedString(gateResult)).append("\n");
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

