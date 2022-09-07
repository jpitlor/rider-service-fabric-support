package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the tags required for placement or running of the service. */
@Fluent
public final class NodeTagsDescription {
    /*
     * The number of tags.
     */
    @JsonProperty(value = "Count", required = true)
    private int count;

    /*
     * Array of size specified by the ‘Count’ parameter, for the placement tags
     * of the service.
     */
    @JsonProperty(value = "Tags", required = true)
    private List<String> tags;

    /**
     * Get the count property: The number of tags.
     *
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: The number of tags.
     *
     * @param count the count value to set.
     * @return the NodeTagsDescription object itself.
     */
    public NodeTagsDescription setCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the tags property: Array of size specified by the ‘Count’ parameter, for the placement tags of the service.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Array of size specified by the ‘Count’ parameter, for the placement tags of the service.
     *
     * @param tags the tags value to set.
     * @return the NodeTagsDescription object itself.
     */
    public NodeTagsDescription setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }
}
