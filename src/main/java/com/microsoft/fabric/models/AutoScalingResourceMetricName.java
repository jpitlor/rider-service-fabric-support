package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutoScalingResourceMetricName. */
public final class AutoScalingResourceMetricName extends ExpandableStringEnum<AutoScalingResourceMetricName> {
    /** Static value cpu for AutoScalingResourceMetricName. */
    public static final AutoScalingResourceMetricName CPU = fromString("cpu");

    /** Static value memoryInGB for AutoScalingResourceMetricName. */
    public static final AutoScalingResourceMetricName MEMORY_IN_GB = fromString("memoryInGB");

    /**
     * Creates or finds a AutoScalingResourceMetricName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoScalingResourceMetricName.
     */
    @JsonCreator
    public static AutoScalingResourceMetricName fromString(String name) {
        return fromString(name, AutoScalingResourceMetricName.class);
    }

    /**
     * Gets known AutoScalingResourceMetricName values.
     *
     * @return known AutoScalingResourceMetricName values.
     */
    public static Collection<AutoScalingResourceMetricName> values() {
        return values(AutoScalingResourceMetricName.class);
    }
}
