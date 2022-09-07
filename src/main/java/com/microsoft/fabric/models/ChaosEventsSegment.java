package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains the list of Chaos events and the continuation token to get the next segment. */
@Fluent
public final class ChaosEventsSegment {
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
     * List of Chaos events that meet the user-supplied criteria.
     */
    @JsonProperty(value = "History")
    private List<ChaosEventWrapper> history;

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
     * @return the ChaosEventsSegment object itself.
     */
    public ChaosEventsSegment setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the history property: List of Chaos events that meet the user-supplied criteria.
     *
     * @return the history value.
     */
    public List<ChaosEventWrapper> getHistory() {
        return this.history;
    }

    /**
     * Set the history property: List of Chaos events that meet the user-supplied criteria.
     *
     * @param history the history value to set.
     * @return the ChaosEventsSegment object itself.
     */
    public ChaosEventsSegment setHistory(List<ChaosEventWrapper> history) {
        this.history = history;
        return this;
    }
}
