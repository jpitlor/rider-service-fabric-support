package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the upgrading node and its status. */
@Fluent
public final class NodeUpgradeProgressInfo {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * The state of the upgrading node.
     */
    @JsonProperty(value = "UpgradePhase")
    private NodeUpgradePhase upgradePhase;

    /*
     * List of pending safety checks
     */
    @JsonProperty(value = "PendingSafetyChecks")
    private List<SafetyCheckWrapper> pendingSafetyChecks;

    /*
     * The estimated time spent processing the node since it was deactivated
     * during a node-by-node upgrade.
     */
    @JsonProperty(value = "UpgradeDuration")
    private String upgradeDuration;

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
     * @return the NodeUpgradeProgressInfo object itself.
     */
    public NodeUpgradeProgressInfo setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the upgradePhase property: The state of the upgrading node.
     *
     * @return the upgradePhase value.
     */
    public NodeUpgradePhase getUpgradePhase() {
        return this.upgradePhase;
    }

    /**
     * Set the upgradePhase property: The state of the upgrading node.
     *
     * @param upgradePhase the upgradePhase value to set.
     * @return the NodeUpgradeProgressInfo object itself.
     */
    public NodeUpgradeProgressInfo setUpgradePhase(NodeUpgradePhase upgradePhase) {
        this.upgradePhase = upgradePhase;
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
     * @return the NodeUpgradeProgressInfo object itself.
     */
    public NodeUpgradeProgressInfo setPendingSafetyChecks(List<SafetyCheckWrapper> pendingSafetyChecks) {
        this.pendingSafetyChecks = pendingSafetyChecks;
        return this;
    }

    /**
     * Get the upgradeDuration property: The estimated time spent processing the node since it was deactivated during a
     * node-by-node upgrade.
     *
     * @return the upgradeDuration value.
     */
    public String getUpgradeDuration() {
        return this.upgradeDuration;
    }

    /**
     * Set the upgradeDuration property: The estimated time spent processing the node since it was deactivated during a
     * node-by-node upgrade.
     *
     * @param upgradeDuration the upgradeDuration value to set.
     * @return the NodeUpgradeProgressInfo object itself.
     */
    public NodeUpgradeProgressInfo setUpgradeDuration(String upgradeDuration) {
        this.upgradeDuration = upgradeDuration;
        return this;
    }
}
