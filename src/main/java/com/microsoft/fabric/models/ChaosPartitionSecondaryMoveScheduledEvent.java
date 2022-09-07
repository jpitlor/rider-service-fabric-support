package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Chaos Move Secondary Fault Scheduled event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosPartitionSecondaryMoveScheduled")
@Fluent
public final class ChaosPartitionSecondaryMoveScheduledEvent extends PartitionEvent {
    /*
     * Id of fault group.
     */
    @JsonProperty(value = "FaultGroupId", required = true)
    private UUID faultGroupId;

    /*
     * Id of fault.
     */
    @JsonProperty(value = "FaultId", required = true)
    private UUID faultId;

    /*
     * Service name.
     */
    @JsonProperty(value = "ServiceName", required = true)
    private String serviceName;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "SourceNode", required = true)
    private String sourceNode;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "DestinationNode", required = true)
    private String destinationNode;

    /*
     * Indicates a forced move.
     */
    @JsonProperty(value = "ForcedMove", required = true)
    private boolean forcedMove;

    /**
     * Get the faultGroupId property: Id of fault group.
     *
     * @return the faultGroupId value.
     */
    public UUID getFaultGroupId() {
        return this.faultGroupId;
    }

    /**
     * Set the faultGroupId property: Id of fault group.
     *
     * @param faultGroupId the faultGroupId value to set.
     * @return the ChaosPartitionSecondaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionSecondaryMoveScheduledEvent setFaultGroupId(UUID faultGroupId) {
        this.faultGroupId = faultGroupId;
        return this;
    }

    /**
     * Get the faultId property: Id of fault.
     *
     * @return the faultId value.
     */
    public UUID getFaultId() {
        return this.faultId;
    }

    /**
     * Set the faultId property: Id of fault.
     *
     * @param faultId the faultId value to set.
     * @return the ChaosPartitionSecondaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionSecondaryMoveScheduledEvent setFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }

    /**
     * Get the serviceName property: Service name.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Service name.
     *
     * @param serviceName the serviceName value to set.
     * @return the ChaosPartitionSecondaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionSecondaryMoveScheduledEvent setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the sourceNode property: The name of a Service Fabric node.
     *
     * @return the sourceNode value.
     */
    public String getSourceNode() {
        return this.sourceNode;
    }

    /**
     * Set the sourceNode property: The name of a Service Fabric node.
     *
     * @param sourceNode the sourceNode value to set.
     * @return the ChaosPartitionSecondaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionSecondaryMoveScheduledEvent setSourceNode(String sourceNode) {
        this.sourceNode = sourceNode;
        return this;
    }

    /**
     * Get the destinationNode property: The name of a Service Fabric node.
     *
     * @return the destinationNode value.
     */
    public String getDestinationNode() {
        return this.destinationNode;
    }

    /**
     * Set the destinationNode property: The name of a Service Fabric node.
     *
     * @param destinationNode the destinationNode value to set.
     * @return the ChaosPartitionSecondaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionSecondaryMoveScheduledEvent setDestinationNode(String destinationNode) {
        this.destinationNode = destinationNode;
        return this;
    }

    /**
     * Get the forcedMove property: Indicates a forced move.
     *
     * @return the forcedMove value.
     */
    public boolean isForcedMove() {
        return this.forcedMove;
    }

    /**
     * Set the forcedMove property: Indicates a forced move.
     *
     * @param forcedMove the forcedMove value to set.
     * @return the ChaosPartitionSecondaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionSecondaryMoveScheduledEvent setForcedMove(boolean forcedMove) {
        this.forcedMove = forcedMove;
        return this;
    }
}
