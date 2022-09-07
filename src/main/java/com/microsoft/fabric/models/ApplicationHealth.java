package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents the health of the application. Contains the application aggregated health state and the service and
 * deployed application health states.
 */
@Fluent
public final class ApplicationHealth extends EntityHealth {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * Service health states as found in the health store.
     */
    @JsonProperty(value = "ServiceHealthStates")
    private List<ServiceHealthState> serviceHealthStates;

    /*
     * Deployed application health states as found in the health store.
     */
    @JsonProperty(value = "DeployedApplicationHealthStates")
    private List<DeployedApplicationHealthState> deployedApplicationHealthStates;

    /**
     * Get the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ApplicationHealth object itself.
     */
    public ApplicationHealth setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the serviceHealthStates property: Service health states as found in the health store.
     *
     * @return the serviceHealthStates value.
     */
    public List<ServiceHealthState> getServiceHealthStates() {
        return this.serviceHealthStates;
    }

    /**
     * Set the serviceHealthStates property: Service health states as found in the health store.
     *
     * @param serviceHealthStates the serviceHealthStates value to set.
     * @return the ApplicationHealth object itself.
     */
    public ApplicationHealth setServiceHealthStates(List<ServiceHealthState> serviceHealthStates) {
        this.serviceHealthStates = serviceHealthStates;
        return this;
    }

    /**
     * Get the deployedApplicationHealthStates property: Deployed application health states as found in the health
     * store.
     *
     * @return the deployedApplicationHealthStates value.
     */
    public List<DeployedApplicationHealthState> getDeployedApplicationHealthStates() {
        return this.deployedApplicationHealthStates;
    }

    /**
     * Set the deployedApplicationHealthStates property: Deployed application health states as found in the health
     * store.
     *
     * @param deployedApplicationHealthStates the deployedApplicationHealthStates value to set.
     * @return the ApplicationHealth object itself.
     */
    public ApplicationHealth setDeployedApplicationHealthStates(
            List<DeployedApplicationHealthState> deployedApplicationHealthStates) {
        this.deployedApplicationHealthStates = deployedApplicationHealthStates;
        return this;
    }
}
