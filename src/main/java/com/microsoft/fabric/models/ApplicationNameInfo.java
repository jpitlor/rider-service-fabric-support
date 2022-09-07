package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the application name. */
@Fluent
public final class ApplicationNameInfo {
    /*
     * The identity of the application. This is an encoded representation of
     * the application name. This is used in the REST APIs to identify the
     * application resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the application name is "fabric:/myapp/app1",
     * the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1"
     * in previous versions.
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Get the id property: The identity of the application. This is an encoded representation of the application name.
     * This is used in the REST APIs to identify the application resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the application name is "fabric:/myapp/app1", the
     * application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous versions.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The identity of the application. This is an encoded representation of the application name.
     * This is used in the REST APIs to identify the application resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the application name is "fabric:/myapp/app1", the
     * application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous versions.
     *
     * @param id the id value to set.
     * @return the ApplicationNameInfo object itself.
     */
    public ApplicationNameInfo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ApplicationNameInfo object itself.
     */
    public ApplicationNameInfo setName(String name) {
        this.name = name;
        return this;
    }
}
