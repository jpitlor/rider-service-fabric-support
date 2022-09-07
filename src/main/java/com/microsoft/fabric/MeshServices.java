package com.microsoft.fabric;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.microsoft.fabric.models.FabricErrorException;
import com.microsoft.fabric.models.HostOptions;
import com.microsoft.fabric.models.PagedServiceResourceDescriptionList;
import com.microsoft.fabric.models.ServiceResourceDescription;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshServices. */
public final class MeshServices {
    /** The proxy service used to perform REST calls. */
    private final MeshServicesService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshServices.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshServices(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(MeshServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshServices to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshServicesService {
        @Get("/Resources/Applications/{applicationResourceName}/Services/{serviceResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<ServiceResourceDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @PathParam(value = "serviceResourceName", encoded = true) String serviceResourceName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Applications/{applicationResourceName}/Services")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedServiceResourceDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Gets the information about the Service resource with the given name. The information include the description and
     * other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Service resource with the given name along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ServiceResourceDescription>> getWithResponseAsync(
            String applicationResourceName, String serviceResourceName) {
        final String accept = "application/json";
        return service.get(
                this.client.getHost(),
                this.client.getApiVersion(),
                applicationResourceName,
                serviceResourceName,
                accept);
    }

    /**
     * Gets the information about the Service resource with the given name. The information include the description and
     * other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Service resource with the given name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceResourceDescription> getAsync(String applicationResourceName, String serviceResourceName) {
        return getWithResponseAsync(applicationResourceName, serviceResourceName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the information about all services of an application resource. The information include the description and
     * other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all services of an application resource along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedServiceResourceDescriptionList>> listWithResponseAsync(String applicationResourceName) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), this.client.getApiVersion(), applicationResourceName, accept);
    }

    /**
     * Gets the information about all services of an application resource. The information include the description and
     * other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all services of an application resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedServiceResourceDescriptionList> listAsync(String applicationResourceName) {
        return listWithResponseAsync(applicationResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
