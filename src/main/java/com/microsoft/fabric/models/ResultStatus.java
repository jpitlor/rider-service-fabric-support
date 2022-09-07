package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResultStatus. */
public final class ResultStatus extends ExpandableStringEnum<ResultStatus> {
    /** Static value Invalid for ResultStatus. */
    public static final ResultStatus INVALID = fromString("Invalid");

    /** Static value Succeeded for ResultStatus. */
    public static final ResultStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Cancelled for ResultStatus. */
    public static final ResultStatus CANCELLED = fromString("Cancelled");

    /** Static value Interrupted for ResultStatus. */
    public static final ResultStatus INTERRUPTED = fromString("Interrupted");

    /** Static value Failed for ResultStatus. */
    public static final ResultStatus FAILED = fromString("Failed");

    /** Static value Pending for ResultStatus. */
    public static final ResultStatus PENDING = fromString("Pending");

    /**
     * Creates or finds a ResultStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResultStatus.
     */
    @JsonCreator
    public static ResultStatus fromString(String name) {
        return fromString(name, ResultStatus.class);
    }

    /**
     * Gets known ResultStatus values.
     *
     * @return known ResultStatus values.
     */
    public static Collection<ResultStatus> values() {
        return values(ResultStatus.class);
    }
}
