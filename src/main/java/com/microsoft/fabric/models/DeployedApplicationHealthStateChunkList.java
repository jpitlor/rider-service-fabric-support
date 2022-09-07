package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of deployed application health state chunks that respect the input filters in the chunk query. Returned by
 * get cluster health state chunks query.
 */
@Fluent
public final class DeployedApplicationHealthStateChunkList {
    /*
     * The list of deployed application health state chunks that respect the
     * input filters in the chunk query.
     */
    @JsonProperty(value = "Items")
    private List<DeployedApplicationHealthStateChunk> items;

    /**
     * Get the items property: The list of deployed application health state chunks that respect the input filters in
     * the chunk query.
     *
     * @return the items value.
     */
    public List<DeployedApplicationHealthStateChunk> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The list of deployed application health state chunks that respect the input filters in
     * the chunk query.
     *
     * @param items the items value to set.
     * @return the DeployedApplicationHealthStateChunkList object itself.
     */
    public DeployedApplicationHealthStateChunkList setItems(List<DeployedApplicationHealthStateChunk> items) {
        this.items = items;
        return this;
    }
}
