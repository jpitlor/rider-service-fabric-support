package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.util.messages.Topic
import dev.pitlor.rider_service_fabric_support.Bundle

fun interface Action {
    fun doAction()

    companion object {
        val TURN_OFF_AUTO_REFRESH =
            Topic.create(Bundle.string("topics.turn_off_auto_refresh.name"), Action::class.java)
        val TURN_ON_AUTO_REFRESH =
            Topic.create(Bundle.string("topics.turn_on_auto_refresh.name"), Action::class.java)
        val MANUAL_REFRESH =
            Topic.create(Bundle.string("topics.manual_refresh.name"), Action::class.java)
    }
}

fun interface ClusterAction {
    fun doAction(arg: Cluster)

    companion object {
        val REFRESH = Topic.create(Bundle.string("topics.refresh.name"), ClusterAction::class.java)
    }
}