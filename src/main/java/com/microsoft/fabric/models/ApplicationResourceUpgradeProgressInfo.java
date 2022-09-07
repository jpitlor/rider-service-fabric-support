package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This type describes an application resource upgrade. */
@Fluent
public final class ApplicationResourceUpgradeProgressInfo {
    /*
     * Name of the Application resource.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The target application version for the application upgrade.
     */
    @JsonProperty(value = "TargetApplicationTypeVersion")
    private String targetApplicationTypeVersion;

    /*
     * The estimated UTC datetime when the upgrade started.
     */
    @JsonProperty(value = "StartTimestampUtc")
    private String startTimestampUtc;

    /*
     * The state of the application resource upgrade.
     */
    @JsonProperty(value = "UpgradeState")
    private ApplicationResourceUpgradeState upgradeState;

    /*
     * The estimated percent of replicas are completed in the upgrade.
     */
    @JsonProperty(value = "PercentCompleted")
    private String percentCompleted;

    /*
     * List of service upgrade progresses.
     */
    @JsonProperty(value = "ServiceUpgradeProgress")
    private List<ServiceUpgradeProgress> serviceUpgradeProgress;

    /*
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored.
     */
    @JsonProperty(value = "RollingUpgradeMode")
    private RollingUpgradeMode rollingUpgradeMode;

    /*
     * The estimated amount of time that the overall upgrade elapsed. It is
     * first interpreted as a string representing an ISO 8601 duration. If that
     * fails, then it is interpreted as a number representing the total number
     * of milliseconds.
     */
    @JsonProperty(value = "UpgradeDuration")
    private String upgradeDuration;

    /*
     * Additional detailed information about the status of the pending upgrade.
     */
    @JsonProperty(value = "ApplicationUpgradeStatusDetails")
    private String applicationUpgradeStatusDetails;

    /*
     * The maximum amount of time to block processing of an upgrade domain and
     * prevent loss of availability when there are unexpected issues. When this
     * timeout expires, processing of the upgrade domain will proceed
     * regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925
     * inclusive. (unsigned 32-bit integer).
     */
    @JsonProperty(value = "UpgradeReplicaSetCheckTimeoutInSeconds")
    private Long upgradeReplicaSetCheckTimeoutInSeconds;

    /*
     * The estimated UTC datetime when the upgrade failed and FailureAction was
     * executed.
     */
    @JsonProperty(value = "FailureTimestampUtc")
    private String failureTimestampUtc;

    /**
     * Get the name property: Name of the Application resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Application resource.
     *
     * @param name the name value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the targetApplicationTypeVersion property: The target application version for the application upgrade.
     *
     * @return the targetApplicationTypeVersion value.
     */
    public String getTargetApplicationTypeVersion() {
        return this.targetApplicationTypeVersion;
    }

    /**
     * Set the targetApplicationTypeVersion property: The target application version for the application upgrade.
     *
     * @param targetApplicationTypeVersion the targetApplicationTypeVersion value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setTargetApplicationTypeVersion(String targetApplicationTypeVersion) {
        this.targetApplicationTypeVersion = targetApplicationTypeVersion;
        return this;
    }

    /**
     * Get the startTimestampUtc property: The estimated UTC datetime when the upgrade started.
     *
     * @return the startTimestampUtc value.
     */
    public String getStartTimestampUtc() {
        return this.startTimestampUtc;
    }

    /**
     * Set the startTimestampUtc property: The estimated UTC datetime when the upgrade started.
     *
     * @param startTimestampUtc the startTimestampUtc value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setStartTimestampUtc(String startTimestampUtc) {
        this.startTimestampUtc = startTimestampUtc;
        return this;
    }

    /**
     * Get the upgradeState property: The state of the application resource upgrade.
     *
     * @return the upgradeState value.
     */
    public ApplicationResourceUpgradeState getUpgradeState() {
        return this.upgradeState;
    }

    /**
     * Set the upgradeState property: The state of the application resource upgrade.
     *
     * @param upgradeState the upgradeState value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setUpgradeState(ApplicationResourceUpgradeState upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the percentCompleted property: The estimated percent of replicas are completed in the upgrade.
     *
     * @return the percentCompleted value.
     */
    public String getPercentCompleted() {
        return this.percentCompleted;
    }

