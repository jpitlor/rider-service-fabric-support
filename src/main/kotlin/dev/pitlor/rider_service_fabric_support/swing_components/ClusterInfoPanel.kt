package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.application.ApplicationManager
import com.intellij.ui.treeStructure.Tree
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction.Companion.REFRESH
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.ClusterInfoPanelModel
import dev.pitlor.rider_service_fabric_support.utils.Cluster
import java.awt.FlowLayout
import java.util.function.Function
import javax.swing.JPanel

// TODO: Support application and service types
// TODO: Support editing things about the cluster (ex: add new service based on type)
class ClusterInfoPanel(
    initialCluster: Cluster,
    applicationNamePredicate: Function<String, Boolean>,
    private val showAppSelector: Boolean = true,
) : JPanel() {
    constructor(cluster: Cluster, application: String) : this(
        cluster,
        { app -> app == "fabric:/$application" },
        false
    )

    private val viewModel = ClusterInfoPanelModel(initialCluster, applicationNamePredicate)

    init {
        layout = FlowLayout()
        render()

        ApplicationManager
            .getApplication()
            .messageBus
            .connect()
            .subscribe(REFRESH, ClusterAction {
                val newCluster = it
                    .stream()
                    .filter { c: Cluster? -> c!!.profile == viewModel.cluster.profile }
                    .findFirst()
                    .orElse(null) ?: return@ClusterAction
                if (newCluster == viewModel.cluster) {
                    return@ClusterAction
                }

                viewModel.cluster = newCluster
                render()
            })
    }

    // TODO: dont replace tree if data is same
    private fun render() {
        val newTree = Tree(viewModel.asTreeNode).apply {
            alignmentX = LEFT_ALIGNMENT
        }
        removeAll()
        add(newTree)
    }
}
