package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for resuming an unmonitored manual Service Fabric application upgrade. */
@Fluent
public final class ResumeApplicationUpgradeDescription {
    /*
     * The name of the upgrade domain in which to resume the upgrade.
     */
    @JsonProperty(value = "UpgradeDomainName", required = true)
    private String upgradeDomainName;

    /**
     * Get the upgradeDomainName property: The name of the upgrade domain in which to resume the upgrade.
     *
     * @return the upgradeDomainName value.
     */
    public String getUpgradeDomainName() {
        return this.upgradeDomainName;
    }

    /**
     * Set the upgradeDomainName property: The name of the upgrade domain in which to resume the upgrade.
     *
     * @param upgradeDomainName the upgradeDomainName value to set.
     * @return the ResumeApplicationUpgradeDescription object itself.
     */
    public ResumeApplicationUpgradeDescription setUpgradeDomainName(String upgradeDomainName) {
        this.upgradeDomainName = upgradeDomainName;
        return this;
    }
}
