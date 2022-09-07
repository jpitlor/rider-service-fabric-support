package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about an upgrade unit. */
@Fluent
public final class UpgradeUnitInfo {
    /*
     * The name of the upgrade unit
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The state of the upgrade unit.
     */
    @JsonProperty(value = "State")
    private UpgradeUnitState state;

    /**
     * Get the name property: The name of the upgrade unit.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the upgrade unit.
     *
     * @param name the name value to set.
     * @return the UpgradeUnitInfo object itself.
     */
    public UpgradeUnitInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the state property: The state of the upgrade unit.
     *
     * @return the state value.
     */
    public UpgradeUnitState getState() {
        return this.state;
    }

    /**
     * Set the state property: The state of the upgrade unit.
     *
     * @param state the state value to set.
     * @return the UpgradeUnitInfo object itself.
     */
    public UpgradeUnitInfo setState(UpgradeUnitState state) {
        this.state = state;
        return this;
    }
}
