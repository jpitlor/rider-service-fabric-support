package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReplicaHealthReportServiceKind. */
public final class ReplicaHealthReportServiceKind extends ExpandableStringEnum<ReplicaHealthReportServiceKind> {
    /** Static value Stateless for ReplicaHealthReportServiceKind. */
    public static final ReplicaHealthReportServiceKind STATELESS = fromString("Stateless");

    /** Static value Stateful for ReplicaHealthReportServiceKind. */
    public static final ReplicaHealthReportServiceKind STATEFUL = fromString("Stateful");

    /**
     * Creates or finds a ReplicaHealthReportServiceKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicaHealthReportServiceKind.
     */
    @JsonCreator
    public static ReplicaHealthReportServiceKind fromString(String name) {
        return fromString(name, ReplicaHealthReportServiceKind.class);
    }

    /**
     * Gets known ReplicaHealthReportServiceKind values.
     *
     * @return known ReplicaHealthReportServiceKind values.
     */
    public static Collection<ReplicaHealthReportServiceKind> values() {
        return values(ReplicaHealthReportServiceKind.class);
    }
}
