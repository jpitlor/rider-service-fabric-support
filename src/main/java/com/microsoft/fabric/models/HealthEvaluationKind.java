package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HealthEvaluationKind. */
public final class HealthEvaluationKind extends ExpandableStringEnum<HealthEvaluationKind> {
    /** Static value Invalid for HealthEvaluationKind. */
    public static final HealthEvaluationKind INVALID = fromString("Invalid");

    /** Static value Event for HealthEvaluationKind. */
    public static final HealthEvaluationKind EVENT = fromString("Event");

    /** Static value Replicas for HealthEvaluationKind. */
    public static final HealthEvaluationKind REPLICAS = fromString("Replicas");

    /** Static value Partitions for HealthEvaluationKind. */
    public static final HealthEvaluationKind PARTITIONS = fromString("Partitions");

    /** Static value DeployedServicePackages for HealthEvaluationKind. */
    public static final HealthEvaluationKind DEPLOYED_SERVICE_PACKAGES = fromString("DeployedServicePackages");

    /** Static value DeployedApplications for HealthEvaluationKind. */
    public static final HealthEvaluationKind DEPLOYED_APPLICATIONS = fromString("DeployedApplications");

    /** Static value Services for HealthEvaluationKind. */
    public static final HealthEvaluationKind SERVICES = fromString("Services");

    /** Static value Nodes for HealthEvaluationKind. */
    public static final HealthEvaluationKind NODES = fromString("Nodes");

    /** Static value Applications for HealthEvaluationKind. */
    public static final HealthEvaluationKind APPLICATIONS = fromString("Applications");

    /** Static value SystemApplication for HealthEvaluationKind. */
    public static final HealthEvaluationKind SYSTEM_APPLICATION = fromString("SystemApplication");

    /** Static value UpgradeDomainDeployedApplications for HealthEvaluationKind. */
    public static final HealthEvaluationKind UPGRADE_DOMAIN_DEPLOYED_APPLICATIONS =
            fromString("UpgradeDomainDeployedApplications");

    /** Static value UpgradeDomainNodes for HealthEvaluationKind. */
    public static final HealthEvaluationKind UPGRADE_DOMAIN_NODES = fromString("UpgradeDomainNodes");

    /** Static value Replica for HealthEvaluationKind. */
    public static final HealthEvaluationKind REPLICA = fromString("Replica");

    /** Static value Partition for HealthEvaluationKind. */
    public static final HealthEvaluationKind PARTITION = fromString("Partition");

    /** Static value DeployedServicePackage for HealthEvaluationKind. */
    public static final HealthEvaluationKind DEPLOYED_SERVICE_PACKAGE = fromString("DeployedServicePackage");

    /** Static value DeployedApplication for HealthEvaluationKind. */
    public static final HealthEvaluationKind DEPLOYED_APPLICATION = fromString("DeployedApplication");

    /** Static value Service for HealthEvaluationKind. */
    public static final HealthEvaluationKind SERVICE = fromString("Service");

    /** Static value Node for HealthEvaluationKind. */
    public static final HealthEvaluationKind NODE = fromString("Node");

    /** Static value Application for HealthEvaluationKind. */
    public static final HealthEvaluationKind APPLICATION = fromString("Application");

    /** Static value DeltaNodesCheck for HealthEvaluationKind. */
    public static final HealthEvaluationKind DELTA_NODES_CHECK = fromString("DeltaNodesCheck");

    /** Static value UpgradeDomainDeltaNodesCheck for HealthEvaluationKind. */
    public static final HealthEvaluationKind UPGRADE_DOMAIN_DELTA_NODES_CHECK =
            fromString("UpgradeDomainDeltaNodesCheck");

    /** Static value ApplicationTypeApplications for HealthEvaluationKind. */
    public static final HealthEvaluationKind APPLICATION_TYPE_APPLICATIONS = fromString("ApplicationTypeApplications");

    /** Static value NodeTypeNodes for HealthEvaluationKind. */
    public static final HealthEvaluationKind NODE_TYPE_NODES = fromString("NodeTypeNodes");

    /**
     * Creates or finds a HealthEvaluationKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthEvaluationKind.
     */
    @JsonCreator
    public static HealthEvaluationKind fromString(String name) {
        return fromString(name, HealthEvaluationKind.class);
    }

    /**
     * Gets known HealthEvaluationKind values.
     *
     * @return known HealthEvaluationKind values.
     */
    public static Collection<HealthEvaluationKind> values() {
        return values(HealthEvaluationKind.class);
    }
}
