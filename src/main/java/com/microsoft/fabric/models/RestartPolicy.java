package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RestartPolicy. */
public final class RestartPolicy extends ExpandableStringEnum<RestartPolicy> {
    /** Static value OnFailure for RestartPolicy. */
    public static final RestartPolicy ON_FAILURE = fromString("OnFailure");

    /** Static value Never for RestartPolicy. */
    public static final RestartPolicy NEVER = fromString("Never");

    /**
     * Creates or finds a RestartPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestartPolicy.
     */
    @JsonCreator
    public static RestartPolicy fromString(String name) {
        return fromString(name, RestartPolicy.class);
    }

    /**
     * Gets known RestartPolicy values.
     *
     * @return known RestartPolicy values.
     */
    public static Collection<RestartPolicy> values() {
        return values(RestartPolicy.class);
    }
}
