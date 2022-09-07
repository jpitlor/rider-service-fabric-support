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
import com.microsoft.fabric.models.PagedVolumeResourceDescriptionList;
import com.microsoft.fabric.models.VolumeResourceDescription;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshVolumes. */
public final class MeshVolumes {
    /** The proxy service used to perform REST calls. */
    private final MeshVolumesService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshVolumes.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshVolumes(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(MeshVolumesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshVolumes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshVolumesService {
        @Put("/Resources/Volumes/{volumeResourceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<VolumeResourceDescription>> createOrUpdate(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "volumeResourceName", encoded = true) String volumeResourceName,
                @BodyParam("application/json") VolumeResourceDescription volumeResourceDescription,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Volumes/{volumeResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<VolumeResourceDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "volumeResourceName", encoded = true) String volumeResourceName,
                @HeaderParam("Accept") String accept);

        @Delete("/Resources/Volumes/{volumeResourceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "volumeResourceName", encoded = true) String volumeResourceName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Volumes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedVolumeResourceDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Creates a Volume resource with the specified name, description and properties. If Volume resource with the same
     * name exists, then it is updated with the specified description and properties.
     *
     * @param volumeResourceName The identity of the volume.
     * @param volumeResourceDescription Description for creating a Volume resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a volume resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VolumeResourceDescription>> createOrUpdateWithResponseAsync(
            String volumeResourceName, VolumeResourceDescription volumeResourceDescription) {
        final String accept = "application/json";
        return service.createOrUpdate(
                this.client.getHost(),
                this.client.getApiVersion(),
                volumeResourceName,
                volumeResourceDescription,
                accept);
    }

    /**
     * Creates a Volume resource with the specified name, description and properties. If Volume resource with the same
     * name exists, then it is updated with the specified description and properties.
     *
     * @param volumeResourceName The identity of the volume.
     * @param volumeResourceDescription Description for creating a Volume resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a volume resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeResourceDescription> createOrUpdateAsync(
            String volumeResourceName, VolumeResourceDescription volumeResourceDescription) {
        return createOrUpdateWithResponseAsync(volumeResourceName, volumeResourceDescription)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the information about the Volume resource with the given name. The information include the description and
     * other properties of the Volume.
     *
     * @param volumeResourceName The identity of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Volume resource with the given name along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VolumeResourceDescription>> getWithResponseAsync(String volumeResourceName) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), this.client.getApiVersion(), volumeResourceName, accept);
    }

    /**
     * Gets the information about the Volume resource with the given name. The information include the description and
     * other properties of the Volume.
     *
     * @param volumeResourceName The identity of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Volume resource with the given name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VolumeResourceDescription> getAsync(String volumeResourceName) {
        return getWithResponseAsync(volumeResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the Volume resource identified by the name.
     *
     * @param volumeResourceName The identity of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String volumeResourceName) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), this.client.getApiVersion(), volumeResourceName, accept);
    }

    /**
     * Deletes the Volume resource identified by the name.
     *
     * @param volumeResourceName The identity of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String volumeResourceName) {
        return deleteWithResponseAsync(volumeResourceName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Gets the information about all volume resources in a given resource group. The information include the
     * description and other properties of the Volume.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all volume resources in a given resource group along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedVolumeResourceDescriptionList>> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), this.client.getApiVersion(), accept);
    }

    /**
     * Gets the information about all volume resources in a given resource group. The information include the
     * description and other properties of the Volume.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all volume resources in a given resource group on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedVolumeResourceDescriptionList> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
