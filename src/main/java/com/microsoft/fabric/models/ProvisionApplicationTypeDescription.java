package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the operation to register or provision an application type using an application package uploaded to the
 * Service Fabric image store.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ImageStorePath")
@Fluent
public final class ProvisionApplicationTypeDescription extends ProvisionApplicationTypeDescriptionBase {
    /*
     * The relative path for the application package in the image store
     * specified during the prior upload operation.
     */
    @JsonProperty(value = "ApplicationTypeBuildPath", required = true)
    private String applicationTypeBuildPath;

    /*
     * The kind of action that needs to be taken for cleaning up the
     * application package after successful provision.
     */
    @JsonProperty(value = "ApplicationPackageCleanupPolicy")
    private ApplicationPackageCleanupPolicy applicationPackageCleanupPolicy;

    /**
     * Get the applicationTypeBuildPath property: The relative path for the application package in the image store
     * specified during the prior upload operation.
     *
     * @return the applicationTypeBuildPath value.
     */
    public String getApplicationTypeBuildPath() {
        return this.applicationTypeBuildPath;
    }

    /**
     * Set the applicationTypeBuildPath property: The relative path for the application package in the image store
     * specified during the prior upload operation.
     *
     * @param applicationTypeBuildPath the applicationTypeBuildPath value to set.
     * @return the ProvisionApplicationTypeDescription object itself.
     */
    public ProvisionApplicationTypeDescription setApplicationTypeBuildPath(String applicationTypeBuildPath) {
        this.applicationTypeBuildPath = applicationTypeBuildPath;
        return this;
    }

    /**
     * Get the applicationPackageCleanupPolicy property: The kind of action that needs to be taken for cleaning up the
     * application package after successful provision.
     *
     * @return the applicationPackageCleanupPolicy value.
     */
    public ApplicationPackageCleanupPolicy getApplicationPackageCleanupPolicy() {
        return this.applicationPackageCleanupPolicy;
    }

    /**
     * Set the applicationPackageCleanupPolicy property: The kind of action that needs to be taken for cleaning up the
     * application package after successful provision.
     *
     * @param applicationPackageCleanupPolicy the applicationPackageCleanupPolicy value to set.
     * @return the ProvisionApplicationTypeDescription object itself.
     */
    public ProvisionApplicationTypeDescription setApplicationPackageCleanupPolicy(
            ApplicationPackageCleanupPolicy applicationPackageCleanupPolicy) {
        this.applicationPackageCleanupPolicy = applicationPackageCleanupPolicy;
        return this;
    }
}
