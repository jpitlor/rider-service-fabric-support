package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines description for creating a Service Fabric compose deployment. */
@Fluent
public final class CreateComposeDeploymentDescription {
    /*
     * The name of the deployment.
     */
    @JsonProperty(value = "DeploymentName", required = true)
    private String deploymentName;

    /*
     * The content of the compose file that describes the deployment to create.
     */
    @JsonProperty(value = "ComposeFileContent", required = true)
    private String composeFileContent;

    /*
     * Credential information to connect to container registry.
     */
    @JsonProperty(value = "RegistryCredential")
    private RegistryCredential registryCredential;

    /**
     * Get the deploymentName property: The name of the deployment.
     *
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The name of the deployment.
     *
     * @param deploymentName the deploymentName value to set.
     * @return the CreateComposeDeploymentDescription object itself.
     */
    public CreateComposeDeploymentDescription setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * Get the composeFileContent property: The content of the compose file that describes the deployment to create.
     *
     * @return the composeFileContent value.
     */
    public String getComposeFileContent() {
        return this.composeFileContent;
    }

    /**
     * Set the composeFileContent property: The content of the compose file that describes the deployment to create.
     *
     * @param composeFileContent the composeFileContent value to set.
     * @return the CreateComposeDeploymentDescription object itself.
     */
    public CreateComposeDeploymentDescription setComposeFileContent(String composeFileContent) {
        this.composeFileContent = composeFileContent;
        return this;
    }

    /**
     * Get the registryCredential property: Credential information to connect to container registry.
     *
     * @return the registryCredential value.
     */
    public RegistryCredential getRegistryCredential() {
        return this.registryCredential;
    }

    /**
     * Set the registryCredential property: Credential information to connect to container registry.
     *
     * @param registryCredential the registryCredential value to set.
     * @return the CreateComposeDeploymentDescription object itself.
     */
    public CreateComposeDeploymentDescription setRegistryCredential(RegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
        return this;
    }
}
