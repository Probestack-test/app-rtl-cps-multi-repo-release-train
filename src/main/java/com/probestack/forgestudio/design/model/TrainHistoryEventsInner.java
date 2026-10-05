package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TrainHistoryEventsInner
 */
@JsonTypeName("TrainHistory_events_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class TrainHistoryEventsInner {

  private UUID eventId;

  /**
   * Gets or Sets eventType
   */
  public enum EventTypeEnum {
    TRAIN_CREATED("TRAIN_CREATED"),
    
    VALIDATION_PASSED("VALIDATION_PASSED"),
    
    VALIDATION_FAILED("VALIDATION_FAILED"),
    
    WAVE_STARTED("WAVE_STARTED"),
    
    WAVE_COMPLETED("WAVE_COMPLETED"),
    
    GATE_PASSED("GATE_PASSED"),
    
    GATE_FAILED("GATE_FAILED"),
    
    PAUSED("PAUSED"),
    
    RESUMED("RESUMED"),
    
    ROLLBACK_STARTED("ROLLBACK_STARTED"),
    
    ROLLBACK_COMPLETED("ROLLBACK_COMPLETED"),
    
    TRAIN_SUCCEEDED("TRAIN_SUCCEEDED"),
    
    TRAIN_FAILED("TRAIN_FAILED"),
    
    ABORTED("ABORTED");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EventTypeEnum eventType;

  private Integer waveNumber;

  private String repoId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occurredAt;

  private String actor;

  private String detail;

  @Valid
  private Map<String, Object> metadata = new HashMap<>();

  public TrainHistoryEventsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrainHistoryEventsInner(UUID eventId, EventTypeEnum eventType, OffsetDateTime occurredAt, String actor) {
    this.eventId = eventId;
    this.eventType = eventType;
    this.occurredAt = occurredAt;
    this.actor = actor;
  }

  public TrainHistoryEventsInner eventId(UUID eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  */
  @NotNull @Valid   @Schema(name = "eventId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventId")
  public UUID getEventId() {
    return eventId;
  }

  public void setEventId(UUID eventId) {
    this.eventId = eventId;
  }

  public TrainHistoryEventsInner eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  */
  @NotNull   @Schema(name = "eventType", example = "WAVE_COMPLETED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public TrainHistoryEventsInner waveNumber(Integer waveNumber) {
    this.waveNumber = waveNumber;
    return this;
  }

  /**
   * Get waveNumber
   * @return waveNumber
  */
    @Schema(name = "waveNumber", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waveNumber")
  public Integer getWaveNumber() {
    return waveNumber;
  }

  public void setWaveNumber(Integer waveNumber) {
    this.waveNumber = waveNumber;
  }

  public TrainHistoryEventsInner repoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * Get repoId
   * @return repoId
  */
    @Schema(name = "repoId", example = "forgesphere/discount-engine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repoId")
  public String getRepoId() {
    return repoId;
  }

  public void setRepoId(String repoId) {
    this.repoId = repoId;
  }

  public TrainHistoryEventsInner occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Get occurredAt
   * @return occurredAt
  */
  @NotNull @Valid   @Schema(name = "occurredAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("occurredAt")
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  public TrainHistoryEventsInner actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  */
  @NotNull   @Schema(name = "actor", example = "release-bot@forgesphere.example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actor")
  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public TrainHistoryEventsInner detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
    @Schema(name = "detail", example = "Wave 1 deployed successfully in 4m 32s.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public TrainHistoryEventsInner metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public TrainHistoryEventsInner putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
    @Schema(name = "metadata", example = "{\"deployedVersion\":\"v2.5.0\",\"durationSeconds\":272}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainHistoryEventsInner trainHistoryEventsInner = (TrainHistoryEventsInner) o;
    return Objects.equals(this.eventId, trainHistoryEventsInner.eventId) &&
        Objects.equals(this.eventType, trainHistoryEventsInner.eventType) &&
        Objects.equals(this.waveNumber, trainHistoryEventsInner.waveNumber) &&
        Objects.equals(this.repoId, trainHistoryEventsInner.repoId) &&
        Objects.equals(this.occurredAt, trainHistoryEventsInner.occurredAt) &&
        Objects.equals(this.actor, trainHistoryEventsInner.actor) &&
        Objects.equals(this.detail, trainHistoryEventsInner.detail) &&
        Objects.equals(this.metadata, trainHistoryEventsInner.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventType, waveNumber, repoId, occurredAt, actor, detail, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainHistoryEventsInner {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    waveNumber: ").append(toIndentedString(waveNumber)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

