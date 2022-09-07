package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a safety check performed by service fabric before continuing with the operations. These checks ensure the
 * availability of the service and the reliability of the state.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = SafetyCheck.class)
@JsonTypeName("SafetyCheck")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "PartitionSafetyCheck", value = PartitionSafetyCheck.class),
    @JsonSubTypes.Type(name = "EnsureSeedNodeQuorum", value = SeedNodeSafetyCheck.class)
})
@Immutable
public class SafetyCheck {}
