package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.application.ApplicationManager
import com.intellij.ui.dsl.builder.bindItem
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.dsl.builder.toNullableProperty
import com.microsoft.fabric.models.ApplicationInfo
import com.microsoft.fabric.models.ReplicaInfo
import com.microsoft.fabric.models.ServiceInfo
import com.microsoft.fabric.models.ServicePartitionInfo
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction.Companion.REFRESH
import dev.pitlor.rider_service_fabric_support.models.*
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.ClusterInfoPanelModel
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.ComboBoxItemRenderer
import dev.pitlor.rider_service_fabric_support.utils.Cluster
import java.util.function.Function

class ClusterInfoPanel(
    initialCluster: Cluster,
    applicationNamePredicate: Function<String, Boolean>,
    private val showAppSelector: Boolean = true,
) {
    constructor(cluster: Cluster, application: String) : this(
        cluster,
        { app -> app == "fabric:/$application" },
        false
    )

    private val model = ClusterInfoPanelModel(initialCluster, applicationNamePredicate)

    // TODO: Support application and service types
    // TODO: Support editing things about the cluster (ex: add new service based on type)
    val component
        get() = panel {
            row {
                panel {
                    if (showAppSelector) {
                        row("Application") {
                            // TODO: display name and set id? we should make custom setters
                            comboBox(model.applications, ComboBoxItemRenderer.basic { it.name })
                                .bindItem(model::selectedApplication.toNullableProperty())
                        }
                    }

                    if (model.selectedApplication != null) {
                        row("Services") {
                            comboBox(model.services, ComboBoxItemRenderer.basic { it.name })
                                .bindItem(model::selectedService.toNullableProperty())
                        }
                    }

                    if (model.selectedService != null) {
                        row("Partitions") {
                            comboBox(model.partitions, ComboBoxItemRenderer.basic { it.partitionInformation.id.toString() })
                                .bindItem(model::selectedPartition.toNullableProperty())
                        }
                    }

                    if (model.selectedPartition != null) {
                        row("Replicas") {
                            comboBox(model.replicas, ComboBoxItemRenderer.basic { it.nodeName })
                                .bindItem(model::selectedReplica.toNullableProperty())
                        }
                    }
                }
                panel {
//                    JBTabbedPane().let {
//                        if (model.applicationType != "") {
//                            it.addTab(model.applicationType, panel {
//                                row("Application Types") {
//
//                                }
//                            })
//                        }
//
//                        if (model.application != "") {
//                            row("Application") {
//                                comboBox(model.applications).bindItem(model::application.toNullableProperty())
//                            }
//                        }
//
//                        if (model.service != "") {
//                            row("Services") {
//                                comboBox(model.services).bindItem(model::service.toNullableProperty())
//                            }
//                        }
//
//                        if (model.partition != "") {
//                            row("Partitions") {
//                                comboBox(model.partitions).bindItem(model::partition.toNullableProperty())
//                            }
//                        }
//
//                        if (model.replica != "") {
//                            row("Replicas") {
//                                comboBox(model.replicas).bindItem(model::replica.toNullableProperty())
//                            }
//                        }
//                    }
                }
            }
        }

    init {
        ApplicationManager
            .getApplication()
            .messageBus
            .connect()
            .subscribe(REFRESH, ClusterAction {
                model.cluster = it
                    .stream()
                    .filter { c: Cluster? -> c!!.profile == model.cluster.profile }
                    .findFirst()
                    .orElse(null) ?: return@ClusterAction
            })
    }
}
