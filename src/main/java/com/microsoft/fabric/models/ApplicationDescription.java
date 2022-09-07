package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a Service Fabric application. */
@Fluent
public final class ApplicationDescription {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "TypeName", required = true)
    private String typeName;

    /*
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "TypeVersion", required = true)
    private String typeVersion;

    /*
     * List of application parameters with overridden values from their default
     * values specified in the application manifest.
     */
    @JsonProperty(value = "ParameterList")
    private List<ApplicationParameter> parameterList;

    /*
     * Describes capacity information for services of this application. This
     * description can be used for describing the following.
     * - Reserving the capacity for the services on the nodes
     * - Limiting the total number of nodes that services of this application
     * can run on
     * - Limiting the custom capacity metrics to limit the total consumption of
     * this metric by the services of this application
     */
    @JsonProperty(value = "ApplicationCapacity")
    private ApplicationCapacityDescription applicationCapacity;

    /*
     * Managed application identity description.
     */
    @JsonProperty(value = "ManagedApplicationIdentity")
    private ManagedApplicationIdentityDescription managedApplicationIdentity;

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
     * @return the ApplicationDescription object itself.
     */
    public ApplicationDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the typeName property: The application type name as defined in the application manifest.
     *
     * @return the typeName value.
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The application type name as defined in the application manifest.
     *
     * @param typeName the typeName value to set.
     * @return the ApplicationDescription object itself.
     */
    public ApplicationDescription setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the typeVersion property: The version of the application type as defined in the application manifest.
     *
     * @return the typeVersion value.
     */
    public String getTypeVersion() {
        return this.typeVersion;
    }

    /**
     * Set the typeVersion property: The version of the application type as defined in the application manifest.
     *
     * @param typeVersion the typeVersion value to set.
     * @return the ApplicationDescription object itself.
     */
    public ApplicationDescription setTypeVersion(String typeVersion) {
        this.typeVersion = typeVersion;
        return this;
    }

    /**
     * Get the parameterList property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @return the parameterList value.
     */
    public List<ApplicationParameter> getParameterList() {
        return this.parameterList;
    }

    /**
     * Set the parameterList property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @param parameterList the parameterList value to set.
     * @return the ApplicationDescription object itself.
     */
    public ApplicationDescription setParameterList(List<ApplicationParameter> parameterList) {
        this.parameterList = parameterList;
        return this;
    }

    /**
     * Get the applicationCapacity property: Describes capacity information for services of this application. This
     * description can be used for describing the following. - Reserving the capacity for the services on the nodes -
     * Limiting the total number of nodes that services of this application can run on - Limiting the custom capacity
     * metrics to limit the total consumption of this metric by the services of this application.
     *
     * @return the applicationCapacity value.
     */
    public ApplicationCapacityDescription getApplicationCapacity() {
        return this.applicationCapacity;
    }

    /**
     * Set the applicationCapacity property: Describes capacity information for services of this application. This
     * description can be used for describing the following. - Reserving the capacity for the services on the nodes -
     * Limiting the total number of nodes that services of this application can run on - Limiting the custom capacity
     * metrics to limit the total consumption of this metric by the services of this application.
     *
     * @param applicationCapacity the applicationCapacity value to set.
     * @return the ApplicationDescription object itself.
     */
    public ApplicationDescription setApplicationCapacity(ApplicationCapacityDescription applicationCapacity) {
        this.applicationCapacity = applicationCapacity;
        return this;
    }

    /**
     * Get the managedApplicationIdentity property: Managed application identity description.
     *
     * @return the managedApplicationIdentity value.
     */
    public ManagedApplicationIdentityDescription getManagedApplicationIdentity() {
        return this.managedApplicationIdentity;
    }

    /**
     * Set the managedApplicationIdentity property: Managed application identity description.
     *
     * @param managedApplicationIdentity the managedApplicationIdentity value to set.
     * @return the ApplicationDescription object itself.
     */
    public ApplicationDescription setManagedApplicationIdentity(
            ManagedApplicationIdentityDescription managedApplicationIdentity) {
        this.managedApplicationIdentity = managedApplicationIdentity;
        return this;
    }
}
