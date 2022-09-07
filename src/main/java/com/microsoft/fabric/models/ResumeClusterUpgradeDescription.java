package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for resuming a cluster upgrade. */
@Fluent
public final class ResumeClusterUpgradeDescription {
    /*
     * The next upgrade domain for this cluster upgrade.
     */
    @JsonProperty(value = "UpgradeDomain", required = true)
    private String upgradeDomain;

    /**
     * Get the upgradeDomain property: The next upgrade domain for this cluster upgrade.
     *
     * @return the upgradeDomain value.
     */
    public String getUpgradeDomain() {
        return this.upgradeDomain;
    }

    /**
     * Set the upgradeDomain property: The next upgrade domain for this cluster upgrade.
     *
     * @param upgradeDomain the upgradeDomain value to set.
     * @return the ResumeClusterUpgradeDescription object itself.
     */
    public ResumeClusterUpgradeDescription setUpgradeDomain(String upgradeDomain) {
        this.upgradeDomain = upgradeDomain;
        return this;
    }
}
