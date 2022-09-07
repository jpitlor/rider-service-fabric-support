package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This type describes the resource limits for a given container. It describes the most amount of resources a container
 * is allowed to use before being restarted.
 */
@Fluent
public final class ResourceLimits {
    /*
     * The memory limit in GB.
     */
    @JsonProperty(value = "memoryInGB")
    private Double memoryInGB;

    /*
     * CPU limits in cores. At present, only full cores are supported.
     */
    @JsonProperty(value = "cpu")
    private Double cpu;

    /**
     * Get the memoryInGB property: The memory limit in GB.
     *
     * @return the memoryInGB value.
     */
    public Double getMemoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memoryInGB property: The memory limit in GB.
     *
     * @param memoryInGB the memoryInGB value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits setMemoryInGB(Double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the cpu property: CPU limits in cores. At present, only full cores are supported.
     *
     * @return the cpu value.
     */
    public Double getCpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: CPU limits in cores. At present, only full cores are supported.
     *
     * @param cpu the cpu value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits setCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }
}
