package dev.pitlor.rider_service_fabric_support.toolbar_actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.application.ApplicationManager
import dev.pitlor.rider_service_fabric_support.interfaces.Action

class Refresh : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        ApplicationManager.getApplication()?.messageBus?.syncPublisher(Action.MANUAL_REFRESH)?.doAction()
    }
}
