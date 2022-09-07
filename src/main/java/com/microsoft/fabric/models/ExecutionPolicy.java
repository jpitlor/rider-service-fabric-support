package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The execution policy of the service. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = ExecutionPolicy.class)
@JsonTypeName("ExecutionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Default", value = DefaultExecutionPolicy.class),
    @JsonSubTypes.Type(name = "RunToCompletion", value = RunToCompletionExecutionPolicy.class)
})
@Immutable
public class ExecutionPolicy {}
