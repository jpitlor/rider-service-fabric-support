package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ComposeDeploymentUpgradeState. */
public final class ComposeDeploymentUpgradeState extends ExpandableStringEnum<ComposeDeploymentUpgradeState> {
    /** Static value Invalid for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState INVALID = fromString("Invalid");

    /** Static value ProvisioningTarget for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState PROVISIONING_TARGET = fromString("ProvisioningTarget");

    /** Static value RollingForwardInProgress for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState ROLLING_FORWARD_IN_PROGRESS =
            fromString("RollingForwardInProgress");

    /** Static value RollingForwardPending for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState ROLLING_FORWARD_PENDING = fromString("RollingForwardPending");

    /** Static value UnprovisioningCurrent for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState UNPROVISIONING_CURRENT = fromString("UnprovisioningCurrent");

    /** Static value RollingForwardCompleted for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState ROLLING_FORWARD_COMPLETED = fromString("RollingForwardCompleted");

    /** Static value RollingBackInProgress for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState ROLLING_BACK_IN_PROGRESS = fromString("RollingBackInProgress");

    /** Static value UnprovisioningTarget for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState UNPROVISIONING_TARGET = fromString("UnprovisioningTarget");

    /** Static value RollingBackCompleted for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState ROLLING_BACK_COMPLETED = fromString("RollingBackCompleted");

    /** Static value Failed for ComposeDeploymentUpgradeState. */
    public static final ComposeDeploymentUpgradeState FAILED = fromString("Failed");

    /**
     * Creates or finds a ComposeDeploymentUpgradeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ComposeDeploymentUpgradeState.
     */
    @JsonCreator
    public static ComposeDeploymentUpgradeState fromString(String name) {
        return fromString(name, ComposeDeploymentUpgradeState.class);
    }

    /**
     * Gets known ComposeDeploymentUpgradeState values.
     *
     * @return known ComposeDeploymentUpgradeState values.
     */
    public static Collection<ComposeDeploymentUpgradeState> values() {
        return values(ComposeDeploymentUpgradeState.class);
    }
}
