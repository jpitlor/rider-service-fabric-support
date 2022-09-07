package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** It describes the body parameters while disabling backup of a backup entity(Application/Service/Partition). */
@Fluent
public final class DisableBackupDescription {
    /*
     * Boolean flag to delete backups. It can be set to true for deleting all
     * the backups which were created for the backup entity that is getting
     * disabled for backup.
     */
    @JsonProperty(value = "CleanBackup", required = true)
    private boolean cleanBackup;

    /**
     * Get the cleanBackup property: Boolean flag to delete backups. It can be set to true for deleting all the backups
     * which were created for the backup entity that is getting disabled for backup.
     *
     * @return the cleanBackup value.
     */
    public boolean isCleanBackup() {
        return this.cleanBackup;
    }

    /**
     * Set the cleanBackup property: Boolean flag to delete backups. It can be set to true for deleting all the backups
     * which were created for the backup entity that is getting disabled for backup.
     *
     * @param cleanBackup the cleanBackup value to set.
     * @return the DisableBackupDescription object itself.
     */
    public DisableBackupDescription setCleanBackup(boolean cleanBackup) {
        this.cleanBackup = cleanBackup;
        return this;
    }
}
