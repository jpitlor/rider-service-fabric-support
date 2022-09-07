package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * Represents load information for a partition, which contains the primary, secondary and auxiliary reported load
 * metrics. In case there is no load reported, PartitionLoadInformation will contain the default load for the service of
 * the partition. For default loads, LoadMetricReport's LastReportedUtc is set to 0.
 */
@Fluent
public final class PartitionLoadInformation {
    /*
     * Id of the partition.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * Array of load reports from the primary replica for this partition.
     */
    @JsonProperty(value = "PrimaryLoadMetricReports")
    private List<LoadMetricReport> primaryLoadMetricReports;

    /*
     * Array of aggregated load reports from all secondary replicas for this
     * partition.
     * Array only contains the latest reported load for each metric.
     */
    @JsonProperty(value = "SecondaryLoadMetricReports")
    private List<LoadMetricReport> secondaryLoadMetricReports;

    /*
     * Array of aggregated load reports from all auxiliary replicas for this
     * partition.
     * Array only contains the latest reported load for each metric.
     */
    @JsonProperty(value = "AuxiliaryLoadMetricReports")
    private List<LoadMetricReport> auxiliaryLoadMetricReports;

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
     * @return the PartitionLoadInformation object itself.
     */
    public PartitionLoadInformation setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the primaryLoadMetricReports property: Array of load reports from the primary replica for this partition.
     *
     * @return the primaryLoadMetricReports value.
     */
    public List<LoadMetricReport> getPrimaryLoadMetricReports() {
        return this.primaryLoadMetricReports;
    }

    /**
     * Set the primaryLoadMetricReports property: Array of load reports from the primary replica for this partition.
     *
     * @param primaryLoadMetricReports the primaryLoadMetricReports value to set.
     * @return the PartitionLoadInformation object itself.
     */
    public PartitionLoadInformation setPrimaryLoadMetricReports(List<LoadMetricReport> primaryLoadMetricReports) {
        this.primaryLoadMetricReports = primaryLoadMetricReports;
        return this;
    }

    /**
     * Get the secondaryLoadMetricReports property: Array of aggregated load reports from all secondary replicas for
     * this partition. Array only contains the latest reported load for each metric.
     *
     * @return the secondaryLoadMetricReports value.
     */
    public List<LoadMetricReport> getSecondaryLoadMetricReports() {
        return this.secondaryLoadMetricReports;
    }

    /**
     * Set the secondaryLoadMetricReports property: Array of aggregated load reports from all secondary replicas for
     * this partition. Array only contains the latest reported load for each metric.
     *
     * @param secondaryLoadMetricReports the secondaryLoadMetricReports value to set.
     * @return the PartitionLoadInformation object itself.
     */
    public PartitionLoadInformation setSecondaryLoadMetricReports(List<LoadMetricReport> secondaryLoadMetricReports) {
        this.secondaryLoadMetricReports = secondaryLoadMetricReports;
        return this;
    }

    /**
     * Get the auxiliaryLoadMetricReports property: Array of aggregated load reports from all auxiliary replicas for
     * this partition. Array only contains the latest reported load for each metric.
     *
     * @return the auxiliaryLoadMetricReports value.
     */
    public List<LoadMetricReport> getAuxiliaryLoadMetricReports() {
        return this.auxiliaryLoadMetricReports;
    }

    /**
     * Set the auxiliaryLoadMetricReports property: Array of aggregated load reports from all auxiliary replicas for
     * this partition. Array only contains the latest reported load for each metric.
     *
     * @param auxiliaryLoadMetricReports the auxiliaryLoadMetricReports value to set.
     * @return the PartitionLoadInformation object itself.
     */
    public PartitionLoadInformation setAuxiliaryLoadMetricReports(List<LoadMetricReport> auxiliaryLoadMetricReports) {
        this.auxiliaryLoadMetricReports = auxiliaryLoadMetricReports;
        return this;
    }
}
