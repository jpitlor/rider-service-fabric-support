package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines the application health policy map used to evaluate the health of an application or one of its children
 * entities.
 */
@Fluent
public final class ApplicationHealthPolicies {
    /*
     * The wrapper that contains the map with application health policies used
     * to evaluate specific applications in the cluster.
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap;

    /**
     * Get the applicationHealthPolicyMap property: The wrapper that contains the map with application health policies
     * used to evaluate specific applications in the cluster.
     *
     * @return the applicationHealthPolicyMap value.
     */
    public List<ApplicationHealthPolicyMapItem> getApplicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set the applicationHealthPolicyMap property: The wrapper that contains the map with application health policies
     * used to evaluate specific applications in the cluster.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set.
     * @return the ApplicationHealthPolicies object itself.
     */
    public ApplicationHealthPolicies setApplicationHealthPolicyMap(
            List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
        return this;
    }
}
