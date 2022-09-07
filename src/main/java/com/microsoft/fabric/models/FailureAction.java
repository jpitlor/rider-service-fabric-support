package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FailureAction. */
public final class FailureAction extends ExpandableStringEnum<FailureAction> {
    /** Static value Invalid for FailureAction. */
    public static final FailureAction INVALID = fromString("Invalid");

    /** Static value Rollback for FailureAction. */
    public static final FailureAction ROLLBACK = fromString("Rollback");

    /** Static value Manual for FailureAction. */
    public static final FailureAction MANUAL = fromString("Manual");

    /**
     * Creates or finds a FailureAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FailureAction.
     */
    @JsonCreator
    public static FailureAction fromString(String name) {
        return fromString(name, FailureAction.class);
    }

    /**
     * Gets known FailureAction values.
     *
     * @return known FailureAction values.
     */
    public static Collection<FailureAction> values() {
        return values(FailureAction.class);
    }
}
