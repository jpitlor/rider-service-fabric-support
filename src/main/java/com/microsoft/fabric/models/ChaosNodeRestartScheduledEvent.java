package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Chaos Restart Node Fault Scheduled event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosNodeRestartScheduled")
@Fluent
public final class ChaosNodeRestartScheduledEvent extends NodeEvent {
    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstanceId", required = true)
    private long nodeInstanceId;

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

    /**
     * Get the nodeInstanceId property: Id of Node instance.
     *
     * @return the nodeInstanceId value.
     */
    public long getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set the nodeInstanceId property: Id of Node instance.
     *
     * @param nodeInstanceId the nodeInstanceId value to set.
     * @return the ChaosNodeRestartScheduledEvent object itself.
     */
    public ChaosNodeRestartScheduledEvent setNodeInstanceId(long nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

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
     * @return the ChaosNodeRestartScheduledEvent object itself.
     */
    public ChaosNodeRestartScheduledEvent setFaultGroupId(UUID faultGroupId) {
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
     * @return the ChaosNodeRestartScheduledEvent object itself.
     */
    public ChaosNodeRestartScheduledEvent setFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }
}
