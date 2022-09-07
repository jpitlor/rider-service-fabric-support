package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Safety check that waits to ensure the availability of the partition. It waits until there are replicas available such
 * that bringing down this replica will not cause availability loss for the partition.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("EnsureAvailability")
@Fluent
public final class EnsureAvailabilitySafetyCheck extends PartitionSafetyCheck {}
