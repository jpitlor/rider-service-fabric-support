package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Reference to sinks in DiagnosticsDescription. */
@Fluent
public final class DiagnosticsRef {
    /*
     * Status of whether or not sinks are enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * List of sinks to be used if enabled. References the list of sinks in
     * DiagnosticsDescription.
     */
    @JsonProperty(value = "sinkRefs")
    private List<String> sinkRefs;

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
     * @return the DiagnosticsRef object itself.
     */
    public DiagnosticsRef setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the sinkRefs property: List of sinks to be used if enabled. References the list of sinks in
     * DiagnosticsDescription.
     *
     * @return the sinkRefs value.
     */
    public List<String> getSinkRefs() {
        return this.sinkRefs;
    }

    /**
     * Set the sinkRefs property: List of sinks to be used if enabled. References the list of sinks in
     * DiagnosticsDescription.
     *
     * @param sinkRefs the sinkRefs value to set.
     * @return the DiagnosticsRef object itself.
     */
    public DiagnosticsRef setSinkRefs(List<String> sinkRefs) {
        this.sinkRefs = sinkRefs;
        return this;
    }
}
