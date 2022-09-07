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
import com.microsoft.fabric.models.PagedServiceReplicaDescriptionList;
import com.microsoft.fabric.models.ServiceReplicaDescription;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshServiceReplicas. */
public final class MeshServiceReplicas {
    /** The proxy service used to perform REST calls. */
    private final MeshServiceReplicasService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshServiceReplicas.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshServiceReplicas(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(
                        MeshServiceReplicasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshServiceReplicas to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshServiceReplicasService {
        @Get("/Resources/Applications/{applicationResourceName}/Services/{serviceResourceName}/Replicas/{replicaName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<ServiceReplicaDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @PathParam(value = "serviceResourceName", encoded = true) String serviceResourceName,
                @PathParam(value = "replicaName", encoded = true) String replicaName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Applications/{applicationResourceName}/Services/{serviceResourceName}/Replicas")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedServiceReplicaDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @PathParam(value = "serviceResourceName", encoded = true) String serviceResourceName,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Gets the information about the service replica with the given name. The information include the description and
     * other properties of the service replica.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @param replicaName Service Fabric replica name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the service replica with the given name along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ServiceReplicaDescription>> getWithResponseAsync(
            String applicationResourceName, String serviceResourceName, String replicaName) {
        final String accept = "application/json";
        return service.get(
                this.client.getHost(),
                this.client.getApiVersion(),
                applicationResourceName,
                serviceResourceName,
                replicaName,
                accept);
    }

    /**
     * Gets the information about the service replica with the given name. The information include the description and
     * other properties of the service replica.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @param replicaName Service Fabric replica name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the service replica with the given name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceReplicaDescription> getAsync(
            String applicationResourceName, String serviceResourceName, String replicaName) {
        return getWithResponseAsync(applicationResourceName, serviceResourceName, replicaName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the information about all replicas of a service. The information include the description and other
     * properties of the service replica.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all replicas of a service along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedServiceReplicaDescriptionList>> listWithResponseAsync(
            String applicationResourceName, String serviceResourceName) {
        final String accept = "application/json";
        return service.list(
                this.client.getHost(),
                this.client.getApiVersion(),
                applicationResourceName,
                serviceResourceName,
                accept);
    }

    /**
     * Gets the information about all replicas of a service. The information include the description and other
     * properties of the service replica.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all replicas of a service on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedServiceReplicaDescriptionList> listAsync(
            String applicationResourceName, String serviceResourceName) {
        return listWithResponseAsync(applicationResourceName, serviceResourceName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
