package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Application Created event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationCreated")
@Fluent
public final class ApplicationCreatedEvent extends ApplicationEvent {
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

    /*
     * Application definition kind.
     */
    @JsonProperty(value = "ApplicationDefinitionKind", required = true)
    private String applicationDefinitionKind;

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
     * @return the ApplicationCreatedEvent object itself.
     */
    public ApplicationCreatedEvent setApplicationTypeName(String applicationTypeName) {
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
     * @return the ApplicationCreatedEvent object itself.
     */
    public ApplicationCreatedEvent setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the applicationDefinitionKind property: Application definition kind.
     *
     * @return the applicationDefinitionKind value.
     */
    public String getApplicationDefinitionKind() {
        return this.applicationDefinitionKind;
    }

    /**
     * Set the applicationDefinitionKind property: Application definition kind.
     *
     * @param applicationDefinitionKind the applicationDefinitionKind value to set.
     * @return the ApplicationCreatedEvent object itself.
     */
    public ApplicationCreatedEvent setApplicationDefinitionKind(String applicationDefinitionKind) {
        this.applicationDefinitionKind = applicationDefinitionKind;
        return this;
    }
}
