package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines description for downloading packages associated with a service manifest to image cache on a Service Fabric
 * node.
 */
@Fluent
public final class DeployServicePackageToNodeDescription {
    /*
     * The name of service manifest whose packages need to be downloaded.
     */
    @JsonProperty(value = "ServiceManifestName", required = true)
    private String serviceManifestName;

    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /*
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /*
     * List of package sharing policy information.
     */
    @JsonProperty(value = "PackageSharingPolicy")
    private List<PackageSharingPolicyInfo> packageSharingPolicy;

    /**
     * Get the serviceManifestName property: The name of service manifest whose packages need to be downloaded.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: The name of service manifest whose packages need to be downloaded.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the applicationTypeName property: The application type name as defined in the application manifest.
     *
     * @return the applicationTypeName value.
     */
    public String getApplicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the applicationTypeName property: The application type name as defined in the application manifest.
     *
     * @param applicationTypeName the applicationTypeName value to set.
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the applicationTypeVersion property: The version of the application type as defined in the application
     * manifest.
     *
     * @return the applicationTypeVersion value.
     */
    public String getApplicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the applicationTypeVersion property: The version of the application type as defined in the application
     * manifest.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set.
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the nodeName property: The name of a Service Fabric node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set.
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the packageSharingPolicy property: List of package sharing policy information.
     *
     * @return the packageSharingPolicy value.
     */
    public List<PackageSharingPolicyInfo> getPackageSharingPolicy() {
        return this.packageSharingPolicy;
    }

    /**
     * Set the packageSharingPolicy property: List of package sharing policy information.
     *
     * @param packageSharingPolicy the packageSharingPolicy value to set.
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription setPackageSharingPolicy(
            List<PackageSharingPolicyInfo> packageSharingPolicy) {
        this.packageSharingPolicy = packageSharingPolicy;
        return this;
    }
}
