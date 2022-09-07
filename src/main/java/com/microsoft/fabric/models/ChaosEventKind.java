package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChaosEventKind. */
public final class ChaosEventKind extends ExpandableStringEnum<ChaosEventKind> {
    /** Static value Invalid for ChaosEventKind. */
    public static final ChaosEventKind INVALID = fromString("Invalid");

    /** Static value Started for ChaosEventKind. */
    public static final ChaosEventKind STARTED = fromString("Started");

    /** Static value ExecutingFaults for ChaosEventKind. */
    public static final ChaosEventKind EXECUTING_FAULTS = fromString("ExecutingFaults");

    /** Static value Waiting for ChaosEventKind. */
    public static final ChaosEventKind WAITING = fromString("Waiting");

    /** Static value ValidationFailed for ChaosEventKind. */
    public static final ChaosEventKind VALIDATION_FAILED = fromString("ValidationFailed");

    /** Static value TestError for ChaosEventKind. */
    public static final ChaosEventKind TEST_ERROR = fromString("TestError");

    /** Static value Stopped for ChaosEventKind. */
    public static final ChaosEventKind STOPPED = fromString("Stopped");

    /**
     * Creates or finds a ChaosEventKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChaosEventKind.
     */
    @JsonCreator
    public static ChaosEventKind fromString(String name) {
        return fromString(name, ChaosEventKind.class);
    }

    /**
     * Gets known ChaosEventKind values.
     *
     * @return known ChaosEventKind values.
     */
    public static Collection<ChaosEventKind> values() {
        return values(ChaosEventKind.class);
    }
}
