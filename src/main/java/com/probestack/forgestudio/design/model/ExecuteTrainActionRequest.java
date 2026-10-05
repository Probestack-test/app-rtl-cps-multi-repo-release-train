package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExecuteTrainActionRequest
 */
@JsonTypeName("executeTrainAction_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class ExecuteTrainActionRequest {

  /**
   * Action to perform on the train.
   */
  public enum ActionEnum {
    START("START"),
    
    PAUSE("PAUSE"),
    
    RESUME("RESUME"),
    
    ROLLBACK("ROLLBACK"),
    
    ABORT("ABORT");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ActionEnum action;

  private String reason;

  private Integer targetWave;

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

  public ExecuteTrainActionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExecuteTrainActionRequest(ActionEnum action, String reason) {
    this.action = action;
    this.reason = reason;
  }

  public ExecuteTrainActionRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Action to perform on the train.
   * @return action
  */
  @NotNull   @Schema(name = "action", example = "START", description = "Action to perform on the train.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public ExecuteTrainActionRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the action (min 15 chars).
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "All pre-flight checks passed; starting release.", description = "Reason for the action (min 15 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ExecuteTrainActionRequest targetWave(Integer targetWave) {
    this.targetWave = targetWave;
    return this;
  }

  /**
   * Optional. Start or rollback from a specific wave.
   * @return targetWave
  */
    @Schema(name = "targetWave", example = "1", description = "Optional. Start or rollback from a specific wave.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetWave")
  public Integer getTargetWave() {
    return targetWave;
  }

  public void setTargetWave(Integer targetWave) {
    this.targetWave = targetWave;
  }

  public ExecuteTrainActionRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public ExecuteTrainActionRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify of this action.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Channels to notify of this action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ExecuteTrainActionRequest executeTrainActionRequest = (ExecuteTrainActionRequest) o;
    return Objects.equals(this.action, executeTrainActionRequest.action) &&
        Objects.equals(this.reason, executeTrainActionRequest.reason) &&
        Objects.equals(this.targetWave, executeTrainActionRequest.targetWave) &&
        Objects.equals(this.notifyChannels, executeTrainActionRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, reason, targetWave, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteTrainActionRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    targetWave: ").append(toIndentedString(targetWave)).append("\n");
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

