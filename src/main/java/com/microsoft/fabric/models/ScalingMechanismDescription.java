package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the mechanism for performing a scaling operation. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ScalingMechanismDescription.class)
@JsonTypeName("ScalingMechanismDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "PartitionInstanceCount", value = PartitionInstanceCountScaleMechanism.class),
    @JsonSubTypes.Type(
            name = "AddRemoveIncrementalNamedPartition",
            value = AddRemoveIncrementalNamedPartitionScalingMechanism.class)
})
@Immutable
public class ScalingMechanismDescription {}
