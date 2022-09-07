package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Service state of Service Fabric Upgrade Orchestration Service. */
@Fluent
public final class UpgradeOrchestrationServiceState {
    /*
     * The state of Service Fabric Upgrade Orchestration Service.
     */
    @JsonProperty(value = "ServiceState")
    private String serviceState;

    /**
     * Get the serviceState property: The state of Service Fabric Upgrade Orchestration Service.
     *
     * @return the serviceState value.
     */
    public String getServiceState() {
        return this.serviceState;
    }

    /**
     * Set the serviceState property: The state of Service Fabric Upgrade Orchestration Service.
     *
     * @param serviceState the serviceState value to set.
     * @return the UpgradeOrchestrationServiceState object itself.
     */
    public UpgradeOrchestrationServiceState setServiceState(String serviceState) {
        this.serviceState = serviceState;
        return this;
    }
}
