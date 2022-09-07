package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Application Deleted event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationDeleted")
@Fluent
public final class ApplicationDeletedEvent extends ApplicationEvent {
    /*
     * Application type name.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /*
     * Application type version.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /**
     * Get the applicationTypeName property: Application type name.
     *
     * @return the applicationTypeName value.
     */
    public String getApplicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the applicationTypeName property: Application type name.
     *
     * @param applicationTypeName the applicationTypeName value to set.
     * @return the ApplicationDeletedEvent object itself.
     */
    public ApplicationDeletedEvent setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the applicationTypeVersion property: Application type version.
     *
     * @return the applicationTypeVersion value.
     */
    public String getApplicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the applicationTypeVersion property: Application type version.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set.
     * @return the ApplicationDeletedEvent object itself.
     */
    public ApplicationDeletedEvent setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }
}
