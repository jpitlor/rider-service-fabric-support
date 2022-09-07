package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Partition Reconfiguration event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("PartitionReconfigured")
@Fluent
public final class PartitionReconfiguredEvent extends PartitionEvent {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstanceId", required = true)
    private String nodeInstanceId;

    /*
     * Type of Service.
     */
    @JsonProperty(value = "ServiceType", required = true)
    private String serviceType;

    /*
     * CcEpochDataLoss version.
     */
    @JsonProperty(value = "CcEpochDataLossVersion", required = true)
    private long ccEpochDataLossVersion;

    /*
     * CcEpochConfig version.
     */
    @JsonProperty(value = "CcEpochConfigVersion", required = true)
    private long ccEpochConfigVersion;

    /*
     * Type of reconfiguration.
     */
    @JsonProperty(value = "ReconfigType", required = true)
    private String reconfigType;

    /*
     * Describes reconfiguration result.
     */
    @JsonProperty(value = "Result", required = true)
    private String result;

    /*
     * Duration of Phase0 in milli-seconds.
     */
    @JsonProperty(value = "Phase0DurationMs", required = true)
    private double phase0DurationMs;

    /*
     * Duration of Phase1 in milli-seconds.
     */
    @JsonProperty(value = "Phase1DurationMs", required = true)
    private double phase1DurationMs;

    /*
     * Duration of Phase2 in milli-seconds.
     */
    @JsonProperty(value = "Phase2DurationMs", required = true)
    private double phase2DurationMs;

    /*
     * Duration of Phase3 in milli-seconds.
     */
    @JsonProperty(value = "Phase3DurationMs", required = true)
    private double phase3DurationMs;

    /*
     * Duration of Phase4 in milli-seconds.
     */
    @JsonProperty(value = "Phase4DurationMs", required = true)
    private double phase4DurationMs;

    /*
     * Total duration in milli-seconds.
     */
    @JsonProperty(value = "TotalDurationMs", required = true)
    private double totalDurationMs;

    /**
     * Get the nodeName property: The name of a Service Fabric node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the nodeInstanceId property: Id of Node instance.
     *
     * @return the nodeInstanceId value.
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set the nodeInstanceId property: Id of Node instance.
     *
     * @param nodeInstanceId the nodeInstanceId value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

    /**
     * Get the serviceType property: Type of Service.
     *
     * @return the serviceType value.
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * Set the serviceType property: Type of Service.
     *
     * @param serviceType the serviceType value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get the ccEpochDataLossVersion property: CcEpochDataLoss version.
     *
     * @return the ccEpochDataLossVersion value.
     */
    public long getCcEpochDataLossVersion() {
        return this.ccEpochDataLossVersion;
    }

    /**
     * Set the ccEpochDataLossVersion property: CcEpochDataLoss version.
     *
     * @param ccEpochDataLossVersion the ccEpochDataLossVersion value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setCcEpochDataLossVersion(long ccEpochDataLossVersion) {
        this.ccEpochDataLossVersion = ccEpochDataLossVersion;
        return this;
    }

    /**
     * Get the ccEpochConfigVersion property: CcEpochConfig version.
     *
     * @return the ccEpochConfigVersion value.
     */
    public long getCcEpochConfigVersion() {
        return this.ccEpochConfigVersion;
    }

    /**
     * Set the ccEpochConfigVersion property: CcEpochConfig version.
     *
     * @param ccEpochConfigVersion the ccEpochConfigVersion value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setCcEpochConfigVersion(long ccEpochConfigVersion) {
        this.ccEpochConfigVersion = ccEpochConfigVersion;
        return this;
    }

    /**
     * Get the reconfigType property: Type of reconfiguration.
     *
     * @return the reconfigType value.
     */
    public String getReconfigType() {
        return this.reconfigType;
    }

    /**
     * Set the reconfigType property: Type of reconfiguration.
     *
     * @param reconfigType the reconfigType value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setReconfigType(String reconfigType) {
        this.reconfigType = reconfigType;
        return this;
    }

    /**
     * Get the result property: Describes reconfiguration result.
     *
     * @return the result value.
     */
    public String getResult() {
        return this.result;
    }

    /**
     * Set the result property: Describes reconfiguration result.
     *
     * @param result the result value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Get the phase0DurationMs property: Duration of Phase0 in milli-seconds.
     *
     * @return the phase0DurationMs value.
     */
    public double getPhase0DurationMs() {
        return this.phase0DurationMs;
    }

    /**
     * Set the phase0DurationMs property: Duration of Phase0 in milli-seconds.
     *
     * @param phase0DurationMs the phase0DurationMs value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setPhase0DurationMs(double phase0DurationMs) {
        this.phase0DurationMs = phase0DurationMs;
        return this;
    }

    /**
     * Get the phase1DurationMs property: Duration of Phase1 in milli-seconds.
     *
     * @return the phase1DurationMs value.
     */
    public double getPhase1DurationMs() {
        return this.phase1DurationMs;
    }

    /**
     * Set the phase1DurationMs property: Duration of Phase1 in milli-seconds.
     *
     * @param phase1DurationMs the phase1DurationMs value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setPhase1DurationMs(double phase1DurationMs) {
        this.phase1DurationMs = phase1DurationMs;
        return this;
    }

    /**
     * Get the phase2DurationMs property: Duration of Phase2 in milli-seconds.
     *
     * @return the phase2DurationMs value.
     */
    public double getPhase2DurationMs() {
        return this.phase2DurationMs;
    }

    /**
     * Set the phase2DurationMs property: Duration of Phase2 in milli-seconds.
     *
     * @param phase2DurationMs the phase2DurationMs value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setPhase2DurationMs(double phase2DurationMs) {
        this.phase2DurationMs = phase2DurationMs;
        return this;
    }

    /**
     * Get the phase3DurationMs property: Duration of Phase3 in milli-seconds.
     *
     * @return the phase3DurationMs value.
     */
    public double getPhase3DurationMs() {
        return this.phase3DurationMs;
    }

    /**
     * Set the phase3DurationMs property: Duration of Phase3 in milli-seconds.
     *
     * @param phase3DurationMs the phase3DurationMs value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setPhase3DurationMs(double phase3DurationMs) {
        this.phase3DurationMs = phase3DurationMs;
        return this;
    }

    /**
     * Get the phase4DurationMs property: Duration of Phase4 in milli-seconds.
     *
     * @return the phase4DurationMs value.
     */
    public double getPhase4DurationMs() {
        return this.phase4DurationMs;
    }

    /**
     * Set the phase4DurationMs property: Duration of Phase4 in milli-seconds.
     *
     * @param phase4DurationMs the phase4DurationMs value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setPhase4DurationMs(double phase4DurationMs) {
        this.phase4DurationMs = phase4DurationMs;
        return this;
    }

    /**
     * Get the totalDurationMs property: Total duration in milli-seconds.
     *
     * @return the totalDurationMs value.
     */
    public double getTotalDurationMs() {
        return this.totalDurationMs;
    }

    /**
     * Set the totalDurationMs property: Total duration in milli-seconds.
     *
     * @param totalDurationMs the totalDurationMs value to set.
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent setTotalDurationMs(double totalDurationMs) {
        this.totalDurationMs = totalDurationMs;
        return this;
    }
}
