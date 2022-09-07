package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the base for all Node Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = NodeEvent.class)
@JsonTypeName("NodeEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "NodeAborted", value = NodeAbortedEvent.class),
    @JsonSubTypes.Type(name = "NodeAddedToCluster", value = NodeAddedToClusterEvent.class),
    @JsonSubTypes.Type(name = "NodeClosed", value = NodeClosedEvent.class),
    @JsonSubTypes.Type(name = "NodeDeactivateCompleted", value = NodeDeactivateCompletedEvent.class),
    @JsonSubTypes.Type(name = "NodeDeactivateStarted", value = NodeDeactivateStartedEvent.class),
    @JsonSubTypes.Type(name = "NodeDown", value = NodeDownEvent.class),
    @JsonSubTypes.Type(name = "NodeNewHealthReport", value = NodeNewHealthReportEvent.class),
    @JsonSubTypes.Type(name = "NodeHealthReportExpired", value = NodeHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "NodeOpenSucceeded", value = NodeOpenSucceededEvent.class),
    @JsonSubTypes.Type(name = "NodeOpenFailed", value = NodeOpenFailedEvent.class),
    @JsonSubTypes.Type(name = "NodeRemovedFromCluster", value = NodeRemovedFromClusterEvent.class),
    @JsonSubTypes.Type(name = "NodeUp", value = NodeUpEvent.class),
    @JsonSubTypes.Type(name = "ChaosNodeRestartScheduled", value = ChaosNodeRestartScheduledEvent.class)
})
@Fluent
public class NodeEvent extends FabricEvent {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /**
     * Get the nodeName property: The name of a Service Fabric node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set.
     * @return the NodeEvent object itself.
     */
    public NodeEvent setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
}
