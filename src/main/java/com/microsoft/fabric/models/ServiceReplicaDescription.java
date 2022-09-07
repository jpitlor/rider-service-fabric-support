package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a replica of a service resource. */
@Fluent
public final class ServiceReplicaDescription extends ServiceReplicaProperties {
    /*
     * Name of the replica.
     */
    @JsonProperty(value = "replicaName", required = true)
    private String replicaName;

    /**
     * Get the replicaName property: Name of the replica.
     *
     * @return the replicaName value.
     */
    public String getReplicaName() {
        return this.replicaName;
    }

    /**
     * Set the replicaName property: Name of the replica.
     *
     * @param replicaName the replicaName value to set.
     * @return the ServiceReplicaDescription object itself.
     */
    public ServiceReplicaDescription setReplicaName(String replicaName) {
        this.replicaName = replicaName;
        return this;
    }
}
