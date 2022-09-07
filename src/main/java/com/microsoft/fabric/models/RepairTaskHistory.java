package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * A record of the times when the repair task entered each state.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@Fluent
public final class RepairTaskHistory {
    /*
     * The time when the repair task entered the Created state.
     */
    @JsonProperty(value = "CreatedUtcTimestamp")
    private OffsetDateTime createdUtcTimestamp;

    /*
     * The time when the repair task entered the Claimed state.
     */
    @JsonProperty(value = "ClaimedUtcTimestamp")
    private OffsetDateTime claimedUtcTimestamp;

    /*
     * The time when the repair task entered the Preparing state.
     */
    @JsonProperty(value = "PreparingUtcTimestamp")
    private OffsetDateTime preparingUtcTimestamp;

    /*
     * The time when the repair task entered the Approved state
     */
    @JsonProperty(value = "ApprovedUtcTimestamp")
    private OffsetDateTime approvedUtcTimestamp;

    /*
     * The time when the repair task entered the Executing state
     */
    @JsonProperty(value = "ExecutingUtcTimestamp")
    private OffsetDateTime executingUtcTimestamp;

    /*
     * The time when the repair task entered the Restoring state
     */
    @JsonProperty(value = "RestoringUtcTimestamp")
    private OffsetDateTime restoringUtcTimestamp;

    /*
     * The time when the repair task entered the Completed state
     */
    @JsonProperty(value = "CompletedUtcTimestamp")
    private OffsetDateTime completedUtcTimestamp;

    /*
     * The time when the repair task started the health check in the Preparing
     * state.
     */
    @JsonProperty(value = "PreparingHealthCheckStartUtcTimestamp")
    private OffsetDateTime preparingHealthCheckStartUtcTimestamp;

    /*
     * The time when the repair task completed the health check in the
     * Preparing state.
     */
    @JsonProperty(value = "PreparingHealthCheckEndUtcTimestamp")
    private OffsetDateTime preparingHealthCheckEndUtcTimestamp;

    /*
     * The time when the repair task started the health check in the Restoring
     * state.
     */
    @JsonProperty(value = "RestoringHealthCheckStartUtcTimestamp")
    private OffsetDateTime restoringHealthCheckStartUtcTimestamp;

    /*
     * The time when the repair task completed the health check in the
     * Restoring state.
     */
    @JsonProperty(value = "RestoringHealthCheckEndUtcTimestamp")
    private OffsetDateTime restoringHealthCheckEndUtcTimestamp;

    /**
     * Get the createdUtcTimestamp property: The time when the repair task entered the Created state.
     *
     * @return the createdUtcTimestamp value.
     */
    public OffsetDateTime getCreatedUtcTimestamp() {
        return this.createdUtcTimestamp;
    }

    /**
     * Set the createdUtcTimestamp property: The time when the repair task entered the Created state.
     *
     * @param createdUtcTimestamp the createdUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setCreatedUtcTimestamp(OffsetDateTime createdUtcTimestamp) {
        this.createdUtcTimestamp = createdUtcTimestamp;
        return this;
    }

    /**
     * Get the claimedUtcTimestamp property: The time when the repair task entered the Claimed state.
     *
     * @return the claimedUtcTimestamp value.
     */
    public OffsetDateTime getClaimedUtcTimestamp() {
        return this.claimedUtcTimestamp;
    }

    /**
     * Set the claimedUtcTimestamp property: The time when the repair task entered the Claimed state.
     *
     * @param claimedUtcTimestamp the claimedUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setClaimedUtcTimestamp(OffsetDateTime claimedUtcTimestamp) {
        this.claimedUtcTimestamp = claimedUtcTimestamp;
        return this;
    }

    /**
     * Get the preparingUtcTimestamp property: The time when the repair task entered the Preparing state.
     *
     * @return the preparingUtcTimestamp value.
     */
    public OffsetDateTime getPreparingUtcTimestamp() {
        return this.preparingUtcTimestamp;
    }

    /**
     * Set the preparingUtcTimestamp property: The time when the repair task entered the Preparing state.
     *
     * @param preparingUtcTimestamp the preparingUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setPreparingUtcTimestamp(OffsetDateTime preparingUtcTimestamp) {
        this.preparingUtcTimestamp = preparingUtcTimestamp;
        return this;
    }

    /**
     * Get the approvedUtcTimestamp property: The time when the repair task entered the Approved state.
     *
     * @return the approvedUtcTimestamp value.
     */
    public OffsetDateTime getApprovedUtcTimestamp() {
        return this.approvedUtcTimestamp;
    }

    /**
     * Set the approvedUtcTimestamp property: The time when the repair task entered the Approved state.
     *
     * @param approvedUtcTimestamp the approvedUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setApprovedUtcTimestamp(OffsetDateTime approvedUtcTimestamp) {
        this.approvedUtcTimestamp = approvedUtcTimestamp;
        return this;
    }

    /**
     * Get the executingUtcTimestamp property: The time when the repair task entered the Executing state.
     *
     * @return the executingUtcTimestamp value.
     */
    public OffsetDateTime getExecutingUtcTimestamp() {
        return this.executingUtcTimestamp;
    }

