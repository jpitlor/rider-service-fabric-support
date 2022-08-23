package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.application.ApplicationManager
import com.intellij.ui.components.JBTabbedPane
import com.intellij.ui.dsl.builder.bindItem
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.dsl.builder.toNullableProperty
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction.Companion.REFRESH
import dev.pitlor.rider_service_fabric_support.models.*
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.ClusterInfoPanelModel
import java.util.function.Function

class ClusterInfoPanel(
    private val clusterProfile: ClusterProfile,
    applicationNamePredicate: Function<String, Boolean>,
    private val showAppSelector: Boolean = true,
) {
    constructor(clusterProfile: ClusterProfile, application: String) : this(
        clusterProfile,
        { app -> app == "fabric:/$application" },
        false
    )

    private var model = ClusterInfoPanelModel(applicationNamePredicate = applicationNamePredicate)
    val component
        get() = panel {
            row {
                panel {
                    if (showAppSelector) {
                        // TODO: Add option to sort by top level node instead
                        row("Application Types") {
                            comboBox(model.applicationTypes).bindItem(model::applicationType.toNullableProperty())
                        }
                        row("Application") {
                            comboBox(model.applications).bindItem(model::application.toNullableProperty())
                        }
                    }

                    if (model.application != "") {
                        row("Services") {
                            comboBox(model.services).bindItem(model::service.toNullableProperty())
                        }
                    }

                    if (model.service != "") {
                        row("Partitions") {
                            comboBox(model.partitions).bindItem(model::partition.toNullableProperty())
                        }
                    }

                    if (model.partition != "") {
                        row("Replicas") {
                            comboBox(model.replicas).bindItem(model::replica.toNullableProperty())
                        }
                    }
                }
                panel {
                    JBTabbedPane().let {
//                        if (model.applicationType != "") {
//                            it.addTab(model.applicationType, panel {
//                                row("Application Types") {
//
//                                }
//                            })
//                        }

                        if (model.application != "") {
                            row("Application") {
                                comboBox(model.applications).bindItem(model::application.toNullableProperty())
                            }
                        }

                        if (model.service != "") {
                            row("Services") {
                                comboBox(model.services).bindItem(model::service.toNullableProperty())
                            }
                        }

                        if (model.partition != "") {
                            row("Partitions") {
                                comboBox(model.partitions).bindItem(model::partition.toNullableProperty())
                            }
                        }

                        if (model.replica != "") {
                            row("Replicas") {
                                comboBox(model.replicas).bindItem(model::replica.toNullableProperty())
                            }
                        }
                    }
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
                    .filter { c: Cluster? -> c!!.profile == clusterProfile }
                    .findFirst()
                    .orElse(null) ?: return@ClusterAction
            })
    }
}
