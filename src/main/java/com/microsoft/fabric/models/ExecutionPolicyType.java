package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExecutionPolicyType. */
public final class ExecutionPolicyType extends ExpandableStringEnum<ExecutionPolicyType> {
    /** Static value Default for ExecutionPolicyType. */
    public static final ExecutionPolicyType DEFAULT = fromString("Default");

    /** Static value RunToCompletion for ExecutionPolicyType. */
    public static final ExecutionPolicyType RUN_TO_COMPLETION = fromString("RunToCompletion");

    /**
     * Creates or finds a ExecutionPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExecutionPolicyType.
     */
    @JsonCreator
    public static ExecutionPolicyType fromString(String name) {
        return fromString(name, ExecutionPolicyType.class);
    }

    /**
     * Gets known ExecutionPolicyType values.
     *
     * @return known ExecutionPolicyType values.
     */
    public static Collection<ExecutionPolicyType> values() {
        return values(ExecutionPolicyType.class);
    }
}
