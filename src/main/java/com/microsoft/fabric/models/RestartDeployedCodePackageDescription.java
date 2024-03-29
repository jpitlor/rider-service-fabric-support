package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines description for restarting a deployed code package on Service Fabric node. */
@Fluent
public final class RestartDeployedCodePackageDescription {
    /*
     * The name of service manifest that specified this code package.
     */
    @JsonProperty(value = "ServiceManifestName", required = true)
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

    /*
     * The name of the code package defined in the service manifest.
     */
    @JsonProperty(value = "CodePackageName", required = true)
    private String codePackageName;

    /*
     * The instance ID for currently running entry point. For a code package
     * setup entry point (if specified) runs first and after it finishes main
     * entry point is started.
     * Each time entry point executable is run, its instance ID will change. If
     * 0 is passed in as the code package instance ID, the API will restart the
     * code package with whatever instance ID it is currently running.
     * If an instance ID other than 0 is passed in, the API will restart the
     * code package only if the current Instance ID matches the passed in
     * instance ID.
     * Note, passing in the exact instance ID (not 0) in the API is safer,
     * because if ensures at most one restart of the code package.
     */
    @JsonProperty(value = "CodePackageInstanceId", required = true)
    private String codePackageInstanceId;

    /**
     * Get the serviceManifestName property: The name of service manifest that specified this code package.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: The name of service manifest that specified this code package.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the RestartDeployedCodePackageDescription object itself.
     */
    public RestartDeployedCodePackageDescription setServiceManifestName(String serviceManifestName) {
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
     * @return the RestartDeployedCodePackageDescription object itself.
     */
    public RestartDeployedCodePackageDescription setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

    /**
     * Get the codePackageName property: The name of the code package defined in the service manifest.
     *
     * @return the codePackageName value.
     */
    public String getCodePackageName() {
        return this.codePackageName;
    }

    /**
     * Set the codePackageName property: The name of the code package defined in the service manifest.
     *
     * @param codePackageName the codePackageName value to set.
     * @return the RestartDeployedCodePackageDescription object itself.
     */
    public RestartDeployedCodePackageDescription setCodePackageName(String codePackageName) {
        this.codePackageName = codePackageName;
        return this;
    }

    /**
     * Get the codePackageInstanceId property: The instance ID for currently running entry point. For a code package
     * setup entry point (if specified) runs first and after it finishes main entry point is started. Each time entry
     * point executable is run, its instance ID will change. If 0 is passed in as the code package instance ID, the API
     * will restart the code package with whatever instance ID it is currently running. If an instance ID other than 0
     * is passed in, the API will restart the code package only if the current Instance ID matches the passed in
     * instance ID. Note, passing in the exact instance ID (not 0) in the API is safer, because if ensures at most one
     * restart of the code package.
     *
     * @return the codePackageInstanceId value.
     */
    public String getCodePackageInstanceId() {
        return this.codePackageInstanceId;
    }

    /**
     * Set the codePackageInstanceId property: The instance ID for currently running entry point. For a code package
     * setup entry point (if specified) runs first and after it finishes main entry point is started. Each time entry
     * point executable is run, its instance ID will change. If 0 is passed in as the code package instance ID, the API
     * will restart the code package with whatever instance ID it is currently running. If an instance ID other than 0
     * is passed in, the API will restart the code package only if the current Instance ID matches the passed in
     * instance ID. Note, passing in the exact instance ID (not 0) in the API is safer, because if ensures at most one
     * restart of the code package.
     *
     * @param codePackageInstanceId the codePackageInstanceId value to set.
     * @return the RestartDeployedCodePackageDescription object itself.
     */
    public RestartDeployedCodePackageDescription setCodePackageInstanceId(String codePackageInstanceId) {
        this.codePackageInstanceId = codePackageInstanceId;
        return this;
    }
}
