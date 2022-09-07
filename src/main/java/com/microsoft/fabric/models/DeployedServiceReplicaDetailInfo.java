package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Information about a Service Fabric service replica deployed on a node. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = DeployedServiceReplicaDetailInfo.class)
@JsonTypeName("DeployedServiceReplicaDetailInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = DeployedStatefulServiceReplicaDetailInfo.class),
    @JsonSubTypes.Type(name = "Stateless", value = DeployedStatelessServiceInstanceDetailInfo.class)
})
@Fluent
public class DeployedServiceReplicaDetailInfo {
    /*
     * Full hierarchical name of the service in URI format starting with
     * `fabric:`.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * An internal ID used by Service Fabric to uniquely identify a partition.
     * This is a randomly generated GUID when the service was created. The
     * partition ID is unique and does not change for the lifetime of the
     * service. If the same service was deleted and recreated the IDs of its
     * partitions would be different.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * Specifies the current active life-cycle operation on a stateful service
     * replica or stateless service instance.
     */
    @JsonProperty(value = "CurrentServiceOperation")
    private ServiceOperationName currentServiceOperation;

    /*
     * The start time of the current service operation in UTC format.
     */
    @JsonProperty(value = "CurrentServiceOperationStartTimeUtc")
    private OffsetDateTime currentServiceOperationStartTimeUtc;

    /*
     * List of load reported by replica.
     */
    @JsonProperty(value = "ReportedLoad")
    private List<LoadMetricReportInfo> reportedLoad;

    /**
     * Get the serviceName property: Full hierarchical name of the service in URI format starting with `fabric:`.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Full hierarchical name of the service in URI format starting with `fabric:`.
     *
     * @param serviceName the serviceName value to set.
     * @return the DeployedServiceReplicaDetailInfo object itself.
     */
    public DeployedServiceReplicaDetailInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the partitionId property: An internal ID used by Service Fabric to uniquely identify a partition. This is a
     * randomly generated GUID when the service was created. The partition ID is unique and does not change for the
     * lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be
     * different.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: An internal ID used by Service Fabric to uniquely identify a partition. This is a
     * randomly generated GUID when the service was created. The partition ID is unique and does not change for the
     * lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be
     * different.
     *
     * @param partitionId the partitionId value to set.
     * @return the DeployedServiceReplicaDetailInfo object itself.
     */
    public DeployedServiceReplicaDetailInfo setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the currentServiceOperation property: Specifies the current active life-cycle operation on a stateful service
     * replica or stateless service instance.
     *
     * @return the currentServiceOperation value.
     */
    public ServiceOperationName getCurrentServiceOperation() {
        return this.currentServiceOperation;
    }

    /**
     * Set the currentServiceOperation property: Specifies the current active life-cycle operation on a stateful service
     * replica or stateless service instance.
     *
     * @param currentServiceOperation the currentServiceOperation value to set.
     * @return the DeployedServiceReplicaDetailInfo object itself.
     */
    public DeployedServiceReplicaDetailInfo setCurrentServiceOperation(ServiceOperationName currentServiceOperation) {
        this.currentServiceOperation = currentServiceOperation;
        return this;
    }

    /**
     * Get the currentServiceOperationStartTimeUtc property: The start time of the current service operation in UTC
     * format.
     *
     * @return the currentServiceOperationStartTimeUtc value.
     */
    public OffsetDateTime getCurrentServiceOperationStartTimeUtc() {
        return this.currentServiceOperationStartTimeUtc;
    }

    /**
     * Set the currentServiceOperationStartTimeUtc property: The start time of the current service operation in UTC
     * format.
     *
     * @param currentServiceOperationStartTimeUtc the currentServiceOperationStartTimeUtc value to set.
     * @return the DeployedServiceReplicaDetailInfo object itself.
     */
    public DeployedServiceReplicaDetailInfo setCurrentServiceOperationStartTimeUtc(
            OffsetDateTime currentServiceOperationStartTimeUtc) {
        this.currentServiceOperationStartTimeUtc = currentServiceOperationStartTimeUtc;
        return this;
    }

    /**
     * Get the reportedLoad property: List of load reported by replica.
     *
     * @return the reportedLoad value.
     */
    public List<LoadMetricReportInfo> getReportedLoad() {
        return this.reportedLoad;
    }

    /**
     * Set the reportedLoad property: List of load reported by replica.
     *
     * @param reportedLoad the reportedLoad value to set.
     * @return the DeployedServiceReplicaDetailInfo object itself.
     */
    public DeployedServiceReplicaDetailInfo setReportedLoad(List<LoadMetricReportInfo> reportedLoad) {
        this.reportedLoad = reportedLoad;
        return this;
    }
}
