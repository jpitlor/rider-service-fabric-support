package dev.pitlor.rider_service_fabric_support.tool_window

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.SimpleToolWindowPanel
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfile
import dev.pitlor.rider_service_fabric_support.services.ClusterRefreshTimer
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterManagerSplitDetails
import org.jetbrains.annotations.NotNull
import javax.swing.JPanel
import javax.swing.JTabbedPane

class ClusterManagerToolWindowPanel(private val cluster: ClusterConnectionProfile, private val project: Project)
    : SimpleToolWindowPanel(false)
{
    init {
        val actionManager = ActionManager.getInstance()
        toolbar = actionManager
            .createActionToolbar(
                Bundle.string("tool_window.action_toolbar.name"),
                actionManager.getAction(Bundle.string("tool_window.action_group.name")) as ActionGroup,
                false
            )
            .apply { targetComponent = this@ClusterManagerToolWindowPanel }
            .component
        // FIXME
//        add(JTabbedPane().apply {
//            addTab(
//                project.name,
//                ClusterManagerSplitDetails.Local(cluster)
//            )
//            addTab(
//                Bundle.string("tool_window.tabs.all_apps.name"),
//                AllIcons.Toolwindows.WebToolWindow,
//                ClusterManagerSplitDetails.Global(cluster)
//            )
//            addTab(
//                Bundle.string("tool_window.tabs.cluster.name"),
//                AllIcons.Toolwindows.ToolWindowStructure,
//                ClusterManagerSplitDetails.Cluster(cluster)
//            )
//        })
    }
}