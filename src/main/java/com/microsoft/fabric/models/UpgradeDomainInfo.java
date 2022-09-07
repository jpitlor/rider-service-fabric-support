package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about an upgrade domain. */
@Fluent
public final class UpgradeDomainInfo {
    /*
     * The name of the upgrade domain
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The state of the upgrade domain.
     */
    @JsonProperty(value = "State")
    private UpgradeDomainState state;

    /**
     * Get the name property: The name of the upgrade domain.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the upgrade domain.
     *
     * @param name the name value to set.
     * @return the UpgradeDomainInfo object itself.
     */
    public UpgradeDomainInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the state property: The state of the upgrade domain.
     *
     * @return the state value.
     */
    public UpgradeDomainState getState() {
        return this.state;
    }

    /**
     * Set the state property: The state of the upgrade domain.
     *
     * @param state the state value to set.
     * @return the UpgradeDomainInfo object itself.
     */
    public UpgradeDomainInfo setState(UpgradeDomainState state) {
        this.state = state;
        return this;
    }
}
