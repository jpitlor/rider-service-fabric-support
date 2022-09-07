package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines an item in ChaosParametersDictionary of the Chaos Schedule. */
@Fluent
public final class ChaosParametersDictionaryItem {
    /*
     * The key identifying the Chaos Parameter in the dictionary. This key is
     * referenced by Chaos Schedule Jobs.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /*
     * Defines all the parameters to configure a Chaos run.
     */
    @JsonProperty(value = "Value", required = true)
    private ChaosParameters value;

    /**
     * Get the key property: The key identifying the Chaos Parameter in the dictionary. This key is referenced by Chaos
     * Schedule Jobs.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key identifying the Chaos Parameter in the dictionary. This key is referenced by Chaos
     * Schedule Jobs.
     *
     * @param key the key value to set.
     * @return the ChaosParametersDictionaryItem object itself.
     */
    public ChaosParametersDictionaryItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: Defines all the parameters to configure a Chaos run.
     *
     * @return the value value.
     */
    public ChaosParameters getValue() {
        return this.value;
    }

    /**
     * Set the value property: Defines all the parameters to configure a Chaos run.
     *
     * @param value the value value to set.
     * @return the ChaosParametersDictionaryItem object itself.
     */
    public ChaosParametersDictionaryItem setValue(ChaosParameters value) {
        this.value = value;
        return this;
    }
}
