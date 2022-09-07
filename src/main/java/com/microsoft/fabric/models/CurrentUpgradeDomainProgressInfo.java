package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the current in-progress upgrade domain. Not applicable to node-by-node upgrades. */
@Fluent
public final class CurrentUpgradeDomainProgressInfo {
    /*
     * The name of the upgrade domain
     */
    @JsonProperty(value = "DomainName")
    private String domainName;

    /*
     * List of upgrading nodes and their statuses
     */
    @JsonProperty(value = "NodeUpgradeProgressList")
    private List<NodeUpgradeProgressInfo> nodeUpgradeProgressList;

    /**
     * Get the domainName property: The name of the upgrade domain.
     *
     * @return the domainName value.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The name of the upgrade domain.
     *
     * @param domainName the domainName value to set.
     * @return the CurrentUpgradeDomainProgressInfo object itself.
     */
    public CurrentUpgradeDomainProgressInfo setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the nodeUpgradeProgressList property: List of upgrading nodes and their statuses.
     *
     * @return the nodeUpgradeProgressList value.
     */
    public List<NodeUpgradeProgressInfo> getNodeUpgradeProgressList() {
        return this.nodeUpgradeProgressList;
    }

    /**
     * Set the nodeUpgradeProgressList property: List of upgrading nodes and their statuses.
     *
     * @param nodeUpgradeProgressList the nodeUpgradeProgressList value to set.
     * @return the CurrentUpgradeDomainProgressInfo object itself.
     */
    public CurrentUpgradeDomainProgressInfo setNodeUpgradeProgressList(
            List<NodeUpgradeProgressInfo> nodeUpgradeProgressList) {
        this.nodeUpgradeProgressList = nodeUpgradeProgressList;
        return this;
    }
}
