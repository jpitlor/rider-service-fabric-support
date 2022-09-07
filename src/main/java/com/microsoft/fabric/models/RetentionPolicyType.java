package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RetentionPolicyType. */
public final class RetentionPolicyType extends ExpandableStringEnum<RetentionPolicyType> {
    /** Static value Basic for RetentionPolicyType. */
    public static final RetentionPolicyType BASIC = fromString("Basic");

    /** Static value Invalid for RetentionPolicyType. */
    public static final RetentionPolicyType INVALID = fromString("Invalid");

    /**
     * Creates or finds a RetentionPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RetentionPolicyType.
     */
    @JsonCreator
    public static RetentionPolicyType fromString(String name) {
        return fromString(name, RetentionPolicyType.class);
    }

    /**
     * Gets known RetentionPolicyType values.
     *
     * @return known RetentionPolicyType values.
     */
    public static Collection<RetentionPolicyType> values() {
        return values(RetentionPolicyType.class);
    }
}
