package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents data structure that contains top/least loaded partitions for a certain metric. */
@Fluent
public final class LoadedPartitionInformationResultList {
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

    /*
     * List of application information.
     */
    @JsonProperty(value = "Items")
    private List<LoadedPartitionInformationResult> items;

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
     * @return the LoadedPartitionInformationResultList object itself.
     */
    public LoadedPartitionInformationResultList setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the items property: List of application information.
     *
     * @return the items value.
     */
    public List<LoadedPartitionInformationResult> getItems() {
        return this.items;
    }

    /**
     * Set the items property: List of application information.
     *
     * @param items the items value to set.
     * @return the LoadedPartitionInformationResultList object itself.
     */
    public LoadedPartitionInformationResultList setItems(List<LoadedPartitionInformationResult> items) {
        this.items = items;
        return this;
    }
}
