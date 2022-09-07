package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Information about a Service Fabric service replica deployed on a node. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = DeployedServiceReplicaInfo.class)
@JsonTypeName("DeployedServiceReplicaInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = DeployedStatefulServiceReplicaInfo.class),
    @JsonSubTypes.Type(name = "Stateless", value = DeployedStatelessServiceInstanceInfo.class)
})
@Fluent
public class DeployedServiceReplicaInfo {
    /*
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * Name of the service type as specified in the service manifest.
     */
    @JsonProperty(value = "ServiceTypeName")
    private String serviceTypeName;

    /*
     * The name of the service manifest in which this service type is defined.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

    /*
     * The name of the code package that hosts this replica.
     */
    @JsonProperty(value = "CodePackageName")
    private String codePackageName;

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
     * The status of a replica of a service.
     */
    @JsonProperty(value = "ReplicaStatus")
    private ReplicaStatus replicaStatus;

    /*
     * The last address returned by the replica in Open or ChangeRole.
     */
    @JsonProperty(value = "Address")
    private String address;

    /*
     * The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the
     * service
     * is 'SharedProcess' (or if it is not specified, in which case it defaults
     * to 'SharedProcess'), then value of ServicePackageActivationId
     * is always an empty string.
     */
    @JsonProperty(value = "ServicePackageActivationId")
    private String servicePackageActivationId;

    /*
     * Host process ID of the process that is hosting the replica. This will be
     * zero if the replica is down. In hyper-v containers this host process ID
     * will be from different kernel.
     */
    @JsonProperty(value = "HostProcessId")
    private String hostProcessId;

    /**
     * Get the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @param serviceName the serviceName value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the serviceTypeName property: Name of the service type as specified in the service manifest.
     *
     * @return the serviceTypeName value.
     */
    public String getServiceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set the serviceTypeName property: Name of the service type as specified in the service manifest.
     *
     * @param serviceTypeName the serviceTypeName value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the serviceManifestName property: The name of the service manifest in which this service type is defined.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: The name of the service manifest in which this service type is defined.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the codePackageName property: The name of the code package that hosts this replica.
     *
     * @return the codePackageName value.
     */
    public String getCodePackageName() {
        return this.codePackageName;
    }

    /**
     * Set the codePackageName property: The name of the code package that hosts this replica.
     *
     * @param codePackageName the codePackageName value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setCodePackageName(String codePackageName) {
        this.codePackageName = codePackageName;
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
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the replicaStatus property: The status of a replica of a service.
     *
     * @return the replicaStatus value.
     */
    public ReplicaStatus getReplicaStatus() {
        return this.replicaStatus;
    }

    /**
     * Set the replicaStatus property: The status of a replica of a service.
     *
     * @param replicaStatus the replicaStatus value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus;
        return this;
    }

    /**
     * Get the address property: The last address returned by the replica in Open or ChangeRole.
     *
     * @return the address value.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address property: The last address returned by the replica in Open or ChangeRole.
     *
     * @param address the address value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the servicePackageActivationId property: The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the service is 'SharedProcess' (or if it is not
     * specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId is always an
     * empty string.
     *
     * @return the servicePackageActivationId value.
     */
    public String getServicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId property: The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the service is 'SharedProcess' (or if it is not
     * specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId is always an
     * empty string.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

    /**
     * Get the hostProcessId property: Host process ID of the process that is hosting the replica. This will be zero if
     * the replica is down. In hyper-v containers this host process ID will be from different kernel.
     *
     * @return the hostProcessId value.
     */
    public String getHostProcessId() {
        return this.hostProcessId;
    }

    /**
     * Set the hostProcessId property: Host process ID of the process that is hosting the replica. This will be zero if
     * the replica is down. In hyper-v containers this host process ID will be from different kernel.
     *
     * @param hostProcessId the hostProcessId value to set.
     * @return the DeployedServiceReplicaInfo object itself.
     */
    public DeployedServiceReplicaInfo setHostProcessId(String hostProcessId) {
        this.hostProcessId = hostProcessId;
        return this;
    }
}
