package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents the health state of the stateless service instance, which contains the instance ID and the aggregated
 * health state.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateless")
@Fluent
public final class StatelessServiceInstanceHealthState extends ReplicaHealthState {
    /*
     * Id of the stateless service instance on the wire this field is called
     * ReplicaId.
     */
    @JsonProperty(value = "ReplicaId")
    private String replicaId;

    /**
     * Get the replicaId property: Id of the stateless service instance on the wire this field is called ReplicaId.
     *
     * @return the replicaId value.
     */
    public String getReplicaId() {
        return this.replicaId;
    }

    /**
     * Set the replicaId property: Id of the stateless service instance on the wire this field is called ReplicaId.
     *
     * @param replicaId the replicaId value to set.
     * @return the StatelessServiceInstanceHealthState object itself.
     */
    public StatelessServiceInstanceHealthState setReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }
}
