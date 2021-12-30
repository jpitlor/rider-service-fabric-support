package dev.pitlor.rider_service_fabric_support.tool_window

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.openapi.wm.ToolWindowManager
import com.intellij.ui.content.ContentFactory
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.services.ClusterRefreshTimer
import dev.pitlor.rider_service_fabric_support.settings.SettingsState

class ClusterManagerToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        refreshTabsListImpl(project, toolWindow)
    }

    companion object {
        fun refreshTabsList() {
            val project = ProjectManager.getInstance().openProjects[0]
            val toolWindow = ToolWindowManager.getInstance(project).getToolWindow(Bundle.string("tool_window.id"))
            if (toolWindow == null) {
                println("Tool window was not found")
                return
            }

            refreshTabsListImpl(project, toolWindow)
        }

        private fun refreshTabsListImpl(project: Project, toolWindow: ToolWindow) {
            toolWindow.contentManager.removeAllContents(false)
            SettingsState.getInstance().state.connectionProfiles.forEach {
                ContentFactory.SERVICE
                    .getInstance()
                    .createContent(
                        ClusterManagerToolWindowPanel(it, project),
                        it.nickname,
                        false
                    )
                    .also(toolWindow.contentManager::addContent)
            }

            service<ClusterRefreshTimer>().start()
        }
    }
}