package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupPolicyScope. */
public final class BackupPolicyScope extends ExpandableStringEnum<BackupPolicyScope> {
    /** Static value Invalid for BackupPolicyScope. */
    public static final BackupPolicyScope INVALID = fromString("Invalid");

    /** Static value Partition for BackupPolicyScope. */
    public static final BackupPolicyScope PARTITION = fromString("Partition");

    /** Static value Service for BackupPolicyScope. */
    public static final BackupPolicyScope SERVICE = fromString("Service");

    /** Static value Application for BackupPolicyScope. */
    public static final BackupPolicyScope APPLICATION = fromString("Application");

    /**
     * Creates or finds a BackupPolicyScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupPolicyScope.
     */
    @JsonCreator
    public static BackupPolicyScope fromString(String name) {
        return fromString(name, BackupPolicyScope.class);
    }

    /**
     * Gets known BackupPolicyScope values.
     *
     * @return known BackupPolicyScope values.
     */
    public static Collection<BackupPolicyScope> values() {
        return values(BackupPolicyScope.class);
    }
}
