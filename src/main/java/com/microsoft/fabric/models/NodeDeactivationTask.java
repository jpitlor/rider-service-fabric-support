package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The task representing the deactivation operation on the node. */
@Fluent
public final class NodeDeactivationTask {
    /*
     * Identity of the task related to deactivation operation on the node.
     */
    @JsonProperty(value = "NodeDeactivationTaskId")
    private NodeDeactivationTaskId nodeDeactivationTaskId;

    /*
     * The intent or the reason for deactivating the node. Following are the
     * possible values for it.
     */
    @JsonProperty(value = "NodeDeactivationIntent")
    private NodeDeactivationIntent nodeDeactivationIntent;

    /**
     * Get the nodeDeactivationTaskId property: Identity of the task related to deactivation operation on the node.
     *
     * @return the nodeDeactivationTaskId value.
     */
    public NodeDeactivationTaskId getNodeDeactivationTaskId() {
        return this.nodeDeactivationTaskId;
    }

    /**
     * Set the nodeDeactivationTaskId property: Identity of the task related to deactivation operation on the node.
     *
     * @param nodeDeactivationTaskId the nodeDeactivationTaskId value to set.
     * @return the NodeDeactivationTask object itself.
     */
    public NodeDeactivationTask setNodeDeactivationTaskId(NodeDeactivationTaskId nodeDeactivationTaskId) {
        this.nodeDeactivationTaskId = nodeDeactivationTaskId;
        return this;
    }

    /**
     * Get the nodeDeactivationIntent property: The intent or the reason for deactivating the node. Following are the
     * possible values for it.
     *
     * @return the nodeDeactivationIntent value.
     */
    public NodeDeactivationIntent getNodeDeactivationIntent() {
        return this.nodeDeactivationIntent;
    }

    /**
     * Set the nodeDeactivationIntent property: The intent or the reason for deactivating the node. Following are the
     * possible values for it.
     *
     * @param nodeDeactivationIntent the nodeDeactivationIntent value to set.
     * @return the NodeDeactivationTask object itself.
     */
    public NodeDeactivationTask setNodeDeactivationIntent(NodeDeactivationIntent nodeDeactivationIntent) {
        this.nodeDeactivationIntent = nodeDeactivationIntent;
        return this;
    }
}
