package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A base type for the list of health state chunks found in the cluster. It contains the total number of health states
 * that match the input filters.
 */
@Fluent
public class EntityHealthStateChunkList {
    /*
     * Total number of entity health state objects that match the specified
     * filters from the cluster health chunk query description.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /**
     * Get the totalCount property: Total number of entity health state objects that match the specified filters from
     * the cluster health chunk query description.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of entity health state objects that match the specified filters from
     * the cluster health chunk query description.
     *
     * @param totalCount the totalCount value to set.
     * @return the EntityHealthStateChunkList object itself.
     */
    public EntityHealthStateChunkList setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}