    /**
     * Set the percentCompleted property: The estimated percent of replicas are completed in the upgrade.
     *
     * @param percentCompleted the percentCompleted value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setPercentCompleted(String percentCompleted) {
        this.percentCompleted = percentCompleted;
        return this;
    }

    /**
     * Get the serviceUpgradeProgress property: List of service upgrade progresses.
     *
     * @return the serviceUpgradeProgress value.
     */
    public List<ServiceUpgradeProgress> getServiceUpgradeProgress() {
        return this.serviceUpgradeProgress;
    }

    /**
     * Set the serviceUpgradeProgress property: List of service upgrade progresses.
     *
     * @param serviceUpgradeProgress the serviceUpgradeProgress value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setServiceUpgradeProgress(
            List<ServiceUpgradeProgress> serviceUpgradeProgress) {
        this.serviceUpgradeProgress = serviceUpgradeProgress;
        return this;
    }

    /**
     * Get the rollingUpgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored.
     *
     * @return the rollingUpgradeMode value.
     */
    public RollingUpgradeMode getRollingUpgradeMode() {
        return this.rollingUpgradeMode;
    }

    /**
     * Set the rollingUpgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored.
     *
     * @param rollingUpgradeMode the rollingUpgradeMode value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setRollingUpgradeMode(RollingUpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the upgradeDuration property: The estimated amount of time that the overall upgrade elapsed. It is first
     * interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number
     * representing the total number of milliseconds.
     *
     * @return the upgradeDuration value.
     */
    public String getUpgradeDuration() {
        return this.upgradeDuration;
    }

    /**
     * Set the upgradeDuration property: The estimated amount of time that the overall upgrade elapsed. It is first
     * interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number
     * representing the total number of milliseconds.
     *
     * @param upgradeDuration the upgradeDuration value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setUpgradeDuration(String upgradeDuration) {
        this.upgradeDuration = upgradeDuration;
        return this;
    }

    /**
     * Get the applicationUpgradeStatusDetails property: Additional detailed information about the status of the pending
     * upgrade.
     *
     * @return the applicationUpgradeStatusDetails value.
     */
    public String getApplicationUpgradeStatusDetails() {
        return this.applicationUpgradeStatusDetails;
    }

    /**
     * Set the applicationUpgradeStatusDetails property: Additional detailed information about the status of the pending
     * upgrade.
     *
     * @param applicationUpgradeStatusDetails the applicationUpgradeStatusDetails value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setApplicationUpgradeStatusDetails(
            String applicationUpgradeStatusDetails) {
        this.applicationUpgradeStatusDetails = applicationUpgradeStatusDetails;
        return this;
    }

    /**
     * Get the upgradeReplicaSetCheckTimeoutInSeconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @return the upgradeReplicaSetCheckTimeoutInSeconds value.
     */
    public Long getUpgradeReplicaSetCheckTimeoutInSeconds() {
        return this.upgradeReplicaSetCheckTimeoutInSeconds;
    }

    /**
     * Set the upgradeReplicaSetCheckTimeoutInSeconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @param upgradeReplicaSetCheckTimeoutInSeconds the upgradeReplicaSetCheckTimeoutInSeconds value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setUpgradeReplicaSetCheckTimeoutInSeconds(
            Long upgradeReplicaSetCheckTimeoutInSeconds) {
        this.upgradeReplicaSetCheckTimeoutInSeconds = upgradeReplicaSetCheckTimeoutInSeconds;
        return this;
    }

    /**
     * Get the failureTimestampUtc property: The estimated UTC datetime when the upgrade failed and FailureAction was
     * executed.
     *
     * @return the failureTimestampUtc value.
     */
    public String getFailureTimestampUtc() {
        return this.failureTimestampUtc;
    }

    /**
     * Set the failureTimestampUtc property: The estimated UTC datetime when the upgrade failed and FailureAction was
     * executed.
     *
     * @param failureTimestampUtc the failureTimestampUtc value to set.
     * @return the ApplicationResourceUpgradeProgressInfo object itself.
     */
    public ApplicationResourceUpgradeProgressInfo setFailureTimestampUtc(String failureTimestampUtc) {
        this.failureTimestampUtc = failureTimestampUtc;
        return this;
    }
}
