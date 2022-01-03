package dev.pitlor.rider_service_fabric_support.models

import kotlinx.serialization.Serializable

enum class NodeType { PrimaryReplica, SecondaryReplica, SingletonInstance }
@Serializable
data class Node(
    val name: String,
    val type: NodeType
)

@Serializable
data class Partition(
    val name: String,
    val nodes: List<Node>
)

@Serializable
data class Service(
    val name: String,
    val partitions: List<Partition>
)

@Serializable
data class Application(
    val name: String,
    val services: List<Service>
)

@Serializable
data class ApplicationType(
    val name: String,
    val applications: List<Application>
)

@Serializable
data class Cluster(
    val profile: ClusterConnectionProfile,
    val name: String,
    val applicationsTypes: List<ApplicationType>,
    val nodes: List<Node>,
    val systemServices: List<Service>
)