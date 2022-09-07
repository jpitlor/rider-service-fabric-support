package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about a stateless service instance deployed on a node. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateless")
@Fluent
public final class DeployedStatelessServiceInstanceInfo extends DeployedServiceReplicaInfo {
    /*
     * Id of a stateless service instance. InstanceId is used by Service Fabric
     * to uniquely identify an instance of a partition of a stateless service.
     * It is unique within a partition and does not change for the lifetime of
     * the instance. If the instance has failed over on the same or different
     * node, it will get a different value for the InstanceId.
     */
    @JsonProperty(value = "InstanceId")
    private String instanceId;

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
     * @return the DeployedStatelessServiceInstanceInfo object itself.
     */
    public DeployedStatelessServiceInstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
}
