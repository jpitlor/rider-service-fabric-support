package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the service name. */
@Fluent
public final class ServiceNameInfo {
    /*
     * The identity of the service. This ID is an encoded representation of the
     * service name. This is used in the REST APIs to identify the service
     * resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the service name is
     * "fabric:/myapp/app1/svc1",
     * the service identity would be "myapp~app1\~svc1" in 6.0+ and
     * "myapp/app1/svc1" in previous versions.
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Get the id property: The identity of the service. This ID is an encoded representation of the service name. This
     * is used in the REST APIs to identify the service resource. Starting in version 6.0, hierarchical names are
     * delimited with the "\~" character. For example, if the service name is "fabric:/myapp/app1/svc1", the service
     * identity would be "myapp~app1\~svc1" in 6.0+ and "myapp/app1/svc1" in previous versions.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The identity of the service. This ID is an encoded representation of the service name. This
     * is used in the REST APIs to identify the service resource. Starting in version 6.0, hierarchical names are
     * delimited with the "\~" character. For example, if the service name is "fabric:/myapp/app1/svc1", the service
     * identity would be "myapp~app1\~svc1" in 6.0+ and "myapp/app1/svc1" in previous versions.
     *
     * @param id the id value to set.
     * @return the ServiceNameInfo object itself.
     */
    public ServiceNameInfo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The full name of the service with 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The full name of the service with 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ServiceNameInfo object itself.
     */
    public ServiceNameInfo setName(String name) {
        this.name = name;
        return this;
    }
}
