package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScalingTriggerKind. */
public final class ScalingTriggerKind extends ExpandableStringEnum<ScalingTriggerKind> {
    /** Static value Invalid for ScalingTriggerKind. */
    public static final ScalingTriggerKind INVALID = fromString("Invalid");

    /** Static value AveragePartitionLoad for ScalingTriggerKind. */
    public static final ScalingTriggerKind AVERAGE_PARTITION_LOAD = fromString("AveragePartitionLoad");

    /** Static value AverageServiceLoad for ScalingTriggerKind. */
    public static final ScalingTriggerKind AVERAGE_SERVICE_LOAD = fromString("AverageServiceLoad");

    /**
     * Creates or finds a ScalingTriggerKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScalingTriggerKind.
     */
    @JsonCreator
    public static ScalingTriggerKind fromString(String name) {
        return fromString(name, ScalingTriggerKind.class);
    }

    /**
     * Gets known ScalingTriggerKind values.
     *
     * @return known ScalingTriggerKind values.
     */
    public static Collection<ScalingTriggerKind> values() {
        return values(ScalingTriggerKind.class);
    }
}
