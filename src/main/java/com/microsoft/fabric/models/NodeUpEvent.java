package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Node Up event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeUp")
@Fluent
public final class NodeUpEvent extends NodeEvent {
    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /*
     * Time when Node was last down.
     */
    @JsonProperty(value = "LastNodeDownAt", required = true)
    private OffsetDateTime lastNodeDownAt;

    /**
     * Get the nodeInstance property: Id of Node instance.
     *
     * @return the nodeInstance value.
     */
    public long getNodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set the nodeInstance property: Id of Node instance.
     *
     * @param nodeInstance the nodeInstance value to set.
     * @return the NodeUpEvent object itself.
     */
    public NodeUpEvent setNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the lastNodeDownAt property: Time when Node was last down.
     *
     * @return the lastNodeDownAt value.
     */
    public OffsetDateTime getLastNodeDownAt() {
        return this.lastNodeDownAt;
    }

    /**
     * Set the lastNodeDownAt property: Time when Node was last down.
     *
     * @param lastNodeDownAt the lastNodeDownAt value to set.
     * @return the NodeUpEvent object itself.
     */
    public NodeUpEvent setLastNodeDownAt(OffsetDateTime lastNodeDownAt) {
        this.lastNodeDownAt = lastNodeDownAt;
        return this;
    }
}
