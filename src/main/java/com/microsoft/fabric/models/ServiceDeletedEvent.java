package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Service Deleted event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ServiceDeleted")
@Fluent
public final class ServiceDeletedEvent extends ServiceEvent {
    /*
     * Service type name.
     */
    @JsonProperty(value = "ServiceTypeName", required = true)
    private String serviceTypeName;

    /*
     * Application name.
     */
    @JsonProperty(value = "ApplicationName", required = true)
    private String applicationName;

    /*
     * Application type name.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /*
     * Id of Service instance.
     */
    @JsonProperty(value = "ServiceInstance", required = true)
    private long serviceInstance;

    /*
     * Indicates if Service is stateful.
     */
    @JsonProperty(value = "IsStateful", required = true)
    private boolean isStateful;

    /*
     * Number of partitions.
     */
    @JsonProperty(value = "PartitionCount", required = true)
    private int partitionCount;

    /*
     * Size of target replicas set.
     */
    @JsonProperty(value = "TargetReplicaSetSize", required = true)
    private int targetReplicaSetSize;

    /*
     * Minimum size of replicas set.
     */
    @JsonProperty(value = "MinReplicaSetSize", required = true)
    private int minReplicaSetSize;

    /*
     * Version of Service package.
     */
    @JsonProperty(value = "ServicePackageVersion", required = true)
    private String servicePackageVersion;

    /**
     * Get the serviceTypeName property: Service type name.
     *
     * @return the serviceTypeName value.
     */
    public String getServiceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set the serviceTypeName property: Service type name.
     *
     * @param serviceTypeName the serviceTypeName value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the applicationName property: Application name.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: Application name.
     *
     * @param applicationName the applicationName value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the applicationTypeName property: Application type name.
     *
     * @return the applicationTypeName value.
     */
    public String getApplicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the applicationTypeName property: Application type name.
     *
     * @param applicationTypeName the applicationTypeName value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the serviceInstance property: Id of Service instance.
     *
     * @return the serviceInstance value.
     */
    public long getServiceInstance() {
        return this.serviceInstance;
    }

    /**
     * Set the serviceInstance property: Id of Service instance.
     *
     * @param serviceInstance the serviceInstance value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setServiceInstance(long serviceInstance) {
        this.serviceInstance = serviceInstance;
        return this;
    }

    /**
     * Get the isStateful property: Indicates if Service is stateful.
     *
     * @return the isStateful value.
     */
    public boolean isStateful() {
        return this.isStateful;
    }

    /**
     * Set the isStateful property: Indicates if Service is stateful.
     *
     * @param isStateful the isStateful value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setIsStateful(boolean isStateful) {
        this.isStateful = isStateful;
        return this;
    }

    /**
     * Get the partitionCount property: Number of partitions.
     *
     * @return the partitionCount value.
     */
    public int getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount property: Number of partitions.
     *
     * @param partitionCount the partitionCount value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setPartitionCount(int partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the targetReplicaSetSize property: Size of target replicas set.
     *
     * @return the targetReplicaSetSize value.
     */
    public int getTargetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the targetReplicaSetSize property: Size of target replicas set.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setTargetReplicaSetSize(int targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minReplicaSetSize property: Minimum size of replicas set.
     *
     * @return the minReplicaSetSize value.
     */
    public int getMinReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minReplicaSetSize property: Minimum size of replicas set.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setMinReplicaSetSize(int minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the servicePackageVersion property: Version of Service package.
     *
     * @return the servicePackageVersion value.
     */
    public String getServicePackageVersion() {
        return this.servicePackageVersion;
    }

    /**
     * Set the servicePackageVersion property: Version of Service package.
     *
     * @param servicePackageVersion the servicePackageVersion value to set.
     * @return the ServiceDeletedEvent object itself.
     */
    public ServiceDeletedEvent setServicePackageVersion(String servicePackageVersion) {
        this.servicePackageVersion = servicePackageVersion;
        return this;
    }
}
