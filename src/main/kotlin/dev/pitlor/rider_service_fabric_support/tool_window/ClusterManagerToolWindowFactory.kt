package dev.pitlor.rider_service_fabric_support.tool_window

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.openapi.wm.ToolWindowManager
import com.intellij.ui.SimpleColoredComponent
import com.intellij.ui.SimpleTextAttributes
import com.intellij.ui.components.DialogPanel
import com.intellij.ui.content.ContentFactory
import com.intellij.ui.dsl.builder.*
import com.jetbrains.rd.util.lifetime.Lifetime
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterRefreshTimer
import dev.pitlor.rider_service_fabric_support.settings.SettingsState
import java.awt.BorderLayout
import java.awt.Component
import java.awt.Cursor
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent
import javax.swing.JPanel

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
            SettingsState
                .getInstance()
                .state
                .connectionProfiles
                .forEach {
                    ContentFactory
                        .getInstance()
                        .createContent(
                            ClusterManagerToolWindowPanel(it, project),
                            it.nickname,
                            false
                        )
                        .also(toolWindow.contentManager::addContent)
                }

            // TODO: Put this back in when we better support auto refresh
            // service<ClusterRefreshTimer>().start()
        }
    }
}
