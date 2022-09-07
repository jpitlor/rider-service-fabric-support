package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Runtime information of a container instance. */
@Fluent
public final class ContainerInstanceView {
    /*
     * The number of times the container has been restarted.
     */
    @JsonProperty(value = "restartCount")
    private Integer restartCount;

    /*
     * Current container instance state.
     */
    @JsonProperty(value = "currentState")
    private ContainerState currentState;

    /*
     * Previous container instance state.
     */
    @JsonProperty(value = "previousState")
    private ContainerState previousState;

    /*
     * The events of this container instance.
     */
    @JsonProperty(value = "events")
    private List<ContainerEvent> events;

    /**
     * Get the restartCount property: The number of times the container has been restarted.
     *
     * @return the restartCount value.
     */
    public Integer getRestartCount() {
        return this.restartCount;
    }

    /**
     * Set the restartCount property: The number of times the container has been restarted.
     *
     * @param restartCount the restartCount value to set.
     * @return the ContainerInstanceView object itself.
     */
    public ContainerInstanceView setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * Get the currentState property: Current container instance state.
     *
     * @return the currentState value.
     */
    public ContainerState getCurrentState() {
        return this.currentState;
    }

    /**
     * Set the currentState property: Current container instance state.
     *
     * @param currentState the currentState value to set.
     * @return the ContainerInstanceView object itself.
     */
    public ContainerInstanceView setCurrentState(ContainerState currentState) {
        this.currentState = currentState;
        return this;
    }

    /**
     * Get the previousState property: Previous container instance state.
     *
     * @return the previousState value.
     */
    public ContainerState getPreviousState() {
        return this.previousState;
    }

    /**
     * Set the previousState property: Previous container instance state.
     *
     * @param previousState the previousState value to set.
     * @return the ContainerInstanceView object itself.
     */
    public ContainerInstanceView setPreviousState(ContainerState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get the events property: The events of this container instance.
     *
     * @return the events value.
     */
    public List<ContainerEvent> getEvents() {
        return this.events;
    }

    /**
     * Set the events property: The events of this container instance.
     *
     * @param events the events value to set.
     * @return the ContainerInstanceView object itself.
     */
    public ContainerInstanceView setEvents(List<ContainerEvent> events) {
        this.events = events;
        return this;
    }
}
