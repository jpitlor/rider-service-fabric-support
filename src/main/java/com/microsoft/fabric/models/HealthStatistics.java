package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The health statistics of an entity, returned as part of the health query result when the query description is
 * configured to include statistics. The statistics include health state counts for all children types of the current
 * entity. For example, for cluster, the health statistics include health state counts for nodes, applications,
 * services, partitions, replicas, deployed applications and deployed service packages. For partition, the health
 * statistics include health counts for replicas.
 */
@Fluent
public final class HealthStatistics {
    /*
     * List of health state counts per entity kind, which keeps track of how
     * many children of the queried entity are in Ok, Warning and Error state.
     */
    @JsonProperty(value = "HealthStateCountList")
    private List<EntityKindHealthStateCount> healthStateCountList;

    /**
     * Get the healthStateCountList property: List of health state counts per entity kind, which keeps track of how many
     * children of the queried entity are in Ok, Warning and Error state.
     *
     * @return the healthStateCountList value.
     */
    public List<EntityKindHealthStateCount> getHealthStateCountList() {
        return this.healthStateCountList;
    }

    /**
     * Set the healthStateCountList property: List of health state counts per entity kind, which keeps track of how many
     * children of the queried entity are in Ok, Warning and Error state.
     *
     * @param healthStateCountList the healthStateCountList value to set.
     * @return the HealthStatistics object itself.
     */
    public HealthStatistics setHealthStateCountList(List<EntityKindHealthStateCount> healthStateCountList) {
        this.healthStateCountList = healthStateCountList;
        return this;
    }
}
