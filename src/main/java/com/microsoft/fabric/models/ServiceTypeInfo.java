package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a service type that is defined in a service manifest of a provisioned application type. */
@Fluent
public final class ServiceTypeInfo {
    /*
     * Describes a service type defined in the service manifest of a
     * provisioned application type. The properties the ones defined in the
     * service manifest.
     */
    @JsonProperty(value = "ServiceTypeDescription")
    private ServiceTypeDescription serviceTypeDescription;

    /*
     * The name of the service manifest in which this service type is defined.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

    /*
     * The version of the service manifest in which this service type is
     * defined.
     */
    @JsonProperty(value = "ServiceManifestVersion")
    private String serviceManifestVersion;

    /*
     * Indicates whether the service is a service group. If it is, the property
     * value is true otherwise false.
     */
    @JsonProperty(value = "IsServiceGroup")
    private Boolean isServiceGroup;

    /**
     * Get the serviceTypeDescription property: Describes a service type defined in the service manifest of a
     * provisioned application type. The properties the ones defined in the service manifest.
     *
     * @return the serviceTypeDescription value.
     */
    public ServiceTypeDescription getServiceTypeDescription() {
        return this.serviceTypeDescription;
    }

    /**
     * Set the serviceTypeDescription property: Describes a service type defined in the service manifest of a
     * provisioned application type. The properties the ones defined in the service manifest.
     *
     * @param serviceTypeDescription the serviceTypeDescription value to set.
     * @return the ServiceTypeInfo object itself.
     */
    public ServiceTypeInfo setServiceTypeDescription(ServiceTypeDescription serviceTypeDescription) {
        this.serviceTypeDescription = serviceTypeDescription;
        return this;
    }

    /**
     * Get the serviceManifestName property: The name of the service manifest in which this service type is defined.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: The name of the service manifest in which this service type is defined.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the ServiceTypeInfo object itself.
     */
    public ServiceTypeInfo setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the serviceManifestVersion property: The version of the service manifest in which this service type is
     * defined.
     *
     * @return the serviceManifestVersion value.
     */
    public String getServiceManifestVersion() {
        return this.serviceManifestVersion;
    }

    /**
     * Set the serviceManifestVersion property: The version of the service manifest in which this service type is
     * defined.
     *
     * @param serviceManifestVersion the serviceManifestVersion value to set.
     * @return the ServiceTypeInfo object itself.
     */
    public ServiceTypeInfo setServiceManifestVersion(String serviceManifestVersion) {
        this.serviceManifestVersion = serviceManifestVersion;
        return this;
    }

    /**
     * Get the isServiceGroup property: Indicates whether the service is a service group. If it is, the property value
     * is true otherwise false.
     *
     * @return the isServiceGroup value.
     */
    public Boolean isServiceGroup() {
        return this.isServiceGroup;
    }

    /**
     * Set the isServiceGroup property: Indicates whether the service is a service group. If it is, the property value
     * is true otherwise false.
     *
     * @param isServiceGroup the isServiceGroup value to set.
     * @return the ServiceTypeInfo object itself.
     */
    public ServiceTypeInfo setIsServiceGroup(Boolean isServiceGroup) {
        this.isServiceGroup = isServiceGroup;
        return this;
    }
}
