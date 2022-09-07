package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Safety check that ensures that a quorum of replicas are not lost for a partition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("EnsurePartitionQuorum")
@Fluent
public final class EnsurePartitionQuorumSafetyCheck extends PartitionSafetyCheck {}
