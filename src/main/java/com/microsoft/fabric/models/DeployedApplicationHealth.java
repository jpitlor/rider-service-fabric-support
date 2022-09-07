package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the health of an application deployed on a Service Fabric node. */
@Fluent
public final class DeployedApplicationHealth extends EntityHealth {
    /*
     * Name of the application deployed on the node whose health information is
     * described by this object.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * Name of the node where this application is deployed.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * Deployed service package health states for the current deployed
     * application as found in the health store.
     */
    @JsonProperty(value = "DeployedServicePackageHealthStates")
    private List<DeployedServicePackageHealthState> deployedServicePackageHealthStates;

    /**
     * Get the name property: Name of the application deployed on the node whose health information is described by this
     * object.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the application deployed on the node whose health information is described by this
     * object.
     *
     * @param name the name value to set.
     * @return the DeployedApplicationHealth object itself.
     */
    public DeployedApplicationHealth setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the nodeName property: Name of the node where this application is deployed.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Name of the node where this application is deployed.
     *
     * @param nodeName the nodeName value to set.
     * @return the DeployedApplicationHealth object itself.
     */
    public DeployedApplicationHealth setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the deployedServicePackageHealthStates property: Deployed service package health states for the current
     * deployed application as found in the health store.
     *
     * @return the deployedServicePackageHealthStates value.
     */
    public List<DeployedServicePackageHealthState> getDeployedServicePackageHealthStates() {
        return this.deployedServicePackageHealthStates;
    }

    /**
     * Set the deployedServicePackageHealthStates property: Deployed service package health states for the current
     * deployed application as found in the health store.
     *
     * @param deployedServicePackageHealthStates the deployedServicePackageHealthStates value to set.
     * @return the DeployedApplicationHealth object itself.
     */
    public DeployedApplicationHealth setDeployedServicePackageHealthStates(
            List<DeployedServicePackageHealthState> deployedServicePackageHealthStates) {
        this.deployedServicePackageHealthStates = deployedServicePackageHealthStates;
        return this;
    }
}
