package dev.pitlor.rider_service_fabric_support.models

import com.google.gson.Gson
import com.intellij.util.xmlb.Converter

data class ClusterConnectionProfile(
    var nickname: String,
    var host: String,
    var port: Int,
    var serverCertThumbprint: String,
    var clientCertThumbprint: String
) {
    constructor(nickname: String, host: String, certThumbprint: String)
            : this(nickname, host, 19000, certThumbprint, certThumbprint)
    constructor() : this("", "", 19000, "", "")

    val nodeAddress get() = "$host:$port"
}

class ClusterConnectionProfileSerializationConverter() : Converter<List<ClusterConnectionProfile>>() {
    private val gson = Gson()
    private val profileList = listOf<ClusterConnectionProfile>()

    override fun toString(profiles: List<ClusterConnectionProfile>): String? {
        return gson.toJson(profiles)
    }

    override fun fromString(string: String): List<ClusterConnectionProfile>? {
        return gson.fromJson(string, profileList::class.java)
    }

}