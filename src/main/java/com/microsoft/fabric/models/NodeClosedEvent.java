package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Node Closed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeClosed")
@Fluent
public final class NodeClosedEvent extends NodeEvent {
    /*
     * Id of Node.
     */
    @JsonProperty(value = "NodeId", required = true)
    private String nodeId;

    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /*
     * Describes error.
     */
    @JsonProperty(value = "Error", required = true)
    private String error;

    /**
     * Get the nodeId property: Id of Node.
     *
     * @return the nodeId value.
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * Set the nodeId property: Id of Node.
     *
     * @param nodeId the nodeId value to set.
     * @return the NodeClosedEvent object itself.
     */
    public NodeClosedEvent setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get the nodeInstance property: Id of Node instance.
     *
     * @return the nodeInstance value.
     */
    public long getNodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set the nodeInstance property: Id of Node instance.
     *
     * @param nodeInstance the nodeInstance value to set.
     * @return the NodeClosedEvent object itself.
     */
    public NodeClosedEvent setNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the error property: Describes error.
     *
     * @return the error value.
     */
    public String getError() {
        return this.error;
    }

    /**
     * Set the error property: Describes error.
     *
     * @param error the error value to set.
     * @return the NodeClosedEvent object itself.
     */
    public NodeClosedEvent setError(String error) {
        this.error = error;
        return this;
    }
}
