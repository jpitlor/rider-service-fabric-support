package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about code package deployed on a Service Fabric node. */
@Fluent
public final class DeployedCodePackageInfo {
    /*
     * The name of the code package.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The version of the code package specified in service manifest.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * The name of service manifest that specified this code package.
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

    /*
     * Specifies the type of host for main entry point of a code package as
     * specified in service manifest.
     */
    @JsonProperty(value = "HostType")
    private HostType hostType;

    /*
     * Specifies the isolation mode of main entry point of a code package when
     * it's host type is ContainerHost. This is specified as part of container
     * host policies in application manifest while importing service manifest.
     */
    @JsonProperty(value = "HostIsolationMode")
    private HostIsolationMode hostIsolationMode;

    /*
     * Specifies the status of a deployed application or service package on a
     * Service Fabric node.
     */
    @JsonProperty(value = "Status")
    private DeploymentStatus status;

    /*
     * The interval at which code package is run. This is used for periodic
     * code package.
     */
    @JsonProperty(value = "RunFrequencyInterval")
    private String runFrequencyInterval;

    /*
     * Information about setup or main entry point of a code package deployed
     * on a Service Fabric node.
     */
    @JsonProperty(value = "SetupEntryPoint")
    private CodePackageEntryPoint setupEntryPoint;

    /*
     * Information about setup or main entry point of a code package deployed
     * on a Service Fabric node.
     */
    @JsonProperty(value = "MainEntryPoint")
    private CodePackageEntryPoint mainEntryPoint;

    /**
     * Get the name property: The name of the code package.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the code package.
     *
     * @param name the name value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: The version of the code package specified in service manifest.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the code package specified in service manifest.
     *
     * @param version the version value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setVersion(String version) {
        this.version = version;
        return this;
    }

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
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setServiceManifestName(String serviceManifestName) {
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
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

    /**
     * Get the hostType property: Specifies the type of host for main entry point of a code package as specified in
     * service manifest.
     *
     * @return the hostType value.
     */
    public HostType getHostType() {
        return this.hostType;
    }

    /**
     * Set the hostType property: Specifies the type of host for main entry point of a code package as specified in
     * service manifest.
     *
     * @param hostType the hostType value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setHostType(HostType hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * Get the hostIsolationMode property: Specifies the isolation mode of main entry point of a code package when it's
     * host type is ContainerHost. This is specified as part of container host policies in application manifest while
     * importing service manifest.
     *
     * @return the hostIsolationMode value.
     */
    public HostIsolationMode getHostIsolationMode() {
        return this.hostIsolationMode;
    }

    /**
     * Set the hostIsolationMode property: Specifies the isolation mode of main entry point of a code package when it's
     * host type is ContainerHost. This is specified as part of container host policies in application manifest while
     * importing service manifest.
     *
     * @param hostIsolationMode the hostIsolationMode value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setHostIsolationMode(HostIsolationMode hostIsolationMode) {
        this.hostIsolationMode = hostIsolationMode;
        return this;
    }

    /**
     * Get the status property: Specifies the status of a deployed application or service package on a Service Fabric
     * node.
     *
     * @return the status value.
     */
    public DeploymentStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Specifies the status of a deployed application or service package on a Service Fabric
     * node.
     *
     * @param status the status value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setStatus(DeploymentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the runFrequencyInterval property: The interval at which code package is run. This is used for periodic code
     * package.
     *
     * @return the runFrequencyInterval value.
     */
    public String getRunFrequencyInterval() {
        return this.runFrequencyInterval;
    }

    /**
     * Set the runFrequencyInterval property: The interval at which code package is run. This is used for periodic code
     * package.
     *
     * @param runFrequencyInterval the runFrequencyInterval value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setRunFrequencyInterval(String runFrequencyInterval) {
        this.runFrequencyInterval = runFrequencyInterval;
        return this;
    }

    /**
     * Get the setupEntryPoint property: Information about setup or main entry point of a code package deployed on a
     * Service Fabric node.
     *
     * @return the setupEntryPoint value.
     */
    public CodePackageEntryPoint getSetupEntryPoint() {
        return this.setupEntryPoint;
    }

    /**
     * Set the setupEntryPoint property: Information about setup or main entry point of a code package deployed on a
     * Service Fabric node.
     *
     * @param setupEntryPoint the setupEntryPoint value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setSetupEntryPoint(CodePackageEntryPoint setupEntryPoint) {
        this.setupEntryPoint = setupEntryPoint;
        return this;
    }

    /**
     * Get the mainEntryPoint property: Information about setup or main entry point of a code package deployed on a
     * Service Fabric node.
     *
     * @return the mainEntryPoint value.
     */
    public CodePackageEntryPoint getMainEntryPoint() {
        return this.mainEntryPoint;
    }

    /**
     * Set the mainEntryPoint property: Information about setup or main entry point of a code package deployed on a
     * Service Fabric node.
     *
     * @param mainEntryPoint the mainEntryPoint value to set.
     * @return the DeployedCodePackageInfo object itself.
     */
    public DeployedCodePackageInfo setMainEntryPoint(CodePackageEntryPoint mainEntryPoint) {
        this.mainEntryPoint = mainEntryPoint;
        return this;
    }
}
