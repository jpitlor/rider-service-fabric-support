package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the trigger for performing a scaling operation. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ScalingTriggerDescription.class)
@JsonTypeName("ScalingTriggerDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AveragePartitionLoad", value = AveragePartitionLoadScalingTrigger.class),
    @JsonSubTypes.Type(name = "AverageServiceLoad", value = AverageServiceLoadScalingTrigger.class)
})
@Immutable
public class ScalingTriggerDescription {}
