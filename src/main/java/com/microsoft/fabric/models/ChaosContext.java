package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Describes a map, which is a collection of (string, string) type key-value pairs. The map can be used to record
 * information about the Chaos run. There cannot be more than 100 such pairs and each string (key or value) can be at
 * most 4095 characters long. This map is set by the starter of the Chaos run to optionally store the context about the
 * specific run.
 */
@Fluent
public final class ChaosContext {
    /*
     * Describes a map that contains a collection of ChaosContextMapItem's.
     */
    @JsonProperty(value = "Map")
    private Map<String, String> map;

    /**
     * Get the map property: Describes a map that contains a collection of ChaosContextMapItem's.
     *
     * @return the map value.
     */
    public Map<String, String> getMap() {
        return this.map;
    }

    /**
     * Set the map property: Describes a map that contains a collection of ChaosContextMapItem's.
     *
     * @param map the map value to set.
     * @return the ChaosContext object itself.
     */
    public ChaosContext setMap(Map<String, String> map) {
        this.map = map;
        return this;
    }
}
