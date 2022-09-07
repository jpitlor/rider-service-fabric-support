package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Chaos Move Primary Fault Scheduled event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosPartitionPrimaryMoveScheduled")
@Fluent
public final class ChaosPartitionPrimaryMoveScheduledEvent extends PartitionEvent {
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
    @JsonProperty(value = "NodeTo", required = true)
    private String nodeTo;

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
     * @return the ChaosPartitionPrimaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionPrimaryMoveScheduledEvent setFaultGroupId(UUID faultGroupId) {
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
     * @return the ChaosPartitionPrimaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionPrimaryMoveScheduledEvent setFaultId(UUID faultId) {
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
     * @return the ChaosPartitionPrimaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionPrimaryMoveScheduledEvent setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the nodeTo property: The name of a Service Fabric node.
     *
     * @return the nodeTo value.
     */
    public String getNodeTo() {
        return this.nodeTo;
    }

    /**
     * Set the nodeTo property: The name of a Service Fabric node.
     *
     * @param nodeTo the nodeTo value to set.
     * @return the ChaosPartitionPrimaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionPrimaryMoveScheduledEvent setNodeTo(String nodeTo) {
        this.nodeTo = nodeTo;
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
     * @return the ChaosPartitionPrimaryMoveScheduledEvent object itself.
     */
    public ChaosPartitionPrimaryMoveScheduledEvent setForcedMove(boolean forcedMove) {
        this.forcedMove = forcedMove;
        return this;
    }
}
