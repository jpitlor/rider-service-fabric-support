package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the retention policy configured. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "RetentionPolicyType",
        defaultImpl = RetentionPolicyDescription.class)
@JsonTypeName("RetentionPolicyDescription")
@JsonSubTypes({@JsonSubTypes.Type(name = "Basic", value = BasicRetentionPolicyDescription.class)})
@Immutable
public class RetentionPolicyDescription {}
