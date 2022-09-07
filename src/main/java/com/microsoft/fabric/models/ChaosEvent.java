package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Represents an event generated during a Chaos run. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ChaosEvent.class)
@JsonTypeName("ChaosEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ExecutingFaults", value = ExecutingFaultsChaosEvent.class),
    @JsonSubTypes.Type(name = "Started", value = StartedChaosEvent.class),
    @JsonSubTypes.Type(name = "Stopped", value = StoppedChaosEvent.class),
    @JsonSubTypes.Type(name = "TestError", value = TestErrorChaosEvent.class),
    @JsonSubTypes.Type(name = "ValidationFailed", value = ValidationFailedChaosEvent.class),
    @JsonSubTypes.Type(name = "Waiting", value = WaitingChaosEvent.class)
})
@Fluent
public class ChaosEvent {
    /*
     * The UTC timestamp when this Chaos event was generated.
     */
    @JsonProperty(value = "TimeStampUtc", required = true)
    private OffsetDateTime timeStampUtc;

    /**
     * Get the timeStampUtc property: The UTC timestamp when this Chaos event was generated.
     *
     * @return the timeStampUtc value.
     */
    public OffsetDateTime getTimeStampUtc() {
        return this.timeStampUtc;
    }

    /**
     * Set the timeStampUtc property: The UTC timestamp when this Chaos event was generated.
     *
     * @param timeStampUtc the timeStampUtc value to set.
     * @return the ChaosEvent object itself.
     */
    public ChaosEvent setTimeStampUtc(OffsetDateTime timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
        return this;
    }
}
