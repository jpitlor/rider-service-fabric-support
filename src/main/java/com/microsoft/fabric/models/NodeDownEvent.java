package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Node Down event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeDown")
@Fluent
public final class NodeDownEvent extends NodeEvent {
    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /*
     * Time when Node was last up.
     */
    @JsonProperty(value = "LastNodeUpAt", required = true)
    private OffsetDateTime lastNodeUpAt;

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
     * @return the NodeDownEvent object itself.
     */
    public NodeDownEvent setNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the lastNodeUpAt property: Time when Node was last up.
     *
     * @return the lastNodeUpAt value.
     */
    public OffsetDateTime getLastNodeUpAt() {
        return this.lastNodeUpAt;
    }

    /**
     * Set the lastNodeUpAt property: Time when Node was last up.
     *
     * @param lastNodeUpAt the lastNodeUpAt value to set.
     * @return the NodeDownEvent object itself.
     */
    public NodeDownEvent setLastNodeUpAt(OffsetDateTime lastNodeUpAt) {
        this.lastNodeUpAt = lastNodeUpAt;
        return this;
    }
}
