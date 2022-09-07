package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupState. */
public final class BackupState extends ExpandableStringEnum<BackupState> {
    /** Static value Invalid for BackupState. */
    public static final BackupState INVALID = fromString("Invalid");

    /** Static value Accepted for BackupState. */
    public static final BackupState ACCEPTED = fromString("Accepted");

    /** Static value BackupInProgress for BackupState. */
    public static final BackupState BACKUP_IN_PROGRESS = fromString("BackupInProgress");

    /** Static value Success for BackupState. */
    public static final BackupState SUCCESS = fromString("Success");

    /** Static value Failure for BackupState. */
    public static final BackupState FAILURE = fromString("Failure");

    /** Static value Timeout for BackupState. */
    public static final BackupState TIMEOUT = fromString("Timeout");

    /**
     * Creates or finds a BackupState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupState.
     */
    @JsonCreator
    public static BackupState fromString(String name) {
        return fromString(name, BackupState.class);
    }

    /**
     * Gets known BackupState values.
     *
     * @return known BackupState values.
     */
    public static Collection<BackupState> values() {
        return values(BackupState.class);
    }
}
