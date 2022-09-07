package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Identity of the task related to deactivation operation on the node. */
@Fluent
public final class NodeDeactivationTaskId {
    /*
     * Value of the task id.
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * The type of the task that performed the node deactivation. Following are
     * the possible values.
     */
    @JsonProperty(value = "NodeDeactivationTaskType")
    private NodeDeactivationTaskType nodeDeactivationTaskType;

    /**
     * Get the id property: Value of the task id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Value of the task id.
     *
     * @param id the id value to set.
     * @return the NodeDeactivationTaskId object itself.
     */
    public NodeDeactivationTaskId setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the nodeDeactivationTaskType property: The type of the task that performed the node deactivation. Following
     * are the possible values.
     *
     * @return the nodeDeactivationTaskType value.
     */
    public NodeDeactivationTaskType getNodeDeactivationTaskType() {
        return this.nodeDeactivationTaskType;
    }

    /**
     * Set the nodeDeactivationTaskType property: The type of the task that performed the node deactivation. Following
     * are the possible values.
     *
     * @param nodeDeactivationTaskType the nodeDeactivationTaskType value to set.
     * @return the NodeDeactivationTaskId object itself.
     */
    public NodeDeactivationTaskId setNodeDeactivationTaskType(NodeDeactivationTaskType nodeDeactivationTaskType) {
        this.nodeDeactivationTaskType = nodeDeactivationTaskType;
        return this;
    }
}
