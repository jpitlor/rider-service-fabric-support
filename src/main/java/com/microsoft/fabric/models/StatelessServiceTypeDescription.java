package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a stateless service type defined in the service manifest of a provisioned application type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Stateless")
@Fluent
public final class StatelessServiceTypeDescription extends ServiceTypeDescription {
    /*
     * A flag indicating if this type is not implemented and hosted by a user
     * service process, but is implicitly hosted by a system created process.
     * This value is true for services using the guest executable services,
     * false otherwise.
     */
    @JsonProperty(value = "UseImplicitHost")
    private Boolean useImplicitHost;

    /**
     * Get the useImplicitHost property: A flag indicating if this type is not implemented and hosted by a user service
     * process, but is implicitly hosted by a system created process. This value is true for services using the guest
     * executable services, false otherwise.
     *
     * @return the useImplicitHost value.
     */
    public Boolean isUseImplicitHost() {
        return this.useImplicitHost;
    }

    /**
     * Set the useImplicitHost property: A flag indicating if this type is not implemented and hosted by a user service
     * process, but is implicitly hosted by a system created process. This value is true for services using the guest
     * executable services, false otherwise.
     *
     * @param useImplicitHost the useImplicitHost value to set.
     * @return the StatelessServiceTypeDescription object itself.
     */
    public StatelessServiceTypeDescription setUseImplicitHost(Boolean useImplicitHost) {
        this.useImplicitHost = useImplicitHost;
        return this;
    }
}
