package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes how the service is partitioned. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "PartitionScheme",
        defaultImpl = PartitionSchemeDescription.class)
@JsonTypeName("PartitionSchemeDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Named", value = NamedPartitionSchemeDescription.class),
    @JsonSubTypes.Type(name = "Singleton", value = SingletonPartitionSchemeDescription.class),
    @JsonSubTypes.Type(name = "UniformInt64Range", value = UniformInt64RangePartitionSchemeDescription.class)
})
@Immutable
public class PartitionSchemeDescription {}
