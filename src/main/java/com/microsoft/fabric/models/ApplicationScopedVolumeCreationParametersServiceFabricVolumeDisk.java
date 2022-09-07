package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes parameters for creating application-scoped volumes provided by Service Fabric Volume Disks. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ServiceFabricVolumeDisk")
@Fluent
public final class ApplicationScopedVolumeCreationParametersServiceFabricVolumeDisk
        extends ApplicationScopedVolumeCreationParameters {
    /*
     * Volume size
     */
    @JsonProperty(value = "sizeDisk", required = true)
    private SizeTypes sizeDisk;

    /**
     * Get the sizeDisk property: Volume size.
     *
     * @return the sizeDisk value.
     */
    public SizeTypes getSizeDisk() {
        return this.sizeDisk;
    }

    /**
     * Set the sizeDisk property: Volume size.
     *
     * @param sizeDisk the sizeDisk value to set.
     * @return the ApplicationScopedVolumeCreationParametersServiceFabricVolumeDisk object itself.
     */
    public ApplicationScopedVolumeCreationParametersServiceFabricVolumeDisk setSizeDisk(SizeTypes sizeDisk) {
        this.sizeDisk = sizeDisk;
        return this;
    }
}
