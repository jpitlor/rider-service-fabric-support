package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the diagnostics options available. */
@Fluent
public final class DiagnosticsDescription {
    /*
     * List of supported sinks that can be referenced.
     */
    @JsonProperty(value = "sinks")
    private List<DiagnosticsSinkProperties> sinks;

    /*
     * Status of whether or not sinks are enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The sinks to be used if diagnostics is enabled. Sink choices can be
     * overridden at the service and code package level.
     */
    @JsonProperty(value = "defaultSinkRefs")
    private List<String> defaultSinkRefs;

    /**
     * Get the sinks property: List of supported sinks that can be referenced.
     *
     * @return the sinks value.
     */
    public List<DiagnosticsSinkProperties> getSinks() {
        return this.sinks;
    }

    /**
     * Set the sinks property: List of supported sinks that can be referenced.
     *
     * @param sinks the sinks value to set.
     * @return the DiagnosticsDescription object itself.
     */
    public DiagnosticsDescription setSinks(List<DiagnosticsSinkProperties> sinks) {
        this.sinks = sinks;
        return this;
    }

    /**
     * Get the enabled property: Status of whether or not sinks are enabled.
     *
     * @return the enabled value.
     */
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Status of whether or not sinks are enabled.
     *
     * @param enabled the enabled value to set.
     * @return the DiagnosticsDescription object itself.
     */
    public DiagnosticsDescription setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the defaultSinkRefs property: The sinks to be used if diagnostics is enabled. Sink choices can be overridden
     * at the service and code package level.
     *
     * @return the defaultSinkRefs value.
     */
    public List<String> getDefaultSinkRefs() {
        return this.defaultSinkRefs;
    }

    /**
     * Set the defaultSinkRefs property: The sinks to be used if diagnostics is enabled. Sink choices can be overridden
     * at the service and code package level.
     *
     * @param defaultSinkRefs the defaultSinkRefs value to set.
     * @return the DiagnosticsDescription object itself.
     */
    public DiagnosticsDescription setDefaultSinkRefs(List<String> defaultSinkRefs) {
        this.defaultSinkRefs = defaultSinkRefs;
        return this;
    }
}
