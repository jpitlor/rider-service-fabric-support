package dev.pitlor.rider_service_fabric_support.swing_components

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

    constructor(messageBus: MessageBus, selector: (cluster: Cluster) -> List<TreeNode>) {
        messageBus
            .connect()
            .subscribe(ClusterAction.REFRESH, ClusterAction {
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
        fun Cluster(project: Project, cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(project.messageBus, SFUtil::getInfrastructure)
        }

        fun Global(project: Project, cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(project.messageBus, SFUtil::getApplications)
        }

        fun Local(project: Project, cluster: ClusterConnectionProfile): ClusterManagerSplitDetails {
            return ClusterManagerSplitDetails(project.messageBus, SFUtil.getServices(project))
        }
    }
}
