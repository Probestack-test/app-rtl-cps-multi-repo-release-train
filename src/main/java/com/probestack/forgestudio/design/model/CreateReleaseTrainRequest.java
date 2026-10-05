package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.CreateReleaseTrainRequestRepositoriesInner;
import com.probestack.forgestudio.design.model.CreateReleaseTrainRequestWavesInner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateReleaseTrainRequest
 */
@JsonTypeName("createReleaseTrain_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class CreateReleaseTrainRequest {

  private String trainName;

  private String description;

  /**
   * Target environment for the train.
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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate targetReleaseDate;

  @Valid
  private List<@Valid CreateReleaseTrainRequestRepositoriesInner> repositories = new ArrayList<>();

  @Valid
  private List<@Valid CreateReleaseTrainRequestWavesInner> waves = new ArrayList<>();

  /**
   * How to roll back if a wave fails.
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
  private RollbackPolicyEnum rollbackPolicy = RollbackPolicyEnum.ROLLBACK_WAVE;

  private String owner;

  /**
   * Gets or Sets notifyChannels
   */
  public enum NotifyChannelsEnum {
    EMAIL("EMAIL"),
    
    SLACK("SLACK"),
    
    PAGERDUTY("PAGERDUTY"),
    
    WEBHOOK("WEBHOOK");

    private String value;

    NotifyChannelsEnum(String value) {
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
    public static NotifyChannelsEnum fromValue(String value) {
      for (NotifyChannelsEnum b : NotifyChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<NotifyChannelsEnum> notifyChannels;

  public CreateReleaseTrainRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateReleaseTrainRequest(String trainName, EnvironmentEnum environment, List<@Valid CreateReleaseTrainRequestRepositoriesInner> repositories, List<@Valid CreateReleaseTrainRequestWavesInner> waves) {
    this.trainName = trainName;
    this.environment = environment;
    this.repositories = repositories;
    this.waves = waves;
  }

  public CreateReleaseTrainRequest trainName(String trainName) {
    this.trainName = trainName;
    return this;
  }

  /**
   * Unique name for this release train.
   * @return trainName
  */
  @NotNull   @Schema(name = "trainName", example = "payment-platform-v2.5", description = "Unique name for this release train.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trainName")
  public String getTrainName() {
    return trainName;
  }

  public void setTrainName(String trainName) {
    this.trainName = trainName;
  }

  public CreateReleaseTrainRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional description of the release scope.
   * @return description
  */
    @Schema(name = "description", example = "Q4 payment platform release with new discount engine.", description = "Optional description of the release scope.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateReleaseTrainRequest environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Target environment for the train.
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", description = "Target environment for the train.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public CreateReleaseTrainRequest targetReleaseDate(LocalDate targetReleaseDate) {
    this.targetReleaseDate = targetReleaseDate;
    return this;
  }

  /**
   * Planned release date.
   * @return targetReleaseDate
  */
  @Valid   @Schema(name = "targetReleaseDate", example = "Thu Oct 15 00:00:00 GMT 2026", description = "Planned release date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetReleaseDate")
  public LocalDate getTargetReleaseDate() {
    return targetReleaseDate;
  }

  public void setTargetReleaseDate(LocalDate targetReleaseDate) {
    this.targetReleaseDate = targetReleaseDate;
  }

  public CreateReleaseTrainRequest repositories(List<@Valid CreateReleaseTrainRequestRepositoriesInner> repositories) {
    this.repositories = repositories;
    return this;
  }

  public CreateReleaseTrainRequest addRepositoriesItem(CreateReleaseTrainRequestRepositoriesInner repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

  /**
   * All repositories participating in this train.
   * @return repositories
  */
  @NotNull @Valid   @Schema(name = "repositories", description = "All repositories participating in this train.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("repositories")
  public List<@Valid CreateReleaseTrainRequestRepositoriesInner> getRepositories() {
    return repositories;
  }

  public void setRepositories(List<@Valid CreateReleaseTrainRequestRepositoriesInner> repositories) {
    this.repositories = repositories;
  }

  public CreateReleaseTrainRequest waves(List<@Valid CreateReleaseTrainRequestWavesInner> waves) {
    this.waves = waves;
    return this;
  }

  public CreateReleaseTrainRequest addWavesItem(CreateReleaseTrainRequestWavesInner wavesItem) {
    if (this.waves == null) {
      this.waves = new ArrayList<>();
    }
    this.waves.add(wavesItem);
    return this;
  }

  /**
   * Ordered deployment waves.
   * @return waves
  */
  @NotNull @Valid   @Schema(name = "waves", description = "Ordered deployment waves.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("waves")
  public List<@Valid CreateReleaseTrainRequestWavesInner> getWaves() {
    return waves;
  }

  public void setWaves(List<@Valid CreateReleaseTrainRequestWavesInner> waves) {
    this.waves = waves;
  }

  public CreateReleaseTrainRequest rollbackPolicy(RollbackPolicyEnum rollbackPolicy) {
    this.rollbackPolicy = rollbackPolicy;
    return this;
  }

  /**
   * How to roll back if a wave fails.
   * @return rollbackPolicy
  */
    @Schema(name = "rollbackPolicy", example = "ROLLBACK_WAVE", description = "How to roll back if a wave fails.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rollbackPolicy")
  public RollbackPolicyEnum getRollbackPolicy() {
    return rollbackPolicy;
  }

  public void setRollbackPolicy(RollbackPolicyEnum rollbackPolicy) {
    this.rollbackPolicy = rollbackPolicy;
  }

  public CreateReleaseTrainRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Team owning this train.
   * @return owner
  */
    @Schema(name = "owner", example = "payments-platform-team", description = "Team owning this train.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public CreateReleaseTrainRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public CreateReleaseTrainRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify on train events.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\",\"PAGERDUTY\"]", description = "Channels to notify on train events.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReleaseTrainRequest createReleaseTrainRequest = (CreateReleaseTrainRequest) o;
    return Objects.equals(this.trainName, createReleaseTrainRequest.trainName) &&
        Objects.equals(this.description, createReleaseTrainRequest.description) &&
        Objects.equals(this.environment, createReleaseTrainRequest.environment) &&
        Objects.equals(this.targetReleaseDate, createReleaseTrainRequest.targetReleaseDate) &&
        Objects.equals(this.repositories, createReleaseTrainRequest.repositories) &&
        Objects.equals(this.waves, createReleaseTrainRequest.waves) &&
        Objects.equals(this.rollbackPolicy, createReleaseTrainRequest.rollbackPolicy) &&
        Objects.equals(this.owner, createReleaseTrainRequest.owner) &&
        Objects.equals(this.notifyChannels, createReleaseTrainRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainName, description, environment, targetReleaseDate, repositories, waves, rollbackPolicy, owner, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReleaseTrainRequest {\n");
    sb.append("    trainName: ").append(toIndentedString(trainName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    targetReleaseDate: ").append(toIndentedString(targetReleaseDate)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    waves: ").append(toIndentedString(waves)).append("\n");
    sb.append("    rollbackPolicy: ").append(toIndentedString(rollbackPolicy)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
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

