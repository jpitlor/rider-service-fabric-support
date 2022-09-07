package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This type describes a application resource. */
@JsonFlatten
@Fluent
public class ApplicationResourceDescription {
    /*
     * Name of the Application resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes the identity of the application.
     */
    @JsonProperty(value = "identity")
    private IdentityDescription identity;

    /*
     * User readable description of the application.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Describes the services in the application. This property is used to
     * create or modify services of the application. On get only the name of
     * the service is returned. The service description can be obtained by
     * querying for the service resource.
     */
    @JsonProperty(value = "properties.services")
    private List<ServiceResourceDescription> services;

    /*
     * Describes the diagnostics definition and usage for an application
     * resource.
     */
    @JsonProperty(value = "properties.diagnostics")
    private DiagnosticsDescription diagnostics;

    /*
     * Internal - used by Visual Studio to setup the debugging session on the
     * local development environment.
     */
    @JsonProperty(value = "properties.debugParams")
    private String debugParams;

    /*
     * Names of the services in the application.
     */
    @JsonProperty(value = "properties.serviceNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> serviceNames;

    /*
     * Status of the application.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /*
     * Gives additional information about the current status of the
     * application.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * Describes the health state of an application resource.
     */
    @JsonProperty(value = "properties.healthState", access = JsonProperty.Access.WRITE_ONLY)
    private HealthState healthState;

    /*
     * When the application's health state is not 'Ok', this additional details
     * from service fabric Health Manager for the user to know why the
     * application is marked unhealthy.
     */
    @JsonProperty(value = "properties.unhealthyEvaluation", access = JsonProperty.Access.WRITE_ONLY)
    private String unhealthyEvaluation;

    /**
     * Get the name property: Name of the Application resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Application resource.
     *
     * @param name the name value to set.
     * @return the ApplicationResourceDescription object itself.
     */
    public ApplicationResourceDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the identity property: Describes the identity of the application.
     *
     * @return the identity value.
     */
    public IdentityDescription getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: Describes the identity of the application.
     *
     * @param identity the identity value to set.
     * @return the ApplicationResourceDescription object itself.
     */
    public ApplicationResourceDescription setIdentity(IdentityDescription identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the description property: User readable description of the application.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: User readable description of the application.
     *
     * @param description the description value to set.
     * @return the ApplicationResourceDescription object itself.
     */
    public ApplicationResourceDescription setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the services property: Describes the services in the application. This property is used to create or modify
     * services of the application. On get only the name of the service is returned. The service description can be
     * obtained by querying for the service resource.
     *
     * @return the services value.
     */
    public List<ServiceResourceDescription> getServices() {
        return this.services;
    }

    /**
     * Set the services property: Describes the services in the application. This property is used to create or modify
     * services of the application. On get only the name of the service is returned. The service description can be
     * obtained by querying for the service resource.
     *
     * @param services the services value to set.
     * @return the ApplicationResourceDescription object itself.
     */
    public ApplicationResourceDescription setServices(List<ServiceResourceDescription> services) {
        this.services = services;
        return this;
    }

    /**
     * Get the diagnostics property: Describes the diagnostics definition and usage for an application resource.
     *
     * @return the diagnostics value.
     */
    public DiagnosticsDescription getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * Set the diagnostics property: Describes the diagnostics definition and usage for an application resource.
     *
     * @param diagnostics the diagnostics value to set.
     * @return the ApplicationResourceDescription object itself.
     */
    public ApplicationResourceDescription setDiagnostics(DiagnosticsDescription diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    /**
     * Get the debugParams property: Internal - used by Visual Studio to setup the debugging session on the local
     * development environment.
     *
     * @return the debugParams value.
     */
    public String getDebugParams() {
        return this.debugParams;
    }

    /**
     * Set the debugParams property: Internal - used by Visual Studio to setup the debugging session on the local
     * development environment.
     *
     * @param debugParams the debugParams value to set.
     * @return the ApplicationResourceDescription object itself.
     */
    public ApplicationResourceDescription setDebugParams(String debugParams) {
        this.debugParams = debugParams;
        return this;
    }

    /**
     * Get the serviceNames property: Names of the services in the application.
     *
     * @return the serviceNames value.
     */
    public List<String> getServiceNames() {
        return this.serviceNames;
    }

    /**
     * Get the status property: Status of the application.
     *
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetails property: Gives additional information about the current status of the application.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the healthState property: Describes the health state of an application resource.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Get the unhealthyEvaluation property: When the application's health state is not 'Ok', this additional details
     * from service fabric Health Manager for the user to know why the application is marked unhealthy.
     *
     * @return the unhealthyEvaluation value.
     */
    public String getUnhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }
}
