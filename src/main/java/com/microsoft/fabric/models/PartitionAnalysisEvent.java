package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the base for all Partition Analysis Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = PartitionAnalysisEvent.class)
@JsonTypeName("PartitionAnalysisEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "PartitionPrimaryMoveAnalysis", value = PartitionPrimaryMoveAnalysisEvent.class)
})
@Fluent
public class PartitionAnalysisEvent extends PartitionEvent {
    /*
     * Metadata about an Analysis Event.
     */
    @JsonProperty(value = "Metadata", required = true)
    private AnalysisEventMetadata metadata;

    /**
     * Get the metadata property: Metadata about an Analysis Event.
     *
     * @return the metadata value.
     */
    public AnalysisEventMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata about an Analysis Event.
     *
     * @param metadata the metadata value to set.
     * @return the PartitionAnalysisEvent object itself.
     */
    public PartitionAnalysisEvent setMetadata(AnalysisEventMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
}
