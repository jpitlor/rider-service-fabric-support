package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the health state of a node, which contains the node identifier and its aggregated health state. */
@Fluent
public final class NodeHealthState extends EntityHealthState {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * An internal ID used by Service Fabric to uniquely identify a node. Node
     * Id is deterministically generated from node name.
     */
    @JsonProperty(value = "Id")
    private NodeId id;

    /**
     * Get the name property: The name of a Service Fabric node.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of a Service Fabric node.
     *
     * @param name the name value to set.
     * @return the NodeHealthState object itself.
     */
    public NodeHealthState setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: An internal ID used by Service Fabric to uniquely identify a node. Node Id is
     * deterministically generated from node name.
     *
     * @return the id value.
     */
    public NodeId getId() {
        return this.id;
    }

    /**
     * Set the id property: An internal ID used by Service Fabric to uniquely identify a node. Node Id is
     * deterministically generated from node name.
     *
     * @param id the id value to set.
     * @return the NodeHealthState object itself.
     */
    public NodeHealthState setId(NodeId id) {
        this.id = id;
        return this;
    }
}
