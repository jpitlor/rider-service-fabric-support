package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Safety check that waits for the current reconfiguration of the partition to be completed before starting an upgrade.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("WaitForReconfiguration")
@Fluent
public final class WaitForReconfigurationSafetyCheck extends PartitionSafetyCheck {}
