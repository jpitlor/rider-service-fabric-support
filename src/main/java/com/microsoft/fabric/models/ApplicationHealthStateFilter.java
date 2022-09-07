package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines matching criteria to determine whether a application should be included in the cluster health chunk. One
 * filter can match zero, one or multiple applications, depending on its properties.
 */
@Fluent
public final class ApplicationHealthStateFilter {
    /*
     * The name of the application that matches the filter, as a fabric uri.
     * The filter is applied only to the specified application, if it exists.
     * If the application doesn't exist, no application is returned in the
     * cluster health chunk based on this filter.
     * If the application exists, it is included in the cluster health chunk if
     * it respects the other filter properties.
     * If not specified, all applications are matched against the other filter
     * members, like health state filter.
     */
    @JsonProperty(value = "ApplicationNameFilter")
    private String applicationNameFilter;

    /*
     * The name of the application type that matches the filter.
     * If specified, the filter is applied only to applications of the selected
     * application type, if any exists.
     * If no applications of the specified application type exists, no
     * application is returned in the cluster health chunk based on this
     * filter.
     * Each application of the specified application type is included in the
     * cluster health chunk if it respects the other filter properties.
     * If not specified, all applications are matched against the other filter
     * members, like health state filter.
     */
    @JsonProperty(value = "ApplicationTypeNameFilter")
    private String applicationTypeNameFilter;

    /*
     * The filter for the health state of the applications. It allows selecting
     * applications if they match the desired health states.
     * The possible values are integer value of one of the following health
     * states. Only applications that match the filter are returned. All
     * applications are used to evaluate the cluster aggregated health state.
     * If not specified, default value is None, unless the application name or
     * the application type name are specified. If the filter has default value
     * and application name is specified, the matching application is returned.
     * The state values are flag-based enumeration, so the value could be a
     * combination of these values obtained using bitwise 'OR' operator.
     * For example, if the provided value is 6, it matches applications with
     * HealthState value of OK (2) and Warning (4).
     *
     * - Default - Default value. Matches any HealthState. The value is zero.
     * - None - Filter that doesn't match any HealthState value. Used in order
     * to return no results on a given collection of states. The value is 1.
     * - Ok - Filter that matches input with HealthState value Ok. The value is
     * 2.
     * - Warning - Filter that matches input with HealthState value Warning.
     * The value is 4.
     * - Error - Filter that matches input with HealthState value Error. The
     * value is 8.
     * - All - Filter that matches input with any HealthState value. The value
     * is 65535.
     */
    @JsonProperty(value = "HealthStateFilter")
    private Integer healthStateFilter;

    /*
     * Defines a list of filters that specify which services to be included in
     * the returned cluster health chunk as children of the application. The
     * services are returned only if the parent application matches a filter.
     * If the list is empty, no services are returned. All the services are
     * used to evaluate the parent application aggregated health state,
     * regardless of the input filters.
     * The application filter may specify multiple service filters.
     * For example, it can specify a filter to return all services with health
     * state Error and another filter to always include a service identified by
     * its service name.
     */
    @JsonProperty(value = "ServiceFilters")
    private List<ServiceHealthStateFilter> serviceFilters;

    /*
     * Defines a list of filters that specify which deployed applications to be
     * included in the returned cluster health chunk as children of the
     * application. The deployed applications are returned only if the parent
     * application matches a filter.
     * If the list is empty, no deployed applications are returned. All the
     * deployed applications are used to evaluate the parent application
     * aggregated health state, regardless of the input filters.
     * The application filter may specify multiple deployed application
     * filters.
     * For example, it can specify a filter to return all deployed applications
     * with health state Error and another filter to always include a deployed
     * application on a specified node.
     */
    @JsonProperty(value = "DeployedApplicationFilters")
    private List<DeployedApplicationHealthStateFilter> deployedApplicationFilters;

