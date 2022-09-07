package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Health policies to evaluate cluster health. */
@Fluent
public final class ClusterHealthPolicies {
    /*
     * Defines a map that contains specific application health policies for
     * different applications.
     * Each entry specifies as key the application name and as value an
     * ApplicationHealthPolicy used to evaluate the application health.
     * If an application is not specified in the map, the application health
     * evaluation uses the ApplicationHealthPolicy found in its application
     * manifest or the default application health policy (if no health policy
     * is defined in the manifest).
     * The map is empty by default.
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap;

    /*
     * Defines a health policy used to evaluate the health of the cluster or of
     * a cluster node.
     */
    @JsonProperty(value = "ClusterHealthPolicy")
    private ClusterHealthPolicy clusterHealthPolicy;

    /**
     * Get the applicationHealthPolicyMap property: Defines a map that contains specific application health policies for
     * different applications. Each entry specifies as key the application name and as value an ApplicationHealthPolicy
     * used to evaluate the application health. If an application is not specified in the map, the application health
     * evaluation uses the ApplicationHealthPolicy found in its application manifest or the default application health
     * policy (if no health policy is defined in the manifest). The map is empty by default.
     *
     * @return the applicationHealthPolicyMap value.
     */
    public List<ApplicationHealthPolicyMapItem> getApplicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set the applicationHealthPolicyMap property: Defines a map that contains specific application health policies for
     * different applications. Each entry specifies as key the application name and as value an ApplicationHealthPolicy
     * used to evaluate the application health. If an application is not specified in the map, the application health
     * evaluation uses the ApplicationHealthPolicy found in its application manifest or the default application health
     * policy (if no health policy is defined in the manifest). The map is empty by default.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set.
     * @return the ClusterHealthPolicies object itself.
     */
    public ClusterHealthPolicies setApplicationHealthPolicyMap(
            List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
        return this;
    }

    /**
     * Get the clusterHealthPolicy property: Defines a health policy used to evaluate the health of the cluster or of a
     * cluster node.
     *
     * @return the clusterHealthPolicy value.
     */
    public ClusterHealthPolicy getClusterHealthPolicy() {
        return this.clusterHealthPolicy;
    }

    /**
     * Set the clusterHealthPolicy property: Defines a health policy used to evaluate the health of the cluster or of a
     * cluster node.
     *
     * @param clusterHealthPolicy the clusterHealthPolicy value to set.
     * @return the ClusterHealthPolicies object itself.
     */
    public ClusterHealthPolicies setClusterHealthPolicy(ClusterHealthPolicy clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }
}
