package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Safety check that waits for the primary replica that was moved out of the node due to upgrade to be placed back again
 * on that node.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("WaitForPrimaryPlacement")
@Fluent
public final class WaitForPrimaryPlacementSafetyCheck extends PartitionSafetyCheck {}
