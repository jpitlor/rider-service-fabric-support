package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReplicaRole. */
public final class ReplicaRole extends ExpandableStringEnum<ReplicaRole> {
    /** Static value Unknown for ReplicaRole. */
    public static final ReplicaRole UNKNOWN = fromString("Unknown");

    /** Static value None for ReplicaRole. */
    public static final ReplicaRole NONE = fromString("None");

    /** Static value Primary for ReplicaRole. */
    public static final ReplicaRole PRIMARY = fromString("Primary");

    /** Static value IdleSecondary for ReplicaRole. */
    public static final ReplicaRole IDLE_SECONDARY = fromString("IdleSecondary");

    /** Static value ActiveSecondary for ReplicaRole. */
    public static final ReplicaRole ACTIVE_SECONDARY = fromString("ActiveSecondary");

    /** Static value IdleAuxiliary for ReplicaRole. */
    public static final ReplicaRole IDLE_AUXILIARY = fromString("IdleAuxiliary");

    /** Static value ActiveAuxiliary for ReplicaRole. */
    public static final ReplicaRole ACTIVE_AUXILIARY = fromString("ActiveAuxiliary");

    /** Static value PrimaryAuxiliary for ReplicaRole. */
    public static final ReplicaRole PRIMARY_AUXILIARY = fromString("PrimaryAuxiliary");

    /**
     * Creates or finds a ReplicaRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicaRole.
     */
    @JsonCreator
    public static ReplicaRole fromString(String name) {
        return fromString(name, ReplicaRole.class);
    }

    /**
     * Gets known ReplicaRole values.
     *
     * @return known ReplicaRole values.
     */
    public static Collection<ReplicaRole> values() {
        return values(ReplicaRole.class);
    }
}
