package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the mechanism for performing auto scaling operation. Derived classes will describe the actual mechanism.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = AutoScalingMechanism.class)
@JsonTypeName("AutoScalingMechanism")
@JsonSubTypes({@JsonSubTypes.Type(name = "AddRemoveReplica", value = AddRemoveReplicaScalingMechanism.class)})
@Immutable
public class AutoScalingMechanism {}
