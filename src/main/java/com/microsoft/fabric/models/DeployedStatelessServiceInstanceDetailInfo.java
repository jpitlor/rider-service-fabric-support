package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a stateless instance running in a code package. Note that DeployedServiceReplicaQueryResult will
 * contain duplicate data like ServiceKind, ServiceName, PartitionId and InstanceId.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateless")
@Fluent
public final class DeployedStatelessServiceInstanceDetailInfo extends DeployedServiceReplicaDetailInfo {
    /*
     * Id of a stateless service instance. InstanceId is used by Service Fabric
     * to uniquely identify an instance of a partition of a stateless service.
     * It is unique within a partition and does not change for the lifetime of
     * the instance. If the instance has failed over on the same or different
     * node, it will get a different value for the InstanceId.
     */
    @JsonProperty(value = "InstanceId")
    private String instanceId;

    /*
     * Information about a stateless service instance deployed on a node.
     */
    @JsonProperty(value = "DeployedServiceReplicaQueryResult")
    private DeployedStatelessServiceInstanceInfo deployedServiceReplicaQueryResult;

    /**
     * Get the instanceId property: Id of a stateless service instance. InstanceId is used by Service Fabric to uniquely
     * identify an instance of a partition of a stateless service. It is unique within a partition and does not change
     * for the lifetime of the instance. If the instance has failed over on the same or different node, it will get a
     * different value for the InstanceId.
     *
     * @return the instanceId value.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Set the instanceId property: Id of a stateless service instance. InstanceId is used by Service Fabric to uniquely
     * identify an instance of a partition of a stateless service. It is unique within a partition and does not change
     * for the lifetime of the instance. If the instance has failed over on the same or different node, it will get a
     * different value for the InstanceId.
     *
     * @param instanceId the instanceId value to set.
     * @return the DeployedStatelessServiceInstanceDetailInfo object itself.
     */
    public DeployedStatelessServiceInstanceDetailInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get the deployedServiceReplicaQueryResult property: Information about a stateless service instance deployed on a
     * node.
     *
     * @return the deployedServiceReplicaQueryResult value.
     */
    public DeployedStatelessServiceInstanceInfo getDeployedServiceReplicaQueryResult() {
        return this.deployedServiceReplicaQueryResult;
    }

    /**
     * Set the deployedServiceReplicaQueryResult property: Information about a stateless service instance deployed on a
     * node.
     *
     * @param deployedServiceReplicaQueryResult the deployedServiceReplicaQueryResult value to set.
     * @return the DeployedStatelessServiceInstanceDetailInfo object itself.
     */
    public DeployedStatelessServiceInstanceDetailInfo setDeployedServiceReplicaQueryResult(
            DeployedStatelessServiceInstanceInfo deployedServiceReplicaQueryResult) {
        this.deployedServiceReplicaQueryResult = deployedServiceReplicaQueryResult;
        return this;
    }
}
