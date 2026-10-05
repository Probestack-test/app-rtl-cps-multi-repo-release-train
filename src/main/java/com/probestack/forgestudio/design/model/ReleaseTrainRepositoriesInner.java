package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * ReleaseTrainRepositoriesInner
 */
@JsonTypeName("ReleaseTrain_repositories_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class ReleaseTrainRepositoriesInner {

  private String repoId;

  private String requiredVersion;

  private Boolean criticalPath;

  private Boolean deployed;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deployedAt;

  private String deployedVersion;

  /**
   * Gets or Sets readinessStatus
   */
  public enum ReadinessStatusEnum {
    PENDING("PENDING"),
    
    READY("READY"),
    
    MISSING("MISSING"),
    
    INCOMPATIBLE("INCOMPATIBLE");

    private String value;

    ReadinessStatusEnum(String value) {
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
    public static ReadinessStatusEnum fromValue(String value) {
      for (ReadinessStatusEnum b : ReadinessStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ReadinessStatusEnum readinessStatus;

  @Valid
  private List<String> dependsOn;

  public ReleaseTrainRepositoriesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReleaseTrainRepositoriesInner(String repoId, String requiredVersion, Boolean criticalPath, Boolean deployed) {
    this.repoId = repoId;
    this.requiredVersion = requiredVersion;
    this.criticalPath = criticalPath;
    this.deployed = deployed;
  }

  public ReleaseTrainRepositoriesInner repoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * Get repoId
   * @return repoId
  */
  @NotNull   @Schema(name = "repoId", example = "forgesphere/payment-service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("repoId")
  public String getRepoId() {
    return repoId;
  }

  public void setRepoId(String repoId) {
    this.repoId = repoId;
  }

  public ReleaseTrainRepositoriesInner requiredVersion(String requiredVersion) {
    this.requiredVersion = requiredVersion;
    return this;
  }

  /**
   * Get requiredVersion
   * @return requiredVersion
  */
  @NotNull   @Schema(name = "requiredVersion", example = "v2.5.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requiredVersion")
  public String getRequiredVersion() {
    return requiredVersion;
  }

  public void setRequiredVersion(String requiredVersion) {
    this.requiredVersion = requiredVersion;
  }

  public ReleaseTrainRepositoriesInner criticalPath(Boolean criticalPath) {
    this.criticalPath = criticalPath;
    return this;
  }

  /**
   * Get criticalPath
   * @return criticalPath
  */
  @NotNull   @Schema(name = "criticalPath", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("criticalPath")
  public Boolean getCriticalPath() {
    return criticalPath;
  }

  public void setCriticalPath(Boolean criticalPath) {
    this.criticalPath = criticalPath;
  }

  public ReleaseTrainRepositoriesInner deployed(Boolean deployed) {
    this.deployed = deployed;
    return this;
  }

  /**
   * Get deployed
   * @return deployed
  */
  @NotNull   @Schema(name = "deployed", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deployed")
  public Boolean getDeployed() {
    return deployed;
  }

  public void setDeployed(Boolean deployed) {
    this.deployed = deployed;
  }

  public ReleaseTrainRepositoriesInner deployedAt(OffsetDateTime deployedAt) {
    this.deployedAt = deployedAt;
    return this;
  }

  /**
   * Get deployedAt
   * @return deployedAt
  */
  @Valid   @Schema(name = "deployedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deployedAt")
  public OffsetDateTime getDeployedAt() {
    return deployedAt;
  }

  public void setDeployedAt(OffsetDateTime deployedAt) {
    this.deployedAt = deployedAt;
  }

  public ReleaseTrainRepositoriesInner deployedVersion(String deployedVersion) {
    this.deployedVersion = deployedVersion;
    return this;
  }

  /**
   * Get deployedVersion
   * @return deployedVersion
  */
    @Schema(name = "deployedVersion", example = "v2.5.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deployedVersion")
  public String getDeployedVersion() {
    return deployedVersion;
  }

  public void setDeployedVersion(String deployedVersion) {
    this.deployedVersion = deployedVersion;
  }

  public ReleaseTrainRepositoriesInner readinessStatus(ReadinessStatusEnum readinessStatus) {
    this.readinessStatus = readinessStatus;
    return this;
  }

  /**
   * Get readinessStatus
   * @return readinessStatus
  */
    @Schema(name = "readinessStatus", example = "READY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readinessStatus")
  public ReadinessStatusEnum getReadinessStatus() {
    return readinessStatus;
  }

  public void setReadinessStatus(ReadinessStatusEnum readinessStatus) {
    this.readinessStatus = readinessStatus;
  }

  public ReleaseTrainRepositoriesInner dependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public ReleaseTrainRepositoriesInner addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

  /**
   * Get dependsOn
   * @return dependsOn
  */
    @Schema(name = "dependsOn", example = "[\"forgesphere/discount-engine\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependsOn")
  public List<String> getDependsOn() {
    return dependsOn;
  }

  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseTrainRepositoriesInner releaseTrainRepositoriesInner = (ReleaseTrainRepositoriesInner) o;
    return Objects.equals(this.repoId, releaseTrainRepositoriesInner.repoId) &&
        Objects.equals(this.requiredVersion, releaseTrainRepositoriesInner.requiredVersion) &&
        Objects.equals(this.criticalPath, releaseTrainRepositoriesInner.criticalPath) &&
        Objects.equals(this.deployed, releaseTrainRepositoriesInner.deployed) &&
        Objects.equals(this.deployedAt, releaseTrainRepositoriesInner.deployedAt) &&
        Objects.equals(this.deployedVersion, releaseTrainRepositoriesInner.deployedVersion) &&
        Objects.equals(this.readinessStatus, releaseTrainRepositoriesInner.readinessStatus) &&
        Objects.equals(this.dependsOn, releaseTrainRepositoriesInner.dependsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId, requiredVersion, criticalPath, deployed, deployedAt, deployedVersion, readinessStatus, dependsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTrainRepositoriesInner {\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    requiredVersion: ").append(toIndentedString(requiredVersion)).append("\n");
    sb.append("    criticalPath: ").append(toIndentedString(criticalPath)).append("\n");
    sb.append("    deployed: ").append(toIndentedString(deployed)).append("\n");
    sb.append("    deployedAt: ").append(toIndentedString(deployedAt)).append("\n");
    sb.append("    deployedVersion: ").append(toIndentedString(deployedVersion)).append("\n");
    sb.append("    readinessStatus: ").append(toIndentedString(readinessStatus)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
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

