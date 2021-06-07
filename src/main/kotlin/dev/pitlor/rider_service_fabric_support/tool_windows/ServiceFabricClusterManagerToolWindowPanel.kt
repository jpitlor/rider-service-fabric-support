package dev.pitlor.rider_service_fabric_support.tool_windows

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.ui.SimpleToolWindowPanel
import dev.pitlor.rider_service_fabric_support.Bundle
import org.jetbrains.annotations.NotNull

class ServiceFabricClusterManagerToolWindowPanel : SimpleToolWindowPanel(false) {

    init {
        val actionManager = ActionManager.getInstance()
        toolbar = actionManager
            .createActionToolbar(
                Bundle.string("tool_window.action_toolbar.name"),
                actionManager.getAction(Bundle.string("tool_window.action_group.name")) as @NotNull ActionGroup,
                false
            )
            .component
        add(ServiceFabricClusterManagerSplitDetails.Global())
    }
}