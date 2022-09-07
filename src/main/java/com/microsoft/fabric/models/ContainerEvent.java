package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A container event. */
@Fluent
public final class ContainerEvent {
    /*
     * The name of the container event.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The count of the event.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Date/time of the first event.
     */
    @JsonProperty(value = "firstTimestamp")
    private String firstTimestamp;

    /*
     * Date/time of the last event.
     */
    @JsonProperty(value = "lastTimestamp")
    private String lastTimestamp;

    /*
     * The event message
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The event type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: The name of the container event.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the container event.
     *
     * @param name the name value to set.
     * @return the ContainerEvent object itself.
     */
    public ContainerEvent setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: The count of the event.
     *
     * @return the count value.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count property: The count of the event.
     *
     * @param count the count value to set.
     * @return the ContainerEvent object itself.
     */
    public ContainerEvent setCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the firstTimestamp property: Date/time of the first event.
     *
     * @return the firstTimestamp value.
     */
    public String getFirstTimestamp() {
        return this.firstTimestamp;
    }

    /**
     * Set the firstTimestamp property: Date/time of the first event.
     *
     * @param firstTimestamp the firstTimestamp value to set.
     * @return the ContainerEvent object itself.
     */
    public ContainerEvent setFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
        return this;
    }

    /**
     * Get the lastTimestamp property: Date/time of the last event.
     *
     * @return the lastTimestamp value.
     */
    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    /**
     * Set the lastTimestamp property: Date/time of the last event.
     *
     * @param lastTimestamp the lastTimestamp value to set.
     * @return the ContainerEvent object itself.
     */
    public ContainerEvent setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }

    /**
     * Get the message property: The event message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The event message.
     *
     * @param message the message value to set.
     * @return the ContainerEvent object itself.
     */
    public ContainerEvent setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the type property: The event type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The event type.
     *
     * @param type the type value to set.
     * @return the ContainerEvent object itself.
     */
    public ContainerEvent setType(String type) {
        this.type = type;
        return this;
    }
}
