package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the trigger for performing auto scaling operation. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = AutoScalingTrigger.class)
@JsonTypeName("AutoScalingTrigger")
@JsonSubTypes({@JsonSubTypes.Type(name = "AverageLoad", value = AverageLoadScalingTrigger.class)})
@Immutable
public class AutoScalingTrigger {}
