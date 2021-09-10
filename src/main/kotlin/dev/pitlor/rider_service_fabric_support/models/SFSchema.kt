package dev.pitlor.rider_service_fabric_support.models

enum class NodeType { PrimaryReplica, SecondaryReplica, SingletonInstance }
data class Node(
    val name: String,
    val type: NodeType
)

data class Partition(
    val name: String,
    val nodes: List<Node>
)

data class Service(
    val name: String,
    val partitions: List<Partition>
)

data class Application(
    val name: String,
    val services: List<Service>
)

data class ApplicationType(
    val name: String,
    val applications: List<Application>
)

data class Cluster(
    val name: String,
    val applicationsTypes: List<ApplicationType>,
    val nodes: List<Node>,
    val systemServices: List<Service>
)