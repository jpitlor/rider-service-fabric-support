package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Represents partition information. */
@Fluent
public final class LoadedPartitionInformationResult {
    /*
     * Name of the service this partition belongs to.
     */
    @JsonProperty(value = "ServiceName", required = true)
    private String serviceName;

    /*
     * Id of the partition.
     */
    @JsonProperty(value = "PartitionId", required = true)
    private UUID partitionId;

    /*
     * Name of the metric for which this information is provided.
     */
    @JsonProperty(value = "MetricName", required = true)
    private String metricName;

    /*
     * Load for metric.
     */
    @JsonProperty(value = "Load", required = true)
    private long load;

    /**
     * Get the serviceName property: Name of the service this partition belongs to.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Name of the service this partition belongs to.
     *
     * @param serviceName the serviceName value to set.
     * @return the LoadedPartitionInformationResult object itself.
     */
    public LoadedPartitionInformationResult setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the partitionId property: Id of the partition.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: Id of the partition.
     *
     * @param partitionId the partitionId value to set.
     * @return the LoadedPartitionInformationResult object itself.
     */
    public LoadedPartitionInformationResult setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the metricName property: Name of the metric for which this information is provided.
     *
     * @return the metricName value.
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: Name of the metric for which this information is provided.
     *
     * @param metricName the metricName value to set.
     * @return the LoadedPartitionInformationResult object itself.
     */
    public LoadedPartitionInformationResult setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the load property: Load for metric.
     *
     * @return the load value.
     */
    public long getLoad() {
        return this.load;
    }

    /**
     * Set the load property: Load for metric.
     *
     * @param load the load value to set.
     * @return the LoadedPartitionInformationResult object itself.
     */
    public LoadedPartitionInformationResult setLoad(long load) {
        this.load = load;
        return this;
    }
}
