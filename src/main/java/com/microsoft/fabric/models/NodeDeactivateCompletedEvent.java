package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Node Deactivate Completed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeDeactivateCompleted")
@Fluent
public final class NodeDeactivateCompletedEvent extends NodeEvent {
    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /*
     * Describes deactivate intent.
     */
    @JsonProperty(value = "EffectiveDeactivateIntent", required = true)
    private String effectiveDeactivateIntent;

    /*
     * Batch Ids.
     */
    @JsonProperty(value = "BatchIdsWithDeactivateIntent", required = true)
    private String batchIdsWithDeactivateIntent;

    /*
     * Start time.
     */
    @JsonProperty(value = "StartTime", required = true)
    private OffsetDateTime startTime;

    /**
     * Get the nodeInstance property: Id of Node instance.
     *
     * @return the nodeInstance value.
     */
    public long getNodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set the nodeInstance property: Id of Node instance.
     *
     * @param nodeInstance the nodeInstance value to set.
     * @return the NodeDeactivateCompletedEvent object itself.
     */
    public NodeDeactivateCompletedEvent setNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the effectiveDeactivateIntent property: Describes deactivate intent.
     *
     * @return the effectiveDeactivateIntent value.
     */
    public String getEffectiveDeactivateIntent() {
        return this.effectiveDeactivateIntent;
    }

    /**
     * Set the effectiveDeactivateIntent property: Describes deactivate intent.
     *
     * @param effectiveDeactivateIntent the effectiveDeactivateIntent value to set.
     * @return the NodeDeactivateCompletedEvent object itself.
     */
    public NodeDeactivateCompletedEvent setEffectiveDeactivateIntent(String effectiveDeactivateIntent) {
        this.effectiveDeactivateIntent = effectiveDeactivateIntent;
        return this;
    }

    /**
     * Get the batchIdsWithDeactivateIntent property: Batch Ids.
     *
     * @return the batchIdsWithDeactivateIntent value.
     */
    public String getBatchIdsWithDeactivateIntent() {
        return this.batchIdsWithDeactivateIntent;
    }

    /**
     * Set the batchIdsWithDeactivateIntent property: Batch Ids.
     *
     * @param batchIdsWithDeactivateIntent the batchIdsWithDeactivateIntent value to set.
     * @return the NodeDeactivateCompletedEvent object itself.
     */
    public NodeDeactivateCompletedEvent setBatchIdsWithDeactivateIntent(String batchIdsWithDeactivateIntent) {
        this.batchIdsWithDeactivateIntent = batchIdsWithDeactivateIntent;
        return this;
    }

    /**
     * Get the startTime property: Start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time.
     *
     * @param startTime the startTime value to set.
     * @return the NodeDeactivateCompletedEvent object itself.
     */
    public NodeDeactivateCompletedEvent setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
}
