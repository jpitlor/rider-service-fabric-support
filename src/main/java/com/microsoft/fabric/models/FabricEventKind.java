package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FabricEventKind. */
public final class FabricEventKind extends ExpandableStringEnum<FabricEventKind> {
    /** Static value ClusterEvent for FabricEventKind. */
    public static final FabricEventKind CLUSTER_EVENT = fromString("ClusterEvent");

    /** Static value ContainerInstanceEvent for FabricEventKind. */
    public static final FabricEventKind CONTAINER_INSTANCE_EVENT = fromString("ContainerInstanceEvent");

    /** Static value NodeEvent for FabricEventKind. */
    public static final FabricEventKind NODE_EVENT = fromString("NodeEvent");

    /** Static value ApplicationEvent for FabricEventKind. */
    public static final FabricEventKind APPLICATION_EVENT = fromString("ApplicationEvent");

    /** Static value ServiceEvent for FabricEventKind. */
    public static final FabricEventKind SERVICE_EVENT = fromString("ServiceEvent");

    /** Static value PartitionEvent for FabricEventKind. */
    public static final FabricEventKind PARTITION_EVENT = fromString("PartitionEvent");

    /** Static value ReplicaEvent for FabricEventKind. */
    public static final FabricEventKind REPLICA_EVENT = fromString("ReplicaEvent");

    /** Static value PartitionAnalysisEvent for FabricEventKind. */
    public static final FabricEventKind PARTITION_ANALYSIS_EVENT = fromString("PartitionAnalysisEvent");

    /** Static value ApplicationCreated for FabricEventKind. */
    public static final FabricEventKind APPLICATION_CREATED = fromString("ApplicationCreated");

    /** Static value ApplicationDeleted for FabricEventKind. */
    public static final FabricEventKind APPLICATION_DELETED = fromString("ApplicationDeleted");

    /** Static value ApplicationNewHealthReport for FabricEventKind. */
    public static final FabricEventKind APPLICATION_NEW_HEALTH_REPORT = fromString("ApplicationNewHealthReport");

    /** Static value ApplicationHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind APPLICATION_HEALTH_REPORT_EXPIRED =
            fromString("ApplicationHealthReportExpired");

    /** Static value ApplicationUpgradeCompleted for FabricEventKind. */
    public static final FabricEventKind APPLICATION_UPGRADE_COMPLETED = fromString("ApplicationUpgradeCompleted");

    /** Static value ApplicationUpgradeDomainCompleted for FabricEventKind. */
    public static final FabricEventKind APPLICATION_UPGRADE_DOMAIN_COMPLETED =
            fromString("ApplicationUpgradeDomainCompleted");

    /** Static value ApplicationUpgradeRollbackCompleted for FabricEventKind. */
    public static final FabricEventKind APPLICATION_UPGRADE_ROLLBACK_COMPLETED =
            fromString("ApplicationUpgradeRollbackCompleted");

    /** Static value ApplicationUpgradeRollbackStarted for FabricEventKind. */
    public static final FabricEventKind APPLICATION_UPGRADE_ROLLBACK_STARTED =
            fromString("ApplicationUpgradeRollbackStarted");

    /** Static value ApplicationUpgradeStarted for FabricEventKind. */
    public static final FabricEventKind APPLICATION_UPGRADE_STARTED = fromString("ApplicationUpgradeStarted");

    /** Static value DeployedApplicationNewHealthReport for FabricEventKind. */
    public static final FabricEventKind DEPLOYED_APPLICATION_NEW_HEALTH_REPORT =
            fromString("DeployedApplicationNewHealthReport");

    /** Static value DeployedApplicationHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind DEPLOYED_APPLICATION_HEALTH_REPORT_EXPIRED =
            fromString("DeployedApplicationHealthReportExpired");

    /** Static value ApplicationProcessExited for FabricEventKind. */
    public static final FabricEventKind APPLICATION_PROCESS_EXITED = fromString("ApplicationProcessExited");

    /** Static value ApplicationContainerInstanceExited for FabricEventKind. */
    public static final FabricEventKind APPLICATION_CONTAINER_INSTANCE_EXITED =
            fromString("ApplicationContainerInstanceExited");

