package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a list of property batch operations to be executed. Either all or none of the operations will be committed.
 */
@Fluent
public final class PropertyBatchDescriptionList {
    /*
     * A list of the property batch operations to be executed.
     */
    @JsonProperty(value = "Operations")
    private List<PropertyBatchOperation> operations;

    /**
     * Get the operations property: A list of the property batch operations to be executed.
     *
     * @return the operations value.
     */
    public List<PropertyBatchOperation> getOperations() {
        return this.operations;
    }

    /**
     * Set the operations property: A list of the property batch operations to be executed.
     *
     * @param operations the operations value to set.
     * @return the PropertyBatchDescriptionList object itself.
     */
    public PropertyBatchDescriptionList setOperations(List<PropertyBatchOperation> operations) {
        this.operations = operations;
        return this;
    }
}
