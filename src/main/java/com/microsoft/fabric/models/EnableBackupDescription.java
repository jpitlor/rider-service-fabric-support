package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the parameters needed to enable periodic backup. */
@Fluent
public final class EnableBackupDescription {
    /*
     * Name of the backup policy to be used for enabling periodic backups.
     */
    @JsonProperty(value = "BackupPolicyName", required = true)
    private String backupPolicyName;

    /**
     * Get the backupPolicyName property: Name of the backup policy to be used for enabling periodic backups.
     *
     * @return the backupPolicyName value.
     */
    public String getBackupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * Set the backupPolicyName property: Name of the backup policy to be used for enabling periodic backups.
     *
     * @param backupPolicyName the backupPolicyName value to set.
     * @return the EnableBackupDescription object itself.
     */
    public EnableBackupDescription setBackupPolicyName(String backupPolicyName) {
        this.backupPolicyName = backupPolicyName;
        return this;
    }
}
