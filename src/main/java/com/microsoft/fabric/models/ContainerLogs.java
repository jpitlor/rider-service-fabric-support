package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Container logs. */
@Fluent
public final class ContainerLogs {
    /*
     * Container logs.
     */
    @JsonProperty(value = "Content")
    private String content;

    /**
     * Get the content property: Container logs.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Container logs.
     *
     * @param content the content value to set.
     * @return the ContainerLogs object itself.
     */
    public ContainerLogs setContent(String content) {
        this.content = content;
        return this;
    }
}
