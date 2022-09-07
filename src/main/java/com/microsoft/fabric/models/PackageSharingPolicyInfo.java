package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a policy for the package sharing. */
@Fluent
public final class PackageSharingPolicyInfo {
    /*
     * The name of code, configuration or data package that should be shared.
     */
    @JsonProperty(value = "SharedPackageName")
    private String sharedPackageName;

    /*
     * Represents the scope for PackageSharingPolicy. This is specified during
     * DeployServicePackageToNode operation.
     */
    @JsonProperty(value = "PackageSharingScope")
    private PackageSharingPolicyScope packageSharingScope;

    /**
     * Get the sharedPackageName property: The name of code, configuration or data package that should be shared.
     *
     * @return the sharedPackageName value.
     */
    public String getSharedPackageName() {
        return this.sharedPackageName;
    }

    /**
     * Set the sharedPackageName property: The name of code, configuration or data package that should be shared.
     *
     * @param sharedPackageName the sharedPackageName value to set.
     * @return the PackageSharingPolicyInfo object itself.
     */
    public PackageSharingPolicyInfo setSharedPackageName(String sharedPackageName) {
        this.sharedPackageName = sharedPackageName;
        return this;
    }

    /**
     * Get the packageSharingScope property: Represents the scope for PackageSharingPolicy. This is specified during
     * DeployServicePackageToNode operation.
     *
     * @return the packageSharingScope value.
     */
    public PackageSharingPolicyScope getPackageSharingScope() {
        return this.packageSharingScope;
    }

    /**
     * Set the packageSharingScope property: Represents the scope for PackageSharingPolicy. This is specified during
     * DeployServicePackageToNode operation.
     *
     * @param packageSharingScope the packageSharingScope value to set.
     * @return the PackageSharingPolicyInfo object itself.
     */
    public PackageSharingPolicyInfo setPackageSharingScope(PackageSharingPolicyScope packageSharingScope) {
        this.packageSharingScope = packageSharingScope;
        return this;
    }
}
