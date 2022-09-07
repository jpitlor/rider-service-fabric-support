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
import com.microsoft.fabric.models.GatewayResourceDescription;
import com.microsoft.fabric.models.HostOptions;
import com.microsoft.fabric.models.PagedGatewayResourceDescriptionList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshGateways. */
public final class MeshGateways {
    /** The proxy service used to perform REST calls. */
    private final MeshGatewaysService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshGateways.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshGateways(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(MeshGatewaysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshGateways to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshGatewaysService {
        @Put("/Resources/Gateways/{gatewayResourceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<GatewayResourceDescription>> createOrUpdate(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "gatewayResourceName", encoded = true) String gatewayResourceName,
                @BodyParam("application/json") GatewayResourceDescription gatewayResourceDescription,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Gateways/{gatewayResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<GatewayResourceDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "gatewayResourceName", encoded = true) String gatewayResourceName,
                @HeaderParam("Accept") String accept);

        @Delete("/Resources/Gateways/{gatewayResourceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "gatewayResourceName", encoded = true) String gatewayResourceName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Gateways")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedGatewayResourceDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Creates a Gateway resource with the specified name, description and properties. If Gateway resource with the same
     * name exists, then it is updated with the specified description and properties. Use Gateway resource to provide
     * public connectivity to application services.
     *
     * @param gatewayResourceName The identity of the gateway.
     * @param gatewayResourceDescription Description for creating a Gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a gateway resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<GatewayResourceDescription>> createOrUpdateWithResponseAsync(
            String gatewayResourceName, GatewayResourceDescription gatewayResourceDescription) {
        final String accept = "application/json";
        return service.createOrUpdate(
                this.client.getHost(),
                this.client.getApiVersion(),
                gatewayResourceName,
                gatewayResourceDescription,
                accept);
    }

    /**
     * Creates a Gateway resource with the specified name, description and properties. If Gateway resource with the same
     * name exists, then it is updated with the specified description and properties. Use Gateway resource to provide
     * public connectivity to application services.
     *
     * @param gatewayResourceName The identity of the gateway.
     * @param gatewayResourceDescription Description for creating a Gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a gateway resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GatewayResourceDescription> createOrUpdateAsync(
            String gatewayResourceName, GatewayResourceDescription gatewayResourceDescription) {
        return createOrUpdateWithResponseAsync(gatewayResourceName, gatewayResourceDescription)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the information about the Gateway resource with the given name. The information include the description and
     * other properties of the Gateway.
     *
     * @param gatewayResourceName The identity of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Gateway resource with the given name along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<GatewayResourceDescription>> getWithResponseAsync(String gatewayResourceName) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), this.client.getApiVersion(), gatewayResourceName, accept);
    }

    /**
     * Gets the information about the Gateway resource with the given name. The information include the description and
     * other properties of the Gateway.
     *
     * @param gatewayResourceName The identity of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Gateway resource with the given name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GatewayResourceDescription> getAsync(String gatewayResourceName) {
        return getWithResponseAsync(gatewayResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the Gateway resource identified by the name.
     *
     * @param gatewayResourceName The identity of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String gatewayResourceName) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), this.client.getApiVersion(), gatewayResourceName, accept);
    }

    /**
     * Deletes the Gateway resource identified by the name.
     *
     * @param gatewayResourceName The identity of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String gatewayResourceName) {
        return deleteWithResponseAsync(gatewayResourceName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Gets the information about all gateway resources in a given resource group. The information include the
     * description and other properties of the Gateway.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all gateway resources in a given resource group along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedGatewayResourceDescriptionList>> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), this.client.getApiVersion(), accept);
    }

    /**
     * Gets the information about all gateway resources in a given resource group. The information include the
     * description and other properties of the Gateway.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all gateway resources in a given resource group on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedGatewayResourceDescriptionList> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
