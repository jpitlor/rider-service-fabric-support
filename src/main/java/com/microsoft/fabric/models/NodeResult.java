package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains information about a node that was targeted by a user-induced operation. */
@Fluent
public final class NodeResult {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * The node instance id.
     */
    @JsonProperty(value = "NodeInstanceId")
    private String nodeInstanceId;

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
     * @return the NodeResult object itself.
     */
    public NodeResult setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the nodeInstanceId property: The node instance id.
     *
     * @return the nodeInstanceId value.
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set the nodeInstanceId property: The node instance id.
     *
     * @param nodeInstanceId the nodeInstanceId value to set.
     * @return the NodeResult object itself.
     */
    public NodeResult setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
}
