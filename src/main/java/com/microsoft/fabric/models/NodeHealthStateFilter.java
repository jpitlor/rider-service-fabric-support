package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines matching criteria to determine whether a node should be included in the returned cluster health chunk. One
 * filter can match zero, one or multiple nodes, depending on its properties. Can be specified in the cluster health
 * chunk query description.
 */
@Fluent
public final class NodeHealthStateFilter {
    /*
     * Name of the node that matches the filter. The filter is applied only to
     * the specified node, if it exists.
     * If the node doesn't exist, no node is returned in the cluster health
     * chunk based on this filter.
     * If the node exists, it is included in the cluster health chunk if the
     * health state matches the other filter properties.
     * If not specified, all nodes that match the parent filters (if any) are
     * taken into consideration and matched against the other filter members,
     * like health state filter.
     */
    @JsonProperty(value = "NodeNameFilter")
    private String nodeNameFilter;

    /*
     * The filter for the health state of the nodes. It allows selecting nodes
     * if they match the desired health states.
     * The possible values are integer value of one of the following health
     * states. Only nodes that match the filter are returned. All nodes are
     * used to evaluate the cluster aggregated health state.
     * If not specified, default value is None, unless the node name is
     * specified. If the filter has default value and node name is specified,
     * the matching node is returned.
     * The state values are flag-based enumeration, so the value could be a
     * combination of these values obtained using bitwise 'OR' operator.
     * For example, if the provided value is 6, it matches nodes with
     * HealthState value of OK (2) and Warning (4).
     *
     * - Default - Default value. Matches any HealthState. The value is zero.
     * - None - Filter that doesn't match any HealthState value. Used in order
     * to return no results on a given collection of states. The value is 1.
     * - Ok - Filter that matches input with HealthState value Ok. The value is
     * 2.
     * - Warning - Filter that matches input with HealthState value Warning.
     * The value is 4.
     * - Error - Filter that matches input with HealthState value Error. The
     * value is 8.
     * - All - Filter that matches input with any HealthState value. The value
     * is 65535.
     */
    @JsonProperty(value = "HealthStateFilter")
    private Integer healthStateFilter;

    /**
     * Get the nodeNameFilter property: Name of the node that matches the filter. The filter is applied only to the
     * specified node, if it exists. If the node doesn't exist, no node is returned in the cluster health chunk based on
     * this filter. If the node exists, it is included in the cluster health chunk if the health state matches the other
     * filter properties. If not specified, all nodes that match the parent filters (if any) are taken into
     * consideration and matched against the other filter members, like health state filter.
     *
     * @return the nodeNameFilter value.
     */
    public String getNodeNameFilter() {
        return this.nodeNameFilter;
    }

    /**
     * Set the nodeNameFilter property: Name of the node that matches the filter. The filter is applied only to the
     * specified node, if it exists. If the node doesn't exist, no node is returned in the cluster health chunk based on
     * this filter. If the node exists, it is included in the cluster health chunk if the health state matches the other
     * filter properties. If not specified, all nodes that match the parent filters (if any) are taken into
     * consideration and matched against the other filter members, like health state filter.
     *
     * @param nodeNameFilter the nodeNameFilter value to set.
     * @return the NodeHealthStateFilter object itself.
     */
    public NodeHealthStateFilter setNodeNameFilter(String nodeNameFilter) {
        this.nodeNameFilter = nodeNameFilter;
        return this;
    }

    /**
     * Get the healthStateFilter property: The filter for the health state of the nodes. It allows selecting nodes if
     * they match the desired health states. The possible values are integer value of one of the following health
     * states. Only nodes that match the filter are returned. All nodes are used to evaluate the cluster aggregated
     * health state. If not specified, default value is None, unless the node name is specified. If the filter has
     * default value and node name is specified, the matching node is returned. The state values are flag-based
     * enumeration, so the value could be a combination of these values obtained using bitwise 'OR' operator. For
     * example, if the provided value is 6, it matches nodes with HealthState value of OK (2) and Warning (4).
     *
     * <p>- Default - Default value. Matches any HealthState. The value is zero. - None - Filter that doesn't match any
     * HealthState value. Used in order to return no results on a given collection of states. The value is 1. - Ok -
     * Filter that matches input with HealthState value Ok. The value is 2. - Warning - Filter that matches input with
     * HealthState value Warning. The value is 4. - Error - Filter that matches input with HealthState value Error. The
     * value is 8. - All - Filter that matches input with any HealthState value. The value is 65535.
     *
     * @return the healthStateFilter value.
     */
    public Integer getHealthStateFilter() {
        return this.healthStateFilter;
    }

    /**
     * Set the healthStateFilter property: The filter for the health state of the nodes. It allows selecting nodes if
     * they match the desired health states. The possible values are integer value of one of the following health
     * states. Only nodes that match the filter are returned. All nodes are used to evaluate the cluster aggregated
     * health state. If not specified, default value is None, unless the node name is specified. If the filter has
     * default value and node name is specified, the matching node is returned. The state values are flag-based
     * enumeration, so the value could be a combination of these values obtained using bitwise 'OR' operator. For
     * example, if the provided value is 6, it matches nodes with HealthState value of OK (2) and Warning (4).
     *
     * <p>- Default - Default value. Matches any HealthState. The value is zero. - None - Filter that doesn't match any
     * HealthState value. Used in order to return no results on a given collection of states. The value is 1. - Ok -
     * Filter that matches input with HealthState value Ok. The value is 2. - Warning - Filter that matches input with
     * HealthState value Warning. The value is 4. - Error - Filter that matches input with HealthState value Error. The
     * value is 8. - All - Filter that matches input with any HealthState value. The value is 65535.
     *
     * @param healthStateFilter the healthStateFilter value to set.
     * @return the NodeHealthStateFilter object itself.
     */
    public NodeHealthStateFilter setHealthStateFilter(Integer healthStateFilter) {
        this.healthStateFilter = healthStateFilter;
        return this;
    }
}
