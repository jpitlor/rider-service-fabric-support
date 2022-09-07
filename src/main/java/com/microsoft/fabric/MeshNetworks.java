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
import com.microsoft.fabric.models.FabricErrorException;
import com.microsoft.fabric.models.HostOptions;
import com.microsoft.fabric.models.NetworkResourceDescription;
import com.microsoft.fabric.models.PagedNetworkResourceDescriptionList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshNetworks. */
public final class MeshNetworks {
    /** The proxy service used to perform REST calls. */
    private final MeshNetworksService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshNetworks.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshNetworks(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(MeshNetworksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshNetworks to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshNetworksService {
        @Put("/Resources/Networks/{networkResourceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<NetworkResourceDescription>> createOrUpdate(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "networkResourceName", encoded = true) String networkResourceName,
                @BodyParam("application/json") NetworkResourceDescription networkResourceDescription,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Networks/{networkResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<NetworkResourceDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "networkResourceName", encoded = true) String networkResourceName,
                @HeaderParam("Accept") String accept);

        @Delete("/Resources/Networks/{networkResourceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "networkResourceName", encoded = true) String networkResourceName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Networks")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedNetworkResourceDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Creates a Network resource with the specified name, description and properties. If Network resource with the same
     * name exists, then it is updated with the specified description and properties. Network resource provides
     * connectivity between application services.
     *
     * @param networkResourceName The identity of the network.
     * @param networkResourceDescription Description for creating a Network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a network resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkResourceDescription>> createOrUpdateWithResponseAsync(
            String networkResourceName, NetworkResourceDescription networkResourceDescription) {
        final String accept = "application/json";
        return service.createOrUpdate(
                this.client.getHost(),
                this.client.getApiVersion(),
                networkResourceName,
                networkResourceDescription,
                accept);
    }

    /**
     * Creates a Network resource with the specified name, description and properties. If Network resource with the same
     * name exists, then it is updated with the specified description and properties. Network resource provides
     * connectivity between application services.
     *
     * @param networkResourceName The identity of the network.
     * @param networkResourceDescription Description for creating a Network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a network resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkResourceDescription> createOrUpdateAsync(
            String networkResourceName, NetworkResourceDescription networkResourceDescription) {
        return createOrUpdateWithResponseAsync(networkResourceName, networkResourceDescription)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the information about the Network resource with the given name. The information include the description and
     * other properties of the Network.
     *
     * @param networkResourceName The identity of the network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Network resource with the given name along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkResourceDescription>> getWithResponseAsync(String networkResourceName) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), this.client.getApiVersion(), networkResourceName, accept);
    }

    /**
     * Gets the information about the Network resource with the given name. The information include the description and
     * other properties of the Network.
     *
     * @param networkResourceName The identity of the network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Network resource with the given name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkResourceDescription> getAsync(String networkResourceName) {
        return getWithResponseAsync(networkResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the Network resource identified by the name.
     *
     * @param networkResourceName The identity of the network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String networkResourceName) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), this.client.getApiVersion(), networkResourceName, accept);
    }

    /**
     * Deletes the Network resource identified by the name.
     *
     * @param networkResourceName The identity of the network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String networkResourceName) {
        return deleteWithResponseAsync(networkResourceName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Gets the information about all network resources in a given resource group. The information include the
     * description and other properties of the Network.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all network resources in a given resource group along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedNetworkResourceDescriptionList>> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), this.client.getApiVersion(), accept);
    }

    /**
     * Gets the information about all network resources in a given resource group. The information include the
     * description and other properties of the Network.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all network resources in a given resource group on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedNetworkResourceDescriptionList> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
