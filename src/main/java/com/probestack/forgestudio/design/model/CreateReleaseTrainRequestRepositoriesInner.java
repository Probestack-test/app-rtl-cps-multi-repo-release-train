package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateReleaseTrainRequestRepositoriesInner
 */
@JsonTypeName("createReleaseTrain_request_repositories_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class CreateReleaseTrainRequestRepositoriesInner {

  private String repoId;

  private String requiredVersion;

  private Boolean criticalPath;

  @Valid
  private List<String> dependsOn;

  public CreateReleaseTrainRequestRepositoriesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateReleaseTrainRequestRepositoriesInner(String repoId, String requiredVersion, Boolean criticalPath) {
    this.repoId = repoId;
    this.requiredVersion = requiredVersion;
    this.criticalPath = criticalPath;
  }

  public CreateReleaseTrainRequestRepositoriesInner repoId(String repoId) {
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

  public CreateReleaseTrainRequestRepositoriesInner requiredVersion(String requiredVersion) {
    this.requiredVersion = requiredVersion;
    return this;
  }

  /**
   * Version or commit that must be deployed.
   * @return requiredVersion
  */
  @NotNull   @Schema(name = "requiredVersion", example = "v2.5.0", description = "Version or commit that must be deployed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requiredVersion")
  public String getRequiredVersion() {
    return requiredVersion;
  }

  public void setRequiredVersion(String requiredVersion) {
    this.requiredVersion = requiredVersion;
  }

  public CreateReleaseTrainRequestRepositoriesInner criticalPath(Boolean criticalPath) {
    this.criticalPath = criticalPath;
    return this;
  }

  /**
   * If true, the train blocks if this repo isn't ready.
   * @return criticalPath
  */
  @NotNull   @Schema(name = "criticalPath", example = "true", description = "If true, the train blocks if this repo isn't ready.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("criticalPath")
  public Boolean getCriticalPath() {
    return criticalPath;
  }

  public void setCriticalPath(Boolean criticalPath) {
    this.criticalPath = criticalPath;
  }

  public CreateReleaseTrainRequestRepositoriesInner dependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public CreateReleaseTrainRequestRepositoriesInner addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

  /**
   * Other repos this one depends on.
   * @return dependsOn
  */
    @Schema(name = "dependsOn", example = "[\"forgesphere/discount-engine\"]", description = "Other repos this one depends on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CreateReleaseTrainRequestRepositoriesInner createReleaseTrainRequestRepositoriesInner = (CreateReleaseTrainRequestRepositoriesInner) o;
    return Objects.equals(this.repoId, createReleaseTrainRequestRepositoriesInner.repoId) &&
        Objects.equals(this.requiredVersion, createReleaseTrainRequestRepositoriesInner.requiredVersion) &&
        Objects.equals(this.criticalPath, createReleaseTrainRequestRepositoriesInner.criticalPath) &&
        Objects.equals(this.dependsOn, createReleaseTrainRequestRepositoriesInner.dependsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId, requiredVersion, criticalPath, dependsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReleaseTrainRequestRepositoriesInner {\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    requiredVersion: ").append(toIndentedString(requiredVersion)).append("\n");
    sb.append("    criticalPath: ").append(toIndentedString(criticalPath)).append("\n");
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

