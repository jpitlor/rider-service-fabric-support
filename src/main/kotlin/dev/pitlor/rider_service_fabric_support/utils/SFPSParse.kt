package dev.pitlor.rider_service_fabric_support.utils

object SFPSParse {
    fun applicationTypes(input: List<PSObject>): List<String> {
        return input.map {
            val name = it.properties.get<String>("ApplicationTypeName")
            val version = it.properties.get<String>("ApplicationTypeVersion")
            return@map "$name@$version"
        }
    }
}