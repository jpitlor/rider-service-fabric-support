package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupType. */
public final class BackupType extends ExpandableStringEnum<BackupType> {
    /** Static value Invalid for BackupType. */
    public static final BackupType INVALID = fromString("Invalid");

    /** Static value Full for BackupType. */
    public static final BackupType FULL = fromString("Full");

    /** Static value Incremental for BackupType. */
    public static final BackupType INCREMENTAL = fromString("Incremental");

    /**
     * Creates or finds a BackupType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupType.
     */
    @JsonCreator
    public static BackupType fromString(String name) {
        return fromString(name, BackupType.class);
    }

    /**
     * Gets known BackupType values.
     *
     * @return known BackupType values.
     */
    public static Collection<BackupType> values() {
        return values(BackupType.class);
    }
}
