package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Key value store related information for the replica. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("KeyValueStore")
@Fluent
public final class KeyValueStoreReplicaStatus extends ReplicaStatusBase {
    /*
     * Value indicating the estimated number of rows in the underlying
     * database.
     */
    @JsonProperty(value = "DatabaseRowCountEstimate")
    private String databaseRowCountEstimate;

    /*
     * Value indicating the estimated size of the underlying database.
     */
    @JsonProperty(value = "DatabaseLogicalSizeEstimate")
    private String databaseLogicalSizeEstimate;

    /*
     * Value indicating the latest key-prefix filter applied to enumeration
     * during the callback. Null if there is no pending callback.
     */
    @JsonProperty(value = "CopyNotificationCurrentKeyFilter")
    private String copyNotificationCurrentKeyFilter;

    /*
     * Value indicating the latest number of keys enumerated during the
     * callback. 0 if there is no pending callback.
     */
    @JsonProperty(value = "CopyNotificationCurrentProgress")
    private String copyNotificationCurrentProgress;

    /*
     * Value indicating the current status details of the replica.
     */
    @JsonProperty(value = "StatusDetails")
    private String statusDetails;

    /**
     * Get the databaseRowCountEstimate property: Value indicating the estimated number of rows in the underlying
     * database.
     *
     * @return the databaseRowCountEstimate value.
     */
    public String getDatabaseRowCountEstimate() {
        return this.databaseRowCountEstimate;
    }

    /**
     * Set the databaseRowCountEstimate property: Value indicating the estimated number of rows in the underlying
     * database.
     *
     * @param databaseRowCountEstimate the databaseRowCountEstimate value to set.
     * @return the KeyValueStoreReplicaStatus object itself.
     */
    public KeyValueStoreReplicaStatus setDatabaseRowCountEstimate(String databaseRowCountEstimate) {
        this.databaseRowCountEstimate = databaseRowCountEstimate;
        return this;
    }

    /**
     * Get the databaseLogicalSizeEstimate property: Value indicating the estimated size of the underlying database.
     *
     * @return the databaseLogicalSizeEstimate value.
     */
    public String getDatabaseLogicalSizeEstimate() {
        return this.databaseLogicalSizeEstimate;
    }

    /**
     * Set the databaseLogicalSizeEstimate property: Value indicating the estimated size of the underlying database.
     *
     * @param databaseLogicalSizeEstimate the databaseLogicalSizeEstimate value to set.
     * @return the KeyValueStoreReplicaStatus object itself.
     */
    public KeyValueStoreReplicaStatus setDatabaseLogicalSizeEstimate(String databaseLogicalSizeEstimate) {
        this.databaseLogicalSizeEstimate = databaseLogicalSizeEstimate;
        return this;
    }

    /**
     * Get the copyNotificationCurrentKeyFilter property: Value indicating the latest key-prefix filter applied to
     * enumeration during the callback. Null if there is no pending callback.
     *
     * @return the copyNotificationCurrentKeyFilter value.
     */
    public String getCopyNotificationCurrentKeyFilter() {
        return this.copyNotificationCurrentKeyFilter;
    }

    /**
     * Set the copyNotificationCurrentKeyFilter property: Value indicating the latest key-prefix filter applied to
     * enumeration during the callback. Null if there is no pending callback.
     *
     * @param copyNotificationCurrentKeyFilter the copyNotificationCurrentKeyFilter value to set.
     * @return the KeyValueStoreReplicaStatus object itself.
     */
    public KeyValueStoreReplicaStatus setCopyNotificationCurrentKeyFilter(String copyNotificationCurrentKeyFilter) {
        this.copyNotificationCurrentKeyFilter = copyNotificationCurrentKeyFilter;
        return this;
    }

    /**
     * Get the copyNotificationCurrentProgress property: Value indicating the latest number of keys enumerated during
     * the callback. 0 if there is no pending callback.
     *
     * @return the copyNotificationCurrentProgress value.
     */
    public String getCopyNotificationCurrentProgress() {
        return this.copyNotificationCurrentProgress;
    }

    /**
     * Set the copyNotificationCurrentProgress property: Value indicating the latest number of keys enumerated during
     * the callback. 0 if there is no pending callback.
     *
     * @param copyNotificationCurrentProgress the copyNotificationCurrentProgress value to set.
     * @return the KeyValueStoreReplicaStatus object itself.
     */
    public KeyValueStoreReplicaStatus setCopyNotificationCurrentProgress(String copyNotificationCurrentProgress) {
        this.copyNotificationCurrentProgress = copyNotificationCurrentProgress;
        return this;
    }

    /**
     * Get the statusDetails property: Value indicating the current status details of the replica.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: Value indicating the current status details of the replica.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the KeyValueStoreReplicaStatus object itself.
     */
    public KeyValueStoreReplicaStatus setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }
}
