package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Status of the secondary replicator when it is in idle mode and is being built by the primary. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("IdleSecondary")
@Fluent
public final class SecondaryIdleReplicatorStatus extends SecondaryReplicatorStatus {}
