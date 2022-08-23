package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import java.util.function.Function

class ClusterInfoPanelModel(
    var cluster: Cluster = Cluster(ClusterProfile(), listOf()),
    private val applicationNamePredicate: Function<String, Boolean>,
) {
    var applicationType = ""
    private val selectedApplicationType
        get() = cluster.applicationTypes.find { it.name == applicationType }
    val applicationTypes
        get() = cluster.applicationTypes
            .filter { applicationNamePredicate.apply(it.name) }
            .map { it.name }

    var application = ""
    private val selectedApplication
        get() = if (applicationType == "" && applicationTypes.size == 1)
            cluster.applicationTypes.find { applicationNamePredicate.apply(it.name) }?.application
        else
            selectedApplicationType?.application
    val applications
        get() = listOf(selectedApplicationType?.application?.applicationName ?: "")

    var service = ""
    private val selectedService
        get() = selectedApplicationType?.serviceTypes?.find { it.service.serviceName == service }
    val services
        get() = selectedApplicationType?.serviceTypes
            ?.map { it.service.serviceName }
            ?: listOf()

    var partition = ""
    private val selectedPartition
        get() = selectedService?.partitionTypes?.find { it.partition.partitionId == partition }
    val partitions
        get() = selectedService?.partitionTypes
            ?.map { it.partition.partitionId }
            ?: listOf()

    var replica = ""
    val selectedReplica
        get() = selectedPartition?.instances?.find { it.nodeName == replica }
    val replicas
        get() = selectedPartition?.instances
            ?.map { it.nodeName }
            ?: listOf()
}
