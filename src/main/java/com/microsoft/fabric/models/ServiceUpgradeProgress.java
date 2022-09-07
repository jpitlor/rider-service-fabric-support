package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about how many replicas are completed or pending for a specific service during upgrade. */
@Fluent
public final class ServiceUpgradeProgress {
    /*
     * Name of the Service resource.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * The number of replicas that completes the upgrade in the service.
     */
    @JsonProperty(value = "CompletedReplicaCount")
    private String completedReplicaCount;

    /*
     * The number of replicas that are waiting to be upgraded in the service.
     */
    @JsonProperty(value = "PendingReplicaCount")
    private String pendingReplicaCount;

    /**
     * Get the serviceName property: Name of the Service resource.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Name of the Service resource.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceUpgradeProgress object itself.
     */
    public ServiceUpgradeProgress setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the completedReplicaCount property: The number of replicas that completes the upgrade in the service.
     *
     * @return the completedReplicaCount value.
     */
    public String getCompletedReplicaCount() {
        return this.completedReplicaCount;
    }

    /**
     * Set the completedReplicaCount property: The number of replicas that completes the upgrade in the service.
     *
     * @param completedReplicaCount the completedReplicaCount value to set.
     * @return the ServiceUpgradeProgress object itself.
     */
    public ServiceUpgradeProgress setCompletedReplicaCount(String completedReplicaCount) {
        this.completedReplicaCount = completedReplicaCount;
        return this;
    }

    /**
     * Get the pendingReplicaCount property: The number of replicas that are waiting to be upgraded in the service.
     *
     * @return the pendingReplicaCount value.
     */
    public String getPendingReplicaCount() {
        return this.pendingReplicaCount;
    }

    /**
     * Set the pendingReplicaCount property: The number of replicas that are waiting to be upgraded in the service.
     *
     * @param pendingReplicaCount the pendingReplicaCount value to set.
     * @return the ServiceUpgradeProgress object itself.
     */
    public ServiceUpgradeProgress setPendingReplicaCount(String pendingReplicaCount) {
        this.pendingReplicaCount = pendingReplicaCount;
        return this;
    }
}
