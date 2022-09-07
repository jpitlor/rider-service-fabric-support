package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents the type of registration or provision requested, and if the operation needs to be asynchronous or not.
 * Supported types of provision operations are from either image store or external store.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ProvisionApplicationTypeDescriptionBase.class)
@JsonTypeName("ProvisionApplicationTypeDescriptionBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ImageStorePath", value = ProvisionApplicationTypeDescription.class),
    @JsonSubTypes.Type(name = "ExternalStore", value = ExternalStoreProvisionApplicationTypeDescription.class)
})
@Fluent
public class ProvisionApplicationTypeDescriptionBase {
    /*
     * Indicates whether or not provisioning should occur asynchronously. When
     * set to true, the provision operation returns when the request is
     * accepted by the system, and the provision operation continues without
     * any timeout limit. The default value is false. For large application
     * packages, we recommend setting the value to true.
     */
    @JsonProperty(value = "Async", required = true)
    private boolean async;

    /**
     * Get the async property: Indicates whether or not provisioning should occur asynchronously. When set to true, the
     * provision operation returns when the request is accepted by the system, and the provision operation continues
     * without any timeout limit. The default value is false. For large application packages, we recommend setting the
     * value to true.
     *
     * @return the async value.
     */
    public boolean isAsync() {
        return this.async;
    }

    /**
     * Set the async property: Indicates whether or not provisioning should occur asynchronously. When set to true, the
     * provision operation returns when the request is accepted by the system, and the provision operation continues
     * without any timeout limit. The default value is false. For large application packages, we recommend setting the
     * value to true.
     *
     * @param async the async value to set.
     * @return the ProvisionApplicationTypeDescriptionBase object itself.
     */
    public ProvisionApplicationTypeDescriptionBase setAsync(boolean async) {
        this.async = async;
        return this;
    }
}
