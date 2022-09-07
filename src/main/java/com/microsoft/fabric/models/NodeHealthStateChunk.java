package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the health state chunk of a node, which contains the node name and its aggregated health state. */
@Fluent
public final class NodeHealthStateChunk extends EntityHealthStateChunk {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /**
     * Get the nodeName property: The name of a Service Fabric node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set.
     * @return the NodeHealthStateChunk object itself.
     */
    public NodeHealthStateChunk setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
}