    /**
     * Get the applicationNameFilter property: The name of the application that matches the filter, as a fabric uri. The
     * filter is applied only to the specified application, if it exists. If the application doesn't exist, no
     * application is returned in the cluster health chunk based on this filter. If the application exists, it is
     * included in the cluster health chunk if it respects the other filter properties. If not specified, all
     * applications are matched against the other filter members, like health state filter.
     *
     * @return the applicationNameFilter value.
     */
    public String getApplicationNameFilter() {
        return this.applicationNameFilter;
    }

    /**
     * Set the applicationNameFilter property: The name of the application that matches the filter, as a fabric uri. The
     * filter is applied only to the specified application, if it exists. If the application doesn't exist, no
     * application is returned in the cluster health chunk based on this filter. If the application exists, it is
     * included in the cluster health chunk if it respects the other filter properties. If not specified, all
     * applications are matched against the other filter members, like health state filter.
     *
     * @param applicationNameFilter the applicationNameFilter value to set.
     * @return the ApplicationHealthStateFilter object itself.
     */
    public ApplicationHealthStateFilter setApplicationNameFilter(String applicationNameFilter) {
        this.applicationNameFilter = applicationNameFilter;
        return this;
    }

    /**
     * Get the applicationTypeNameFilter property: The name of the application type that matches the filter. If
     * specified, the filter is applied only to applications of the selected application type, if any exists. If no
     * applications of the specified application type exists, no application is returned in the cluster health chunk
     * based on this filter. Each application of the specified application type is included in the cluster health chunk
     * if it respects the other filter properties. If not specified, all applications are matched against the other
     * filter members, like health state filter.
     *
     * @return the applicationTypeNameFilter value.
     */
    public String getApplicationTypeNameFilter() {
        return this.applicationTypeNameFilter;
    }

    /**
     * Set the applicationTypeNameFilter property: The name of the application type that matches the filter. If
     * specified, the filter is applied only to applications of the selected application type, if any exists. If no
     * applications of the specified application type exists, no application is returned in the cluster health chunk
     * based on this filter. Each application of the specified application type is included in the cluster health chunk
     * if it respects the other filter properties. If not specified, all applications are matched against the other
     * filter members, like health state filter.
     *
     * @param applicationTypeNameFilter the applicationTypeNameFilter value to set.
     * @return the ApplicationHealthStateFilter object itself.
     */
    public ApplicationHealthStateFilter setApplicationTypeNameFilter(String applicationTypeNameFilter) {
        this.applicationTypeNameFilter = applicationTypeNameFilter;
        return this;
    }

    /**
     * Get the healthStateFilter property: The filter for the health state of the applications. It allows selecting
     * applications if they match the desired health states. The possible values are integer value of one of the
     * following health states. Only applications that match the filter are returned. All applications are used to
     * evaluate the cluster aggregated health state. If not specified, default value is None, unless the application
     * name or the application type name are specified. If the filter has default value and application name is
     * specified, the matching application is returned. The state values are flag-based enumeration, so the value could
     * be a combination of these values obtained using bitwise 'OR' operator. For example, if the provided value is 6,
     * it matches applications with HealthState value of OK (2) and Warning (4).
     *
     * <p>- Default - Default value. Matches any HealthState. The value is zero. - None - Filter that doesn't match any
     * HealthState value. Used in order to return no results on a given collection of states. The value is 1. - Ok -
     * Filter that matches input with HealthState value Ok. The value is 2. - Warning - Filter that matches input with
     * HealthState value Warning. The value is 4. - Error - Filter that matches input with HealthState value Error. The
     * value is 8. - All - Filter that matches input with any HealthState value. The value is 65535.
     *
     * @return the healthStateFilter value.
     */
    public Integer getHealthStateFilter() {
        return this.healthStateFilter;
    }

