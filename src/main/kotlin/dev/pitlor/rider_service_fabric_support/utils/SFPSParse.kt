package dev.pitlor.rider_service_fabric_support.utils

import dev.pitlor.rider_service_fabric_support.models.ApplicationType
import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.models.PSObject
import dev.pitlor.rider_service_fabric_support.models.PSObjects

object SFPSParse {
    fun applicationTypes(input: List<PSObject>): List<String> {
        return input.map {
            val name = it.properties.get<String>("ApplicationTypeName")
            val version = it.properties.get<String>("ApplicationTypeVersion")
            return@map "$name@$version"
        }
    }

    fun cluster(input: PSObjects): Cluster {
        val clusterName = input.getResult(SFPSUtil.connectToCluster())
            ?.properties
            ?.filterIsInstance<PSObject>()
            ?.find { it.name == "GatewayInformation" }
            ?.properties
            ?.get<String>("NodeAddress")
            ?: "Unknown Cluster"
        val applicationTypes = input
            .getResults(SFPSUtil.getApplicationTypes())
            .map {
                val name = it.properties.get<String>("ApplicationTypeName")
                val version = it.properties.get<String>("ApplicationTypeVersion")
                ApplicationType("$name@$version", listOf())
            }
        return Cluster(clusterName, applicationTypes, listOf(), listOf())
    }
}