package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import com.microsoft.fabric.models.ApplicationInfo
import com.microsoft.fabric.models.ReplicaInfo
import com.microsoft.fabric.models.ServiceInfo
import com.microsoft.fabric.models.ServicePartitionInfo
import dev.pitlor.rider_service_fabric_support.utils.Cluster
import java.util.*
import java.util.function.Function
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.TreeNode

class Labeled<T>(val item: T, private val asString: String) {
    override fun toString(): String = asString
}

class TreeNode<T>(item: T, asString: String) : DefaultMutableTreeNode(Labeled(item, asString))

class ClusterInfoPanelModel(
    initialCluster: Cluster,
    private val applicationNamePredicate: Function<String, Boolean>
) {
    var cluster = initialCluster
    val applications get() = cluster.applications.filter { applicationNamePredicate.apply(it.name) }.toTypedArray()
    var selectedApplication: ApplicationInfo? = null
    val services: Array<ServiceInfo>
        get() {
            val application = selectedApplication ?: return arrayOf()
            return cluster.services[application.id]?.toTypedArray() ?: arrayOf()
        }
    var selectedService: ServiceInfo? = null
    val partitions: Array<ServicePartitionInfo>
        get() {
            val service = selectedService ?: return arrayOf()
            return cluster.partitions[service.id]?.toTypedArray() ?: arrayOf()
        }
    var selectedPartition: ServicePartitionInfo? = null
    val replicas: Array<ReplicaInfo>
        get() {
            val partition = selectedPartition ?: return arrayOf()
            return cluster.replicas[partition.partitionInformation.id]?.toTypedArray() ?: arrayOf()
        }
    var selectedReplica: ReplicaInfo? = null

    val asTreeNode get() = TreeNode(cluster, cluster.profile.nickname).also { clusterNode ->
        cluster.applications.forEach { application ->
            clusterNode.add(TreeNode(application, application.name).also { applicationNode ->
                cluster.services[application.id]?.forEach { service ->
                    applicationNode.add(TreeNode(service, service.name).also { serviceNode ->
                        cluster.partitions[service.id]?.forEach { partition ->
                            serviceNode.add(TreeNode(partition, partition.partitionInformation.id.toString()).also { partitionNode ->
                                cluster.replicas[partition.partitionInformation.id]?.forEach { replica ->
                                    partitionNode.add(TreeNode(replica, replica.nodeName))
                                }
                            })
                        }
                    })
                }
            })
        }
    }
}
