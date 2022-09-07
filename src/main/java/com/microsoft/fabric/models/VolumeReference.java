package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a reference to a volume resource. */
@Fluent
public class VolumeReference {
    /*
     * Name of the volume being referenced.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The flag indicating whether the volume is read only. Default is 'false'.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /*
     * The path within the container at which the volume should be mounted.
     * Only valid path characters are allowed.
     */
    @JsonProperty(value = "destinationPath", required = true)
    private String destinationPath;

    /**
     * Get the name property: Name of the volume being referenced.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the volume being referenced.
     *
     * @param name the name value to set.
     * @return the VolumeReference object itself.
     */
    public VolumeReference setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the readOnly property: The flag indicating whether the volume is read only. Default is 'false'.
     *
     * @return the readOnly value.
     */
    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * Set the readOnly property: The flag indicating whether the volume is read only. Default is 'false'.
     *
     * @param readOnly the readOnly value to set.
     * @return the VolumeReference object itself.
     */
    public VolumeReference setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the destinationPath property: The path within the container at which the volume should be mounted. Only valid
     * path characters are allowed.
     *
     * @return the destinationPath value.
     */
    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * Set the destinationPath property: The path within the container at which the volume should be mounted. Only valid
     * path characters are allowed.
     *
     * @param destinationPath the destinationPath value to set.
     * @return the VolumeReference object itself.
     */
    public VolumeReference setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }
}
