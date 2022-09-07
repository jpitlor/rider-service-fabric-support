package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a setting for the container. The setting file path can be fetched from environment variable
 * "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux container is
 * "/var/secrets".
 */
@Fluent
public final class Setting {
    /*
     * The type of the setting being given in value
     */
    @JsonProperty(value = "type")
    private SettingType type;

    /*
     * The name of the setting.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the setting, will be processed based on the type provided.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the type property: The type of the setting being given in value.
     *
     * @return the type value.
     */
    public SettingType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the setting being given in value.
     *
     * @param type the type value to set.
     * @return the Setting object itself.
     */
    public Setting setType(SettingType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The name of the setting.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the setting.
     *
     * @param name the name value to set.
     * @return the Setting object itself.
     */
    public Setting setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the setting, will be processed based on the type provided.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the setting, will be processed based on the type provided.
     *
     * @param value the value value to set.
     * @return the Setting object itself.
     */
    public Setting setValue(String value) {
        this.value = value;
        return this;
    }
}
