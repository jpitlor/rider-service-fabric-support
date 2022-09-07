package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RepairTargetKind. */
public final class RepairTargetKind extends ExpandableStringEnum<RepairTargetKind> {
    /** Static value Invalid for RepairTargetKind. */
    public static final RepairTargetKind INVALID = fromString("Invalid");

    /** Static value Node for RepairTargetKind. */
    public static final RepairTargetKind NODE = fromString("Node");

    /**
     * Creates or finds a RepairTargetKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RepairTargetKind.
     */
    @JsonCreator
    public static RepairTargetKind fromString(String name) {
        return fromString(name, RepairTargetKind.class);
    }

    /**
     * Gets known RepairTargetKind values.
     *
     * @return known RepairTargetKind values.
     */
    public static Collection<RepairTargetKind> values() {
        return values(RepairTargetKind.class);
    }
}
