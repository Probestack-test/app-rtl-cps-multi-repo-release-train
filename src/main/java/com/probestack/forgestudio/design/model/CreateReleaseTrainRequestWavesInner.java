package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.CreateReleaseTrainRequestWavesInnerSuccessGate;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateReleaseTrainRequestWavesInner
 */
@JsonTypeName("createReleaseTrain_request_waves_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class CreateReleaseTrainRequestWavesInner {

  private Integer waveNumber;

  private String name;

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

  private CreateReleaseTrainRequestWavesInnerSuccessGate successGate;

  public CreateReleaseTrainRequestWavesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateReleaseTrainRequestWavesInner(Integer waveNumber, String name, List<String> repositories, StrategyEnum strategy) {
    this.waveNumber = waveNumber;
    this.name = name;
    this.repositories = repositories;
    this.strategy = strategy;
  }

  public CreateReleaseTrainRequestWavesInner waveNumber(Integer waveNumber) {
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

  public CreateReleaseTrainRequestWavesInner name(String name) {
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

  public CreateReleaseTrainRequestWavesInner repositories(List<String> repositories) {
    this.repositories = repositories;
    return this;
  }

  public CreateReleaseTrainRequestWavesInner addRepositoriesItem(String repositoriesItem) {
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

  public CreateReleaseTrainRequestWavesInner strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
  */
  @NotNull   @Schema(name = "strategy", example = "CANARY_5_PERCENT", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("strategy")
  public StrategyEnum getStrategy() {
    return strategy;
  }

  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }

  public CreateReleaseTrainRequestWavesInner successGate(CreateReleaseTrainRequestWavesInnerSuccessGate successGate) {
    this.successGate = successGate;
    return this;
  }

  /**
   * Get successGate
   * @return successGate
  */
  @Valid   @Schema(name = "successGate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successGate")
  public CreateReleaseTrainRequestWavesInnerSuccessGate getSuccessGate() {
    return successGate;
  }

  public void setSuccessGate(CreateReleaseTrainRequestWavesInnerSuccessGate successGate) {
    this.successGate = successGate;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReleaseTrainRequestWavesInner createReleaseTrainRequestWavesInner = (CreateReleaseTrainRequestWavesInner) o;
    return Objects.equals(this.waveNumber, createReleaseTrainRequestWavesInner.waveNumber) &&
        Objects.equals(this.name, createReleaseTrainRequestWavesInner.name) &&
        Objects.equals(this.repositories, createReleaseTrainRequestWavesInner.repositories) &&
        Objects.equals(this.strategy, createReleaseTrainRequestWavesInner.strategy) &&
        Objects.equals(this.successGate, createReleaseTrainRequestWavesInner.successGate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waveNumber, name, repositories, strategy, successGate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReleaseTrainRequestWavesInner {\n");
    sb.append("    waveNumber: ").append(toIndentedString(waveNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    successGate: ").append(toIndentedString(successGate)).append("\n");
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

