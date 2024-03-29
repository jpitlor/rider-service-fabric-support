package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines matching criteria to determine whether a replica should be included as a child of a partition in the cluster
 * health chunk. The replicas are only returned if the parent entities match a filter specified in the cluster health
 * chunk query description. The parent partition, service and application must be included in the cluster health chunk.
 * One filter can match zero, one or multiple replicas, depending on its properties.
 */
@Fluent
public final class ReplicaHealthStateFilter {
    /*
     * Id of the stateful service replica or stateless service instance that
     * matches the filter. The filter is applied only to the specified replica,
     * if it exists.
     * If the replica doesn't exist, no replica is returned in the cluster
     * health chunk based on this filter.
     * If the replica exists, it is included in the cluster health chunk if it
     * respects the other filter properties.
     * If not specified, all replicas that match the parent filters (if any)
     * are taken into consideration and matched against the other filter
     * members, like health state filter.
     */
    @JsonProperty(value = "ReplicaOrInstanceIdFilter")
    private String replicaOrInstanceIdFilter;

    /*
     * The filter for the health state of the replicas. It allows selecting
     * replicas if they match the desired health states.
     * The possible values are integer value of one of the following health
     * states. Only replicas that match the filter are returned. All replicas
     * are used to evaluate the parent partition aggregated health state.
     * If not specified, default value is None, unless the replica ID is
     * specified. If the filter has default value and replica ID is specified,
     * the matching replica is returned.
     * The state values are flag-based enumeration, so the value could be a
     * combination of these values obtained using bitwise 'OR' operator.
     * For example, if the provided value is 6, it matches replicas with
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
     * Get the replicaOrInstanceIdFilter property: Id of the stateful service replica or stateless service instance that
     * matches the filter. The filter is applied only to the specified replica, if it exists. If the replica doesn't
     * exist, no replica is returned in the cluster health chunk based on this filter. If the replica exists, it is
     * included in the cluster health chunk if it respects the other filter properties. If not specified, all replicas
     * that match the parent filters (if any) are taken into consideration and matched against the other filter members,
     * like health state filter.
     *
     * @return the replicaOrInstanceIdFilter value.
     */
    public String getReplicaOrInstanceIdFilter() {
        return this.replicaOrInstanceIdFilter;
    }

    /**
     * Set the replicaOrInstanceIdFilter property: Id of the stateful service replica or stateless service instance that
     * matches the filter. The filter is applied only to the specified replica, if it exists. If the replica doesn't
     * exist, no replica is returned in the cluster health chunk based on this filter. If the replica exists, it is
     * included in the cluster health chunk if it respects the other filter properties. If not specified, all replicas
     * that match the parent filters (if any) are taken into consideration and matched against the other filter members,
     * like health state filter.
     *
     * @param replicaOrInstanceIdFilter the replicaOrInstanceIdFilter value to set.
     * @return the ReplicaHealthStateFilter object itself.
     */
    public ReplicaHealthStateFilter setReplicaOrInstanceIdFilter(String replicaOrInstanceIdFilter) {
        this.replicaOrInstanceIdFilter = replicaOrInstanceIdFilter;
        return this;
    }

    /**
     * Get the healthStateFilter property: The filter for the health state of the replicas. It allows selecting replicas
     * if they match the desired health states. The possible values are integer value of one of the following health
     * states. Only replicas that match the filter are returned. All replicas are used to evaluate the parent partition
     * aggregated health state. If not specified, default value is None, unless the replica ID is specified. If the
     * filter has default value and replica ID is specified, the matching replica is returned. The state values are
     * flag-based enumeration, so the value could be a combination of these values obtained using bitwise 'OR' operator.
     * For example, if the provided value is 6, it matches replicas with HealthState value of OK (2) and Warning (4).
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
     * Set the healthStateFilter property: The filter for the health state of the replicas. It allows selecting replicas
     * if they match the desired health states. The possible values are integer value of one of the following health
     * states. Only replicas that match the filter are returned. All replicas are used to evaluate the parent partition
     * aggregated health state. If not specified, default value is None, unless the replica ID is specified. If the
     * filter has default value and replica ID is specified, the matching replica is returned. The state values are
     * flag-based enumeration, so the value could be a combination of these values obtained using bitwise 'OR' operator.
     * For example, if the provided value is 6, it matches replicas with HealthState value of OK (2) and Warning (4).
     *
     * <p>- Default - Default value. Matches any HealthState. The value is zero. - None - Filter that doesn't match any
     * HealthState value. Used in order to return no results on a given collection of states. The value is 1. - Ok -
     * Filter that matches input with HealthState value Ok. The value is 2. - Warning - Filter that matches input with
     * HealthState value Warning. The value is 4. - Error - Filter that matches input with HealthState value Error. The
     * value is 8. - All - Filter that matches input with any HealthState value. The value is 65535.
     *
     * @param healthStateFilter the healthStateFilter value to set.
     * @return the ReplicaHealthStateFilter object itself.
     */
    public ReplicaHealthStateFilter setHealthStateFilter(Integer healthStateFilter) {
        this.healthStateFilter = healthStateFilter;
        return this;
    }
}
