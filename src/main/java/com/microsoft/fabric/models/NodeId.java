package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An internal ID used by Service Fabric to uniquely identify a node. Node Id is deterministically generated from node
 * name.
 */
@Fluent
public final class NodeId {
    /*
     * Value of the node Id. This is a 128 bit integer.
     */
    @JsonProperty(value = "Id")
    private String id;

    /**
     * Get the id property: Value of the node Id. This is a 128 bit integer.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Value of the node Id. This is a 128 bit integer.
     *
     * @param id the id value to set.
     * @return the NodeId object itself.
     */
    public NodeId setId(String id) {
        this.id = id;
        return this;
    }
}
