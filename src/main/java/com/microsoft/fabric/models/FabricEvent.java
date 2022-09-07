package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Represents the base for all Fabric Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = FabricEvent.class)
@JsonTypeName("FabricEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ClusterEvent", value = ClusterEvent.class),
    @JsonSubTypes.Type(name = "ContainerInstanceEvent", value = ContainerInstanceEvent.class),
    @JsonSubTypes.Type(name = "NodeEvent", value = NodeEvent.class),
    @JsonSubTypes.Type(name = "ApplicationEvent", value = ApplicationEvent.class),
    @JsonSubTypes.Type(name = "ServiceEvent", value = ServiceEvent.class),
    @JsonSubTypes.Type(name = "PartitionEvent", value = PartitionEvent.class),
    @JsonSubTypes.Type(name = "ReplicaEvent", value = ReplicaEvent.class)
})
@Fluent
public class FabricEvent {
    /*
     * The identifier for the FabricEvent instance.
     */
    @JsonProperty(value = "EventInstanceId", required = true)
    private UUID eventInstanceId;

    /*
     * The category of event.
     */
    @JsonProperty(value = "Category")
    private String category;

    /*
     * The time event was logged.
     */
    @JsonProperty(value = "TimeStamp", required = true)
    private OffsetDateTime timeStamp;

    /*
     * Shows there is existing related events available.
     */
    @JsonProperty(value = "HasCorrelatedEvents")
    private Boolean hasCorrelatedEvents;

    /**
     * Get the eventInstanceId property: The identifier for the FabricEvent instance.
     *
     * @return the eventInstanceId value.
     */
    public UUID getEventInstanceId() {
        return this.eventInstanceId;
    }

    /**
     * Set the eventInstanceId property: The identifier for the FabricEvent instance.
     *
     * @param eventInstanceId the eventInstanceId value to set.
     * @return the FabricEvent object itself.
     */
    public FabricEvent setEventInstanceId(UUID eventInstanceId) {
        this.eventInstanceId = eventInstanceId;
        return this;
    }

    /**
     * Get the category property: The category of event.
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Set the category property: The category of event.
     *
     * @param category the category value to set.
     * @return the FabricEvent object itself.
     */
    public FabricEvent setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the timeStamp property: The time event was logged.
     *
     * @return the timeStamp value.
     */
    public OffsetDateTime getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Set the timeStamp property: The time event was logged.
     *
     * @param timeStamp the timeStamp value to set.
     * @return the FabricEvent object itself.
     */
    public FabricEvent setTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * Get the hasCorrelatedEvents property: Shows there is existing related events available.
     *
     * @return the hasCorrelatedEvents value.
     */
    public Boolean isHasCorrelatedEvents() {
        return this.hasCorrelatedEvents;
    }

    /**
     * Set the hasCorrelatedEvents property: Shows there is existing related events available.
     *
     * @param hasCorrelatedEvents the hasCorrelatedEvents value to set.
     * @return the FabricEvent object itself.
     */
    public FabricEvent setHasCorrelatedEvents(Boolean hasCorrelatedEvents) {
        this.hasCorrelatedEvents = hasCorrelatedEvents;
        return this;
    }
}
