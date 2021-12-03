package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import dev.pitlor.rider_service_fabric_support.Bundle


object Notification {
    fun info(message: String) {
        send(message, NotificationType.INFORMATION)
    }

    fun warn(message: String) {
        send(message, NotificationType.WARNING)
    }

    fun error(message: String) {
        send(message, NotificationType.ERROR)
    }

    private fun send(message: String, type: NotificationType) {
        NotificationGroupManager.getInstance()
            .getNotificationGroup(Bundle.string("notifications.group_id"))
            .createNotification(message, type)
            .notify(null)
    }
}