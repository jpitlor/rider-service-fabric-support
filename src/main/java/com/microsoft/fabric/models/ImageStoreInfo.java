package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the ImageStore's resource usage. */
@Fluent
public final class ImageStoreInfo {
    /*
     * disk capacity and available disk space on the node where the ImageStore
     * primary is placed.
     */
    @JsonProperty(value = "DiskInfo")
    private DiskInfo diskInfo;

    /*
     * the ImageStore's file system usage for metadata.
     */
    @JsonProperty(value = "UsedByMetadata")
    private UsageInfo usedByMetadata;

    /*
     * The ImageStore's file system usage for staging files that are being
     * uploaded.
     */
    @JsonProperty(value = "UsedByStaging")
    private UsageInfo usedByStaging;

    /*
     * the ImageStore's file system usage for copied application and cluster
     * packages. [Removing application and cluster
     * packages](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-deleteimagestorecontent)
     * will free up this space.
     */
    @JsonProperty(value = "UsedByCopy")
    private UsageInfo usedByCopy;

    /*
     * the ImageStore's file system usage for registered and cluster packages.
     * [Unregistering
     * application](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-unprovisionapplicationtype)
     * and [cluster
     * packages](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-unprovisionapplicationtype)
     * will free up this space.
     */
    @JsonProperty(value = "UsedByRegister")
    private UsageInfo usedByRegister;

    /**
     * Get the diskInfo property: disk capacity and available disk space on the node where the ImageStore primary is
     * placed.
     *
     * @return the diskInfo value.
     */
    public DiskInfo getDiskInfo() {
        return this.diskInfo;
    }

    /**
     * Set the diskInfo property: disk capacity and available disk space on the node where the ImageStore primary is
     * placed.
     *
     * @param diskInfo the diskInfo value to set.
     * @return the ImageStoreInfo object itself.
     */
    public ImageStoreInfo setDiskInfo(DiskInfo diskInfo) {
        this.diskInfo = diskInfo;
        return this;
    }

    /**
     * Get the usedByMetadata property: the ImageStore's file system usage for metadata.
     *
     * @return the usedByMetadata value.
     */
    public UsageInfo getUsedByMetadata() {
        return this.usedByMetadata;
    }

    /**
     * Set the usedByMetadata property: the ImageStore's file system usage for metadata.
     *
     * @param usedByMetadata the usedByMetadata value to set.
     * @return the ImageStoreInfo object itself.
     */
    public ImageStoreInfo setUsedByMetadata(UsageInfo usedByMetadata) {
        this.usedByMetadata = usedByMetadata;
        return this;
    }

    /**
     * Get the usedByStaging property: The ImageStore's file system usage for staging files that are being uploaded.
     *
     * @return the usedByStaging value.
     */
    public UsageInfo getUsedByStaging() {
        return this.usedByStaging;
    }

    /**
     * Set the usedByStaging property: The ImageStore's file system usage for staging files that are being uploaded.
     *
     * @param usedByStaging the usedByStaging value to set.
     * @return the ImageStoreInfo object itself.
     */
    public ImageStoreInfo setUsedByStaging(UsageInfo usedByStaging) {
        this.usedByStaging = usedByStaging;
        return this;
    }

    /**
     * Get the usedByCopy property: the ImageStore's file system usage for copied application and cluster packages.
     * [Removing application and cluster
     * packages](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-deleteimagestorecontent) will free up
     * this space.
     *
     * @return the usedByCopy value.
     */
    public UsageInfo getUsedByCopy() {
        return this.usedByCopy;
    }

    /**
     * Set the usedByCopy property: the ImageStore's file system usage for copied application and cluster packages.
     * [Removing application and cluster
     * packages](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-deleteimagestorecontent) will free up
     * this space.
     *
     * @param usedByCopy the usedByCopy value to set.
     * @return the ImageStoreInfo object itself.
     */
    public ImageStoreInfo setUsedByCopy(UsageInfo usedByCopy) {
        this.usedByCopy = usedByCopy;
        return this;
    }

    /**
     * Get the usedByRegister property: the ImageStore's file system usage for registered and cluster packages.
     * [Unregistering
     * application](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-unprovisionapplicationtype) and
     * [cluster packages](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-unprovisionapplicationtype)
     * will free up this space.
     *
     * @return the usedByRegister value.
     */
    public UsageInfo getUsedByRegister() {
        return this.usedByRegister;
    }

    /**
     * Set the usedByRegister property: the ImageStore's file system usage for registered and cluster packages.
     * [Unregistering
     * application](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-unprovisionapplicationtype) and
     * [cluster packages](https://docs.microsoft.com/rest/api/servicefabric/sfclient-api-unprovisionapplicationtype)
     * will free up this space.
     *
     * @param usedByRegister the usedByRegister value to set.
     * @return the ImageStoreInfo object itself.
     */
    public ImageStoreInfo setUsedByRegister(UsageInfo usedByRegister) {
        this.usedByRegister = usedByRegister;
        return this;
    }
}
