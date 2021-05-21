package dev.pitlor.rider_service_fabric_support.tool_windows

import com.intellij.openapi.project.Project
import com.intellij.ui.treeStructure.Tree
import dev.pitlor.rider_service_fabric_support.utils.*
import dev.pitlor.rider_service_fabric_support.utils.SFUtil.getApplicationName
import javax.swing.event.TreeModelListener
import javax.swing.tree.TreeModel
import javax.swing.tree.TreePath

class ServiceFabricClusterManagerTreeModel(val project: Project?) : TreeModel {
    private val cluster =
        if (project == null) SFUtil.getApplicationsOnCluster()
        else SFUtil.getServicesOnCluster(project.getApplicationName())
    private val changeListeners = arrayListOf<TreeModelListener>()

    override fun getRoot(): Any {
        return cluster
    }

    override fun getChild(parent: Any, index: Int): Any {
        return when (parent) {
            is ServiceFabricClusterTreeNode -> parent.children[index]
            else -> Unit
        }
    }

    override fun getChildCount(parent: Any): Int {
        return when (parent) {
            is ServiceFabricClusterTreeNode -> parent.children.size
            else -> 0
        }
    }

    override fun isLeaf(node: Any): Boolean {
        return node is ServiceFabricClusterTreeLeaf
    }

    override fun getIndexOfChild(parent: Any, child: Any): Int {
        return when (parent) {
            is ServiceFabricClusterTreeNode -> parent.children.indexOf(child)
            else -> -1
        }

    }

    // The tree is not editable, so we don't need to add bodies to these
    override fun valueForPathChanged(path: TreePath, newValue: Any) {}
    override fun addTreeModelListener(listener: TreeModelListener) {}
    override fun removeTreeModelListener(listener: TreeModelListener) {}
}

class ServiceFabricClusterManagerTreeView(project: Project?)
    : Tree(ServiceFabricClusterManagerTreeModel(project))
{
    init {
        isRootVisible = false
    }

    @Suppress("FunctionName")
    companion object {
        fun Global(): ServiceFabricClusterManagerTreeView {
            return ServiceFabricClusterManagerTreeView(null)
        }

        fun Local(project: Project): ServiceFabricClusterManagerTreeView {
            return ServiceFabricClusterManagerTreeView(project)
        }
    }
}