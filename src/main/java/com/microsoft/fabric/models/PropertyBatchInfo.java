package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about the results of a property batch. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = PropertyBatchInfo.class)
@JsonTypeName("PropertyBatchInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Successful", value = SuccessfulPropertyBatchInfo.class),
    @JsonSubTypes.Type(name = "Failed", value = FailedPropertyBatchInfo.class)
})
@Immutable
public class PropertyBatchInfo {}
