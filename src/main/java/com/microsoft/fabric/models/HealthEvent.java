package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Represents health information reported on a health entity, such as cluster, application or node, with additional
 * metadata added by the Health Manager.
 */
@Fluent
public final class HealthEvent extends HealthInformation {
    /*
     * Returns true if the health event is expired, otherwise false.
     */
    @JsonProperty(value = "IsExpired")
    private Boolean isExpired;

    /*
     * The date and time when the health report was sent by the source.
     */
    @JsonProperty(value = "SourceUtcTimestamp")
    private OffsetDateTime sourceUtcTimestamp;

    /*
     * The date and time when the health report was last modified by the health
     * store.
     */
    @JsonProperty(value = "LastModifiedUtcTimestamp")
    private OffsetDateTime lastModifiedUtcTimestamp;

    /*
     * If the current health state is 'Ok', this property returns the time at
     * which the health report was first reported with 'Ok'.
     * For periodic reporting, many reports with the same state may have been
     * generated.
     * This property returns the date and time when the first 'Ok' health
     * report was received.
     *
     * If the current health state is 'Error' or 'Warning', returns the date
     * and time at which the health state was last in 'Ok', before
     * transitioning to a different state.
     *
     * If the health state was never 'Ok', the value will be zero date-time.
     */
    @JsonProperty(value = "LastOkTransitionAt")
    private OffsetDateTime lastOkTransitionAt;

    /*
     * If the current health state is 'Warning', this property returns the time
     * at which the health report was first reported with 'Warning'. For
     * periodic reporting, many reports with the same state may have been
     * generated however, this property returns only the date and time at the
     * first 'Warning' health report was received.
     *
     * If the current health state is 'Ok' or 'Error', returns the date and
     * time at which the health state was last in 'Warning', before
     * transitioning to a different state.
     *
     * If the health state was never 'Warning', the value will be zero
     * date-time.
     */
    @JsonProperty(value = "LastWarningTransitionAt")
    private OffsetDateTime lastWarningTransitionAt;

    /*
     * If the current health state is 'Error', this property returns the time
     * at which the health report was first reported with 'Error'. For periodic
     * reporting, many reports with the same state may have been generated
     * however, this property returns only the date and time at the first
     * 'Error' health report was received.
     *
     * If the current health state is 'Ok' or 'Warning', returns the date and
     * time at which the health state was last in 'Error', before transitioning
     * to a different state.
     *
     * If the health state was never 'Error', the value will be zero date-time.
     */
    @JsonProperty(value = "LastErrorTransitionAt")
    private OffsetDateTime lastErrorTransitionAt;

    /**
     * Get the isExpired property: Returns true if the health event is expired, otherwise false.
     *
     * @return the isExpired value.
     */
    public Boolean isExpired() {
        return this.isExpired;
    }

    /**
     * Set the isExpired property: Returns true if the health event is expired, otherwise false.
     *
     * @param isExpired the isExpired value to set.
     * @return the HealthEvent object itself.
     */
    public HealthEvent setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    /**
     * Get the sourceUtcTimestamp property: The date and time when the health report was sent by the source.
     *
     * @return the sourceUtcTimestamp value.
     */
    public OffsetDateTime getSourceUtcTimestamp() {
        return this.sourceUtcTimestamp;
    }

    /**
     * Set the sourceUtcTimestamp property: The date and time when the health report was sent by the source.
     *
     * @param sourceUtcTimestamp the sourceUtcTimestamp value to set.
     * @return the HealthEvent object itself.
     */
    public HealthEvent setSourceUtcTimestamp(OffsetDateTime sourceUtcTimestamp) {
        this.sourceUtcTimestamp = sourceUtcTimestamp;
        return this;
    }

    /**
     * Get the lastModifiedUtcTimestamp property: The date and time when the health report was last modified by the
     * health store.
     *
     * @return the lastModifiedUtcTimestamp value.
     */
    public OffsetDateTime getLastModifiedUtcTimestamp() {
        return this.lastModifiedUtcTimestamp;
    }

    /**
     * Set the lastModifiedUtcTimestamp property: The date and time when the health report was last modified by the
     * health store.
     *
     * @param lastModifiedUtcTimestamp the lastModifiedUtcTimestamp value to set.
     * @return the HealthEvent object itself.
     */
    public HealthEvent setLastModifiedUtcTimestamp(OffsetDateTime lastModifiedUtcTimestamp) {
        this.lastModifiedUtcTimestamp = lastModifiedUtcTimestamp;
        return this;
    }

