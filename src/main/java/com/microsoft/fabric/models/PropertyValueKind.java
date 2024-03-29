package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PropertyValueKind. */
public final class PropertyValueKind extends ExpandableStringEnum<PropertyValueKind> {
    /** Static value Invalid for PropertyValueKind. */
    public static final PropertyValueKind INVALID = fromString("Invalid");

    /** Static value Binary for PropertyValueKind. */
    public static final PropertyValueKind BINARY = fromString("Binary");

    /** Static value Int64 for PropertyValueKind. */
    public static final PropertyValueKind INT64 = fromString("Int64");

    /** Static value Double for PropertyValueKind. */
    public static final PropertyValueKind DOUBLE = fromString("Double");

    /** Static value String for PropertyValueKind. */
    public static final PropertyValueKind STRING = fromString("String");

    /** Static value Guid for PropertyValueKind. */
    public static final PropertyValueKind GUID = fromString("Guid");

    /**
     * Creates or finds a PropertyValueKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PropertyValueKind.
     */
    @JsonCreator
    public static PropertyValueKind fromString(String name) {
        return fromString(name, PropertyValueKind.class);
    }

    /**
     * Gets known PropertyValueKind values.
     *
     * @return known PropertyValueKind values.
     */
    public static Collection<PropertyValueKind> values() {
        return values(PropertyValueKind.class);
    }
}
