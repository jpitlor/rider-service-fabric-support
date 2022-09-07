package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the parameters for updating an application instance. */
@Fluent
public final class ApplicationUpdateDescription {
    /*
     * Flags indicating whether other properties are set. Each of the
     * associated properties corresponds to a flag, specified below, which, if
     * set, indicate that the property is specified.
     * If flags are not specified for a certain property, the property will not
     * be updated even if the new value is provided.
     * This property can be a combination of those flags obtained using bitwise
     * 'OR' operator. Exception is RemoveApplicationCapacity which cannot be
     * specified along with other parameters.
     * For example, if the provided value is 3 then the flags for MinimumNodes
     * (1) and MaximumNodes (2) are set.
     *
     * - None - Does not indicate any other properties are set. The value is 0.
     * - MinimumNodes - Indicates whether the MinimumNodes property is set. The
     * value is 1.
     * - MaximumNodes - Indicates whether the MinimumNodes property is set. The
     * value is  2.
     * - ApplicationMetrics - Indicates whether the ApplicationMetrics property
     * is set. The value is 4.
     */
    @JsonProperty(value = "Flags")
    private String flags;

    /*
     * Used to clear all parameters related to Application Capacity for this
     * application. |
     * It is not possible to specify this parameter together with other
     * Application Capacity parameters.
     */
    @JsonProperty(value = "RemoveApplicationCapacity")
    private Boolean removeApplicationCapacity;

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
     * Get the flags property: Flags indicating whether other properties are set. Each of the associated properties
     * corresponds to a flag, specified below, which, if set, indicate that the property is specified. If flags are not
     * specified for a certain property, the property will not be updated even if the new value is provided. This
     * property can be a combination of those flags obtained using bitwise 'OR' operator. Exception is
     * RemoveApplicationCapacity which cannot be specified along with other parameters. For example, if the provided
     * value is 3 then the flags for MinimumNodes (1) and MaximumNodes (2) are set.
     *
     * <p>- None - Does not indicate any other properties are set. The value is 0. - MinimumNodes - Indicates whether
     * the MinimumNodes property is set. The value is 1. - MaximumNodes - Indicates whether the MinimumNodes property is
     * set. The value is 2. - ApplicationMetrics - Indicates whether the ApplicationMetrics property is set. The value
     * is 4.
     *
     * @return the flags value.
     */
    public String getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: Flags indicating whether other properties are set. Each of the associated properties
     * corresponds to a flag, specified below, which, if set, indicate that the property is specified. If flags are not
     * specified for a certain property, the property will not be updated even if the new value is provided. This
     * property can be a combination of those flags obtained using bitwise 'OR' operator. Exception is
     * RemoveApplicationCapacity which cannot be specified along with other parameters. For example, if the provided
     * value is 3 then the flags for MinimumNodes (1) and MaximumNodes (2) are set.
     *
     * <p>- None - Does not indicate any other properties are set. The value is 0. - MinimumNodes - Indicates whether
     * the MinimumNodes property is set. The value is 1. - MaximumNodes - Indicates whether the MinimumNodes property is
     * set. The value is 2. - ApplicationMetrics - Indicates whether the ApplicationMetrics property is set. The value
     * is 4.
     *
     * @param flags the flags value to set.
     * @return the ApplicationUpdateDescription object itself.
     */
    public ApplicationUpdateDescription setFlags(String flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the removeApplicationCapacity property: Used to clear all parameters related to Application Capacity for this
     * application. | It is not possible to specify this parameter together with other Application Capacity parameters.
     *
     * @return the removeApplicationCapacity value.
     */
    public Boolean isRemoveApplicationCapacity() {
        return this.removeApplicationCapacity;
    }

    /**
     * Set the removeApplicationCapacity property: Used to clear all parameters related to Application Capacity for this
     * application. | It is not possible to specify this parameter together with other Application Capacity parameters.
     *
     * @param removeApplicationCapacity the removeApplicationCapacity value to set.
     * @return the ApplicationUpdateDescription object itself.
     */
    public ApplicationUpdateDescription setRemoveApplicationCapacity(Boolean removeApplicationCapacity) {
        this.removeApplicationCapacity = removeApplicationCapacity;
        return this;
    }

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
     * @return the ApplicationUpdateDescription object itself.
     */
    public ApplicationUpdateDescription setMinimumNodes(Long minimumNodes) {
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
     * @return the ApplicationUpdateDescription object itself.
     */
    public ApplicationUpdateDescription setMaximumNodes(Long maximumNodes) {
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
     * @return the ApplicationUpdateDescription object itself.
     */
    public ApplicationUpdateDescription setApplicationMetrics(List<ApplicationMetricDescription> applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
        return this;
    }
}
