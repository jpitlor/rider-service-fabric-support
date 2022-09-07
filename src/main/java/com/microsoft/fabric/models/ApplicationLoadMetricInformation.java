package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes load information for a custom resource balancing metric. This can be used to limit the total consumption of
 * this metric by the services of this application.
 */
@Fluent
public final class ApplicationLoadMetricInformation {
    /*
     * The name of the metric.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * This is the capacity reserved in the cluster for the application.
     * It's the product of NodeReservationCapacity and MinimumNodes.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity
     * this value must be smaller than or equal to MaximumCapacity for each
     * metric.
     */
    @JsonProperty(value = "ReservationCapacity")
    private Long reservationCapacity;

    /*
     * Total capacity for this metric in this application instance.
     */
    @JsonProperty(value = "ApplicationCapacity")
    private Long applicationCapacity;

    /*
     * Current load for this metric in this application instance.
     */
    @JsonProperty(value = "ApplicationLoad")
    private Long applicationLoad;

    /**
     * Get the name property: The name of the metric.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     *
     * @param name the name value to set.
     * @return the ApplicationLoadMetricInformation object itself.
     */
    public ApplicationLoadMetricInformation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the reservationCapacity property: This is the capacity reserved in the cluster for the application. It's the
     * product of NodeReservationCapacity and MinimumNodes. If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity this value must be smaller than or equal
     * to MaximumCapacity for each metric.
     *
     * @return the reservationCapacity value.
     */
    public Long getReservationCapacity() {
        return this.reservationCapacity;
    }

    /**
     * Set the reservationCapacity property: This is the capacity reserved in the cluster for the application. It's the
     * product of NodeReservationCapacity and MinimumNodes. If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity this value must be smaller than or equal
     * to MaximumCapacity for each metric.
     *
     * @param reservationCapacity the reservationCapacity value to set.
     * @return the ApplicationLoadMetricInformation object itself.
     */
    public ApplicationLoadMetricInformation setReservationCapacity(Long reservationCapacity) {
        this.reservationCapacity = reservationCapacity;
        return this;
    }

    /**
     * Get the applicationCapacity property: Total capacity for this metric in this application instance.
     *
     * @return the applicationCapacity value.
     */
    public Long getApplicationCapacity() {
        return this.applicationCapacity;
    }

    /**
     * Set the applicationCapacity property: Total capacity for this metric in this application instance.
     *
     * @param applicationCapacity the applicationCapacity value to set.
     * @return the ApplicationLoadMetricInformation object itself.
     */
    public ApplicationLoadMetricInformation setApplicationCapacity(Long applicationCapacity) {
        this.applicationCapacity = applicationCapacity;
        return this;
    }

    /**
     * Get the applicationLoad property: Current load for this metric in this application instance.
     *
     * @return the applicationLoad value.
     */
    public Long getApplicationLoad() {
        return this.applicationLoad;
    }

    /**
     * Set the applicationLoad property: Current load for this metric in this application instance.
     *
     * @param applicationLoad the applicationLoad value to set.
     * @return the ApplicationLoadMetricInformation object itself.
     */
    public ApplicationLoadMetricInformation setApplicationLoad(Long applicationLoad) {
        this.applicationLoad = applicationLoad;
        return this;
    }
}
