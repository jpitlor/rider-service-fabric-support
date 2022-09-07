package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes the named partition scheme of the service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "PartitionScheme")
@JsonTypeName("Named")
@Fluent
public final class NamedPartitionSchemeDescription extends PartitionSchemeDescription {
    /*
     * The number of partitions.
     */
    @JsonProperty(value = "Count", required = true)
    private int count;

    /*
     * Array of size specified by the ‘Count’ parameter, for the names of the
     * partitions.
     */
    @JsonProperty(value = "Names", required = true)
    private List<String> names;

    /**
     * Get the count property: The number of partitions.
     *
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: The number of partitions.
     *
     * @param count the count value to set.
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription setCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the names property: Array of size specified by the ‘Count’ parameter, for the names of the partitions.
     *
     * @return the names value.
     */
    public List<String> getNames() {
        return this.names;
    }

    /**
     * Set the names property: Array of size specified by the ‘Count’ parameter, for the names of the partitions.
     *
     * @param names the names value to set.
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription setNames(List<String> names) {
        this.names = names;
        return this;
    }
}
