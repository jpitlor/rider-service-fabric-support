package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about the identity, status, health, node name, uptime, and other details about the replica. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = ReplicaInfo.class)
@JsonTypeName("ReplicaInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceReplicaInfo.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceInstanceInfo.class)
})
@Fluent
public class ReplicaInfo {
    /*
     * The status of a replica of a service.
     */
    @JsonProperty(value = "ReplicaStatus")
    private ReplicaStatus replicaStatus;

    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * The address the replica is listening on.
     */
    @JsonProperty(value = "Address")
    private String address;

    /*
     * The last in build duration of the replica in seconds.
     */
    @JsonProperty(value = "LastInBuildDurationInSeconds")
    private String lastInBuildDurationInSeconds;

    /**
     * Get the replicaStatus property: The status of a replica of a service.
     *
     * @return the replicaStatus value.
     */
    public ReplicaStatus getReplicaStatus() {
        return this.replicaStatus;
    }

    /**
     * Set the replicaStatus property: The status of a replica of a service.
     *
     * @param replicaStatus the replicaStatus value to set.
     * @return the ReplicaInfo object itself.
     */
    public ReplicaInfo setReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus;
        return this;
    }

    /**
     * Get the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @param healthState the healthState value to set.
     * @return the ReplicaInfo object itself.
     */
    public ReplicaInfo setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the nodeName property: The name of a Service Fabric node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set.
     * @return the ReplicaInfo object itself.
     */
    public ReplicaInfo setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the address property: The address the replica is listening on.
     *
     * @return the address value.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address property: The address the replica is listening on.
     *
     * @param address the address value to set.
     * @return the ReplicaInfo object itself.
     */
    public ReplicaInfo setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the lastInBuildDurationInSeconds property: The last in build duration of the replica in seconds.
     *
     * @return the lastInBuildDurationInSeconds value.
     */
    public String getLastInBuildDurationInSeconds() {
        return this.lastInBuildDurationInSeconds;
    }

    /**
     * Set the lastInBuildDurationInSeconds property: The last in build duration of the replica in seconds.
     *
     * @param lastInBuildDurationInSeconds the lastInBuildDurationInSeconds value to set.
     * @return the ReplicaInfo object itself.
     */
    public ReplicaInfo setLastInBuildDurationInSeconds(String lastInBuildDurationInSeconds) {
        this.lastInBuildDurationInSeconds = lastInBuildDurationInSeconds;
        return this;
    }
}
