package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the partition information for the name as a string that is based on partition schemes. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServicePartitionKind")
@JsonTypeName("Named")
@Fluent
public final class NamedPartitionInformation extends PartitionInformation {
    /*
     * Name of the partition.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Get the name property: Name of the partition.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the partition.
     *
     * @param name the name value to set.
     * @return the NamedPartitionInformation object itself.
     */
    public NamedPartitionInformation setName(String name) {
        this.name = name;
        return this;
    }
}
