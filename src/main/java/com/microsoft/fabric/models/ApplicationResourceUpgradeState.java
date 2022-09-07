package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationResourceUpgradeState. */
public final class ApplicationResourceUpgradeState extends ExpandableStringEnum<ApplicationResourceUpgradeState> {
    /** Static value Invalid for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState INVALID = fromString("Invalid");

    /** Static value ProvisioningTarget for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState PROVISIONING_TARGET = fromString("ProvisioningTarget");

    /** Static value RollingForward for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState ROLLING_FORWARD = fromString("RollingForward");

    /** Static value UnprovisioningCurrent for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState UNPROVISIONING_CURRENT = fromString("UnprovisioningCurrent");

    /** Static value CompletedRollforward for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState COMPLETED_ROLLFORWARD = fromString("CompletedRollforward");

    /** Static value RollingBack for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState ROLLING_BACK = fromString("RollingBack");

    /** Static value UnprovisioningTarget for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState UNPROVISIONING_TARGET = fromString("UnprovisioningTarget");

    /** Static value CompletedRollback for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState COMPLETED_ROLLBACK = fromString("CompletedRollback");

    /** Static value Failed for ApplicationResourceUpgradeState. */
    public static final ApplicationResourceUpgradeState FAILED = fromString("Failed");

    /**
     * Creates or finds a ApplicationResourceUpgradeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationResourceUpgradeState.
     */
    @JsonCreator
    public static ApplicationResourceUpgradeState fromString(String name) {
        return fromString(name, ApplicationResourceUpgradeState.class);
    }

    /**
     * Gets known ApplicationResourceUpgradeState values.
     *
     * @return known ApplicationResourceUpgradeState values.
     */
    public static Collection<ApplicationResourceUpgradeState> values() {
        return values(ApplicationResourceUpgradeState.class);
    }
}
