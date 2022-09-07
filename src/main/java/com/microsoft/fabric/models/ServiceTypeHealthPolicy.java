package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the health policy used to evaluate the health of services belonging to a service type. */
@Fluent
public final class ServiceTypeHealthPolicy {
    /*
     * The maximum allowed percentage of unhealthy partitions per service.
     * Allowed values are Byte values from zero to 100
     *
     * The percentage represents the maximum tolerated percentage of partitions
     * that can be unhealthy before the service is considered in error.
     * If the percentage is respected but there is at least one unhealthy
     * partition, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy
     * partitions over the total number of partitions in the service.
     * The computation rounds up to tolerate one failure on small numbers of
     * partitions. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyPartitionsPerService")
    private Integer maxPercentUnhealthyPartitionsPerService;

    /*
     * The maximum allowed percentage of unhealthy replicas per partition.
     * Allowed values are Byte values from zero to 100.
     *
     * The percentage represents the maximum tolerated percentage of replicas
     * that can be unhealthy before the partition is considered in error.
     * If the percentage is respected but there is at least one unhealthy
     * replica, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy
     * replicas over the total number of replicas in the partition.
     * The computation rounds up to tolerate one failure on small numbers of
     * replicas. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyReplicasPerPartition")
    private Integer maxPercentUnhealthyReplicasPerPartition;

    /*
     * The maximum allowed percentage of unhealthy services. Allowed values are
     * Byte values from zero to 100.
     *
     * The percentage represents the maximum tolerated percentage of services
     * that can be unhealthy before the application is considered in error.
     * If the percentage is respected but there is at least one unhealthy
     * service, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy services of the
     * specific service type over the total number of services of the specific
     * service type.
     * The computation rounds up to tolerate one failure on small numbers of
     * services. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyServices")
    private Integer maxPercentUnhealthyServices;

    /**
     * Get the maxPercentUnhealthyPartitionsPerService property: The maximum allowed percentage of unhealthy partitions
     * per service. Allowed values are Byte values from zero to 100
     *
     * <p>The percentage represents the maximum tolerated percentage of partitions that can be unhealthy before the
     * service is considered in error. If the percentage is respected but there is at least one unhealthy partition, the
     * health is evaluated as Warning. The percentage is calculated by dividing the number of unhealthy partitions over
     * the total number of partitions in the service. The computation rounds up to tolerate one failure on small numbers
     * of partitions. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyPartitionsPerService value.
     */
    public Integer getMaxPercentUnhealthyPartitionsPerService() {
        return this.maxPercentUnhealthyPartitionsPerService;
    }

    /**
     * Set the maxPercentUnhealthyPartitionsPerService property: The maximum allowed percentage of unhealthy partitions
     * per service. Allowed values are Byte values from zero to 100
     *
     * <p>The percentage represents the maximum tolerated percentage of partitions that can be unhealthy before the
     * service is considered in error. If the percentage is respected but there is at least one unhealthy partition, the
     * health is evaluated as Warning. The percentage is calculated by dividing the number of unhealthy partitions over
     * the total number of partitions in the service. The computation rounds up to tolerate one failure on small numbers
     * of partitions. Default percentage is zero.
     *
     * @param maxPercentUnhealthyPartitionsPerService the maxPercentUnhealthyPartitionsPerService value to set.
     * @return the ServiceTypeHealthPolicy object itself.
     */
    public ServiceTypeHealthPolicy setMaxPercentUnhealthyPartitionsPerService(
            Integer maxPercentUnhealthyPartitionsPerService) {
        this.maxPercentUnhealthyPartitionsPerService = maxPercentUnhealthyPartitionsPerService;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyReplicasPerPartition property: The maximum allowed percentage of unhealthy replicas
     * per partition. Allowed values are Byte values from zero to 100.
     *
     * <p>The percentage represents the maximum tolerated percentage of replicas that can be unhealthy before the
     * partition is considered in error. If the percentage is respected but there is at least one unhealthy replica, the
     * health is evaluated as Warning. The percentage is calculated by dividing the number of unhealthy replicas over
     * the total number of replicas in the partition. The computation rounds up to tolerate one failure on small numbers
     * of replicas. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyReplicasPerPartition value.
     */
    public Integer getMaxPercentUnhealthyReplicasPerPartition() {
        return this.maxPercentUnhealthyReplicasPerPartition;
    }

    /**
     * Set the maxPercentUnhealthyReplicasPerPartition property: The maximum allowed percentage of unhealthy replicas
     * per partition. Allowed values are Byte values from zero to 100.
     *
     * <p>The percentage represents the maximum tolerated percentage of replicas that can be unhealthy before the
     * partition is considered in error. If the percentage is respected but there is at least one unhealthy replica, the
     * health is evaluated as Warning. The percentage is calculated by dividing the number of unhealthy replicas over
     * the total number of replicas in the partition. The computation rounds up to tolerate one failure on small numbers
     * of replicas. Default percentage is zero.
     *
     * @param maxPercentUnhealthyReplicasPerPartition the maxPercentUnhealthyReplicasPerPartition value to set.
     * @return the ServiceTypeHealthPolicy object itself.
     */
    public ServiceTypeHealthPolicy setMaxPercentUnhealthyReplicasPerPartition(
            Integer maxPercentUnhealthyReplicasPerPartition) {
        this.maxPercentUnhealthyReplicasPerPartition = maxPercentUnhealthyReplicasPerPartition;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyServices property: The maximum allowed percentage of unhealthy services. Allowed
     * values are Byte values from zero to 100.
     *
     * <p>The percentage represents the maximum tolerated percentage of services that can be unhealthy before the
     * application is considered in error. If the percentage is respected but there is at least one unhealthy service,
     * the health is evaluated as Warning. This is calculated by dividing the number of unhealthy services of the
     * specific service type over the total number of services of the specific service type. The computation rounds up
     * to tolerate one failure on small numbers of services. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyServices value.
     */
    public Integer getMaxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices;
    }

    /**
     * Set the maxPercentUnhealthyServices property: The maximum allowed percentage of unhealthy services. Allowed
     * values are Byte values from zero to 100.
     *
     * <p>The percentage represents the maximum tolerated percentage of services that can be unhealthy before the
     * application is considered in error. If the percentage is respected but there is at least one unhealthy service,
     * the health is evaluated as Warning. This is calculated by dividing the number of unhealthy services of the
     * specific service type over the total number of services of the specific service type. The computation rounds up
     * to tolerate one failure on small numbers of services. Default percentage is zero.
     *
     * @param maxPercentUnhealthyServices the maxPercentUnhealthyServices value to set.
     * @return the ServiceTypeHealthPolicy object itself.
     */
    public ServiceTypeHealthPolicy setMaxPercentUnhealthyServices(Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
        return this;
    }
}
