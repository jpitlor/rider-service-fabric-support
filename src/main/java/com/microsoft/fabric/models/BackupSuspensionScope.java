package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupSuspensionScope. */
public final class BackupSuspensionScope extends ExpandableStringEnum<BackupSuspensionScope> {
    /** Static value Invalid for BackupSuspensionScope. */
    public static final BackupSuspensionScope INVALID = fromString("Invalid");

    /** Static value Partition for BackupSuspensionScope. */
    public static final BackupSuspensionScope PARTITION = fromString("Partition");

    /** Static value Service for BackupSuspensionScope. */
    public static final BackupSuspensionScope SERVICE = fromString("Service");

    /** Static value Application for BackupSuspensionScope. */
    public static final BackupSuspensionScope APPLICATION = fromString("Application");

    /**
     * Creates or finds a BackupSuspensionScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupSuspensionScope.
     */
    @JsonCreator
    public static BackupSuspensionScope fromString(String name) {
        return fromString(name, BackupSuspensionScope.class);
    }

    /**
     * Gets known BackupSuspensionScope values.
     *
     * @return known BackupSuspensionScope values.
     */
    public static Collection<BackupSuspensionScope> values() {
        return values(BackupSuspensionScope.class);
    }
}
