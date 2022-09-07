package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the health of a Service Fabric service. */
@Fluent
public final class ServiceHealth extends EntityHealth {
    /*
     * The name of the service whose health information is described by this
     * object.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The list of partition health states associated with the service.
     */
    @JsonProperty(value = "PartitionHealthStates")
    private List<PartitionHealthState> partitionHealthStates;

    /**
     * Get the name property: The name of the service whose health information is described by this object.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the service whose health information is described by this object.
     *
     * @param name the name value to set.
     * @return the ServiceHealth object itself.
     */
    public ServiceHealth setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the partitionHealthStates property: The list of partition health states associated with the service.
     *
     * @return the partitionHealthStates value.
     */
    public List<PartitionHealthState> getPartitionHealthStates() {
        return this.partitionHealthStates;
    }

    /**
     * Set the partitionHealthStates property: The list of partition health states associated with the service.
     *
     * @param partitionHealthStates the partitionHealthStates value to set.
     * @return the ServiceHealth object itself.
     */
    public ServiceHealth setPartitionHealthStates(List<PartitionHealthState> partitionHealthStates) {
        this.partitionHealthStates = partitionHealthStates;
        return this;
    }
}
