package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about an application type. */
@Fluent
public final class ApplicationTypeInfo {
    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * List of application type parameters that can be overridden when creating
     * or updating the application.
     */
    @JsonProperty(value = "DefaultParameterList")
    private List<ApplicationParameter> defaultParameterList;

    /*
     * The status of the application type.
     */
    @JsonProperty(value = "Status")
    private ApplicationTypeStatus status;

    /*
     * Additional detailed information about the status of the application
     * type.
     */
    @JsonProperty(value = "StatusDetails")
    private String statusDetails;

    /*
     * The mechanism used to define a Service Fabric application type.
     */
    @JsonProperty(value = "ApplicationTypeDefinitionKind")
    private ApplicationTypeDefinitionKind applicationTypeDefinitionKind;

    /**
     * Get the name property: The application type name as defined in the application manifest.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The application type name as defined in the application manifest.
     *
     * @param name the name value to set.
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: The version of the application type as defined in the application manifest.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the application type as defined in the application manifest.
     *
     * @param version the version value to set.
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the defaultParameterList property: List of application type parameters that can be overridden when creating
     * or updating the application.
     *
     * @return the defaultParameterList value.
     */
    public List<ApplicationParameter> getDefaultParameterList() {
        return this.defaultParameterList;
    }

    /**
     * Set the defaultParameterList property: List of application type parameters that can be overridden when creating
     * or updating the application.
     *
     * @param defaultParameterList the defaultParameterList value to set.
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo setDefaultParameterList(List<ApplicationParameter> defaultParameterList) {
        this.defaultParameterList = defaultParameterList;
        return this;
    }

    /**
     * Get the status property: The status of the application type.
     *
     * @return the status value.
     */
    public ApplicationTypeStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the application type.
     *
     * @param status the status value to set.
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo setStatus(ApplicationTypeStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails property: Additional detailed information about the status of the application type.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: Additional detailed information about the status of the application type.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the applicationTypeDefinitionKind property: The mechanism used to define a Service Fabric application type.
     *
     * @return the applicationTypeDefinitionKind value.
     */
    public ApplicationTypeDefinitionKind getApplicationTypeDefinitionKind() {
        return this.applicationTypeDefinitionKind;
    }

    /**
     * Set the applicationTypeDefinitionKind property: The mechanism used to define a Service Fabric application type.
     *
     * @param applicationTypeDefinitionKind the applicationTypeDefinitionKind value to set.
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo setApplicationTypeDefinitionKind(
            ApplicationTypeDefinitionKind applicationTypeDefinitionKind) {
        this.applicationTypeDefinitionKind = applicationTypeDefinitionKind;
        return this;
    }
}
