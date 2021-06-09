package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.project.Project
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.concurrent.scheduleAtFixedRate

interface ClusterRefreshTimer {
    fun pause()
    fun start()
    fun doNow()
}

class ClusterRefreshTimerImpl(project: Project) : ClusterRefreshTimer {
    private var timer: Timer? = null
    private val publisher = project.messageBus.syncPublisher(ClusterAction.REFRESH)

    init {
        project.messageBus.connect().apply {
            subscribe(Action.MANUAL_REFRESH, Action { doNow() })
            subscribe(Action.TURN_OFF_AUTO_REFRESH, Action { pause() })
            subscribe(Action.TURN_ON_AUTO_REFRESH, Action { start() })
        }
    }

    override fun pause() {
        timer?.cancel()
        timer = null
    }

    override fun start() {
        pause()
        timer = fixedRateTimer(null, false, 0, 15_000) { doNow() }
    }

    override fun doNow() {
        val cluster = SFUtil.getCluster()
        publisher.doAction(cluster)
    }
}