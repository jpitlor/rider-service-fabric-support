package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about a partition of a stateless Service Fabric service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateless")
@Fluent
public final class StatelessServicePartitionInfo extends ServicePartitionInfo {
    /*
     * Number of instances of this partition.
     */
    @JsonProperty(value = "InstanceCount")
    private Long instanceCount;

    /*
     * MinInstanceCount is the minimum number of instances that must be up to
     * meet the EnsureAvailability safety check during operations like upgrade
     * or deactivate node.
     * The actual number that is used is max( MinInstanceCount, ceil(
     * MinInstancePercentage/100.0 * InstanceCount) ).
     * Note, if InstanceCount is set to -1, during MinInstanceCount computation
     * -1 is first converted into the number of nodes on which the instances
     * are allowed to be placed according to the placement constraints on the
     * service.
     */
    @JsonProperty(value = "MinInstanceCount")
    private Integer minInstanceCount;

    /*
     * MinInstancePercentage is the minimum percentage of InstanceCount that
     * must be up to meet the EnsureAvailability safety check during operations
     * like upgrade or deactivate node.
     * The actual number that is used is max( MinInstanceCount, ceil(
     * MinInstancePercentage/100.0 * InstanceCount) ).
     * Note, if InstanceCount is set to -1, during MinInstancePercentage
     * computation, -1 is first converted into the number of nodes on which the
     * instances are allowed to be placed according to the placement
     * constraints on the service.
     */
    @JsonProperty(value = "MinInstancePercentage")
    private Integer minInstancePercentage;

    /**
     * Get the instanceCount property: Number of instances of this partition.
     *
     * @return the instanceCount value.
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: Number of instances of this partition.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the StatelessServicePartitionInfo object itself.
     */
    public StatelessServicePartitionInfo setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the minInstanceCount property: MinInstanceCount is the minimum number of instances that must be up to meet
     * the EnsureAvailability safety check during operations like upgrade or deactivate node. The actual number that is
     * used is max( MinInstanceCount, ceil( MinInstancePercentage/100.0 * InstanceCount) ). Note, if InstanceCount is
     * set to -1, during MinInstanceCount computation -1 is first converted into the number of nodes on which the
     * instances are allowed to be placed according to the placement constraints on the service.
     *
     * @return the minInstanceCount value.
     */
    public Integer getMinInstanceCount() {
        return this.minInstanceCount;
    }

    /**
     * Set the minInstanceCount property: MinInstanceCount is the minimum number of instances that must be up to meet
     * the EnsureAvailability safety check during operations like upgrade or deactivate node. The actual number that is
     * used is max( MinInstanceCount, ceil( MinInstancePercentage/100.0 * InstanceCount) ). Note, if InstanceCount is
     * set to -1, during MinInstanceCount computation -1 is first converted into the number of nodes on which the
     * instances are allowed to be placed according to the placement constraints on the service.
     *
     * @param minInstanceCount the minInstanceCount value to set.
     * @return the StatelessServicePartitionInfo object itself.
     */
    public StatelessServicePartitionInfo setMinInstanceCount(Integer minInstanceCount) {
        this.minInstanceCount = minInstanceCount;
        return this;
    }

    /**
     * Get the minInstancePercentage property: MinInstancePercentage is the minimum percentage of InstanceCount that
     * must be up to meet the EnsureAvailability safety check during operations like upgrade or deactivate node. The
     * actual number that is used is max( MinInstanceCount, ceil( MinInstancePercentage/100.0 * InstanceCount) ). Note,
     * if InstanceCount is set to -1, during MinInstancePercentage computation, -1 is first converted into the number of
     * nodes on which the instances are allowed to be placed according to the placement constraints on the service.
     *
     * @return the minInstancePercentage value.
     */
    public Integer getMinInstancePercentage() {
        return this.minInstancePercentage;
    }

    /**
     * Set the minInstancePercentage property: MinInstancePercentage is the minimum percentage of InstanceCount that
     * must be up to meet the EnsureAvailability safety check during operations like upgrade or deactivate node. The
     * actual number that is used is max( MinInstanceCount, ceil( MinInstancePercentage/100.0 * InstanceCount) ). Note,
     * if InstanceCount is set to -1, during MinInstancePercentage computation, -1 is first converted into the number of
     * nodes on which the instances are allowed to be placed according to the placement constraints on the service.
     *
     * @param minInstancePercentage the minInstancePercentage value to set.
     * @return the StatelessServicePartitionInfo object itself.
     */
    public StatelessServicePartitionInfo setMinInstancePercentage(Integer minInstancePercentage) {
        this.minInstancePercentage = minInstancePercentage;
        return this;
    }
}
