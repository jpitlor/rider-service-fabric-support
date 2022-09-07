package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A wrapper for the safety check object. Safety checks are performed by service fabric before continuing with the
 * operations. These checks ensure the availability of the service and the reliability of the state.
 */
@Fluent
public final class SafetyCheckWrapper {
    /*
     * Represents a safety check performed by service fabric before continuing
     * with the operations. These checks ensure the availability of the service
     * and the reliability of the state.
     */
    @JsonProperty(value = "SafetyCheck")
    private SafetyCheck safetyCheck;

    /**
     * Get the safetyCheck property: Represents a safety check performed by service fabric before continuing with the
     * operations. These checks ensure the availability of the service and the reliability of the state.
     *
     * @return the safetyCheck value.
     */
    public SafetyCheck getSafetyCheck() {
        return this.safetyCheck;
    }

    /**
     * Set the safetyCheck property: Represents a safety check performed by service fabric before continuing with the
     * operations. These checks ensure the availability of the service and the reliability of the state.
     *
     * @param safetyCheck the safetyCheck value to set.
     * @return the SafetyCheckWrapper object itself.
     */
    public SafetyCheckWrapper setSafetyCheck(SafetyCheck safetyCheck) {
        this.safetyCheck = safetyCheck;
        return this;
    }
}
