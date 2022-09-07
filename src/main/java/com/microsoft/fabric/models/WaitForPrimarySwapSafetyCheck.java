package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Safety check that waits for the primary replica to be moved out of the node before starting an upgrade to ensure the
 * availability of the primary replica for the partition.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("WaitForPrimarySwap")
@Fluent
public final class WaitForPrimarySwapSafetyCheck extends PartitionSafetyCheck {}
