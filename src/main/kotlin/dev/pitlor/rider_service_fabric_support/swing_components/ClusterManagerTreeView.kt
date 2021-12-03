package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.Project
import com.intellij.ui.JBSplitter
import com.intellij.ui.components.JBList
import com.intellij.util.messages.MessageBus
import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfile
import dev.pitlor.rider_service_fabric_support.utils.SFUtil
import javax.swing.DefaultListModel
import javax.swing.JPanel
import javax.swing.JTextField

sealed class TreeNode(val name: String)
class ClusterTreeLeaf(name: String) : TreeNode(name)
class ClusterTreeNode(name: String, val children: List<TreeNode>) : TreeNode(name)

class NodeDetailPane(node: ClusterTreeLeaf) : JTextField(node.name)

class ClusterManagerSplitDetails : JBSplitter {
    private var data = listOf<TreeNode>()
    private val leftList = JBList<String>()

    constructor(nodeAddress: String, selector: (cluster: Cluster) -> List<TreeNode>) {
        ApplicationManager
            .getApplication()
            .messageBus
            .connect()
            .subscribe(ClusterAction.REFRESH, ClusterAction {
                if (it.name.lowercase() != nodeAddress.lowercase()) return@ClusterAction

                data = selector(it)
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
            return ClusterManagerSplitDetails(cluster.nodeAddress, SFUtil::getInfrastructure)
        }

        fun Global(cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(cluster.nodeAddress, SFUtil::getApplications)
        }

        fun Local(cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(cluster.nodeAddress, SFUtil::getServices)
        }
    }
}
