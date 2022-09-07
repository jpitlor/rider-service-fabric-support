package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a Service Fabric application. */
@Fluent
public final class ApplicationInfo {
    /*
     * The identity of the application. This is an encoded representation of
     * the application name. This is used in the REST APIs to identify the
     * application resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the application name is "fabric:/myapp/app1",
     * the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1"
     * in previous versions.
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "TypeName")
    private String typeName;

    /*
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "TypeVersion")
    private String typeVersion;

    /*
     * The status of the application.
     */
    @JsonProperty(value = "Status")
    private ApplicationStatus status;

    /*
     * List of application parameters with overridden values from their default
     * values specified in the application manifest.
     */
    @JsonProperty(value = "Parameters")
    private List<ApplicationParameter> parameters;

    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /*
     * The mechanism used to define a Service Fabric application.
     */
    @JsonProperty(value = "ApplicationDefinitionKind")
    private ApplicationDefinitionKind applicationDefinitionKind;

    /*
     * Managed application identity description.
     */
    @JsonProperty(value = "ManagedApplicationIdentity")
    private ManagedApplicationIdentityDescription managedApplicationIdentity;

    /**
     * Get the id property: The identity of the application. This is an encoded representation of the application name.
     * This is used in the REST APIs to identify the application resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the application name is "fabric:/myapp/app1", the
     * application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous versions.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The identity of the application. This is an encoded representation of the application name.
     * This is used in the REST APIs to identify the application resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the application name is "fabric:/myapp/app1", the
     * application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous versions.
     *
     * @param id the id value to set.
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setId(String id) {
        this.id = id;
        return this;
    }

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
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setName(String name) {
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
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setTypeName(String typeName) {
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
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setTypeVersion(String typeVersion) {
        this.typeVersion = typeVersion;
        return this;
    }

    /**
     * Get the status property: The status of the application.
     *
     * @return the status value.
     */
    public ApplicationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the application.
     *
     * @param status the status value to set.
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setStatus(ApplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @return the parameters value.
     */
    public List<ApplicationParameter> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @param parameters the parameters value to set.
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setParameters(List<ApplicationParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @param healthState the healthState value to set.
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the applicationDefinitionKind property: The mechanism used to define a Service Fabric application.
     *
     * @return the applicationDefinitionKind value.
     */
    public ApplicationDefinitionKind getApplicationDefinitionKind() {
        return this.applicationDefinitionKind;
    }

    /**
     * Set the applicationDefinitionKind property: The mechanism used to define a Service Fabric application.
     *
     * @param applicationDefinitionKind the applicationDefinitionKind value to set.
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setApplicationDefinitionKind(ApplicationDefinitionKind applicationDefinitionKind) {
        this.applicationDefinitionKind = applicationDefinitionKind;
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
     * @return the ApplicationInfo object itself.
     */
    public ApplicationInfo setManagedApplicationIdentity(
            ManagedApplicationIdentityDescription managedApplicationIdentity) {
        this.managedApplicationIdentity = managedApplicationIdentity;
        return this;
    }
}
