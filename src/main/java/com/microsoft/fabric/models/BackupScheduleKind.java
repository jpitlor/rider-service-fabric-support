package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupScheduleKind. */
public final class BackupScheduleKind extends ExpandableStringEnum<BackupScheduleKind> {
    /** Static value Invalid for BackupScheduleKind. */
    public static final BackupScheduleKind INVALID = fromString("Invalid");

    /** Static value TimeBased for BackupScheduleKind. */
    public static final BackupScheduleKind TIME_BASED = fromString("TimeBased");

    /** Static value FrequencyBased for BackupScheduleKind. */
    public static final BackupScheduleKind FREQUENCY_BASED = fromString("FrequencyBased");

    /**
     * Creates or finds a BackupScheduleKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupScheduleKind.
     */
    @JsonCreator
    public static BackupScheduleKind fromString(String name) {
        return fromString(name, BackupScheduleKind.class);
    }

    /**
     * Gets known BackupScheduleKind values.
     *
     * @return known BackupScheduleKind values.
     */
    public static Collection<BackupScheduleKind> values() {
        return values(BackupScheduleKind.class);
    }
}
