package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Information about the node deactivation. This information is valid for a node that is undergoing deactivation or has
 * already been deactivated.
 */
@Fluent
public final class NodeDeactivationInfo {
    /*
     * The intent or the reason for deactivating the node. Following are the
     * possible values for it.
     */
    @JsonProperty(value = "NodeDeactivationIntent")
    private NodeDeactivationIntent nodeDeactivationIntent;

    /*
     * The status of node deactivation operation. Following are the possible
     * values.
     */
    @JsonProperty(value = "NodeDeactivationStatus")
    private NodeDeactivationStatus nodeDeactivationStatus;

    /*
     * List of tasks representing the deactivation operation on the node.
     */
    @JsonProperty(value = "NodeDeactivationTask")
    private List<NodeDeactivationTask> nodeDeactivationTask;

    /*
     * List of pending safety checks
     */
    @JsonProperty(value = "PendingSafetyChecks")
    private List<SafetyCheckWrapper> pendingSafetyChecks;

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
     * @return the NodeDeactivationInfo object itself.
     */
    public NodeDeactivationInfo setNodeDeactivationIntent(NodeDeactivationIntent nodeDeactivationIntent) {
        this.nodeDeactivationIntent = nodeDeactivationIntent;
        return this;
    }

    /**
     * Get the nodeDeactivationStatus property: The status of node deactivation operation. Following are the possible
     * values.
     *
     * @return the nodeDeactivationStatus value.
     */
    public NodeDeactivationStatus getNodeDeactivationStatus() {
        return this.nodeDeactivationStatus;
    }

    /**
     * Set the nodeDeactivationStatus property: The status of node deactivation operation. Following are the possible
     * values.
     *
     * @param nodeDeactivationStatus the nodeDeactivationStatus value to set.
     * @return the NodeDeactivationInfo object itself.
     */
    public NodeDeactivationInfo setNodeDeactivationStatus(NodeDeactivationStatus nodeDeactivationStatus) {
        this.nodeDeactivationStatus = nodeDeactivationStatus;
        return this;
    }

    /**
     * Get the nodeDeactivationTask property: List of tasks representing the deactivation operation on the node.
     *
     * @return the nodeDeactivationTask value.
     */
    public List<NodeDeactivationTask> getNodeDeactivationTask() {
        return this.nodeDeactivationTask;
    }

    /**
     * Set the nodeDeactivationTask property: List of tasks representing the deactivation operation on the node.
     *
     * @param nodeDeactivationTask the nodeDeactivationTask value to set.
     * @return the NodeDeactivationInfo object itself.
     */
    public NodeDeactivationInfo setNodeDeactivationTask(List<NodeDeactivationTask> nodeDeactivationTask) {
        this.nodeDeactivationTask = nodeDeactivationTask;
        return this;
    }

    /**
     * Get the pendingSafetyChecks property: List of pending safety checks.
     *
     * @return the pendingSafetyChecks value.
     */
    public List<SafetyCheckWrapper> getPendingSafetyChecks() {
        return this.pendingSafetyChecks;
    }

    /**
     * Set the pendingSafetyChecks property: List of pending safety checks.
     *
     * @param pendingSafetyChecks the pendingSafetyChecks value to set.
     * @return the NodeDeactivationInfo object itself.
     */
    public NodeDeactivationInfo setPendingSafetyChecks(List<SafetyCheckWrapper> pendingSafetyChecks) {
        this.pendingSafetyChecks = pendingSafetyChecks;
        return this;
    }
}