    /** Static value NodeAborted for FabricEventKind. */
    public static final FabricEventKind NODE_ABORTED = fromString("NodeAborted");

    /** Static value NodeAddedToCluster for FabricEventKind. */
    public static final FabricEventKind NODE_ADDED_TO_CLUSTER = fromString("NodeAddedToCluster");

    /** Static value NodeClosed for FabricEventKind. */
    public static final FabricEventKind NODE_CLOSED = fromString("NodeClosed");

    /** Static value NodeDeactivateCompleted for FabricEventKind. */
    public static final FabricEventKind NODE_DEACTIVATE_COMPLETED = fromString("NodeDeactivateCompleted");

    /** Static value NodeDeactivateStarted for FabricEventKind. */
    public static final FabricEventKind NODE_DEACTIVATE_STARTED = fromString("NodeDeactivateStarted");

    /** Static value NodeDown for FabricEventKind. */
    public static final FabricEventKind NODE_DOWN = fromString("NodeDown");

    /** Static value NodeNewHealthReport for FabricEventKind. */
    public static final FabricEventKind NODE_NEW_HEALTH_REPORT = fromString("NodeNewHealthReport");

    /** Static value NodeHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind NODE_HEALTH_REPORT_EXPIRED = fromString("NodeHealthReportExpired");

    /** Static value NodeOpenSucceeded for FabricEventKind. */
    public static final FabricEventKind NODE_OPEN_SUCCEEDED = fromString("NodeOpenSucceeded");

    /** Static value NodeOpenFailed for FabricEventKind. */
    public static final FabricEventKind NODE_OPEN_FAILED = fromString("NodeOpenFailed");

    /** Static value NodeRemovedFromCluster for FabricEventKind. */
    public static final FabricEventKind NODE_REMOVED_FROM_CLUSTER = fromString("NodeRemovedFromCluster");

    /** Static value NodeUp for FabricEventKind. */
    public static final FabricEventKind NODE_UP = fromString("NodeUp");

    /** Static value PartitionNewHealthReport for FabricEventKind. */
    public static final FabricEventKind PARTITION_NEW_HEALTH_REPORT = fromString("PartitionNewHealthReport");

    /** Static value PartitionHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind PARTITION_HEALTH_REPORT_EXPIRED = fromString("PartitionHealthReportExpired");

    /** Static value PartitionReconfigured for FabricEventKind. */
    public static final FabricEventKind PARTITION_RECONFIGURED = fromString("PartitionReconfigured");

    /** Static value PartitionPrimaryMoveAnalysis for FabricEventKind. */
    public static final FabricEventKind PARTITION_PRIMARY_MOVE_ANALYSIS = fromString("PartitionPrimaryMoveAnalysis");

    /** Static value ServiceCreated for FabricEventKind. */
    public static final FabricEventKind SERVICE_CREATED = fromString("ServiceCreated");

    /** Static value ServiceDeleted for FabricEventKind. */
    public static final FabricEventKind SERVICE_DELETED = fromString("ServiceDeleted");

    /** Static value ServiceNewHealthReport for FabricEventKind. */
    public static final FabricEventKind SERVICE_NEW_HEALTH_REPORT = fromString("ServiceNewHealthReport");

    /** Static value ServiceHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind SERVICE_HEALTH_REPORT_EXPIRED = fromString("ServiceHealthReportExpired");

    /** Static value DeployedServicePackageNewHealthReport for FabricEventKind. */
    public static final FabricEventKind DEPLOYED_SERVICE_PACKAGE_NEW_HEALTH_REPORT =
            fromString("DeployedServicePackageNewHealthReport");

    /** Static value DeployedServicePackageHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind DEPLOYED_SERVICE_PACKAGE_HEALTH_REPORT_EXPIRED =
            fromString("DeployedServicePackageHealthReportExpired");

    /** Static value StatefulReplicaNewHealthReport for FabricEventKind. */
    public static final FabricEventKind STATEFUL_REPLICA_NEW_HEALTH_REPORT =
            fromString("StatefulReplicaNewHealthReport");

