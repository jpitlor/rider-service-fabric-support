package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes how the instance will behave. */
@Fluent
public final class InstanceLifecycleDescription {
    /*
     * If set to true, move/swap replica to original location after upgrade.
     */
    @JsonProperty(value = "RestoreReplicaLocationAfterUpgrade")
    private Boolean restoreReplicaLocationAfterUpgrade;

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
     * @return the InstanceLifecycleDescription object itself.
     */
    public InstanceLifecycleDescription setRestoreReplicaLocationAfterUpgrade(
            Boolean restoreReplicaLocationAfterUpgrade) {
        this.restoreReplicaLocationAfterUpgrade = restoreReplicaLocationAfterUpgrade;
        return this;
    }
}
