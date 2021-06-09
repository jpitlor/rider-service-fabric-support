package dev.pitlor.rider_service_fabric_support.toolbar_actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import dev.pitlor.rider_service_fabric_support.utils.Action

class Refresh : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.project?.messageBus?.syncPublisher(Action.MANUAL_REFRESH)?.doAction()
    }
}