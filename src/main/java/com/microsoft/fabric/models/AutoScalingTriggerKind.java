package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutoScalingTriggerKind. */
public final class AutoScalingTriggerKind extends ExpandableStringEnum<AutoScalingTriggerKind> {
    /** Static value AverageLoad for AutoScalingTriggerKind. */
    public static final AutoScalingTriggerKind AVERAGE_LOAD = fromString("AverageLoad");

    /**
     * Creates or finds a AutoScalingTriggerKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoScalingTriggerKind.
     */
    @JsonCreator
    public static AutoScalingTriggerKind fromString(String name) {
        return fromString(name, AutoScalingTriggerKind.class);
    }

    /**
     * Gets known AutoScalingTriggerKind values.
     *
     * @return known AutoScalingTriggerKind values.
     */
    public static Collection<AutoScalingTriggerKind> values() {
        return values(AutoScalingTriggerKind.class);
    }
}
