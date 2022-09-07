package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RestartPartitionMode. */
public final class RestartPartitionMode extends ExpandableStringEnum<RestartPartitionMode> {
    /** Static value Invalid for RestartPartitionMode. */
    public static final RestartPartitionMode INVALID = fromString("Invalid");

    /** Static value AllReplicasOrInstances for RestartPartitionMode. */
    public static final RestartPartitionMode ALL_REPLICAS_OR_INSTANCES = fromString("AllReplicasOrInstances");

    /** Static value OnlyActiveSecondaries for RestartPartitionMode. */
    public static final RestartPartitionMode ONLY_ACTIVE_SECONDARIES = fromString("OnlyActiveSecondaries");

    /**
     * Creates or finds a RestartPartitionMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestartPartitionMode.
     */
    @JsonCreator
    public static RestartPartitionMode fromString(String name) {
        return fromString(name, RestartPartitionMode.class);
    }

    /**
     * Gets known RestartPartitionMode values.
     *
     * @return known RestartPartitionMode values.
     */
    public static Collection<RestartPartitionMode> values() {
        return values(RestartPartitionMode.class);
    }
}
