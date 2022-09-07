package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes capacity information for services of this application. This description can be used for describing the
 * following. - Reserving the capacity for the services on the nodes - Limiting the total number of nodes that services
 * of this application can run on - Limiting the custom capacity metrics to limit the total consumption of this metric
 * by the services of this application.
 */
@Fluent
public final class ApplicationCapacityDescription {
    /*
     * The minimum number of nodes where Service Fabric will reserve capacity
     * for this application. Note that this does not mean that the services of
     * this application will be placed on all of those nodes. If this property
     * is set to zero, no capacity will be reserved. The value of this property
     * cannot be more than the value of the MaximumNodes property.
     */
    @JsonProperty(value = "MinimumNodes")
    private Long minimumNodes;

    /*
     * The maximum number of nodes where Service Fabric will reserve capacity
     * for this application. Note that this does not mean that the services of
     * this application will be placed on all of those nodes. By default, the
     * value of this property is zero and it means that the services can be
     * placed on any node.
     */
    @JsonProperty(value = "MaximumNodes")
    private Long maximumNodes;

    /*
     * List of application capacity metric description.
     */
    @JsonProperty(value = "ApplicationMetrics")
    private List<ApplicationMetricDescription> applicationMetrics;

    /**
     * Get the minimumNodes property: The minimum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more
     * than the value of the MaximumNodes property.
     *
     * @return the minimumNodes value.
     */
    public Long getMinimumNodes() {
        return this.minimumNodes;
    }

    /**
     * Set the minimumNodes property: The minimum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more
     * than the value of the MaximumNodes property.
     *
     * @param minimumNodes the minimumNodes value to set.
     * @return the ApplicationCapacityDescription object itself.
     */
    public ApplicationCapacityDescription setMinimumNodes(Long minimumNodes) {
        this.minimumNodes = minimumNodes;
        return this;
    }

    /**
     * Get the maximumNodes property: The maximum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     *
     * @return the maximumNodes value.
     */
    public Long getMaximumNodes() {
        return this.maximumNodes;
    }

    /**
     * Set the maximumNodes property: The maximum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     *
     * @param maximumNodes the maximumNodes value to set.
     * @return the ApplicationCapacityDescription object itself.
     */
    public ApplicationCapacityDescription setMaximumNodes(Long maximumNodes) {
        this.maximumNodes = maximumNodes;
        return this;
    }

    /**
     * Get the applicationMetrics property: List of application capacity metric description.
     *
     * @return the applicationMetrics value.
     */
    public List<ApplicationMetricDescription> getApplicationMetrics() {
        return this.applicationMetrics;
    }

    /**
     * Set the applicationMetrics property: List of application capacity metric description.
     *
     * @param applicationMetrics the applicationMetrics value to set.
     * @return the ApplicationCapacityDescription object itself.
     */
    public ApplicationCapacityDescription setApplicationMetrics(List<ApplicationMetricDescription> applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
        return this;
    }
}
