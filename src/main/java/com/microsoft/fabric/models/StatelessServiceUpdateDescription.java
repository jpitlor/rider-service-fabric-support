package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes an update for a stateless service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateless")
@Fluent
public final class StatelessServiceUpdateDescription extends ServiceUpdateDescription {
    /*
     * The instance count.
     */
    @JsonProperty(value = "InstanceCount")
    private Integer instanceCount;

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

    /*
     * Duration in seconds, to wait before a stateless instance is closed, to
     * allow the active requests to drain gracefully. This would be effective
     * when the instance is closing during the application/cluster upgrade and
     * disabling node.
     * The endpoint exposed on this instance is removed prior to starting the
     * delay, which prevents new connections to this instance.
     * In addition, clients that have subscribed to service endpoint change
     * events(https://docs.microsoft.com/dotnet/api/system.fabric.fabricclient.servicemanagementclient.registerservicenotificationfilterasync),
     * can do
     * the following upon receiving the endpoint removal notification:
     * - Stop sending new requests to this instance.
     * - Close existing connections after in-flight requests have completed.
     * - Connect to a different instance of the service partition for future
     * requests.
     */
    @JsonProperty(value = "InstanceCloseDelayDurationSeconds")
    private String instanceCloseDelayDurationSeconds;

    /*
     * Defines how instances of this service will behave during their
     * lifecycle.
     */
    @JsonProperty(value = "InstanceLifecycleDescription")
    private InstanceLifecycleDescription instanceLifecycleDescription;

    /*
     * When a stateless instance goes down, this timer starts. When it expires
     * Service Fabric will create a new instance on any node in the cluster.
     * This configuration is to reduce unnecessary creation of a new instance
     * in situations where the instance going down is likely to recover in a
     * short time. For example, during an upgrade.
     * The default value is 0, which indicates that when stateless instance
     * goes down, Service Fabric will immediately start building its
     * replacement.
     */
    @JsonProperty(value = "InstanceRestartWaitDurationSeconds")
    private String instanceRestartWaitDurationSeconds;

    /**
     * Get the instanceCount property: The instance count.
     *
     * @return the instanceCount value.
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The instance count.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the StatelessServiceUpdateDescription object itself.
     */
    public StatelessServiceUpdateDescription setInstanceCount(Integer instanceCount) {
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
     * @return the StatelessServiceUpdateDescription object itself.
     */
    public StatelessServiceUpdateDescription setMinInstanceCount(Integer minInstanceCount) {
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
     * @return the StatelessServiceUpdateDescription object itself.
     */
    public StatelessServiceUpdateDescription setMinInstancePercentage(Integer minInstancePercentage) {
        this.minInstancePercentage = minInstancePercentage;
        return this;
    }

    /**
     * Get the instanceCloseDelayDurationSeconds property: Duration in seconds, to wait before a stateless instance is
     * closed, to allow the active requests to drain gracefully. This would be effective when the instance is closing
     * during the application/cluster upgrade and disabling node. The endpoint exposed on this instance is removed prior
     * to starting the delay, which prevents new connections to this instance. In addition, clients that have subscribed
     * to service endpoint change
     * events(https://docs.microsoft.com/dotnet/api/system.fabric.fabricclient.servicemanagementclient.registerservicenotificationfilterasync),
     * can do the following upon receiving the endpoint removal notification: - Stop sending new requests to this
     * instance. - Close existing connections after in-flight requests have completed. - Connect to a different instance
     * of the service partition for future requests.
     *
     * @return the instanceCloseDelayDurationSeconds value.
     */
    public String getInstanceCloseDelayDurationSeconds() {
        return this.instanceCloseDelayDurationSeconds;
    }

    /**
     * Set the instanceCloseDelayDurationSeconds property: Duration in seconds, to wait before a stateless instance is
     * closed, to allow the active requests to drain gracefully. This would be effective when the instance is closing
     * during the application/cluster upgrade and disabling node. The endpoint exposed on this instance is removed prior
     * to starting the delay, which prevents new connections to this instance. In addition, clients that have subscribed
     * to service endpoint change
     * events(https://docs.microsoft.com/dotnet/api/system.fabric.fabricclient.servicemanagementclient.registerservicenotificationfilterasync),
     * can do the following upon receiving the endpoint removal notification: - Stop sending new requests to this
     * instance. - Close existing connections after in-flight requests have completed. - Connect to a different instance
     * of the service partition for future requests.
     *
     * @param instanceCloseDelayDurationSeconds the instanceCloseDelayDurationSeconds value to set.
     * @return the StatelessServiceUpdateDescription object itself.
     */
    public StatelessServiceUpdateDescription setInstanceCloseDelayDurationSeconds(
            String instanceCloseDelayDurationSeconds) {
        this.instanceCloseDelayDurationSeconds = instanceCloseDelayDurationSeconds;
        return this;
    }

    /**
     * Get the instanceLifecycleDescription property: Defines how instances of this service will behave during their
     * lifecycle.
     *
     * @return the instanceLifecycleDescription value.
     */
    public InstanceLifecycleDescription getInstanceLifecycleDescription() {
        return this.instanceLifecycleDescription;
    }

    /**
     * Set the instanceLifecycleDescription property: Defines how instances of this service will behave during their
     * lifecycle.
     *
     * @param instanceLifecycleDescription the instanceLifecycleDescription value to set.
     * @return the StatelessServiceUpdateDescription object itself.
     */
    public StatelessServiceUpdateDescription setInstanceLifecycleDescription(
            InstanceLifecycleDescription instanceLifecycleDescription) {
        this.instanceLifecycleDescription = instanceLifecycleDescription;
        return this;
    }

    /**
     * Get the instanceRestartWaitDurationSeconds property: When a stateless instance goes down, this timer starts. When
     * it expires Service Fabric will create a new instance on any node in the cluster. This configuration is to reduce
     * unnecessary creation of a new instance in situations where the instance going down is likely to recover in a
     * short time. For example, during an upgrade. The default value is 0, which indicates that when stateless instance
     * goes down, Service Fabric will immediately start building its replacement.
     *
     * @return the instanceRestartWaitDurationSeconds value.
     */
    public String getInstanceRestartWaitDurationSeconds() {
        return this.instanceRestartWaitDurationSeconds;
    }

    /**
     * Set the instanceRestartWaitDurationSeconds property: When a stateless instance goes down, this timer starts. When
     * it expires Service Fabric will create a new instance on any node in the cluster. This configuration is to reduce
     * unnecessary creation of a new instance in situations where the instance going down is likely to recover in a
     * short time. For example, during an upgrade. The default value is 0, which indicates that when stateless instance
     * goes down, Service Fabric will immediately start building its replacement.
     *
     * @param instanceRestartWaitDurationSeconds the instanceRestartWaitDurationSeconds value to set.
     * @return the StatelessServiceUpdateDescription object itself.
     */
    public StatelessServiceUpdateDescription setInstanceRestartWaitDurationSeconds(
            String instanceRestartWaitDurationSeconds) {
        this.instanceRestartWaitDurationSeconds = instanceRestartWaitDurationSeconds;
        return this;
    }
}
