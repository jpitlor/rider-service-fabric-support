package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Safety check that waits for the replica build operation to finish. This indicates that there is a replica that is
 * going through the copy or is providing data for building another replica. Bring the node down will abort this copy
 * operation which are typically expensive involving data movements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("WaitForInbuildReplica")
@Fluent
public final class WaitForInbuildReplicaSafetyCheck extends PartitionSafetyCheck {}
