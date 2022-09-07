package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the operation to register or provision an application type using an application package from an external
 * store instead of a package uploaded to the Service Fabric image store.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ExternalStore")
@Fluent
public final class ExternalStoreProvisionApplicationTypeDescription extends ProvisionApplicationTypeDescriptionBase {
    /*
     * The path to the '.sfpkg' application package from where the application
     * package can be downloaded using HTTP or HTTPS protocols. The application
     * package can be stored in an external store that provides GET operation
     * to download the file. Supported protocols are HTTP and HTTPS, and the
     * path must allow READ access.
     */
    @JsonProperty(value = "ApplicationPackageDownloadUri", required = true)
    private String applicationPackageDownloadUri;

    /*
     * The application type name represents the name of the application type
     * found in the application manifest.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /*
     * The application type version represents the version of the application
     * type found in the application manifest.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /**
     * Get the applicationPackageDownloadUri property: The path to the '.sfpkg' application package from where the
     * application package can be downloaded using HTTP or HTTPS protocols. The application package can be stored in an
     * external store that provides GET operation to download the file. Supported protocols are HTTP and HTTPS, and the
     * path must allow READ access.
     *
     * @return the applicationPackageDownloadUri value.
     */
    public String getApplicationPackageDownloadUri() {
        return this.applicationPackageDownloadUri;
    }

    /**
     * Set the applicationPackageDownloadUri property: The path to the '.sfpkg' application package from where the
     * application package can be downloaded using HTTP or HTTPS protocols. The application package can be stored in an
     * external store that provides GET operation to download the file. Supported protocols are HTTP and HTTPS, and the
     * path must allow READ access.
     *
     * @param applicationPackageDownloadUri the applicationPackageDownloadUri value to set.
     * @return the ExternalStoreProvisionApplicationTypeDescription object itself.
     */
    public ExternalStoreProvisionApplicationTypeDescription setApplicationPackageDownloadUri(
            String applicationPackageDownloadUri) {
        this.applicationPackageDownloadUri = applicationPackageDownloadUri;
        return this;
    }

    /**
     * Get the applicationTypeName property: The application type name represents the name of the application type found
     * in the application manifest.
     *
     * @return the applicationTypeName value.
     */
    public String getApplicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the applicationTypeName property: The application type name represents the name of the application type found
     * in the application manifest.
     *
     * @param applicationTypeName the applicationTypeName value to set.
     * @return the ExternalStoreProvisionApplicationTypeDescription object itself.
     */
    public ExternalStoreProvisionApplicationTypeDescription setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the applicationTypeVersion property: The application type version represents the version of the application
     * type found in the application manifest.
     *
     * @return the applicationTypeVersion value.
     */
    public String getApplicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the applicationTypeVersion property: The application type version represents the version of the application
     * type found in the application manifest.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set.
     * @return the ExternalStoreProvisionApplicationTypeDescription object itself.
     */
    public ExternalStoreProvisionApplicationTypeDescription setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }
}
