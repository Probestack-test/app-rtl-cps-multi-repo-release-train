package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.ReleaseTrainRepositoriesInner;
import com.probestack.forgestudio.design.model.ReleaseTrainWavesInner;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReleaseTrain
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class ReleaseTrain {

  private UUID trainId;

  private String trainName;

  private String description;

  /**
   * Gets or Sets environment
   */
  public enum EnvironmentEnum {
    STAGING("STAGING"),
    
    PRODUCTION("PRODUCTION");

    private String value;

    EnvironmentEnum(String value) {
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
    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnvironmentEnum environment;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    VALIDATING("VALIDATING"),
    
    READY("READY"),
    
    RUNNING("RUNNING"),
    
    PAUSED("PAUSED"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
    ROLLING_BACK("ROLLING_BACK"),
    
    ROLLED_BACK("ROLLED_BACK"),
    
    ABORTED("ABORTED");

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate targetReleaseDate;

  private Integer currentWave;

  private Integer totalWaves;

  private Integer progressPercent;

  @Valid
  private List<@Valid ReleaseTrainRepositoriesInner> repositories = new ArrayList<>();

  @Valid
  private List<@Valid ReleaseTrainWavesInner> waves = new ArrayList<>();

  /**
   * Gets or Sets rollbackPolicy
   */
  public enum RollbackPolicyEnum {
    ROLLBACK_ALL("ROLLBACK_ALL"),
    
    ROLLBACK_WAVE("ROLLBACK_WAVE"),
    
    ROLLBACK_FAILED_ONLY("ROLLBACK_FAILED_ONLY"),
    
    MANUAL("MANUAL");

    private String value;

    RollbackPolicyEnum(String value) {
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
    public static RollbackPolicyEnum fromValue(String value) {
      for (RollbackPolicyEnum b : RollbackPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RollbackPolicyEnum rollbackPolicy;

  private String owner;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  @Valid
  private List<String> blockers;

  public ReleaseTrain() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReleaseTrain(UUID trainId, String trainName, EnvironmentEnum environment, StatusEnum status, Integer currentWave, Integer totalWaves, List<@Valid ReleaseTrainRepositoriesInner> repositories, List<@Valid ReleaseTrainWavesInner> waves, OffsetDateTime createdAt) {
    this.trainId = trainId;
    this.trainName = trainName;
    this.environment = environment;
    this.status = status;
    this.currentWave = currentWave;
    this.totalWaves = totalWaves;
    this.repositories = repositories;
    this.waves = waves;
    this.createdAt = createdAt;
  }

  public ReleaseTrain trainId(UUID trainId) {
    this.trainId = trainId;
    return this;
  }

  /**
   * Get trainId
   * @return trainId
  */
  @NotNull @Valid   @Schema(name = "trainId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trainId")
  public UUID getTrainId() {
    return trainId;
  }

  public void setTrainId(UUID trainId) {
    this.trainId = trainId;
  }

  public ReleaseTrain trainName(String trainName) {
    this.trainName = trainName;
    return this;
  }

  /**
   * Get trainName
   * @return trainName
  */
  @NotNull   @Schema(name = "trainName", example = "payment-platform-v2.5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trainName")
  public String getTrainName() {
    return trainName;
  }

  public void setTrainName(String trainName) {
    this.trainName = trainName;
  }

  public ReleaseTrain description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "Q4 payment platform release with new discount engine.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReleaseTrain environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public ReleaseTrain status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "RUNNING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ReleaseTrain targetReleaseDate(LocalDate targetReleaseDate) {
    this.targetReleaseDate = targetReleaseDate;
    return this;
  }

  /**
   * Get targetReleaseDate
   * @return targetReleaseDate
  */
  @Valid   @Schema(name = "targetReleaseDate", example = "Thu Oct 15 00:00:00 GMT 2026", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetReleaseDate")
  public LocalDate getTargetReleaseDate() {
    return targetReleaseDate;
  }

  public void setTargetReleaseDate(LocalDate targetReleaseDate) {
    this.targetReleaseDate = targetReleaseDate;
  }

  public ReleaseTrain currentWave(Integer currentWave) {
    this.currentWave = currentWave;
    return this;
  }

  /**
   * Wave currently being deployed (1-indexed, 0 if not started).
   * @return currentWave
  */
  @NotNull   @Schema(name = "currentWave", example = "2", description = "Wave currently being deployed (1-indexed, 0 if not started).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentWave")
  public Integer getCurrentWave() {
    return currentWave;
  }

  public void setCurrentWave(Integer currentWave) {
    this.currentWave = currentWave;
  }

  public ReleaseTrain totalWaves(Integer totalWaves) {
    this.totalWaves = totalWaves;
    return this;
  }

  /**
   * Get totalWaves
   * @return totalWaves
  */
  @NotNull   @Schema(name = "totalWaves", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalWaves")
  public Integer getTotalWaves() {
    return totalWaves;
  }

  public void setTotalWaves(Integer totalWaves) {
    this.totalWaves = totalWaves;
  }

  public ReleaseTrain progressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Get progressPercent
   * @return progressPercent
  */
    @Schema(name = "progressPercent", example = "62", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressPercent")
  public Integer getProgressPercent() {
    return progressPercent;
  }

  public void setProgressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
  }

  public ReleaseTrain repositories(List<@Valid ReleaseTrainRepositoriesInner> repositories) {
    this.repositories = repositories;
    return this;
  }

  public ReleaseTrain addRepositoriesItem(ReleaseTrainRepositoriesInner repositoriesItem) {
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
  @NotNull @Valid   @Schema(name = "repositories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("repositories")
  public List<@Valid ReleaseTrainRepositoriesInner> getRepositories() {
    return repositories;
  }

  public void setRepositories(List<@Valid ReleaseTrainRepositoriesInner> repositories) {
    this.repositories = repositories;
  }

  public ReleaseTrain waves(List<@Valid ReleaseTrainWavesInner> waves) {
    this.waves = waves;
    return this;
  }

  public ReleaseTrain addWavesItem(ReleaseTrainWavesInner wavesItem) {
    if (this.waves == null) {
      this.waves = new ArrayList<>();
    }
    this.waves.add(wavesItem);
    return this;
  }

  /**
   * Get waves
   * @return waves
  */
  @NotNull @Valid   @Schema(name = "waves", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("waves")
  public List<@Valid ReleaseTrainWavesInner> getWaves() {
    return waves;
  }

  public void setWaves(List<@Valid ReleaseTrainWavesInner> waves) {
    this.waves = waves;
  }

  public ReleaseTrain rollbackPolicy(RollbackPolicyEnum rollbackPolicy) {
    this.rollbackPolicy = rollbackPolicy;
    return this;
  }

  /**
   * Get rollbackPolicy
   * @return rollbackPolicy
  */
    @Schema(name = "rollbackPolicy", example = "ROLLBACK_WAVE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rollbackPolicy")
  public RollbackPolicyEnum getRollbackPolicy() {
    return rollbackPolicy;
  }

  public void setRollbackPolicy(RollbackPolicyEnum rollbackPolicy) {
    this.rollbackPolicy = rollbackPolicy;
  }

  public ReleaseTrain owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
    @Schema(name = "owner", example = "payments-platform-team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ReleaseTrain createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ReleaseTrain startedAt(OffsetDateTime startedAt) {
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

  public ReleaseTrain completedAt(OffsetDateTime completedAt) {
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

  public ReleaseTrain blockers(List<String> blockers) {
    this.blockers = blockers;
    return this;
  }

  public ReleaseTrain addBlockersItem(String blockersItem) {
    if (this.blockers == null) {
      this.blockers = new ArrayList<>();
    }
    this.blockers.add(blockersItem);
    return this;
  }

  /**
   * Reasons the train cannot proceed.
   * @return blockers
  */
    @Schema(name = "blockers", example = "[\"forgesphere/checkout-service v1.9.0 has not passed tests.\",\"forgesphere/discount-engine dependency conflict detected.\"]", description = "Reasons the train cannot proceed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockers")
  public List<String> getBlockers() {
    return blockers;
  }

  public void setBlockers(List<String> blockers) {
    this.blockers = blockers;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseTrain releaseTrain = (ReleaseTrain) o;
    return Objects.equals(this.trainId, releaseTrain.trainId) &&
        Objects.equals(this.trainName, releaseTrain.trainName) &&
        Objects.equals(this.description, releaseTrain.description) &&
        Objects.equals(this.environment, releaseTrain.environment) &&
        Objects.equals(this.status, releaseTrain.status) &&
        Objects.equals(this.targetReleaseDate, releaseTrain.targetReleaseDate) &&
        Objects.equals(this.currentWave, releaseTrain.currentWave) &&
        Objects.equals(this.totalWaves, releaseTrain.totalWaves) &&
        Objects.equals(this.progressPercent, releaseTrain.progressPercent) &&
        Objects.equals(this.repositories, releaseTrain.repositories) &&
        Objects.equals(this.waves, releaseTrain.waves) &&
        Objects.equals(this.rollbackPolicy, releaseTrain.rollbackPolicy) &&
        Objects.equals(this.owner, releaseTrain.owner) &&
        Objects.equals(this.createdAt, releaseTrain.createdAt) &&
        Objects.equals(this.startedAt, releaseTrain.startedAt) &&
        Objects.equals(this.completedAt, releaseTrain.completedAt) &&
        Objects.equals(this.blockers, releaseTrain.blockers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainId, trainName, description, environment, status, targetReleaseDate, currentWave, totalWaves, progressPercent, repositories, waves, rollbackPolicy, owner, createdAt, startedAt, completedAt, blockers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTrain {\n");
    sb.append("    trainId: ").append(toIndentedString(trainId)).append("\n");
    sb.append("    trainName: ").append(toIndentedString(trainName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetReleaseDate: ").append(toIndentedString(targetReleaseDate)).append("\n");
    sb.append("    currentWave: ").append(toIndentedString(currentWave)).append("\n");
    sb.append("    totalWaves: ").append(toIndentedString(totalWaves)).append("\n");
    sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    waves: ").append(toIndentedString(waves)).append("\n");
    sb.append("    rollbackPolicy: ").append(toIndentedString(rollbackPolicy)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    blockers: ").append(toIndentedString(blockers)).append("\n");
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

