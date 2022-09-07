package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies a metric to load balance a service during runtime. */
@Fluent
public final class ServiceLoadMetricDescription {
    /*
     * The name of the metric. If the service chooses to report load during
     * runtime, the load metric name should match the name that is specified in
     * Name exactly. Note that metric names are case-sensitive.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The service load metric relative weight, compared to other metrics
     * configured for this service, as a number.
     */
    @JsonProperty(value = "Weight")
    private ServiceLoadMetricWeight weight;

    /*
     * Used only for Stateful services. The default amount of load, as a
     * number, that this service creates for this metric when it is a Primary
     * replica.
     */
    @JsonProperty(value = "PrimaryDefaultLoad")
    private Integer primaryDefaultLoad;

    /*
     * Used only for Stateful services. The default amount of load, as a
     * number, that this service creates for this metric when it is a Secondary
     * replica.
     */
    @JsonProperty(value = "SecondaryDefaultLoad")
    private Integer secondaryDefaultLoad;

    /*
     * Used only for Stateful services. The default amount of load, as a
     * number, that this service creates for this metric when it is an
     * Auxiliary replica.
     */
    @JsonProperty(value = "AuxiliaryDefaultLoad")
    private Integer auxiliaryDefaultLoad;

    /*
     * Used only for Stateless services. The default amount of load, as a
     * number, that this service creates for this metric.
     */
    @JsonProperty(value = "DefaultLoad")
    private Integer defaultLoad;

    /**
     * Get the name property: The name of the metric. If the service chooses to report load during runtime, the load
     * metric name should match the name that is specified in Name exactly. Note that metric names are case-sensitive.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric. If the service chooses to report load during runtime, the load
     * metric name should match the name that is specified in Name exactly. Note that metric names are case-sensitive.
     *
     * @param name the name value to set.
     * @return the ServiceLoadMetricDescription object itself.
     */
    public ServiceLoadMetricDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the weight property: The service load metric relative weight, compared to other metrics configured for this
     * service, as a number.
     *
     * @return the weight value.
     */
    public ServiceLoadMetricWeight getWeight() {
        return this.weight;
    }

    /**
     * Set the weight property: The service load metric relative weight, compared to other metrics configured for this
     * service, as a number.
     *
     * @param weight the weight value to set.
     * @return the ServiceLoadMetricDescription object itself.
     */
    public ServiceLoadMetricDescription setWeight(ServiceLoadMetricWeight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the primaryDefaultLoad property: Used only for Stateful services. The default amount of load, as a number,
     * that this service creates for this metric when it is a Primary replica.
     *
     * @return the primaryDefaultLoad value.
     */
    public Integer getPrimaryDefaultLoad() {
        return this.primaryDefaultLoad;
    }

    /**
     * Set the primaryDefaultLoad property: Used only for Stateful services. The default amount of load, as a number,
     * that this service creates for this metric when it is a Primary replica.
     *
     * @param primaryDefaultLoad the primaryDefaultLoad value to set.
     * @return the ServiceLoadMetricDescription object itself.
     */
    public ServiceLoadMetricDescription setPrimaryDefaultLoad(Integer primaryDefaultLoad) {
        this.primaryDefaultLoad = primaryDefaultLoad;
        return this;
    }

    /**
     * Get the secondaryDefaultLoad property: Used only for Stateful services. The default amount of load, as a number,
     * that this service creates for this metric when it is a Secondary replica.
     *
     * @return the secondaryDefaultLoad value.
     */
    public Integer getSecondaryDefaultLoad() {
        return this.secondaryDefaultLoad;
    }

    /**
     * Set the secondaryDefaultLoad property: Used only for Stateful services. The default amount of load, as a number,
     * that this service creates for this metric when it is a Secondary replica.
     *
     * @param secondaryDefaultLoad the secondaryDefaultLoad value to set.
     * @return the ServiceLoadMetricDescription object itself.
     */
    public ServiceLoadMetricDescription setSecondaryDefaultLoad(Integer secondaryDefaultLoad) {
        this.secondaryDefaultLoad = secondaryDefaultLoad;
        return this;
    }

    /**
     * Get the auxiliaryDefaultLoad property: Used only for Stateful services. The default amount of load, as a number,
     * that this service creates for this metric when it is an Auxiliary replica.
     *
     * @return the auxiliaryDefaultLoad value.
     */
    public Integer getAuxiliaryDefaultLoad() {
        return this.auxiliaryDefaultLoad;
    }

    /**
     * Set the auxiliaryDefaultLoad property: Used only for Stateful services. The default amount of load, as a number,
     * that this service creates for this metric when it is an Auxiliary replica.
     *
     * @param auxiliaryDefaultLoad the auxiliaryDefaultLoad value to set.
     * @return the ServiceLoadMetricDescription object itself.
     */
    public ServiceLoadMetricDescription setAuxiliaryDefaultLoad(Integer auxiliaryDefaultLoad) {
        this.auxiliaryDefaultLoad = auxiliaryDefaultLoad;
        return this;
    }

    /**
     * Get the defaultLoad property: Used only for Stateless services. The default amount of load, as a number, that
     * this service creates for this metric.
     *
     * @return the defaultLoad value.
     */
    public Integer getDefaultLoad() {
        return this.defaultLoad;
    }

    /**
     * Set the defaultLoad property: Used only for Stateless services. The default amount of load, as a number, that
     * this service creates for this metric.
     *
     * @param defaultLoad the defaultLoad value to set.
     * @return the ServiceLoadMetricDescription object itself.
     */
    public ServiceLoadMetricDescription setDefaultLoad(Integer defaultLoad) {
        this.defaultLoad = defaultLoad;
        return this;
    }
}
