package dev.pitlor.rider_service_fabric_support.models

data class Parameter(
    val name: String,
    val value: String
)

data class Instance(
    val replicaAddress: String,
    val nodeName: String
)

data class Partition(
    val partitionId: String,
    val partitionKind: Int
)

data class PartitionType(
    val partition: Partition,
    val instances: List<Instance>
)

data class Service(
    val serviceKind: Int,
    val serviceName: String,
    val serviceTypeName: String,
    val serviceManifestVersion: String
)

data class ServiceType(
    val service: Service,
    val partitionTypes: List<PartitionType>
)

data class Application(
    val applicationName: String,
    val applicationTypeName: String,
    val applicationTypeVersion: String,
    val applicationParameters: List<Parameter>,
)

data class ApplicationType(
    val application: Application,
    val serviceTypes: List<ServiceType>
)

data class ClusterConnection(
    val connectionEndpoint: List<String>
)

data class Cluster(
    val profile: ClusterConnectionProfile,
    val applicationTypes: List<ApplicationType>,
    val connection: ClusterConnection
)