package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type describes a volume resource. */
@JsonFlatten
@Fluent
public class VolumeResourceDescription {
    /*
     * Name of the Volume resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * User readable description of the volume.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Status of the volume.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /*
     * Gives additional information about the current status of the volume.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * Provider of the volume.
     */
    @JsonProperty(value = "properties.provider", required = true)
    private VolumeProvider provider;

    /*
     * This type describes a volume provided by an Azure Files file share.
     */
    @JsonProperty(value = "properties.azureFileParameters")
    private VolumeProviderParametersAzureFile azureFileParameters;

    /**
     * Get the name property: Name of the Volume resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Volume resource.
     *
     * @param name the name value to set.
     * @return the VolumeResourceDescription object itself.
     */
    public VolumeResourceDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: User readable description of the volume.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: User readable description of the volume.
     *
     * @param description the description value to set.
     * @return the VolumeResourceDescription object itself.
     */
    public VolumeResourceDescription setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the status property: Status of the volume.
     *
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetails property: Gives additional information about the current status of the volume.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the provider property: Provider of the volume.
     *
     * @return the provider value.
     */
    public VolumeProvider getProvider() {
        return this.provider;
    }

    /**
     * Set the provider property: Provider of the volume.
     *
     * @param provider the provider value to set.
     * @return the VolumeResourceDescription object itself.
     */
    public VolumeResourceDescription setProvider(VolumeProvider provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the azureFileParameters property: This type describes a volume provided by an Azure Files file share.
     *
     * @return the azureFileParameters value.
     */
    public VolumeProviderParametersAzureFile getAzureFileParameters() {
        return this.azureFileParameters;
    }

    /**
     * Set the azureFileParameters property: This type describes a volume provided by an Azure Files file share.
     *
     * @param azureFileParameters the azureFileParameters value to set.
     * @return the VolumeResourceDescription object itself.
     */
    public VolumeResourceDescription setAzureFileParameters(VolumeProviderParametersAzureFile azureFileParameters) {
        this.azureFileParameters = azureFileParameters;
        return this;
    }
}
