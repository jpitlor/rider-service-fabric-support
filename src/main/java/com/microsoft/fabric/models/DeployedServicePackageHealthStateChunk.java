package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state chunk of a deployed service package, which contains the service manifest name and the
 * service package aggregated health state.
 */
@Fluent
public final class DeployedServicePackageHealthStateChunk extends EntityHealthStateChunk {
    /*
     * The name of the service manifest.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

    /*
     * The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the
     * service
     * is 'SharedProcess' (or if it is not specified, in which case it defaults
     * to 'SharedProcess'), then value of ServicePackageActivationId
     * is always an empty string.
     */
    @JsonProperty(value = "ServicePackageActivationId")
    private String servicePackageActivationId;

    /**
     * Get the serviceManifestName property: The name of the service manifest.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: The name of the service manifest.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the DeployedServicePackageHealthStateChunk object itself.
     */
    public DeployedServicePackageHealthStateChunk setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the servicePackageActivationId property: The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the service is 'SharedProcess' (or if it is not
     * specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId is always an
     * empty string.
     *
     * @return the servicePackageActivationId value.
     */
    public String getServicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId property: The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the service is 'SharedProcess' (or if it is not
     * specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId is always an
     * empty string.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set.
     * @return the DeployedServicePackageHealthStateChunk object itself.
     */
    public DeployedServicePackageHealthStateChunk setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }
}
