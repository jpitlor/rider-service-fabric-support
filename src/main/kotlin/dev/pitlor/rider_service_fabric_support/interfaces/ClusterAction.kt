package dev.pitlor.rider_service_fabric_support.interfaces

import com.intellij.util.messages.Topic
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.Cluster

fun interface ClusterAction {
    fun doAction(arg: List<Cluster>)

    companion object {
        val REFRESH = Topic.create(Bundle.string("topics.refresh.name"), ClusterAction::class.java)
    }
}