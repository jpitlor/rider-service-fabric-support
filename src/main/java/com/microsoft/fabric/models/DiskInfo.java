package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the disk. */
@Fluent
public final class DiskInfo {
    /*
     * the disk size in bytes
     */
    @JsonProperty(value = "Capacity")
    private String capacity;

    /*
     * the available disk space in bytes
     */
    @JsonProperty(value = "AvailableSpace")
    private String availableSpace;

    /**
     * Get the capacity property: the disk size in bytes.
     *
     * @return the capacity value.
     */
    public String getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: the disk size in bytes.
     *
     * @param capacity the capacity value to set.
     * @return the DiskInfo object itself.
     */
    public DiskInfo setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the availableSpace property: the available disk space in bytes.
     *
     * @return the availableSpace value.
     */
    public String getAvailableSpace() {
        return this.availableSpace;
    }

    /**
     * Set the availableSpace property: the available disk space in bytes.
     *
     * @param availableSpace the availableSpace value to set.
     * @return the DiskInfo object itself.
     */
    public DiskInfo setAvailableSpace(String availableSpace) {
        this.availableSpace = availableSpace;
        return this;
    }
}