    /** Static value StatefulReplicaHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind STATEFUL_REPLICA_HEALTH_REPORT_EXPIRED =
            fromString("StatefulReplicaHealthReportExpired");

    /** Static value StatelessReplicaNewHealthReport for FabricEventKind. */
    public static final FabricEventKind STATELESS_REPLICA_NEW_HEALTH_REPORT =
            fromString("StatelessReplicaNewHealthReport");

    /** Static value StatelessReplicaHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind STATELESS_REPLICA_HEALTH_REPORT_EXPIRED =
            fromString("StatelessReplicaHealthReportExpired");

    /** Static value ClusterNewHealthReport for FabricEventKind. */
    public static final FabricEventKind CLUSTER_NEW_HEALTH_REPORT = fromString("ClusterNewHealthReport");

    /** Static value ClusterHealthReportExpired for FabricEventKind. */
    public static final FabricEventKind CLUSTER_HEALTH_REPORT_EXPIRED = fromString("ClusterHealthReportExpired");

    /** Static value ClusterUpgradeCompleted for FabricEventKind. */
    public static final FabricEventKind CLUSTER_UPGRADE_COMPLETED = fromString("ClusterUpgradeCompleted");

    /** Static value ClusterUpgradeDomainCompleted for FabricEventKind. */
    public static final FabricEventKind CLUSTER_UPGRADE_DOMAIN_COMPLETED = fromString("ClusterUpgradeDomainCompleted");

    /** Static value ClusterUpgradeRollbackCompleted for FabricEventKind. */
    public static final FabricEventKind CLUSTER_UPGRADE_ROLLBACK_COMPLETED =
            fromString("ClusterUpgradeRollbackCompleted");

    /** Static value ClusterUpgradeRollbackStarted for FabricEventKind. */
    public static final FabricEventKind CLUSTER_UPGRADE_ROLLBACK_STARTED = fromString("ClusterUpgradeRollbackStarted");

    /** Static value ClusterUpgradeStarted for FabricEventKind. */
    public static final FabricEventKind CLUSTER_UPGRADE_STARTED = fromString("ClusterUpgradeStarted");

    /** Static value ChaosStopped for FabricEventKind. */
    public static final FabricEventKind CHAOS_STOPPED = fromString("ChaosStopped");

    /** Static value ChaosStarted for FabricEventKind. */
    public static final FabricEventKind CHAOS_STARTED = fromString("ChaosStarted");

    /** Static value ChaosCodePackageRestartScheduled for FabricEventKind. */
    public static final FabricEventKind CHAOS_CODE_PACKAGE_RESTART_SCHEDULED =
            fromString("ChaosCodePackageRestartScheduled");

    /** Static value ChaosReplicaRemovalScheduled for FabricEventKind. */
    public static final FabricEventKind CHAOS_REPLICA_REMOVAL_SCHEDULED = fromString("ChaosReplicaRemovalScheduled");

    /** Static value ChaosPartitionSecondaryMoveScheduled for FabricEventKind. */
    public static final FabricEventKind CHAOS_PARTITION_SECONDARY_MOVE_SCHEDULED =
            fromString("ChaosPartitionSecondaryMoveScheduled");

    /** Static value ChaosPartitionPrimaryMoveScheduled for FabricEventKind. */
    public static final FabricEventKind CHAOS_PARTITION_PRIMARY_MOVE_SCHEDULED =
            fromString("ChaosPartitionPrimaryMoveScheduled");

    /** Static value ChaosReplicaRestartScheduled for FabricEventKind. */
    public static final FabricEventKind CHAOS_REPLICA_RESTART_SCHEDULED = fromString("ChaosReplicaRestartScheduled");

    /** Static value ChaosNodeRestartScheduled for FabricEventKind. */
    public static final FabricEventKind CHAOS_NODE_RESTART_SCHEDULED = fromString("ChaosNodeRestartScheduled");

    /**
     * Creates or finds a FabricEventKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FabricEventKind.
     */
    @JsonCreator
    public static FabricEventKind fromString(String name) {
        return fromString(name, FabricEventKind.class);
    }

    /**
     * Gets known FabricEventKind values.
     *
     * @return known FabricEventKind values.
     */
    public static Collection<FabricEventKind> values() {
        return values(FabricEventKind.class);
    }
}