    /**
     * Set the healthStateFilter property: The filter for the health state of the applications. It allows selecting
     * applications if they match the desired health states. The possible values are integer value of one of the
     * following health states. Only applications that match the filter are returned. All applications are used to
     * evaluate the cluster aggregated health state. If not specified, default value is None, unless the application
     * name or the application type name are specified. If the filter has default value and application name is
     * specified, the matching application is returned. The state values are flag-based enumeration, so the value could
     * be a combination of these values obtained using bitwise 'OR' operator. For example, if the provided value is 6,
     * it matches applications with HealthState value of OK (2) and Warning (4).
     *
     * <p>- Default - Default value. Matches any HealthState. The value is zero. - None - Filter that doesn't match any
     * HealthState value. Used in order to return no results on a given collection of states. The value is 1. - Ok -
     * Filter that matches input with HealthState value Ok. The value is 2. - Warning - Filter that matches input with
     * HealthState value Warning. The value is 4. - Error - Filter that matches input with HealthState value Error. The
     * value is 8. - All - Filter that matches input with any HealthState value. The value is 65535.
     *
     * @param healthStateFilter the healthStateFilter value to set.
     * @return the ApplicationHealthStateFilter object itself.
     */
    public ApplicationHealthStateFilter setHealthStateFilter(Integer healthStateFilter) {
        this.healthStateFilter = healthStateFilter;
        return this;
    }

    /**
     * Get the serviceFilters property: Defines a list of filters that specify which services to be included in the
     * returned cluster health chunk as children of the application. The services are returned only if the parent
     * application matches a filter. If the list is empty, no services are returned. All the services are used to
     * evaluate the parent application aggregated health state, regardless of the input filters. The application filter
     * may specify multiple service filters. For example, it can specify a filter to return all services with health
     * state Error and another filter to always include a service identified by its service name.
     *
     * @return the serviceFilters value.
     */
    public List<ServiceHealthStateFilter> getServiceFilters() {
        return this.serviceFilters;
    }

    /**
     * Set the serviceFilters property: Defines a list of filters that specify which services to be included in the
     * returned cluster health chunk as children of the application. The services are returned only if the parent
     * application matches a filter. If the list is empty, no services are returned. All the services are used to
     * evaluate the parent application aggregated health state, regardless of the input filters. The application filter
     * may specify multiple service filters. For example, it can specify a filter to return all services with health
     * state Error and another filter to always include a service identified by its service name.
     *
     * @param serviceFilters the serviceFilters value to set.
     * @return the ApplicationHealthStateFilter object itself.
     */
    public ApplicationHealthStateFilter setServiceFilters(List<ServiceHealthStateFilter> serviceFilters) {
        this.serviceFilters = serviceFilters;
        return this;
    }

    /**
     * Get the deployedApplicationFilters property: Defines a list of filters that specify which deployed applications
     * to be included in the returned cluster health chunk as children of the application. The deployed applications are
     * returned only if the parent application matches a filter. If the list is empty, no deployed applications are
     * returned. All the deployed applications are used to evaluate the parent application aggregated health state,
     * regardless of the input filters. The application filter may specify multiple deployed application filters. For
     * example, it can specify a filter to return all deployed applications with health state Error and another filter
     * to always include a deployed application on a specified node.
     *
     * @return the deployedApplicationFilters value.
     */
    public List<DeployedApplicationHealthStateFilter> getDeployedApplicationFilters() {
        return this.deployedApplicationFilters;
    }

    /**
     * Set the deployedApplicationFilters property: Defines a list of filters that specify which deployed applications
     * to be included in the returned cluster health chunk as children of the application. The deployed applications are
     * returned only if the parent application matches a filter. If the list is empty, no deployed applications are
     * returned. All the deployed applications are used to evaluate the parent application aggregated health state,
     * regardless of the input filters. The application filter may specify multiple deployed application filters. For
     * example, it can specify a filter to return all deployed applications with health state Error and another filter
     * to always include a deployed application on a specified node.
     *
     * @param deployedApplicationFilters the deployedApplicationFilters value to set.
     * @return the ApplicationHealthStateFilter object itself.
     */
    public ApplicationHealthStateFilter setDeployedApplicationFilters(
            List<DeployedApplicationHealthStateFilter> deployedApplicationFilters) {
        this.deployedApplicationFilters = deployedApplicationFilters;
        return this;
    }
}
