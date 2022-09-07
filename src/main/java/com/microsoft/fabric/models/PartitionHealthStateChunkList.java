package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of partition health state chunks that respect the input filters in the chunk query description. Returned by
 * get cluster health state chunks query as part of the parent application hierarchy.
 */
@Fluent
public final class PartitionHealthStateChunkList {
    /*
     * The list of partition health state chunks that respect the input filters
     * in the chunk query.
     */
    @JsonProperty(value = "Items")
    private List<PartitionHealthStateChunk> items;

    /**
     * Get the items property: The list of partition health state chunks that respect the input filters in the chunk
     * query.
     *
     * @return the items value.
     */
    public List<PartitionHealthStateChunk> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The list of partition health state chunks that respect the input filters in the chunk
     * query.
     *
     * @param items the items value to set.
     * @return the PartitionHealthStateChunkList object itself.
     */
    public PartitionHealthStateChunkList setItems(List<PartitionHealthStateChunk> items) {
        this.items = items;
        return this;
    }
}
