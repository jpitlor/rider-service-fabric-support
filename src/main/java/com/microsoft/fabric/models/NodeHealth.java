package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the health of a Service Fabric node. */
@Fluent
public final class NodeHealth extends EntityHealth {
    /*
     * Name of the node whose health information is described by this object.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Get the name property: Name of the node whose health information is described by this object.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the node whose health information is described by this object.
     *
     * @param name the name value to set.
     * @return the NodeHealth object itself.
     */
    public NodeHealth setName(String name) {
        this.name = name;
        return this;
    }
}
