package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceLoadMetricWeight. */
public final class ServiceLoadMetricWeight extends ExpandableStringEnum<ServiceLoadMetricWeight> {
    /** Static value Zero for ServiceLoadMetricWeight. */
    public static final ServiceLoadMetricWeight ZERO = fromString("Zero");

    /** Static value Low for ServiceLoadMetricWeight. */
    public static final ServiceLoadMetricWeight LOW = fromString("Low");

    /** Static value Medium for ServiceLoadMetricWeight. */
    public static final ServiceLoadMetricWeight MEDIUM = fromString("Medium");

    /** Static value High for ServiceLoadMetricWeight. */
    public static final ServiceLoadMetricWeight HIGH = fromString("High");

    /**
     * Creates or finds a ServiceLoadMetricWeight from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceLoadMetricWeight.
     */
    @JsonCreator
    public static ServiceLoadMetricWeight fromString(String name) {
        return fromString(name, ServiceLoadMetricWeight.class);
    }

    /**
     * Gets known ServiceLoadMetricWeight values.
     *
     * @return known ServiceLoadMetricWeight values.
     */
    public static Collection<ServiceLoadMetricWeight> values() {
        return values(ServiceLoadMetricWeight.class);
    }
}
