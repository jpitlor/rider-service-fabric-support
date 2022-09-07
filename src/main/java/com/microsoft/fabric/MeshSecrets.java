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
import com.microsoft.fabric.models.PagedSecretResourceDescriptionList;
import com.microsoft.fabric.models.SecretResourceDescription;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshSecrets. */
public final class MeshSecrets {
    /** The proxy service used to perform REST calls. */
    private final MeshSecretsService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshSecrets.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshSecrets(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(MeshSecretsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshSecrets to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshSecretsService {
        @Put("/Resources/Secrets/{secretResourceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<SecretResourceDescription>> createOrUpdate(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @BodyParam("application/json") SecretResourceDescription secretResourceDescription,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Secrets/{secretResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<SecretResourceDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @HeaderParam("Accept") String accept);

        @Delete("/Resources/Secrets/{secretResourceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Secrets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedSecretResourceDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Creates a Secret resource with the specified name, description and properties. If Secret resource with the same
     * name exists, then it is updated with the specified description and properties. Once created, the kind and
     * contentType of a secret resource cannot be updated.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretResourceDescription Description for creating a secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a secret resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecretResourceDescription>> createOrUpdateWithResponseAsync(
            String secretResourceName, SecretResourceDescription secretResourceDescription) {
        final String accept = "application/json";
        return service.createOrUpdate(
                this.client.getHost(),
                this.client.getApiVersion(),
                secretResourceName,
                secretResourceDescription,
                accept);
    }

    /**
     * Creates a Secret resource with the specified name, description and properties. If Secret resource with the same
     * name exists, then it is updated with the specified description and properties. Once created, the kind and
     * contentType of a secret resource cannot be updated.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretResourceDescription Description for creating a secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a secret resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecretResourceDescription> createOrUpdateAsync(
            String secretResourceName, SecretResourceDescription secretResourceDescription) {
        return createOrUpdateWithResponseAsync(secretResourceName, secretResourceDescription)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the information about the Secret resource with the given name. The information include the description and
     * other properties of the Secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Secret resource with the given name along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecretResourceDescription>> getWithResponseAsync(String secretResourceName) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), this.client.getApiVersion(), secretResourceName, accept);
    }

    /**
     * Gets the information about the Secret resource with the given name. The information include the description and
     * other properties of the Secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the Secret resource with the given name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecretResourceDescription> getAsync(String secretResourceName) {
        return getWithResponseAsync(secretResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the specified Secret resource and all of its named values.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String secretResourceName) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), this.client.getApiVersion(), secretResourceName, accept);
    }

    /**
     * Deletes the specified Secret resource and all of its named values.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String secretResourceName) {
        return deleteWithResponseAsync(secretResourceName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Gets the information about all secret resources in a given resource group. The information include the
     * description and other properties of the Secret.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all secret resources in a given resource group along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedSecretResourceDescriptionList>> listWithResponseAsync() {
        final String accept = "application/json";
        return service.list(this.client.getHost(), this.client.getApiVersion(), accept);
    }

    /**
     * Gets the information about all secret resources in a given resource group. The information include the
     * description and other properties of the Secret.
     *
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about all secret resources in a given resource group on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedSecretResourceDescriptionList> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
