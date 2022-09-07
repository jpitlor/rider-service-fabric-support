package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * Derived from PropertyBatchInfo. Represents the property batch succeeding. Contains the results of any "Get"
 * operations in the batch.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Successful")
@Fluent
public final class SuccessfulPropertyBatchInfo extends PropertyBatchInfo {
    /*
     * A map containing the properties that were requested through any "Get"
     * property batch operations. The key represents the index of the "Get"
     * operation in the original request, in string form. The value is the
     * property. If a property is not found, it will not be in the map.
     */
    @JsonProperty(value = "Properties")
    private Map<String, PropertyInfo> properties;

    /**
     * Get the properties property: A map containing the properties that were requested through any "Get" property batch
     * operations. The key represents the index of the "Get" operation in the original request, in string form. The
     * value is the property. If a property is not found, it will not be in the map.
     *
     * @return the properties value.
     */
    public Map<String, PropertyInfo> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: A map containing the properties that were requested through any "Get" property batch
     * operations. The key represents the index of the "Get" operation in the original request, in string form. The
     * value is the property. If a property is not found, it will not be in the map.
     *
     * @param properties the properties value to set.
     * @return the SuccessfulPropertyBatchInfo object itself.
     */
    public SuccessfulPropertyBatchInfo setProperties(Map<String, PropertyInfo> properties) {
        this.properties = properties;
        return this;
    }
}
