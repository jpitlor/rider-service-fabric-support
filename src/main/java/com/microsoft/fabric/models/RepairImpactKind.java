package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RepairImpactKind. */
public final class RepairImpactKind extends ExpandableStringEnum<RepairImpactKind> {
    /** Static value Invalid for RepairImpactKind. */
    public static final RepairImpactKind INVALID = fromString("Invalid");

    /** Static value Node for RepairImpactKind. */
    public static final RepairImpactKind NODE = fromString("Node");

    /**
     * Creates or finds a RepairImpactKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RepairImpactKind.
     */
    @JsonCreator
    public static RepairImpactKind fromString(String name) {
        return fromString(name, RepairImpactKind.class);
    }

    /**
     * Gets known RepairImpactKind values.
     *
     * @return known RepairImpactKind values.
     */
    public static Collection<RepairImpactKind> values() {
        return values(RepairImpactKind.class);
    }
}
