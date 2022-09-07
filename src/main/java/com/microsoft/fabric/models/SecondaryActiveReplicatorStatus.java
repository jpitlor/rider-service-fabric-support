package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Status of the secondary replicator when it is in active mode and is part of the replica set. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ActiveSecondary")
@Fluent
public final class SecondaryActiveReplicatorStatus extends SecondaryReplicatorStatus {}
