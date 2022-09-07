package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NodeUpgradePhase. */
public final class NodeUpgradePhase extends ExpandableStringEnum<NodeUpgradePhase> {
    /** Static value Invalid for NodeUpgradePhase. */
    public static final NodeUpgradePhase INVALID = fromString("Invalid");

    /** Static value PreUpgradeSafetyCheck for NodeUpgradePhase. */
    public static final NodeUpgradePhase PRE_UPGRADE_SAFETY_CHECK = fromString("PreUpgradeSafetyCheck");

    /** Static value Upgrading for NodeUpgradePhase. */
    public static final NodeUpgradePhase UPGRADING = fromString("Upgrading");

    /** Static value PostUpgradeSafetyCheck for NodeUpgradePhase. */
    public static final NodeUpgradePhase POST_UPGRADE_SAFETY_CHECK = fromString("PostUpgradeSafetyCheck");

    /**
     * Creates or finds a NodeUpgradePhase from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeUpgradePhase.
     */
    @JsonCreator
    public static NodeUpgradePhase fromString(String name) {
        return fromString(name, NodeUpgradePhase.class);
    }

    /**
     * Gets known NodeUpgradePhase values.
     *
     * @return known NodeUpgradePhase values.
     */
    public static Collection<NodeUpgradePhase> values() {
        return values(NodeUpgradePhase.class);
    }
}
