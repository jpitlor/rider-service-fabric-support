package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.SimpleToolWindowPanel
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.services.ClusterRefreshTimer
import org.jetbrains.annotations.NotNull
import javax.swing.JTabbedPane

class ClusterManagerToolWindowPanel(private val project: Project) : SimpleToolWindowPanel(false) {
    private val timer = project.service<ClusterRefreshTimer>()

    init {
        val actionManager = ActionManager.getInstance()
        toolbar = actionManager
            .createActionToolbar(
                Bundle.string("tool_window.action_toolbar.name"),
                actionManager.getAction(Bundle.string("tool_window.action_group.name")) as @NotNull ActionGroup,
                false
            )
            .component
        add(JTabbedPane().apply {
            addTab(
                project.name,
                ClusterManagerSplitDetails.Local(project)
            )
            addTab(
                Bundle.string("tool_window.tabs.all_apps.name"),
                AllIcons.Toolwindows.WebToolWindow,
                ClusterManagerSplitDetails.Global(project)
            )
            addTab(
                Bundle.string("tool_window.tabs.cluster.name"),
                AllIcons.Toolwindows.ToolWindowStructure,
                ClusterManagerSplitDetails.Cluster(project)
            )
        })

        // TODO: At some point, figure out how to get a timer running
//        timer.start()
        timer.doNow()
    }
}