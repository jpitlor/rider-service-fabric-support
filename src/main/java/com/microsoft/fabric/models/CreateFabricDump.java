package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CreateFabricDump. */
public final class CreateFabricDump extends ExpandableStringEnum<CreateFabricDump> {
    /** Static value False for CreateFabricDump. */
    public static final CreateFabricDump FALSE = fromString("False");

    /** Static value True for CreateFabricDump. */
    public static final CreateFabricDump TRUE = fromString("True");

    /**
     * Creates or finds a CreateFabricDump from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CreateFabricDump.
     */
    @JsonCreator
    public static CreateFabricDump fromString(String name) {
        return fromString(name, CreateFabricDump.class);
    }

    /**
     * Gets known CreateFabricDump values.
     *
     * @return known CreateFabricDump values.
     */
    public static Collection<CreateFabricDump> values() {
        return values(CreateFabricDump.class);
    }
}
