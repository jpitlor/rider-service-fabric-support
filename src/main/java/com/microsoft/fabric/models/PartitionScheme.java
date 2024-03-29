package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartitionScheme. */
public final class PartitionScheme extends ExpandableStringEnum<PartitionScheme> {
    /** Static value Invalid for PartitionScheme. */
    public static final PartitionScheme INVALID = fromString("Invalid");

    /** Static value Singleton for PartitionScheme. */
    public static final PartitionScheme SINGLETON = fromString("Singleton");

    /** Static value UniformInt64Range for PartitionScheme. */
    public static final PartitionScheme UNIFORM_INT64RANGE = fromString("UniformInt64Range");

    /** Static value Named for PartitionScheme. */
    public static final PartitionScheme NAMED = fromString("Named");

    /**
     * Creates or finds a PartitionScheme from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartitionScheme.
     */
    @JsonCreator
    public static PartitionScheme fromString(String name) {
        return fromString(name, PartitionScheme.class);
    }

    /**
     * Gets known PartitionScheme values.
     *
     * @return known PartitionScheme values.
     */
    public static Collection<PartitionScheme> values() {
        return values(PartitionScheme.class);
    }
}
