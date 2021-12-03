package dev.pitlor.rider_service_fabric_support.services

import com.intellij.openapi.application.ApplicationManager
import dev.pitlor.rider_service_fabric_support.interfaces.Action
import dev.pitlor.rider_service_fabric_support.interfaces.ClusterAction
import dev.pitlor.rider_service_fabric_support.utils.SFUtil
import java.util.*
import kotlin.concurrent.fixedRateTimer

interface ClusterRefreshTimer {
    fun pause()
    fun start()
    fun doNow()
}

class ClusterRefreshTimerImpl : ClusterRefreshTimer {
    private val application = ApplicationManager.getApplication()
    private var timer: Timer? = null
    private val publisher = application.messageBus.syncPublisher(ClusterAction.REFRESH)

    init {
        application.messageBus.connect().apply {
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