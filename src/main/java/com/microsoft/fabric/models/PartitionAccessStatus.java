package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartitionAccessStatus. */
public final class PartitionAccessStatus extends ExpandableStringEnum<PartitionAccessStatus> {
    /** Static value Invalid for PartitionAccessStatus. */
    public static final PartitionAccessStatus INVALID = fromString("Invalid");

    /** Static value Granted for PartitionAccessStatus. */
    public static final PartitionAccessStatus GRANTED = fromString("Granted");

    /** Static value ReconfigurationPending for PartitionAccessStatus. */
    public static final PartitionAccessStatus RECONFIGURATION_PENDING = fromString("ReconfigurationPending");

    /** Static value NotPrimary for PartitionAccessStatus. */
    public static final PartitionAccessStatus NOT_PRIMARY = fromString("NotPrimary");

    /** Static value NoWriteQuorum for PartitionAccessStatus. */
    public static final PartitionAccessStatus NO_WRITE_QUORUM = fromString("NoWriteQuorum");

    /**
     * Creates or finds a PartitionAccessStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartitionAccessStatus.
     */
    @JsonCreator
    public static PartitionAccessStatus fromString(String name) {
        return fromString(name, PartitionAccessStatus.class);
    }

    /**
     * Gets known PartitionAccessStatus values.
     *
     * @return known PartitionAccessStatus values.
     */
    public static Collection<PartitionAccessStatus> values() {
        return values(PartitionAccessStatus.class);
    }
}
