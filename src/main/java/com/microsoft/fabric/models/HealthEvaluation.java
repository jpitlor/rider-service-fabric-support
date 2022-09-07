package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a health evaluation which describes the data and the algorithm used by health manager to evaluate the
 * health of an entity.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = HealthEvaluation.class)
@JsonTypeName("HealthEvaluation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Application", value = ApplicationHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Applications", value = ApplicationsHealthEvaluation.class),
    @JsonSubTypes.Type(name = "ApplicationTypeApplications", value = ApplicationTypeApplicationsHealthEvaluation.class),
    @JsonSubTypes.Type(name = "DeltaNodesCheck", value = DeltaNodesCheckHealthEvaluation.class),
    @JsonSubTypes.Type(name = "DeployedApplication", value = DeployedApplicationHealthEvaluation.class),
    @JsonSubTypes.Type(name = "DeployedApplications", value = DeployedApplicationsHealthEvaluation.class),
    @JsonSubTypes.Type(name = "DeployedServicePackage", value = DeployedServicePackageHealthEvaluation.class),
    @JsonSubTypes.Type(name = "DeployedServicePackages", value = DeployedServicePackagesHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Event", value = EventHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Node", value = NodeHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Nodes", value = NodesHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Partition", value = PartitionHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Partitions", value = PartitionsHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Replica", value = ReplicaHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Replicas", value = ReplicasHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Service", value = ServiceHealthEvaluation.class),
    @JsonSubTypes.Type(name = "Services", value = ServicesHealthEvaluation.class),
    @JsonSubTypes.Type(name = "SystemApplication", value = SystemApplicationHealthEvaluation.class),
    @JsonSubTypes.Type(
            name = "UpgradeDomainDeltaNodesCheck",
            value = UpgradeDomainDeltaNodesCheckHealthEvaluation.class),
    @JsonSubTypes.Type(
            name = "UpgradeDomainDeployedApplications",
            value = UpgradeDomainDeployedApplicationsHealthEvaluation.class),
    @JsonSubTypes.Type(name = "UpgradeDomainNodes", value = UpgradeDomainNodesHealthEvaluation.class),
    @JsonSubTypes.Type(name = "NodeTypeNodes", value = NodeTypeNodesHealthEvaluation.class)
})
@Fluent
public class HealthEvaluation {
    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "AggregatedHealthState")
    private HealthState aggregatedHealthState;

    /*
     * Description of the health evaluation, which represents a summary of the
     * evaluation process.
     */
    @JsonProperty(value = "Description")
    private String description;

    /**
     * Get the aggregatedHealthState property: The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     *
     * @return the aggregatedHealthState value.
     */
    public HealthState getAggregatedHealthState() {
        return this.aggregatedHealthState;
    }

    /**
     * Set the aggregatedHealthState property: The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     *
     * @param aggregatedHealthState the aggregatedHealthState value to set.
     * @return the HealthEvaluation object itself.
     */
    public HealthEvaluation setAggregatedHealthState(HealthState aggregatedHealthState) {
        this.aggregatedHealthState = aggregatedHealthState;
        return this;
    }

    /**
     * Get the description property: Description of the health evaluation, which represents a summary of the evaluation
     * process.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of the health evaluation, which represents a summary of the evaluation
     * process.
     *
     * @param description the description value to set.
     * @return the HealthEvaluation object itself.
     */
    public HealthEvaluation setDescription(String description) {
        this.description = description;
        return this;
    }
}
