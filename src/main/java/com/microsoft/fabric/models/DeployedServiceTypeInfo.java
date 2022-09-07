package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about service type deployed on a node, information such as the status of the service type registration on
 * a node.
 */
@Fluent
public final class DeployedServiceTypeInfo {
    /*
     * Name of the service type as specified in the service manifest.
     */
    @JsonProperty(value = "ServiceTypeName")
    private String serviceTypeName;

    /*
     * The name of the service manifest in which this service type is defined.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

    /*
     * The name of the code package that registered the service type.
     */
    @JsonProperty(value = "CodePackageName")
    private String codePackageName;

    /*
     * The status of the service type registration on the node.
     */
    @JsonProperty(value = "Status")
    private ServiceTypeRegistrationStatus status;

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
     * Get the serviceTypeName property: Name of the service type as specified in the service manifest.
     *
     * @return the serviceTypeName value.
     */
    public String getServiceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set the serviceTypeName property: Name of the service type as specified in the service manifest.
     *
     * @param serviceTypeName the serviceTypeName value to set.
     * @return the DeployedServiceTypeInfo object itself.
     */
    public DeployedServiceTypeInfo setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
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
     * @return the DeployedServiceTypeInfo object itself.
     */
    public DeployedServiceTypeInfo setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the codePackageName property: The name of the code package that registered the service type.
     *
     * @return the codePackageName value.
     */
    public String getCodePackageName() {
        return this.codePackageName;
    }

    /**
     * Set the codePackageName property: The name of the code package that registered the service type.
     *
     * @param codePackageName the codePackageName value to set.
     * @return the DeployedServiceTypeInfo object itself.
     */
    public DeployedServiceTypeInfo setCodePackageName(String codePackageName) {
        this.codePackageName = codePackageName;
        return this;
    }

    /**
     * Get the status property: The status of the service type registration on the node.
     *
     * @return the status value.
     */
    public ServiceTypeRegistrationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the service type registration on the node.
     *
     * @param status the status value to set.
     * @return the DeployedServiceTypeInfo object itself.
     */
    public DeployedServiceTypeInfo setStatus(ServiceTypeRegistrationStatus status) {
        this.status = status;
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
     * @return the DeployedServiceTypeInfo object itself.
     */
    public DeployedServiceTypeInfo setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }
}
