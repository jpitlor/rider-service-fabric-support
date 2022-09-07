package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This type describes the requested resources for a given container. It describes the least amount of resources
 * required for the container. A container can consume more than requested resources up to the specified limits before
 * being restarted. Currently, the requested resources are treated as limits.
 */
@Fluent
public final class ResourceRequests {
    /*
     * The memory request in GB for this container.
     */
    @JsonProperty(value = "memoryInGB", required = true)
    private double memoryInGB;

    /*
     * Requested number of CPU cores. At present, only full cores are
     * supported.
     */
    @JsonProperty(value = "cpu", required = true)
    private double cpu;

    /**
     * Get the memoryInGB property: The memory request in GB for this container.
     *
     * @return the memoryInGB value.
     */
    public double getMemoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memoryInGB property: The memory request in GB for this container.
     *
     * @param memoryInGB the memoryInGB value to set.
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests setMemoryInGB(double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the cpu property: Requested number of CPU cores. At present, only full cores are supported.
     *
     * @return the cpu value.
     */
    public double getCpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: Requested number of CPU cores. At present, only full cores are supported.
     *
     * @param cpu the cpu value to set.
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests setCpu(double cpu) {
        this.cpu = cpu;
        return this;
    }
}
