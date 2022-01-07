package dev.pitlor.rider_service_fabric_support.interfaces

interface ClusterRefreshTimer {
    fun pause()
    fun start()
    fun doNow()
}