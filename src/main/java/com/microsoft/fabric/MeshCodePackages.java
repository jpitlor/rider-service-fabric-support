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
import com.microsoft.fabric.models.ContainerLogs;
import com.microsoft.fabric.models.FabricErrorException;
import com.microsoft.fabric.models.HostOptions;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MeshCodePackages. */
public final class MeshCodePackages {
    /** The proxy service used to perform REST calls. */
    private final MeshCodePackagesService service;

    /** The service client containing this operation class. */
    private final ServiceFabricClientAPIs client;

    /**
     * Initializes an instance of MeshCodePackages.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MeshCodePackages(ServiceFabricClientAPIs client) {
        this.service =
                RestProxy.create(
                        MeshCodePackagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricClientAPIsMeshCodePackages to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricClientA")
    private interface MeshCodePackagesService {
        @Get(
                "/Resources/Applications/{applicationResourceName}/Services/{serviceResourceName}/Replicas/{replicaName}/CodePackages/{codePackageName}/Logs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FabricErrorException.class)
        Mono<Response<ContainerLogs>> getContainerLogs(
                @HostParam("$host") HostOptions host,
                @QueryParam("api-version") String apiVersion,
                @PathParam(value = "applicationResourceName", encoded = true) String applicationResourceName,
                @PathParam(value = "serviceResourceName", encoded = true) String serviceResourceName,
                @PathParam(value = "replicaName", encoded = true) String replicaName,
                @PathParam("codePackageName") String codePackageName,
                @QueryParam("Tail") String tail,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Gets the logs for the container of the specified code package of the service replica.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @param replicaName Service Fabric replica name.
     * @param codePackageName The name of code package of the service.
     * @param tail Number of lines to show from the end of the logs. Default is 100. 'all' to show the complete logs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for the container of the specified code package of the service replica along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ContainerLogs>> getContainerLogsWithResponseAsync(
            String applicationResourceName,
            String serviceResourceName,
            String replicaName,
            String codePackageName,
            String tail) {
        final String accept = "application/json";
        return service.getContainerLogs(
                this.client.getHost(),
                this.client.getApiVersion(),
                applicationResourceName,
                serviceResourceName,
                replicaName,
                codePackageName,
                tail,
                accept);
    }

    /**
     * Gets the logs for the container of the specified code package of the service replica.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @param replicaName Service Fabric replica name.
     * @param codePackageName The name of code package of the service.
     * @param tail Number of lines to show from the end of the logs. Default is 100. 'all' to show the complete logs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws FabricErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for the container of the specified code package of the service replica on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerLogs> getContainerLogsAsync(
            String applicationResourceName,
            String serviceResourceName,
            String replicaName,
            String codePackageName,
            String tail) {
        return getContainerLogsWithResponseAsync(
                        applicationResourceName, serviceResourceName, replicaName, codePackageName, tail)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}
