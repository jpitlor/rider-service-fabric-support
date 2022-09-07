package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Diagnostics settings for Geneva. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AzureInternalMonitoringPipeline")
@Fluent
public final class AzureInternalMonitoringPipelineSinkDescription extends DiagnosticsSinkProperties {
    /*
     * Azure Internal monitoring pipeline account.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * Azure Internal monitoring pipeline account namespace.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * Azure Internal monitoring agent configuration.
     */
    @JsonProperty(value = "maConfigUrl")
    private String maConfigUrl;

    /*
     * Azure Internal monitoring agent fluentd configuration.
     */
    @JsonProperty(value = "fluentdConfigUrl")
    private String fluentdConfigUrl;

    /*
     * Azure Internal monitoring pipeline autokey associated with the
     * certificate.
     */
    @JsonProperty(value = "autoKeyConfigUrl")
    private String autoKeyConfigUrl;

    /**
     * Get the accountName property: Azure Internal monitoring pipeline account.
     *
     * @return the accountName value.
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Azure Internal monitoring pipeline account.
     *
     * @param accountName the accountName value to set.
     * @return the AzureInternalMonitoringPipelineSinkDescription object itself.
     */
    public AzureInternalMonitoringPipelineSinkDescription setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the namespace property: Azure Internal monitoring pipeline account namespace.
     *
     * @return the namespace value.
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: Azure Internal monitoring pipeline account namespace.
     *
     * @param namespace the namespace value to set.
     * @return the AzureInternalMonitoringPipelineSinkDescription object itself.
     */
    public AzureInternalMonitoringPipelineSinkDescription setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the maConfigUrl property: Azure Internal monitoring agent configuration.
     *
     * @return the maConfigUrl value.
     */
    public String getMaConfigUrl() {
        return this.maConfigUrl;
    }

    /**
     * Set the maConfigUrl property: Azure Internal monitoring agent configuration.
     *
     * @param maConfigUrl the maConfigUrl value to set.
     * @return the AzureInternalMonitoringPipelineSinkDescription object itself.
     */
    public AzureInternalMonitoringPipelineSinkDescription setMaConfigUrl(String maConfigUrl) {
        this.maConfigUrl = maConfigUrl;
        return this;
    }

    /**
     * Get the fluentdConfigUrl property: Azure Internal monitoring agent fluentd configuration.
     *
     * @return the fluentdConfigUrl value.
     */
    public String getFluentdConfigUrl() {
        return this.fluentdConfigUrl;
    }

    /**
     * Set the fluentdConfigUrl property: Azure Internal monitoring agent fluentd configuration.
     *
     * @param fluentdConfigUrl the fluentdConfigUrl value to set.
     * @return the AzureInternalMonitoringPipelineSinkDescription object itself.
     */
    public AzureInternalMonitoringPipelineSinkDescription setFluentdConfigUrl(String fluentdConfigUrl) {
        this.fluentdConfigUrl = fluentdConfigUrl;
        return this;
    }

    /**
     * Get the autoKeyConfigUrl property: Azure Internal monitoring pipeline autokey associated with the certificate.
     *
     * @return the autoKeyConfigUrl value.
     */
    public String getAutoKeyConfigUrl() {
        return this.autoKeyConfigUrl;
    }

    /**
     * Set the autoKeyConfigUrl property: Azure Internal monitoring pipeline autokey associated with the certificate.
     *
     * @param autoKeyConfigUrl the autoKeyConfigUrl value to set.
     * @return the AzureInternalMonitoringPipelineSinkDescription object itself.
     */
    public AzureInternalMonitoringPipelineSinkDescription setAutoKeyConfigUrl(String autoKeyConfigUrl) {
        this.autoKeyConfigUrl = autoKeyConfigUrl;
        return this;
    }
}
