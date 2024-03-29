package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReplicatorOperationName. */
public final class ReplicatorOperationName extends ExpandableStringEnum<ReplicatorOperationName> {
    /** Static value Invalid for ReplicatorOperationName. */
    public static final ReplicatorOperationName INVALID = fromString("Invalid");

    /** Static value None for ReplicatorOperationName. */
    public static final ReplicatorOperationName NONE = fromString("None");

    /** Static value Open for ReplicatorOperationName. */
    public static final ReplicatorOperationName OPEN = fromString("Open");

    /** Static value ChangeRole for ReplicatorOperationName. */
    public static final ReplicatorOperationName CHANGE_ROLE = fromString("ChangeRole");

    /** Static value UpdateEpoch for ReplicatorOperationName. */
    public static final ReplicatorOperationName UPDATE_EPOCH = fromString("UpdateEpoch");

    /** Static value Close for ReplicatorOperationName. */
    public static final ReplicatorOperationName CLOSE = fromString("Close");

    /** Static value Abort for ReplicatorOperationName. */
    public static final ReplicatorOperationName ABORT = fromString("Abort");

    /** Static value OnDataLoss for ReplicatorOperationName. */
    public static final ReplicatorOperationName ON_DATA_LOSS = fromString("OnDataLoss");

    /** Static value WaitForCatchup for ReplicatorOperationName. */
    public static final ReplicatorOperationName WAIT_FOR_CATCHUP = fromString("WaitForCatchup");

    /** Static value Build for ReplicatorOperationName. */
    public static final ReplicatorOperationName BUILD = fromString("Build");

    /**
     * Creates or finds a ReplicatorOperationName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicatorOperationName.
     */
    @JsonCreator
    public static ReplicatorOperationName fromString(String name) {
        return fromString(name, ReplicatorOperationName.class);
    }

    /**
     * Gets known ReplicatorOperationName values.
     *
     * @return known ReplicatorOperationName values.
     */
    public static Collection<ReplicatorOperationName> values() {
        return values(ReplicatorOperationName.class);
    }
}
