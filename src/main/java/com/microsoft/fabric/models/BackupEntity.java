package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the Service Fabric entity that is configured for backup. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "EntityKind",
        defaultImpl = BackupEntity.class)
@JsonTypeName("BackupEntity")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Application", value = ApplicationBackupEntity.class),
    @JsonSubTypes.Type(name = "Service", value = ServiceBackupEntity.class),
    @JsonSubTypes.Type(name = "Partition", value = PartitionBackupEntity.class)
})
@Immutable
public class BackupEntity {}
