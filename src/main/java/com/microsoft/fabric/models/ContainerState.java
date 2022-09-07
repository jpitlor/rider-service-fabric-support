package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The container state. */
@Fluent
public final class ContainerState {
    /*
     * The state of this container
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Date/time when the container state started.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The container exit code.
     */
    @JsonProperty(value = "exitCode")
    private String exitCode;

    /*
     * Date/time when the container state finished.
     */
    @JsonProperty(value = "finishTime")
    private OffsetDateTime finishTime;

    /*
     * Human-readable status of this state.
     */
    @JsonProperty(value = "detailStatus")
    private String detailStatus;

    /**
     * Get the state property: The state of this container.
     *
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state property: The state of this container.
     *
     * @param state the state value to set.
     * @return the ContainerState object itself.
     */
    public ContainerState setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the startTime property: Date/time when the container state started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Date/time when the container state started.
     *
     * @param startTime the startTime value to set.
     * @return the ContainerState object itself.
     */
    public ContainerState setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the exitCode property: The container exit code.
     *
     * @return the exitCode value.
     */
    public String getExitCode() {
        return this.exitCode;
    }

    /**
     * Set the exitCode property: The container exit code.
     *
     * @param exitCode the exitCode value to set.
     * @return the ContainerState object itself.
     */
    public ContainerState setExitCode(String exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get the finishTime property: Date/time when the container state finished.
     *
     * @return the finishTime value.
     */
    public OffsetDateTime getFinishTime() {
        return this.finishTime;
    }

    /**
     * Set the finishTime property: Date/time when the container state finished.
     *
     * @param finishTime the finishTime value to set.
     * @return the ContainerState object itself.
     */
    public ContainerState setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get the detailStatus property: Human-readable status of this state.
     *
     * @return the detailStatus value.
     */
    public String getDetailStatus() {
        return this.detailStatus;
    }

    /**
     * Set the detailStatus property: Human-readable status of this state.
     *
     * @param detailStatus the detailStatus value to set.
     * @return the ContainerState object itself.
     */
    public ContainerState setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
        return this;
    }
}
