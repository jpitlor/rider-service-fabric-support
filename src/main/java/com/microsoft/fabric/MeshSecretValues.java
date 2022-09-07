package com.microsoft.fabric;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.microsoft.fabric.models.PagedSecretValueResourceDescriptionList;
import com.microsoft.fabric.models.SecretValue;
import com.microsoft.fabric.models.SecretValueResourceDescription;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshSecretValues. */
public final class MeshSecretValues {
    /** The proxy service used to perform REST calls. */
    private final MeshSecretValuesService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshSecretValues.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshSecretValues(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(
                        MeshSecretValuesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshSecretValues to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshSecretValuesService {
        @Put("/Resources/Secrets/{secretResourceName}/values/{secretValueResourceName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<SecretValueResourceDescription>> addValue(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @PathParam(value = "secretValueResourceName", encoded = true) String secretValueResourceName,
                @BodyParam("application/json") SecretValueResourceDescription secretValueResourceDescription,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Secrets/{secretResourceName}/values/{secretValueResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<SecretValueResourceDescription>> get(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @PathParam(value = "secretValueResourceName", encoded = true) String secretValueResourceName,
                @HeaderParam("Accept") String accept);

        @Delete("/Resources/Secrets/{secretResourceName}/values/{secretValueResourceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @PathParam(value = "secretValueResourceName", encoded = true) String secretValueResourceName,
                @HeaderParam("Accept") String accept);

        @Get("/Resources/Secrets/{secretResourceName}/values")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<PagedSecretValueResourceDescriptionList>> list(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @HeaderParam("Accept") String accept);

        @Post("/Resources/Secrets/{secretResourceName}/values/{secretValueResourceName}/list_value")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<SecretValue>> show(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "secretResourceName", encoded = true) String secretResourceName,
                @PathParam(value = "secretValueResourceName", encoded = true) String secretValueResourceName,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Creates a new value of the specified secret resource. The name of the value is typically the version identifier.
     * Once created the value cannot be changed.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @param secretValueResourceDescription Description for creating a value of a secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a value of a secret resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecretValueResourceDescription>> addValueWithResponseAsync(
            String secretResourceName,
            String secretValueResourceName,
            SecretValueResourceDescription secretValueResourceDescription) {
        final String accept = "application/json";
        return service.addValue(
                this.client.getHost(),
                this.client.getApiVersion(),
                secretResourceName,
                secretValueResourceName,
                secretValueResourceDescription,
                accept);
    }

    /**
     * Creates a new value of the specified secret resource. The name of the value is typically the version identifier.
     * Once created the value cannot be changed.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @param secretValueResourceDescription Description for creating a value of a secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type describes a value of a secret resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecretValueResourceDescription> addValueAsync(
            String secretResourceName,
            String secretValueResourceName,
            SecretValueResourceDescription secretValueResourceDescription) {
        return addValueWithResponseAsync(secretResourceName, secretValueResourceName, secretValueResourceDescription)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the information about the specified named secret value resources. The information does not include the actual
     * value of the secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the specified named secret value resources along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecretValueResourceDescription>> getWithResponseAsync(
            String secretResourceName, String secretValueResourceName) {
        final String accept = "application/json";
        return service.get(
                this.client.getHost(),
                this.client.getApiVersion(),
                secretResourceName,
                secretValueResourceName,
                accept);
    }

    /**
     * Get the information about the specified named secret value resources. The information does not include the actual
     * value of the secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information about the specified named secret value resources on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecretValueResourceDescription> getAsync(String secretResourceName, String secretValueResourceName) {
        return getWithResponseAsync(secretResourceName, secretValueResourceName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the secret value resource identified by the name. The name of the resource is typically the version
     * associated with that value. Deletion will fail if the specified value is in use.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String secretResourceName, String secretValueResourceName) {
        final String accept = "application/json";
        return service.delete(
                this.client.getHost(),
                this.client.getApiVersion(),
                secretResourceName,
                secretValueResourceName,
                accept);
    }

    /**
     * Deletes the secret value resource identified by the name. The name of the resource is typically the version
     * associated with that value. Deletion will fail if the specified value is in use.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String secretResourceName, String secretValueResourceName) {
        return deleteWithResponseAsync(secretResourceName, secretValueResourceName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Gets information about all secret value resources of the specified secret resource. The information includes the
     * names of the secret value resources, but not the actual values.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all secret value resources of the specified secret resource along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PagedSecretValueResourceDescriptionList>> listWithResponseAsync(String secretResourceName) {
        final String accept = "application/json";
        return service.list(this.client.getHost(), this.client.getApiVersion(), secretResourceName, accept);
    }

    /**
     * Gets information about all secret value resources of the specified secret resource. The information includes the
     * names of the secret value resources, but not the actual values.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all secret value resources of the specified secret resource on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedSecretValueResourceDescriptionList> listAsync(String secretResourceName) {
        return listWithResponseAsync(secretResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Lists the decrypted value of the specified named value of the secret resource. This is a privileged operation.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type represents the unencrypted value of the secret along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecretValue>> showWithResponseAsync(
            String secretResourceName, String secretValueResourceName) {
        final String accept = "application/json";
        return service.show(
                this.client.getHost(),
                this.client.getApiVersion(),
                secretResourceName,
                secretValueResourceName,
                accept);
    }

    /**
     * Lists the decrypted value of the specified named value of the secret resource. This is a privileged operation.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretValueResourceName The name of the secret resource value which is typically the version identifier
     *     for the value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this type represents the unencrypted value of the secret on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecretValue> showAsync(String secretResourceName, String secretValueResourceName) {
        return showWithResponseAsync(secretResourceName, secretValueResourceName)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
