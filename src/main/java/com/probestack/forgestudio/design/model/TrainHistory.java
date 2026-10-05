package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.TrainHistoryEventsInner;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TrainHistory
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")public class TrainHistory {

  private UUID trainId;

  @Valid
  private List<@Valid TrainHistoryEventsInner> events = new ArrayList<>();

  private Integer totalElements;

  private Integer totalPages;

  private Integer page;

  private Integer size;

  public TrainHistory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrainHistory(UUID trainId, List<@Valid TrainHistoryEventsInner> events, Integer totalElements, Integer totalPages) {
    this.trainId = trainId;
    this.events = events;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
  }

  public TrainHistory trainId(UUID trainId) {
    this.trainId = trainId;
    return this;
  }

  /**
   * Get trainId
   * @return trainId
  */
  @NotNull @Valid   @Schema(name = "trainId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trainId")
  public UUID getTrainId() {
    return trainId;
  }

  public void setTrainId(UUID trainId) {
    this.trainId = trainId;
  }

  public TrainHistory events(List<@Valid TrainHistoryEventsInner> events) {
    this.events = events;
    return this;
  }

  public TrainHistory addEventsItem(TrainHistoryEventsInner eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
  */
  @NotNull @Valid   @Schema(name = "events", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("events")
  public List<@Valid TrainHistoryEventsInner> getEvents() {
    return events;
  }

  public void setEvents(List<@Valid TrainHistoryEventsInner> events) {
    this.events = events;
  }

  public TrainHistory totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull   @Schema(name = "totalElements", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public TrainHistory totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull   @Schema(name = "totalPages", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public TrainHistory page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
    @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TrainHistory size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
    @Schema(name = "size", example = "50", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainHistory trainHistory = (TrainHistory) o;
    return Objects.equals(this.trainId, trainHistory.trainId) &&
        Objects.equals(this.events, trainHistory.events) &&
        Objects.equals(this.totalElements, trainHistory.totalElements) &&
        Objects.equals(this.totalPages, trainHistory.totalPages) &&
        Objects.equals(this.page, trainHistory.page) &&
        Objects.equals(this.size, trainHistory.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainId, events, totalElements, totalPages, page, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainHistory {\n");
    sb.append("    trainId: ").append(toIndentedString(trainId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