    /**
     * Get the lastOkTransitionAt property: If the current health state is 'Ok', this property returns the time at which
     * the health report was first reported with 'Ok'. For periodic reporting, many reports with the same state may have
     * been generated. This property returns the date and time when the first 'Ok' health report was received.
     *
     * <p>If the current health state is 'Error' or 'Warning', returns the date and time at which the health state was
     * last in 'Ok', before transitioning to a different state.
     *
     * <p>If the health state was never 'Ok', the value will be zero date-time.
     *
     * @return the lastOkTransitionAt value.
     */
    public OffsetDateTime getLastOkTransitionAt() {
        return this.lastOkTransitionAt;
    }

    /**
     * Set the lastOkTransitionAt property: If the current health state is 'Ok', this property returns the time at which
     * the health report was first reported with 'Ok'. For periodic reporting, many reports with the same state may have
     * been generated. This property returns the date and time when the first 'Ok' health report was received.
     *
     * <p>If the current health state is 'Error' or 'Warning', returns the date and time at which the health state was
     * last in 'Ok', before transitioning to a different state.
     *
     * <p>If the health state was never 'Ok', the value will be zero date-time.
     *
     * @param lastOkTransitionAt the lastOkTransitionAt value to set.
     * @return the HealthEvent object itself.
     */
    public HealthEvent setLastOkTransitionAt(OffsetDateTime lastOkTransitionAt) {
        this.lastOkTransitionAt = lastOkTransitionAt;
        return this;
    }

    /**
     * Get the lastWarningTransitionAt property: If the current health state is 'Warning', this property returns the
     * time at which the health report was first reported with 'Warning'. For periodic reporting, many reports with the
     * same state may have been generated however, this property returns only the date and time at the first 'Warning'
     * health report was received.
     *
     * <p>If the current health state is 'Ok' or 'Error', returns the date and time at which the health state was last
     * in 'Warning', before transitioning to a different state.
     *
     * <p>If the health state was never 'Warning', the value will be zero date-time.
     *
     * @return the lastWarningTransitionAt value.
     */
    public OffsetDateTime getLastWarningTransitionAt() {
        return this.lastWarningTransitionAt;
    }

    /**
     * Set the lastWarningTransitionAt property: If the current health state is 'Warning', this property returns the
     * time at which the health report was first reported with 'Warning'. For periodic reporting, many reports with the
     * same state may have been generated however, this property returns only the date and time at the first 'Warning'
     * health report was received.
     *
     * <p>If the current health state is 'Ok' or 'Error', returns the date and time at which the health state was last
     * in 'Warning', before transitioning to a different state.
     *
     * <p>If the health state was never 'Warning', the value will be zero date-time.
     *
     * @param lastWarningTransitionAt the lastWarningTransitionAt value to set.
     * @return the HealthEvent object itself.
     */
    public HealthEvent setLastWarningTransitionAt(OffsetDateTime lastWarningTransitionAt) {
        this.lastWarningTransitionAt = lastWarningTransitionAt;
        return this;
    }

    /**
     * Get the lastErrorTransitionAt property: If the current health state is 'Error', this property returns the time at
     * which the health report was first reported with 'Error'. For periodic reporting, many reports with the same state
     * may have been generated however, this property returns only the date and time at the first 'Error' health report
     * was received.
     *
     * <p>If the current health state is 'Ok' or 'Warning', returns the date and time at which the health state was last
     * in 'Error', before transitioning to a different state.
     *
     * <p>If the health state was never 'Error', the value will be zero date-time.
     *
     * @return the lastErrorTransitionAt value.
     */
    public OffsetDateTime getLastErrorTransitionAt() {
        return this.lastErrorTransitionAt;
    }

    /**
     * Set the lastErrorTransitionAt property: If the current health state is 'Error', this property returns the time at
     * which the health report was first reported with 'Error'. For periodic reporting, many reports with the same state
     * may have been generated however, this property returns only the date and time at the first 'Error' health report
     * was received.
     *
     * <p>If the current health state is 'Ok' or 'Warning', returns the date and time at which the health state was last
     * in 'Error', before transitioning to a different state.
     *
     * <p>If the health state was never 'Error', the value will be zero date-time.
     *
     * @param lastErrorTransitionAt the lastErrorTransitionAt value to set.
     * @return the HealthEvent object itself.
     */
    public HealthEvent setLastErrorTransitionAt(OffsetDateTime lastErrorTransitionAt) {
        this.lastErrorTransitionAt = lastErrorTransitionAt;
        return this;
    }
}
