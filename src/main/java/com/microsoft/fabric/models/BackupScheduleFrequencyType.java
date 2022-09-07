package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupScheduleFrequencyType. */
public final class BackupScheduleFrequencyType extends ExpandableStringEnum<BackupScheduleFrequencyType> {
    /** Static value Invalid for BackupScheduleFrequencyType. */
    public static final BackupScheduleFrequencyType INVALID = fromString("Invalid");

    /** Static value Daily for BackupScheduleFrequencyType. */
    public static final BackupScheduleFrequencyType DAILY = fromString("Daily");

    /** Static value Weekly for BackupScheduleFrequencyType. */
    public static final BackupScheduleFrequencyType WEEKLY = fromString("Weekly");

    /**
     * Creates or finds a BackupScheduleFrequencyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupScheduleFrequencyType.
     */
    @JsonCreator
    public static BackupScheduleFrequencyType fromString(String name) {
        return fromString(name, BackupScheduleFrequencyType.class);
    }

    /**
     * Gets known BackupScheduleFrequencyType values.
     *
     * @return known BackupScheduleFrequencyType values.
     */
    public static Collection<BackupScheduleFrequencyType> values() {
        return values(BackupScheduleFrequencyType.class);
    }
}
