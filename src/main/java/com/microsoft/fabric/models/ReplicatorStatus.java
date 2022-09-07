package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a base class for primary or secondary replicator status. Contains information about the service fabric
 * replicator like the replication/copy queue utilization, last acknowledgement received timestamp, etc.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ReplicatorStatus.class)
@JsonTypeName("ReplicatorStatus")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Primary", value = PrimaryReplicatorStatus.class),
    @JsonSubTypes.Type(name = "SecondaryReplicatorStatus", value = SecondaryReplicatorStatus.class)
})
@Immutable
public class ReplicatorStatus {}
