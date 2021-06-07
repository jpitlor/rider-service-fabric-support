package dev.pitlor.rider_service_fabric_support.toolbar_actions

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ToggleAutoRefresh : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.presentation.icon = if (e.presentation.icon == AllIcons.Actions.Pause)
            AllIcons.Process.ProgressResume
            else AllIcons.Process.ProgressPause
    }
}