package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents data structure that contains query information. */
@Fluent
public final class LoadedPartitionInformationQueryDescription {
    /*
     * Name of the metric for which this information is provided.
     */
    @JsonProperty(value = "MetricName")
    private String metricName;

    /*
     * Name of the service this partition belongs to.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * Ordering of partitions' load.
     */
    @JsonProperty(value = "Ordering")
    private Ordering ordering;

    /*
     * The maximum number of results to be returned as part of the paged
     * queries. This parameter defines the upper bound on the number of results
     * returned. The results returned can be less than the specified maximum
     * results if they do not fit in the message as per the max message size
     * restrictions defined in the configuration. If this parameter is zero or
     * not specified, the paged query includes as many results as possible that
     * fit in the return message.
     */
    @JsonProperty(value = "MaxResults")
    private Long maxResults;

    /*
     * The continuation token parameter is used to obtain next set of results.
     * The continuation token is included in the response of the API when the
     * results from the system do not fit in a single response. When this value
     * is passed to the next API call, the API returns next set of results. If
     * there are no further results, then the continuation token is not
     * included in the response.
     */
    @JsonProperty(value = "ContinuationToken")
    private String continuationToken;

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
     * @return the LoadedPartitionInformationQueryDescription object itself.
     */
    public LoadedPartitionInformationQueryDescription setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

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
     * @return the LoadedPartitionInformationQueryDescription object itself.
     */
    public LoadedPartitionInformationQueryDescription setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the ordering property: Ordering of partitions' load.
     *
     * @return the ordering value.
     */
    public Ordering getOrdering() {
        return this.ordering;
    }

    /**
     * Set the ordering property: Ordering of partitions' load.
     *
     * @param ordering the ordering value to set.
     * @return the LoadedPartitionInformationQueryDescription object itself.
     */
    public LoadedPartitionInformationQueryDescription setOrdering(Ordering ordering) {
        this.ordering = ordering;
        return this;
    }

    /**
     * Get the maxResults property: The maximum number of results to be returned as part of the paged queries. This
     * parameter defines the upper bound on the number of results returned. The results returned can be less than the
     * specified maximum results if they do not fit in the message as per the max message size restrictions defined in
     * the configuration. If this parameter is zero or not specified, the paged query includes as many results as
     * possible that fit in the return message.
     *
     * @return the maxResults value.
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: The maximum number of results to be returned as part of the paged queries. This
     * parameter defines the upper bound on the number of results returned. The results returned can be less than the
     * specified maximum results if they do not fit in the message as per the max message size restrictions defined in
     * the configuration. If this parameter is zero or not specified, the paged query includes as many results as
     * possible that fit in the return message.
     *
     * @param maxResults the maxResults value to set.
     * @return the LoadedPartitionInformationQueryDescription object itself.
     */
    public LoadedPartitionInformationQueryDescription setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the continuationToken property: The continuation token parameter is used to obtain next set of results. The
     * continuation token is included in the response of the API when the results from the system do not fit in a single
     * response. When this value is passed to the next API call, the API returns next set of results. If there are no
     * further results, then the continuation token is not included in the response.
     *
     * @return the continuationToken value.
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: The continuation token parameter is used to obtain next set of results. The
     * continuation token is included in the response of the API when the results from the system do not fit in a single
     * response. When this value is passed to the next API call, the API returns next set of results. If there are no
     * further results, then the continuation token is not included in the response.
     *
     * @param continuationToken the continuationToken value to set.
     * @return the LoadedPartitionInformationQueryDescription object itself.
     */
    public LoadedPartitionInformationQueryDescription setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
}
