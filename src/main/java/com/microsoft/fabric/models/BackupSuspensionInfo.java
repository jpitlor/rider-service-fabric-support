package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the backup suspension details. */
@Fluent
public final class BackupSuspensionInfo {
    /*
     * Indicates whether periodic backup is suspended at this level or not.
     */
    @JsonProperty(value = "IsSuspended")
    private Boolean isSuspended;

    /*
     * Specifies the scope at which the backup suspension was applied.
     */
    @JsonProperty(value = "SuspensionInheritedFrom")
    private BackupSuspensionScope suspensionInheritedFrom;

    /**
     * Get the isSuspended property: Indicates whether periodic backup is suspended at this level or not.
     *
     * @return the isSuspended value.
     */
    public Boolean isSuspended() {
        return this.isSuspended;
    }

    /**
     * Set the isSuspended property: Indicates whether periodic backup is suspended at this level or not.
     *
     * @param isSuspended the isSuspended value to set.
     * @return the BackupSuspensionInfo object itself.
     */
    public BackupSuspensionInfo setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
        return this;
    }

    /**
     * Get the suspensionInheritedFrom property: Specifies the scope at which the backup suspension was applied.
     *
     * @return the suspensionInheritedFrom value.
     */
    public BackupSuspensionScope getSuspensionInheritedFrom() {
        return this.suspensionInheritedFrom;
    }

    /**
     * Set the suspensionInheritedFrom property: Specifies the scope at which the backup suspension was applied.
     *
     * @param suspensionInheritedFrom the suspensionInheritedFrom value to set.
     * @return the BackupSuspensionInfo object itself.
     */
    public BackupSuspensionInfo setSuspensionInheritedFrom(BackupSuspensionScope suspensionInheritedFrom) {
        this.suspensionInheritedFrom = suspensionInheritedFrom;
        return this;
    }
}
