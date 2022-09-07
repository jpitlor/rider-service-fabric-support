package com.microsoft.fabric;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.microsoft.fabric.models.ApplicationResourceDescription;
import com.microsoft.fabric.models.ApplicationResourceUpgradeProgressInfo;
import com.microsoft.fabric.models.FabricErrorException;
import com.microsoft.fabric.models.HostOptions;
import com.microsoft.fabric.models.PagedApplicationResourceDescriptionList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshApplications. */
public final class MeshApplications {
    /** The proxy service used to perform REST calls. */
    private final MeshApplicationsService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshApplications.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshApplications(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(
                        MeshApplicationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshApplications to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshApplicationsService {
        @Put("/Resources/Applications/{applicationResourceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<ApplicationResourceDescription>> createOrUpdate(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @BodyParam("application/json") ApplicationResourceDescription applicationResourceDescription,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Applications/{applicationResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<ApplicationResourceDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @HeaderParam("Accept") String accept);

        @Delete("/Resources/Applications/{applicationResourceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Applications")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedApplicationResourceDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Applications/{applicationResourceName}/$/GetUpgradeProgress")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<ApplicationResourceUpgradeProgressInfo>> getUpgradeProgress(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Creates a Application resource with the specified name, description and properties. If Application resource with
     * the same name exists, then it is updated with the specified description and properties.
     *
     * @param applicationResourceName The identity of the application.
     * @param applicationResourceDescription Description for creating a Application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a application resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApplicationResourceDescription>> createOrUpdateWithResponseAsync(
            String applicationResourceName, ApplicationResourceDescription applicationResourceDescription) {
        final String accept = "application/json";
        return service.createOrUpdate(
                this.client.getHost(),
                this.client.getApiVersion(),
                applicationResourceName,
                applicationResourceDescription,
                accept);
    }

    /**
     * Creates a Application resource with the specified name, description and properties. If Application resource with
     * the same name exists, then it is updated with the specified description and properties.
     *
     * @param applicationResourceName The identity of the application.
     * @param applicationResourceDescription Description for creating a Application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a application resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApplicationResourceDescription> createOrUpdateAsync(
            String applicationResourceName, ApplicationResourceDescription applicationResourceDescription) {
        return createOrUpdateWithResponseAsync(applicationResourceName, applicationResourceDescription)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the information about the Application resource with the given name. The information include the description
     * and other properties of the Application.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Application resource with the given name along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApplicationResourceDescription>> getWithResponseAsync(String applicationResourceName) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), this.client.getApiVersion(), applicationResourceName, accept);
    }

    /**
     * Gets the information about the Application resource with the given name. The information include the description
     * and other properties of the Application.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Application resource with the given name on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApplicationResourceDescription> getAsync(String applicationResourceName) {
        return getWithResponseAsync(applicationResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the Application resource identified by the name.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String applicationResourceName) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), this.client.getApiVersion(), applicationResourceName, accept);
    }

    /**
     * Deletes the Application resource identified by the name.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String applicationResourceName) {
        return deleteWithResponseAsync(applicationResourceName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Gets the information about all application resources in a given resource group. The information include the
     * description and other properties of the Application.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all application resources in a given resource group along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedApplicationResourceDescriptionList>> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), this.client.getApiVersion(), accept);
    }

    /**
     * Gets the information about all application resources in a given resource group. The information include the
     * description and other properties of the Application.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all application resources in a given resource group on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedApplicationResourceDescriptionList> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the upgrade progress information about the Application resource with the given name. The information include
     * percentage of completion and other upgrade state information of the Application resource.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade progress information about the Application resource with the given name along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApplicationResourceUpgradeProgressInfo>> getUpgradeProgressWithResponseAsync(
            String applicationResourceName) {
        final String accept = "application/json";
        return service.getUpgradeProgress(
                this.client.getHost(), this.client.getApiVersion(), applicationResourceName, accept);
    }

    /**
     * Gets the upgrade progress information about the Application resource with the given name. The information include
     * percentage of completion and other upgrade state information of the Application resource.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade progress information about the Application resource with the given name on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApplicationResourceUpgradeProgressInfo> getUpgradeProgressAsync(String applicationResourceName) {
        return getUpgradeProgressWithResponseAsync(applicationResourceName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
