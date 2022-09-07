package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes how the replica will behave. */
@Fluent
public final class ReplicaLifecycleDescription {
    /*
     * If set to true, replicas with a target replica set size of 1 will be
     * permitted to move during upgrade.
     */
    @JsonProperty(value = "IsSingletonReplicaMoveAllowedDuringUpgrade")
    private Boolean isSingletonReplicaMoveAllowedDuringUpgrade;

    /*
     * If set to true, move/swap replica to original location after upgrade.
     */
    @JsonProperty(value = "RestoreReplicaLocationAfterUpgrade")
    private Boolean restoreReplicaLocationAfterUpgrade;

    /**
     * Get the isSingletonReplicaMoveAllowedDuringUpgrade property: If set to true, replicas with a target replica set
     * size of 1 will be permitted to move during upgrade.
     *
     * @return the isSingletonReplicaMoveAllowedDuringUpgrade value.
     */
    public Boolean isSingletonReplicaMoveAllowedDuringUpgrade() {
        return this.isSingletonReplicaMoveAllowedDuringUpgrade;
    }

    /**
     * Set the isSingletonReplicaMoveAllowedDuringUpgrade property: If set to true, replicas with a target replica set
     * size of 1 will be permitted to move during upgrade.
     *
     * @param isSingletonReplicaMoveAllowedDuringUpgrade the isSingletonReplicaMoveAllowedDuringUpgrade value to set.
     * @return the ReplicaLifecycleDescription object itself.
     */
    public ReplicaLifecycleDescription setIsSingletonReplicaMoveAllowedDuringUpgrade(
            Boolean isSingletonReplicaMoveAllowedDuringUpgrade) {
        this.isSingletonReplicaMoveAllowedDuringUpgrade = isSingletonReplicaMoveAllowedDuringUpgrade;
        return this;
    }

    /**
     * Get the restoreReplicaLocationAfterUpgrade property: If set to true, move/swap replica to original location after
     * upgrade.
     *
     * @return the restoreReplicaLocationAfterUpgrade value.
     */
    public Boolean isRestoreReplicaLocationAfterUpgrade() {
        return this.restoreReplicaLocationAfterUpgrade;
    }

    /**
     * Set the restoreReplicaLocationAfterUpgrade property: If set to true, move/swap replica to original location after
     * upgrade.
     *
     * @param restoreReplicaLocationAfterUpgrade the restoreReplicaLocationAfterUpgrade value to set.
     * @return the ReplicaLifecycleDescription object itself.
     */
    public ReplicaLifecycleDescription setRestoreReplicaLocationAfterUpgrade(
            Boolean restoreReplicaLocationAfterUpgrade) {
        this.restoreReplicaLocationAfterUpgrade = restoreReplicaLocationAfterUpgrade;
        return this;
    }
}