    /**
     * Set the executingUtcTimestamp property: The time when the repair task entered the Executing state.
     *
     * @param executingUtcTimestamp the executingUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setExecutingUtcTimestamp(OffsetDateTime executingUtcTimestamp) {
        this.executingUtcTimestamp = executingUtcTimestamp;
        return this;
    }

    /**
     * Get the restoringUtcTimestamp property: The time when the repair task entered the Restoring state.
     *
     * @return the restoringUtcTimestamp value.
     */
    public OffsetDateTime getRestoringUtcTimestamp() {
        return this.restoringUtcTimestamp;
    }

    /**
     * Set the restoringUtcTimestamp property: The time when the repair task entered the Restoring state.
     *
     * @param restoringUtcTimestamp the restoringUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setRestoringUtcTimestamp(OffsetDateTime restoringUtcTimestamp) {
        this.restoringUtcTimestamp = restoringUtcTimestamp;
        return this;
    }

    /**
     * Get the completedUtcTimestamp property: The time when the repair task entered the Completed state.
     *
     * @return the completedUtcTimestamp value.
     */
    public OffsetDateTime getCompletedUtcTimestamp() {
        return this.completedUtcTimestamp;
    }

    /**
     * Set the completedUtcTimestamp property: The time when the repair task entered the Completed state.
     *
     * @param completedUtcTimestamp the completedUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setCompletedUtcTimestamp(OffsetDateTime completedUtcTimestamp) {
        this.completedUtcTimestamp = completedUtcTimestamp;
        return this;
    }

    /**
     * Get the preparingHealthCheckStartUtcTimestamp property: The time when the repair task started the health check in
     * the Preparing state.
     *
     * @return the preparingHealthCheckStartUtcTimestamp value.
     */
    public OffsetDateTime getPreparingHealthCheckStartUtcTimestamp() {
        return this.preparingHealthCheckStartUtcTimestamp;
    }

    /**
     * Set the preparingHealthCheckStartUtcTimestamp property: The time when the repair task started the health check in
     * the Preparing state.
     *
     * @param preparingHealthCheckStartUtcTimestamp the preparingHealthCheckStartUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setPreparingHealthCheckStartUtcTimestamp(
            OffsetDateTime preparingHealthCheckStartUtcTimestamp) {
        this.preparingHealthCheckStartUtcTimestamp = preparingHealthCheckStartUtcTimestamp;
        return this;
    }

    /**
     * Get the preparingHealthCheckEndUtcTimestamp property: The time when the repair task completed the health check in
     * the Preparing state.
     *
     * @return the preparingHealthCheckEndUtcTimestamp value.
     */
    public OffsetDateTime getPreparingHealthCheckEndUtcTimestamp() {
        return this.preparingHealthCheckEndUtcTimestamp;
    }

    /**
     * Set the preparingHealthCheckEndUtcTimestamp property: The time when the repair task completed the health check in
     * the Preparing state.
     *
     * @param preparingHealthCheckEndUtcTimestamp the preparingHealthCheckEndUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setPreparingHealthCheckEndUtcTimestamp(
            OffsetDateTime preparingHealthCheckEndUtcTimestamp) {
        this.preparingHealthCheckEndUtcTimestamp = preparingHealthCheckEndUtcTimestamp;
        return this;
    }

    /**
     * Get the restoringHealthCheckStartUtcTimestamp property: The time when the repair task started the health check in
     * the Restoring state.
     *
     * @return the restoringHealthCheckStartUtcTimestamp value.
     */
    public OffsetDateTime getRestoringHealthCheckStartUtcTimestamp() {
        return this.restoringHealthCheckStartUtcTimestamp;
    }

    /**
     * Set the restoringHealthCheckStartUtcTimestamp property: The time when the repair task started the health check in
     * the Restoring state.
     *
     * @param restoringHealthCheckStartUtcTimestamp the restoringHealthCheckStartUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setRestoringHealthCheckStartUtcTimestamp(
            OffsetDateTime restoringHealthCheckStartUtcTimestamp) {
        this.restoringHealthCheckStartUtcTimestamp = restoringHealthCheckStartUtcTimestamp;
        return this;
    }

    /**
     * Get the restoringHealthCheckEndUtcTimestamp property: The time when the repair task completed the health check in
     * the Restoring state.
     *
     * @return the restoringHealthCheckEndUtcTimestamp value.
     */
    public OffsetDateTime getRestoringHealthCheckEndUtcTimestamp() {
        return this.restoringHealthCheckEndUtcTimestamp;
    }

    /**
     * Set the restoringHealthCheckEndUtcTimestamp property: The time when the repair task completed the health check in
     * the Restoring state.
     *
     * @param restoringHealthCheckEndUtcTimestamp the restoringHealthCheckEndUtcTimestamp value to set.
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory setRestoringHealthCheckEndUtcTimestamp(
            OffsetDateTime restoringHealthCheckEndUtcTimestamp) {
        this.restoringHealthCheckEndUtcTimestamp = restoringHealthCheckEndUtcTimestamp;
        return this;
    }
}
