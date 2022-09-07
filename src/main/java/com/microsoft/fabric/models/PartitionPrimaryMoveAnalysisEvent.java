package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Partition Primary Move Analysis event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("PartitionPrimaryMoveAnalysis")
@Fluent
public final class PartitionPrimaryMoveAnalysisEvent extends PartitionAnalysisEvent {
    /*
     * Time when the move was completed.
     */
    @JsonProperty(value = "WhenMoveCompleted", required = true)
    private OffsetDateTime whenMoveCompleted;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "PreviousNode", required = true)
    private String previousNode;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "CurrentNode", required = true)
    private String currentNode;

    /*
     * Move reason.
     */
    @JsonProperty(value = "MoveReason", required = true)
    private String moveReason;

    /*
     * Relevant traces.
     */
    @JsonProperty(value = "RelevantTraces", required = true)
    private String relevantTraces;

    /**
     * Get the whenMoveCompleted property: Time when the move was completed.
     *
     * @return the whenMoveCompleted value.
     */
    public OffsetDateTime getWhenMoveCompleted() {
        return this.whenMoveCompleted;
    }

    /**
     * Set the whenMoveCompleted property: Time when the move was completed.
     *
     * @param whenMoveCompleted the whenMoveCompleted value to set.
     * @return the PartitionPrimaryMoveAnalysisEvent object itself.
     */
    public PartitionPrimaryMoveAnalysisEvent setWhenMoveCompleted(OffsetDateTime whenMoveCompleted) {
        this.whenMoveCompleted = whenMoveCompleted;
        return this;
    }

    /**
     * Get the previousNode property: The name of a Service Fabric node.
     *
     * @return the previousNode value.
     */
    public String getPreviousNode() {
        return this.previousNode;
    }

    /**
     * Set the previousNode property: The name of a Service Fabric node.
     *
     * @param previousNode the previousNode value to set.
     * @return the PartitionPrimaryMoveAnalysisEvent object itself.
     */
    public PartitionPrimaryMoveAnalysisEvent setPreviousNode(String previousNode) {
        this.previousNode = previousNode;
        return this;
    }

    /**
     * Get the currentNode property: The name of a Service Fabric node.
     *
     * @return the currentNode value.
     */
    public String getCurrentNode() {
        return this.currentNode;
    }

    /**
     * Set the currentNode property: The name of a Service Fabric node.
     *
     * @param currentNode the currentNode value to set.
     * @return the PartitionPrimaryMoveAnalysisEvent object itself.
     */
    public PartitionPrimaryMoveAnalysisEvent setCurrentNode(String currentNode) {
        this.currentNode = currentNode;
        return this;
    }

    /**
     * Get the moveReason property: Move reason.
     *
     * @return the moveReason value.
     */
    public String getMoveReason() {
        return this.moveReason;
    }

    /**
     * Set the moveReason property: Move reason.
     *
     * @param moveReason the moveReason value to set.
     * @return the PartitionPrimaryMoveAnalysisEvent object itself.
     */
    public PartitionPrimaryMoveAnalysisEvent setMoveReason(String moveReason) {
        this.moveReason = moveReason;
        return this;
    }

    /**
     * Get the relevantTraces property: Relevant traces.
     *
     * @return the relevantTraces value.
     */
    public String getRelevantTraces() {
        return this.relevantTraces;
    }

    /**
     * Set the relevantTraces property: Relevant traces.
     *
     * @param relevantTraces the relevantTraces value to set.
     * @return the PartitionPrimaryMoveAnalysisEvent object itself.
     */
    public PartitionPrimaryMoveAnalysisEvent setRelevantTraces(String relevantTraces) {
        this.relevantTraces = relevantTraces;
        return this;
    }
}
