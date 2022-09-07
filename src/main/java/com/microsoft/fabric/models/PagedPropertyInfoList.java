package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The paged list of Service Fabric properties under a given name. The list is paged when all of the results cannot fit
 * in a single message. The next set of results can be obtained by executing the same query with the continuation token
 * provided in this list.
 */
@Fluent
public final class PagedPropertyInfoList {
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
     * Indicates whether any property under the given name has been modified
     * during the enumeration. If there was a modification, this property value
     * is false.
     */
    @JsonProperty(value = "IsConsistent")
    private Boolean isConsistent;

    /*
     * List of property information.
     */
    @JsonProperty(value = "Properties")
    private List<PropertyInfo> properties;

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
     * @return the PagedPropertyInfoList object itself.
     */
    public PagedPropertyInfoList setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the isConsistent property: Indicates whether any property under the given name has been modified during the
     * enumeration. If there was a modification, this property value is false.
     *
     * @return the isConsistent value.
     */
    public Boolean isConsistent() {
        return this.isConsistent;
    }

    /**
     * Set the isConsistent property: Indicates whether any property under the given name has been modified during the
     * enumeration. If there was a modification, this property value is false.
     *
     * @param isConsistent the isConsistent value to set.
     * @return the PagedPropertyInfoList object itself.
     */
    public PagedPropertyInfoList setIsConsistent(Boolean isConsistent) {
        this.isConsistent = isConsistent;
        return this;
    }

    /**
     * Get the properties property: List of property information.
     *
     * @return the properties value.
     */
    public List<PropertyInfo> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: List of property information.
     *
     * @param properties the properties value to set.
     * @return the PagedPropertyInfoList object itself.
     */
    public PagedPropertyInfoList setProperties(List<PropertyInfo> properties) {
        this.properties = properties;
        return this;
    }
}
