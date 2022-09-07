package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationType. */
public final class OperationType extends ExpandableStringEnum<OperationType> {
    /** Static value Invalid for OperationType. */
    public static final OperationType INVALID = fromString("Invalid");

    /** Static value PartitionDataLoss for OperationType. */
    public static final OperationType PARTITION_DATA_LOSS = fromString("PartitionDataLoss");

    /** Static value PartitionQuorumLoss for OperationType. */
    public static final OperationType PARTITION_QUORUM_LOSS = fromString("PartitionQuorumLoss");

    /** Static value PartitionRestart for OperationType. */
    public static final OperationType PARTITION_RESTART = fromString("PartitionRestart");

    /** Static value NodeTransition for OperationType. */
    public static final OperationType NODE_TRANSITION = fromString("NodeTransition");

    /**
     * Creates or finds a OperationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationType.
     */
    @JsonCreator
    public static OperationType fromString(String name) {
        return fromString(name, OperationType.class);
    }

    /**
     * Gets known OperationType values.
     *
     * @return known OperationType values.
     */
    public static Collection<OperationType> values() {
        return values(OperationType.class);
    }
}
