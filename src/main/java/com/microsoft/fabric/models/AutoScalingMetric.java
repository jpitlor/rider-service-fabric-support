package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the metric that is used for triggering auto scaling operation. Derived classes will describe resources or
 * metrics.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = AutoScalingMetric.class)
@JsonTypeName("AutoScalingMetric")
@JsonSubTypes({@JsonSubTypes.Type(name = "Resource", value = AutoScalingResourceMetric.class)})
@Immutable
public class AutoScalingMetric {}
