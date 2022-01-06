package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.Project
import com.intellij.ui.JBSplitter
import com.intellij.ui.components.JBList
import com.intellij.util.messages.MessageBus
import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfile
import dev.pitlor.rider_service_fabric_support.utils.Notification
import dev.pitlor.rider_service_fabric_support.utils.SFUtil
import javax.swing.DefaultListModel
import javax.swing.JPanel
import javax.swing.JTextField

sealed class TreeNode(open val name: String)
data class ClusterTreeLeaf(override val name: String) : TreeNode(name)
data class ClusterTreeNode(override val name: String, val children: List<TreeNode>) : TreeNode(name)

class NodeDetailPane(node: ClusterTreeLeaf) : JTextField(node.name)

class ClusterManagerSplitDetails : JBSplitter {
    private var data = listOf<TreeNode>()
    private val leftList = JBList<String>()

    constructor(profile: ClusterConnectionProfile, selector: (cluster: Cluster) -> List<TreeNode>) {
        ApplicationManager
            .getApplication()
            .messageBus
            .connect()
            .subscribe(ClusterAction.REFRESH, ClusterAction {
                val cluster = it.find { c -> c.profile == profile } ?: return@ClusterAction
                val newData = selector(cluster)
                if (data == newData) return@ClusterAction

                data = selector(cluster)
                refreshUi()
            })
        initUi()
    }

    private constructor(data: List<TreeNode>) {
        this.data = data
        initUi()
    }

    private fun initUi() {
        firstComponent = leftList
        secondComponent = JPanel()

        leftList.addListSelectionListener {
            val selection = data[it.firstIndex]
            secondComponent = when (selection) {
                is ClusterTreeLeaf -> NodeDetailPane(selection)
                is ClusterTreeNode -> ClusterManagerSplitDetails(selection.children)
            }
        }
    }

    private fun refreshUi() {
        leftList.model = DefaultListModel<String>()
            .apply { addAll(data.map { it.name }) }
    }

    @Suppress("FunctionName")
    companion object {
        fun Cluster(cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(cluster, SFUtil::getInfrastructure)
        }

        fun Global(cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(cluster, SFUtil::getApplications)
        }

        fun Local(cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(cluster, SFUtil::getServices)
        }
    }
}
