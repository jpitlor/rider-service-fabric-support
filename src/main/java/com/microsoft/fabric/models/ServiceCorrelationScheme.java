package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceCorrelationScheme. */
public final class ServiceCorrelationScheme extends ExpandableStringEnum<ServiceCorrelationScheme> {
    /** Static value Invalid for ServiceCorrelationScheme. */
    public static final ServiceCorrelationScheme INVALID = fromString("Invalid");

    /** Static value Affinity for ServiceCorrelationScheme. */
    public static final ServiceCorrelationScheme AFFINITY = fromString("Affinity");

    /** Static value AlignedAffinity for ServiceCorrelationScheme. */
    public static final ServiceCorrelationScheme ALIGNED_AFFINITY = fromString("AlignedAffinity");

    /** Static value NonAlignedAffinity for ServiceCorrelationScheme. */
    public static final ServiceCorrelationScheme NON_ALIGNED_AFFINITY = fromString("NonAlignedAffinity");

    /**
     * Creates or finds a ServiceCorrelationScheme from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceCorrelationScheme.
     */
    @JsonCreator
    public static ServiceCorrelationScheme fromString(String name) {
        return fromString(name, ServiceCorrelationScheme.class);
    }

    /**
     * Gets known ServiceCorrelationScheme values.
     *
     * @return known ServiceCorrelationScheme values.
     */
    public static Collection<ServiceCorrelationScheme> values() {
        return values(ServiceCorrelationScheme.class);
    }
}
