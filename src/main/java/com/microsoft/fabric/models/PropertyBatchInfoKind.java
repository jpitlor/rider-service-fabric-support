package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PropertyBatchInfoKind. */
public final class PropertyBatchInfoKind extends ExpandableStringEnum<PropertyBatchInfoKind> {
    /** Static value Invalid for PropertyBatchInfoKind. */
    public static final PropertyBatchInfoKind INVALID = fromString("Invalid");

    /** Static value Successful for PropertyBatchInfoKind. */
    public static final PropertyBatchInfoKind SUCCESSFUL = fromString("Successful");

    /** Static value Failed for PropertyBatchInfoKind. */
    public static final PropertyBatchInfoKind FAILED = fromString("Failed");

    /**
     * Creates or finds a PropertyBatchInfoKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PropertyBatchInfoKind.
     */
    @JsonCreator
    public static PropertyBatchInfoKind fromString(String name) {
        return fromString(name, PropertyBatchInfoKind.class);
    }

    /**
     * Gets known PropertyBatchInfoKind values.
     *
     * @return known PropertyBatchInfoKind values.
     */
    public static Collection<PropertyBatchInfoKind> values() {
        return values(PropertyBatchInfoKind.class);
    }
}
