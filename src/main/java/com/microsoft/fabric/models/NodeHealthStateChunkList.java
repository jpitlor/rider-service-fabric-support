package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of node health state chunks in the cluster that respect the input filters in the chunk query. Returned by
 * get cluster health state chunks query.
 */
@Fluent
public final class NodeHealthStateChunkList extends EntityHealthStateChunkList {
    /*
     * The list of node health state chunks that respect the input filters in
     * the chunk query.
     */
    @JsonProperty(value = "Items")
    private List<NodeHealthStateChunk> items;

    /**
     * Get the items property: The list of node health state chunks that respect the input filters in the chunk query.
     *
     * @return the items value.
     */
    public List<NodeHealthStateChunk> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The list of node health state chunks that respect the input filters in the chunk query.
     *
     * @param items the items value to set.
     * @return the NodeHealthStateChunkList object itself.
     */
    public NodeHealthStateChunkList setItems(List<NodeHealthStateChunk> items) {
        this.items = items;
        return this;
    }
}
