package dev.pitlor.rider_service_fabric_support.tool_windows

import com.intellij.openapi.project.Project
import com.intellij.ui.JBSplitter
import com.intellij.ui.components.JBList
import com.intellij.ui.treeStructure.Tree
import dev.pitlor.rider_service_fabric_support.utils.*
import dev.pitlor.rider_service_fabric_support.utils.SFUtil.getApplicationName
import org.jdesktop.swingx.calendar.DateSelectionModel
import java.awt.Color
import java.util.*
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.JTextPane
import javax.swing.event.TreeModelListener
import javax.swing.tree.TreeModel
import javax.swing.tree.TreePath

sealed class TreeNode(val name: String)
class ServiceFabricClusterTreeLeaf(name: String) : TreeNode(name)
class ServiceFabricClusterTreeNode(name: String, val children: List<TreeNode>) : TreeNode(name)

class ServiceFabricNodeDetailPane(node: ServiceFabricClusterTreeLeaf) : JTextField(node.name)

class ServiceFabricClusterManagerSplitDetails(data: List<TreeNode>) : JBSplitter() {
    init {
        val leftList = JBList(data.map { it.name })

        firstComponent = leftList
        secondComponent = JPanel()

        leftList.addListSelectionListener {
            val selection = data[it.firstIndex]
            secondComponent = when(selection) {
                is ServiceFabricClusterTreeLeaf -> ServiceFabricNodeDetailPane(selection)
                is ServiceFabricClusterTreeNode -> ServiceFabricClusterManagerSplitDetails(selection.children)
            }
        }
    }

    @Suppress("FunctionName")
    companion object {
        fun Global(): ServiceFabricClusterManagerSplitDetails {
            val cluster = SFUtil.getApplicationsOnCluster()
            return ServiceFabricClusterManagerSplitDetails(cluster.map { ServiceFabricClusterTreeLeaf(it) })
        }

        fun Local(project: Project): ServiceFabricClusterManagerSplitDetails {
            val cluster = SFUtil.getServicesOnCluster(project.getApplicationName())
            return ServiceFabricClusterManagerSplitDetails(listOf())
        }
    }
}
