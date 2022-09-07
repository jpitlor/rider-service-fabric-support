package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a Service Fabric property value. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = PropertyValue.class)
@JsonTypeName("PropertyValue")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Binary", value = BinaryPropertyValue.class),
    @JsonSubTypes.Type(name = "Int64", value = Int64PropertyValue.class),
    @JsonSubTypes.Type(name = "Double", value = DoublePropertyValue.class),
    @JsonSubTypes.Type(name = "String", value = StringPropertyValue.class),
    @JsonSubTypes.Type(name = "Guid", value = GuidPropertyValue.class)
})
@Immutable
public class PropertyValue {}
