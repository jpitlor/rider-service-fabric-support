package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import com.microsoft.fabric.models.ApplicationInfo
import com.microsoft.fabric.models.ReplicaInfo
import com.microsoft.fabric.models.ServiceInfo
import com.microsoft.fabric.models.ServicePartitionInfo
import dev.pitlor.rider_service_fabric_support.utils.Cluster
import java.util.function.Function

class ClusterInfoPanelModel(
    initialCluster: Cluster,
    private val applicationNamePredicate: Function<String, Boolean>
) {
    var cluster = initialCluster
    val applications get() = cluster.applications.filter { applicationNamePredicate.apply(it.name) }
    var selectedApplication: ApplicationInfo? = null
    val services: List<ServiceInfo>
        get() {
            val application = selectedApplication ?: return listOf()
            return cluster.services[application.id] ?: listOf()
        }
    var selectedService: ServiceInfo? = null
    val partitions: List<ServicePartitionInfo>
        get() {
            val service = selectedService ?: return listOf()
            return cluster.partitions[service.id] ?: listOf()
        }
    var selectedPartition: ServicePartitionInfo? = null
    val replicas: List<ReplicaInfo>
        get() {
            val partition = selectedPartition ?: return listOf()
            return cluster.replicas[partition.partitionInformation.id] ?: listOf()
        }
    var selectedReplica: ReplicaInfo? = null
}
