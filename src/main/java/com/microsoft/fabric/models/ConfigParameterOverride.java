package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Information about a configuration parameter override. */
@Fluent
public final class ConfigParameterOverride {
    /*
     * Name of the section for the parameter override.
     */
    @JsonProperty(value = "SectionName", required = true)
    private String sectionName;

    /*
     * Name of the parameter that has been overridden.
     */
    @JsonProperty(value = "ParameterName", required = true)
    private String parameterName;

    /*
     * Value of the overridden parameter.
     */
    @JsonProperty(value = "ParameterValue", required = true)
    private String parameterValue;

    /*
     * The duration until config override is considered as valid.
     */
    @JsonProperty(value = "Timeout")
    private Duration timeout;

    /*
     * A value that indicates whether config override will be removed on
     * upgrade or will still be considered as valid.
     */
    @JsonProperty(value = "PersistAcrossUpgrade")
    private Boolean persistAcrossUpgrade;

    /**
     * Get the sectionName property: Name of the section for the parameter override.
     *
     * @return the sectionName value.
     */
    public String getSectionName() {
        return this.sectionName;
    }

    /**
     * Set the sectionName property: Name of the section for the parameter override.
     *
     * @param sectionName the sectionName value to set.
     * @return the ConfigParameterOverride object itself.
     */
    public ConfigParameterOverride setSectionName(String sectionName) {
        this.sectionName = sectionName;
        return this;
    }

    /**
     * Get the parameterName property: Name of the parameter that has been overridden.
     *
     * @return the parameterName value.
     */
    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * Set the parameterName property: Name of the parameter that has been overridden.
     *
     * @param parameterName the parameterName value to set.
     * @return the ConfigParameterOverride object itself.
     */
    public ConfigParameterOverride setParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * Get the parameterValue property: Value of the overridden parameter.
     *
     * @return the parameterValue value.
     */
    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * Set the parameterValue property: Value of the overridden parameter.
     *
     * @param parameterValue the parameterValue value to set.
     * @return the ConfigParameterOverride object itself.
     */
    public ConfigParameterOverride setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    /**
     * Get the timeout property: The duration until config override is considered as valid.
     *
     * @return the timeout value.
     */
    public Duration getTimeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The duration until config override is considered as valid.
     *
     * @param timeout the timeout value to set.
     * @return the ConfigParameterOverride object itself.
     */
    public ConfigParameterOverride setTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the persistAcrossUpgrade property: A value that indicates whether config override will be removed on upgrade
     * or will still be considered as valid.
     *
     * @return the persistAcrossUpgrade value.
     */
    public Boolean isPersistAcrossUpgrade() {
        return this.persistAcrossUpgrade;
    }

    /**
     * Set the persistAcrossUpgrade property: A value that indicates whether config override will be removed on upgrade
     * or will still be considered as valid.
     *
     * @param persistAcrossUpgrade the persistAcrossUpgrade value to set.
     * @return the ConfigParameterOverride object itself.
     */
    public ConfigParameterOverride setPersistAcrossUpgrade(Boolean persistAcrossUpgrade) {
        this.persistAcrossUpgrade = persistAcrossUpgrade;
        return this;
    }
}
