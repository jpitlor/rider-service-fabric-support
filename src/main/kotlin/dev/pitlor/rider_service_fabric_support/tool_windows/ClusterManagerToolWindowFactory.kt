package dev.pitlor.rider_service_fabric_support.tool_windows

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterManagerToolWindowPanel

class ClusterManagerToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val content = ContentFactory.SERVICE
            .getInstance()
            .createContent(
                ClusterManagerToolWindowPanel(project),
                Bundle.string("tool_window.title"),
                false
            )
        toolWindow.contentManager.addContent(content)
    }
}