package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReplicaStatus. */
public final class ReplicaStatus extends ExpandableStringEnum<ReplicaStatus> {
    /** Static value Invalid for ReplicaStatus. */
    public static final ReplicaStatus INVALID = fromString("Invalid");

    /** Static value InBuild for ReplicaStatus. */
    public static final ReplicaStatus IN_BUILD = fromString("InBuild");

    /** Static value Standby for ReplicaStatus. */
    public static final ReplicaStatus STANDBY = fromString("Standby");

    /** Static value Ready for ReplicaStatus. */
    public static final ReplicaStatus READY = fromString("Ready");

    /** Static value Down for ReplicaStatus. */
    public static final ReplicaStatus DOWN = fromString("Down");

    /** Static value Dropped for ReplicaStatus. */
    public static final ReplicaStatus DROPPED = fromString("Dropped");

    /**
     * Creates or finds a ReplicaStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicaStatus.
     */
    @JsonCreator
    public static ReplicaStatus fromString(String name) {
        return fromString(name, ReplicaStatus.class);
    }

    /**
     * Gets known ReplicaStatus values.
     *
     * @return known ReplicaStatus values.
     */
    public static Collection<ReplicaStatus> values() {
        return values(ReplicaStatus.class);
    }
}
