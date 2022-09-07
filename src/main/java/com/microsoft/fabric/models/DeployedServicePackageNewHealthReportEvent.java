package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Deployed Service Health Report Created event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("DeployedServicePackageNewHealthReport")
@Fluent
public final class DeployedServicePackageNewHealthReportEvent extends ApplicationEvent {
    /*
     * Service manifest name.
     */
    @JsonProperty(value = "ServiceManifestName", required = true)
    private String serviceManifestName;

    /*
     * Id of Service package instance.
     */
    @JsonProperty(value = "ServicePackageInstanceId", required = true)
    private long servicePackageInstanceId;

    /*
     * Id of Service package activation.
     */
    @JsonProperty(value = "ServicePackageActivationId", required = true)
    private String servicePackageActivationId;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /*
     * Id of report source.
     */
    @JsonProperty(value = "SourceId", required = true)
    private String sourceId;

    /*
     * Describes the property.
     */
    @JsonProperty(value = "Property", required = true)
    private String property;

    /*
     * Describes the property health state.
     */
    @JsonProperty(value = "HealthState", required = true)
    private String healthState;

    /*
     * Time to live in milli-seconds.
     */
    @JsonProperty(value = "TimeToLiveMs", required = true)
    private long timeToLiveMs;

    /*
     * Sequence number of report.
     */
    @JsonProperty(value = "SequenceNumber", required = true)
    private long sequenceNumber;

    /*
     * Description of report.
     */
    @JsonProperty(value = "Description", required = true)
    private String description;

    /*
     * Indicates the removal when it expires.
     */
    @JsonProperty(value = "RemoveWhenExpired", required = true)
    private boolean removeWhenExpired;

    /*
     * Source time.
     */
    @JsonProperty(value = "SourceUtcTimestamp", required = true)
    private OffsetDateTime sourceUtcTimestamp;

    /**
     * Get the serviceManifestName property: Service manifest name.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: Service manifest name.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the servicePackageInstanceId property: Id of Service package instance.
     *
     * @return the servicePackageInstanceId value.
     */
    public long getServicePackageInstanceId() {
        return this.servicePackageInstanceId;
    }

    /**
     * Set the servicePackageInstanceId property: Id of Service package instance.
     *
     * @param servicePackageInstanceId the servicePackageInstanceId value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setServicePackageInstanceId(long servicePackageInstanceId) {
        this.servicePackageInstanceId = servicePackageInstanceId;
        return this;
    }

    /**
     * Get the servicePackageActivationId property: Id of Service package activation.
     *
     * @return the servicePackageActivationId value.
     */
    public String getServicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId property: Id of Service package activation.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

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
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the sourceId property: Id of report source.
     *
     * @return the sourceId value.
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: Id of report source.
     *
     * @param sourceId the sourceId value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get the property property: Describes the property.
     *
     * @return the property value.
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * Set the property property: Describes the property.
     *
     * @param property the property value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * Get the healthState property: Describes the property health state.
     *
     * @return the healthState value.
     */
    public String getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: Describes the property health state.
     *
     * @param healthState the healthState value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setHealthState(String healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the timeToLiveMs property: Time to live in milli-seconds.
     *
     * @return the timeToLiveMs value.
     */
    public long getTimeToLiveMs() {
        return this.timeToLiveMs;
    }

    /**
     * Set the timeToLiveMs property: Time to live in milli-seconds.
     *
     * @param timeToLiveMs the timeToLiveMs value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setTimeToLiveMs(long timeToLiveMs) {
        this.timeToLiveMs = timeToLiveMs;
        return this;
    }

    /**
     * Get the sequenceNumber property: Sequence number of report.
     *
     * @return the sequenceNumber value.
     */
    public long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Set the sequenceNumber property: Sequence number of report.
     *
     * @param sequenceNumber the sequenceNumber value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Get the description property: Description of report.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of report.
     *
     * @param description the description value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the removeWhenExpired property: Indicates the removal when it expires.
     *
     * @return the removeWhenExpired value.
     */
    public boolean isRemoveWhenExpired() {
        return this.removeWhenExpired;
    }

    /**
     * Set the removeWhenExpired property: Indicates the removal when it expires.
     *
     * @param removeWhenExpired the removeWhenExpired value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setRemoveWhenExpired(boolean removeWhenExpired) {
        this.removeWhenExpired = removeWhenExpired;
        return this;
    }

    /**
     * Get the sourceUtcTimestamp property: Source time.
     *
     * @return the sourceUtcTimestamp value.
     */
    public OffsetDateTime getSourceUtcTimestamp() {
        return this.sourceUtcTimestamp;
    }

    /**
     * Set the sourceUtcTimestamp property: Source time.
     *
     * @param sourceUtcTimestamp the sourceUtcTimestamp value to set.
     * @return the DeployedServicePackageNewHealthReportEvent object itself.
     */
    public DeployedServicePackageNewHealthReportEvent setSourceUtcTimestamp(OffsetDateTime sourceUtcTimestamp) {
        this.sourceUtcTimestamp = sourceUtcTimestamp;
        return this;
    }
}
