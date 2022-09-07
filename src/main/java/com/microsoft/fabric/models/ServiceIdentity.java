package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Map service identity friendly name to an application identity. */
@Fluent
public final class ServiceIdentity {
    /*
     * The identity friendly name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The application identity name.
     */
    @JsonProperty(value = "identityRef")
    private String identityRef;

    /**
     * Get the name property: The identity friendly name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The identity friendly name.
     *
     * @param name the name value to set.
     * @return the ServiceIdentity object itself.
     */
    public ServiceIdentity setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the identityRef property: The application identity name.
     *
     * @return the identityRef value.
     */
    public String getIdentityRef() {
        return this.identityRef;
    }

    /**
     * Set the identityRef property: The application identity name.
     *
     * @param identityRef the identityRef value to set.
     * @return the ServiceIdentity object itself.
     */
    public ServiceIdentity setIdentityRef(String identityRef) {
        this.identityRef = identityRef;
        return this;
    }
}
