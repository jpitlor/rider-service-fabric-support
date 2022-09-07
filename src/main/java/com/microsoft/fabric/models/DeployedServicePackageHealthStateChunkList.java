package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of deployed service package health state chunks that respect the input filters in the chunk query. Returned
 * by get cluster health state chunks query.
 */
@Fluent
public final class DeployedServicePackageHealthStateChunkList {
    /*
     * The list of deployed service package health state chunks that respect
     * the input filters in the chunk query.
     */
    @JsonProperty(value = "Items")
    private List<DeployedServicePackageHealthStateChunk> items;

    /**
     * Get the items property: The list of deployed service package health state chunks that respect the input filters
     * in the chunk query.
     *
     * @return the items value.
     */
    public List<DeployedServicePackageHealthStateChunk> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The list of deployed service package health state chunks that respect the input filters
     * in the chunk query.
     *
     * @param items the items value to set.
     * @return the DeployedServicePackageHealthStateChunkList object itself.
     */
    public DeployedServicePackageHealthStateChunkList setItems(List<DeployedServicePackageHealthStateChunk> items) {
        this.items = items;
        return this;
    }
}
