package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChaosScheduleStatus. */
public final class ChaosScheduleStatus extends ExpandableStringEnum<ChaosScheduleStatus> {
    /** Static value Invalid for ChaosScheduleStatus. */
    public static final ChaosScheduleStatus INVALID = fromString("Invalid");

    /** Static value Stopped for ChaosScheduleStatus. */
    public static final ChaosScheduleStatus STOPPED = fromString("Stopped");

    /** Static value Active for ChaosScheduleStatus. */
    public static final ChaosScheduleStatus ACTIVE = fromString("Active");

    /** Static value Expired for ChaosScheduleStatus. */
    public static final ChaosScheduleStatus EXPIRED = fromString("Expired");

    /** Static value Pending for ChaosScheduleStatus. */
    public static final ChaosScheduleStatus PENDING = fromString("Pending");

    /**
     * Creates or finds a ChaosScheduleStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChaosScheduleStatus.
     */
    @JsonCreator
    public static ChaosScheduleStatus fromString(String name) {
        return fromString(name, ChaosScheduleStatus.class);
    }

    /**
     * Gets known ChaosScheduleStatus values.
     *
     * @return known ChaosScheduleStatus values.
     */
    public static Collection<ChaosScheduleStatus> values() {
        return values(ChaosScheduleStatus.class);
    }
}
