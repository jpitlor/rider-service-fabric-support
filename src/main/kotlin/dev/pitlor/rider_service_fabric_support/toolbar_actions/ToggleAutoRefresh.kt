package dev.pitlor.rider_service_fabric_support.toolbar_actions

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.application.ApplicationManager
import dev.pitlor.rider_service_fabric_support.interfaces.Action

class ToggleAutoRefresh : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        if (e.presentation.icon == AllIcons.Actions.Pause) {
            turnAutoRefreshOff(e)
        } else {
            turnAutoRefreshOn(e)
        }
    }

    private fun turnAutoRefreshOn(e: AnActionEvent) {
        e.presentation.icon = AllIcons.Actions.Pause
        ApplicationManager.getApplication()?.messageBus?.syncPublisher(Action.TURN_ON_AUTO_REFRESH)?.doAction()
    }

    private fun turnAutoRefreshOff(e: AnActionEvent) {
        e.presentation.icon = AllIcons.Actions.Resume
        ApplicationManager.getApplication()?.messageBus?.syncPublisher(Action.TURN_OFF_AUTO_REFRESH)?.doAction()
    }
}
