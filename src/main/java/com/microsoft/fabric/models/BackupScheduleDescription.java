package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the backup schedule parameters. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ScheduleKind",
        defaultImpl = BackupScheduleDescription.class)
@JsonTypeName("BackupScheduleDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FrequencyBased", value = FrequencyBasedBackupScheduleDescription.class),
    @JsonSubTypes.Type(name = "TimeBased", value = TimeBasedBackupScheduleDescription.class)
})
@Immutable
public class BackupScheduleDescription {}
