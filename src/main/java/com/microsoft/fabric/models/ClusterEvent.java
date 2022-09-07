package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the base for all Cluster Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ClusterEvent.class)
@JsonTypeName("ClusterEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ClusterNewHealthReport", value = ClusterNewHealthReportEvent.class),
    @JsonSubTypes.Type(name = "ClusterHealthReportExpired", value = ClusterHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ClusterUpgradeCompleted", value = ClusterUpgradeCompletedEvent.class),
    @JsonSubTypes.Type(name = "ClusterUpgradeDomainCompleted", value = ClusterUpgradeDomainCompletedEvent.class),
    @JsonSubTypes.Type(name = "ClusterUpgradeRollbackCompleted", value = ClusterUpgradeRollbackCompletedEvent.class),
    @JsonSubTypes.Type(name = "ClusterUpgradeRollbackStarted", value = ClusterUpgradeRollbackStartedEvent.class),
    @JsonSubTypes.Type(name = "ClusterUpgradeStarted", value = ClusterUpgradeStartedEvent.class),
    @JsonSubTypes.Type(name = "ChaosStopped", value = ChaosStoppedEvent.class),
    @JsonSubTypes.Type(name = "ChaosStarted", value = ChaosStartedEvent.class)
})
@Fluent
public class ClusterEvent extends FabricEvent {}
