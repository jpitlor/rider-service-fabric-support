package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DiagnosticsSinkKind. */
public final class DiagnosticsSinkKind extends ExpandableStringEnum<DiagnosticsSinkKind> {
    /** Static value Invalid for DiagnosticsSinkKind. */
    public static final DiagnosticsSinkKind INVALID = fromString("Invalid");

    /** Static value AzureInternalMonitoringPipeline for DiagnosticsSinkKind. */
    public static final DiagnosticsSinkKind AZURE_INTERNAL_MONITORING_PIPELINE =
            fromString("AzureInternalMonitoringPipeline");

    /**
     * Creates or finds a DiagnosticsSinkKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiagnosticsSinkKind.
     */
    @JsonCreator
    public static DiagnosticsSinkKind fromString(String name) {
        return fromString(name, DiagnosticsSinkKind.class);
    }

    /**
     * Gets known DiagnosticsSinkKind values.
     *
     * @return known DiagnosticsSinkKind values.
     */
    public static Collection<DiagnosticsSinkKind> values() {
        return values(DiagnosticsSinkKind.class);
    }
}
