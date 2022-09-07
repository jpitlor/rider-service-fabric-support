package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Node Deactivate Started event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeDeactivateStarted")
@Fluent
public final class NodeDeactivateStartedEvent extends NodeEvent {
    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /*
     * Batch Id.
     */
    @JsonProperty(value = "BatchId", required = true)
    private String batchId;

    /*
     * Describes deactivate intent.
     */
    @JsonProperty(value = "DeactivateIntent", required = true)
    private String deactivateIntent;

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
     * @return the NodeDeactivateStartedEvent object itself.
     */
    public NodeDeactivateStartedEvent setNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the batchId property: Batch Id.
     *
     * @return the batchId value.
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * Set the batchId property: Batch Id.
     *
     * @param batchId the batchId value to set.
     * @return the NodeDeactivateStartedEvent object itself.
     */
    public NodeDeactivateStartedEvent setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * Get the deactivateIntent property: Describes deactivate intent.
     *
     * @return the deactivateIntent value.
     */
    public String getDeactivateIntent() {
        return this.deactivateIntent;
    }

    /**
     * Set the deactivateIntent property: Describes deactivate intent.
     *
     * @param deactivateIntent the deactivateIntent value to set.
     * @return the NodeDeactivateStartedEvent object itself.
     */
    public NodeDeactivateStartedEvent setDeactivateIntent(String deactivateIntent) {
        this.deactivateIntent = deactivateIntent;
        return this;
    }
}
