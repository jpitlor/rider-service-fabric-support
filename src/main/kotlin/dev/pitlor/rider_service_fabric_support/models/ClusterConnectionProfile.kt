package dev.pitlor.rider_service_fabric_support.models

import com.intellij.util.xml.ConvertContext
import com.intellij.util.xml.Converter

data class ClusterConnectionProfile(
    val nickname: String,
    val host: String,
    val port: Int,
    val serverCertThumbprint: String,
    val clientCertThumbprint: String
) {
    constructor(nickname: String, host: String, certThumbprint: String)
            : this(nickname, host, 19000, certThumbprint, certThumbprint)
}

class ClusterConnectionProfileSerializationConverter() : Converter<List<ClusterConnectionProfile>>() {
    override fun toString(profiles: List<ClusterConnectionProfile>?, context: ConvertContext?): String? {
        if (profiles == null) return null
    }

    override fun fromString(string: String?, context: ConvertContext?): List<ClusterConnectionProfile>? {
        if (string == null) return null
    }

}