package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutoScalingMetricKind. */
public final class AutoScalingMetricKind extends ExpandableStringEnum<AutoScalingMetricKind> {
    /** Static value Resource for AutoScalingMetricKind. */
    public static final AutoScalingMetricKind RESOURCE = fromString("Resource");

    /**
     * Creates or finds a AutoScalingMetricKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoScalingMetricKind.
     */
    @JsonCreator
    public static AutoScalingMetricKind fromString(String name) {
        return fromString(name, AutoScalingMetricKind.class);
    }

    /**
     * Gets known AutoScalingMetricKind values.
     *
     * @return known AutoScalingMetricKind values.
     */
    public static Collection<AutoScalingMetricKind> values() {
        return values(AutoScalingMetricKind.class);
    }
}
