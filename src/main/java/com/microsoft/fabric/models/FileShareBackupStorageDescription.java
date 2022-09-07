package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the parameters for file share storage used for storing or enumerating backups. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "StorageKind")
@JsonTypeName("FileShare")
@Fluent
public final class FileShareBackupStorageDescription extends BackupStorageDescription {
    /*
     * UNC path of the file share where to store or enumerate backups from.
     */
    @JsonProperty(value = "Path", required = true)
    private String path;

    /*
     * Primary user name to access the file share.
     */
    @JsonProperty(value = "PrimaryUserName")
    private String primaryUserName;

    /*
     * Primary password to access the share location.
     */
    @JsonProperty(value = "PrimaryPassword")
    private String primaryPassword;

    /*
     * Secondary user name to access the file share.
     */
    @JsonProperty(value = "SecondaryUserName")
    private String secondaryUserName;

    /*
     * Secondary password to access the share location
     */
    @JsonProperty(value = "SecondaryPassword")
    private String secondaryPassword;

    /**
     * Get the path property: UNC path of the file share where to store or enumerate backups from.
     *
     * @return the path value.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path property: UNC path of the file share where to store or enumerate backups from.
     *
     * @param path the path value to set.
     * @return the FileShareBackupStorageDescription object itself.
     */
    public FileShareBackupStorageDescription setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the primaryUserName property: Primary user name to access the file share.
     *
     * @return the primaryUserName value.
     */
    public String getPrimaryUserName() {
        return this.primaryUserName;
    }

    /**
     * Set the primaryUserName property: Primary user name to access the file share.
     *
     * @param primaryUserName the primaryUserName value to set.
     * @return the FileShareBackupStorageDescription object itself.
     */
    public FileShareBackupStorageDescription setPrimaryUserName(String primaryUserName) {
        this.primaryUserName = primaryUserName;
        return this;
    }

    /**
     * Get the primaryPassword property: Primary password to access the share location.
     *
     * @return the primaryPassword value.
     */
    public String getPrimaryPassword() {
        return this.primaryPassword;
    }

    /**
     * Set the primaryPassword property: Primary password to access the share location.
     *
     * @param primaryPassword the primaryPassword value to set.
     * @return the FileShareBackupStorageDescription object itself.
     */
    public FileShareBackupStorageDescription setPrimaryPassword(String primaryPassword) {
        this.primaryPassword = primaryPassword;
        return this;
    }

    /**
     * Get the secondaryUserName property: Secondary user name to access the file share.
     *
     * @return the secondaryUserName value.
     */
    public String getSecondaryUserName() {
        return this.secondaryUserName;
    }

    /**
     * Set the secondaryUserName property: Secondary user name to access the file share.
     *
     * @param secondaryUserName the secondaryUserName value to set.
     * @return the FileShareBackupStorageDescription object itself.
     */
    public FileShareBackupStorageDescription setSecondaryUserName(String secondaryUserName) {
        this.secondaryUserName = secondaryUserName;
        return this;
    }

    /**
     * Get the secondaryPassword property: Secondary password to access the share location.
     *
     * @return the secondaryPassword value.
     */
    public String getSecondaryPassword() {
        return this.secondaryPassword;
    }

    /**
     * Set the secondaryPassword property: Secondary password to access the share location.
     *
     * @param secondaryPassword the secondaryPassword value to set.
     * @return the FileShareBackupStorageDescription object itself.
     */
    public FileShareBackupStorageDescription setSecondaryPassword(String secondaryPassword) {
        this.secondaryPassword = secondaryPassword;
        return this;
    }
}
