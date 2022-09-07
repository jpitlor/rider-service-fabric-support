package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Chaos Restart Replica Fault Scheduled event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosReplicaRestartScheduled")
@Fluent
public final class ChaosReplicaRestartScheduledEvent extends ReplicaEvent {
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
    @JsonProperty(value = "ServiceUri", required = true)
    private String serviceUri;

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
     * @return the ChaosReplicaRestartScheduledEvent object itself.
     */
    public ChaosReplicaRestartScheduledEvent setFaultGroupId(UUID faultGroupId) {
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
     * @return the ChaosReplicaRestartScheduledEvent object itself.
     */
    public ChaosReplicaRestartScheduledEvent setFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }

    /**
     * Get the serviceUri property: Service name.
     *
     * @return the serviceUri value.
     */
    public String getServiceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: Service name.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the ChaosReplicaRestartScheduledEvent object itself.
     */
    public ChaosReplicaRestartScheduledEvent setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }
}
