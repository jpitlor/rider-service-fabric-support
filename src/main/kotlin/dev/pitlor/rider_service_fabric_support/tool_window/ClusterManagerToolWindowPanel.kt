package dev.pitlor.rider_service_fabric_support.tool_window

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.SimpleToolWindowPanel
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterInfoPanel
import dev.pitlor.rider_service_fabric_support.utils.SFUtil
import javax.swing.JTabbedPane

class ClusterManagerToolWindowPanel(private val profile: ClusterProfile, private val project: Project) :
    SimpleToolWindowPanel(false) {
    init {
        val actionManager = ActionManager.getInstance()
        val cluster = SFUtil.readCluster(profile)
        toolbar = actionManager
            .createActionToolbar(
                Bundle.string("tool_window.action_toolbar.name"),
                actionManager.getAction(Bundle.string("tool_window.action_group.name")) as ActionGroup,
                false
            )
            .apply { targetComponent = this@ClusterManagerToolWindowPanel }
            .component
        add(JTabbedPane().apply {
            addTab(
                project.name,
                ClusterInfoPanel(
                    cluster,
                    project.name
                ).component
            )
            addTab(
                Bundle.string("tool_window.tabs.all_apps.name"),
                AllIcons.Toolwindows.WebToolWindow,
                ClusterInfoPanel(cluster, {
                    !it.substringAfter("fabric:/").startsWith("System")
                }).component
            )
            addTab(
                Bundle.string("tool_window.tabs.cluster.name"),
                AllIcons.Toolwindows.ToolWindowStructure,
                ClusterInfoPanel(cluster, {
                    it.substringAfter("fabric:/").startsWith("System")
                }).component
            )
        })
    }
}
