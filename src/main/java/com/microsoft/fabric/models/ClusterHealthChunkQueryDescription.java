package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The cluster health chunk query description, which can specify the health policies to evaluate cluster health and very
 * expressive filters to select which cluster entities to include in response.
 */
@Fluent
public final class ClusterHealthChunkQueryDescription {
    /*
     * Defines a list of filters that specify which nodes to be included in the
     * returned cluster health chunk.
     * If no filters are specified, no nodes are returned. All the nodes are
     * used to evaluate the cluster's aggregated health state, regardless of
     * the input filters.
     * The cluster health chunk query may specify multiple node filters.
     * For example, it can specify a filter to return all nodes with health
     * state Error and another filter to always include a node identified by
     * its NodeName.
     */
    @JsonProperty(value = "NodeFilters")
    private List<NodeHealthStateFilter> nodeFilters;

    /*
     * Defines a list of filters that specify which applications to be included
     * in the returned cluster health chunk.
     * If no filters are specified, no applications are returned. All the
     * applications are used to evaluate the cluster's aggregated health state,
     * regardless of the input filters.
     * The cluster health chunk query may specify multiple application filters.
     * For example, it can specify a filter to return all applications with
     * health state Error and another filter to always include applications of
     * a specified application type.
     */
    @JsonProperty(value = "ApplicationFilters")
    private List<ApplicationHealthStateFilter> applicationFilters;

    /*
     * Defines a health policy used to evaluate the health of the cluster or of
     * a cluster node.
     */
    @JsonProperty(value = "ClusterHealthPolicy")
    private ClusterHealthPolicy clusterHealthPolicy;

    /*
     * Defines the application health policy map used to evaluate the health of
     * an application or one of its children entities.
     */
    @JsonProperty(value = "ApplicationHealthPolicies")
    private ApplicationHealthPolicies applicationHealthPolicies;

    /**
     * Get the nodeFilters property: Defines a list of filters that specify which nodes to be included in the returned
     * cluster health chunk. If no filters are specified, no nodes are returned. All the nodes are used to evaluate the
     * cluster's aggregated health state, regardless of the input filters. The cluster health chunk query may specify
     * multiple node filters. For example, it can specify a filter to return all nodes with health state Error and
     * another filter to always include a node identified by its NodeName.
     *
     * @return the nodeFilters value.
     */
    public List<NodeHealthStateFilter> getNodeFilters() {
        return this.nodeFilters;
    }

    /**
     * Set the nodeFilters property: Defines a list of filters that specify which nodes to be included in the returned
     * cluster health chunk. If no filters are specified, no nodes are returned. All the nodes are used to evaluate the
     * cluster's aggregated health state, regardless of the input filters. The cluster health chunk query may specify
     * multiple node filters. For example, it can specify a filter to return all nodes with health state Error and
     * another filter to always include a node identified by its NodeName.
     *
     * @param nodeFilters the nodeFilters value to set.
     * @return the ClusterHealthChunkQueryDescription object itself.
     */
    public ClusterHealthChunkQueryDescription setNodeFilters(List<NodeHealthStateFilter> nodeFilters) {
        this.nodeFilters = nodeFilters;
        return this;
    }

    /**
     * Get the applicationFilters property: Defines a list of filters that specify which applications to be included in
     * the returned cluster health chunk. If no filters are specified, no applications are returned. All the
     * applications are used to evaluate the cluster's aggregated health state, regardless of the input filters. The
     * cluster health chunk query may specify multiple application filters. For example, it can specify a filter to
     * return all applications with health state Error and another filter to always include applications of a specified
     * application type.
     *
     * @return the applicationFilters value.
     */
    public List<ApplicationHealthStateFilter> getApplicationFilters() {
        return this.applicationFilters;
    }

    /**
     * Set the applicationFilters property: Defines a list of filters that specify which applications to be included in
     * the returned cluster health chunk. If no filters are specified, no applications are returned. All the
     * applications are used to evaluate the cluster's aggregated health state, regardless of the input filters. The
     * cluster health chunk query may specify multiple application filters. For example, it can specify a filter to
     * return all applications with health state Error and another filter to always include applications of a specified
     * application type.
     *
     * @param applicationFilters the applicationFilters value to set.
     * @return the ClusterHealthChunkQueryDescription object itself.
     */
    public ClusterHealthChunkQueryDescription setApplicationFilters(
            List<ApplicationHealthStateFilter> applicationFilters) {
        this.applicationFilters = applicationFilters;
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
     * @return the ClusterHealthChunkQueryDescription object itself.
     */
    public ClusterHealthChunkQueryDescription setClusterHealthPolicy(ClusterHealthPolicy clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }

    /**
     * Get the applicationHealthPolicies property: Defines the application health policy map used to evaluate the health
     * of an application or one of its children entities.
     *
     * @return the applicationHealthPolicies value.
     */
    public ApplicationHealthPolicies getApplicationHealthPolicies() {
        return this.applicationHealthPolicies;
    }

    /**
     * Set the applicationHealthPolicies property: Defines the application health policy map used to evaluate the health
     * of an application or one of its children entities.
     *
     * @param applicationHealthPolicies the applicationHealthPolicies value to set.
     * @return the ClusterHealthChunkQueryDescription object itself.
     */
    public ClusterHealthChunkQueryDescription setApplicationHealthPolicies(
            ApplicationHealthPolicies applicationHealthPolicies) {
        this.applicationHealthPolicies = applicationHealthPolicies;
        return this;
    }
}
