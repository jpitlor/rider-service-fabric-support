package dev.pitlor.rider_service_fabric_support.models

import dev.pitlor.rider_service_fabric_support.utils.Certificate

data class ClusterProfile(
    var nickname: String,
    var host: String,
    var port: Int,
    var serverCertificate: Certificate? = null,
    var clientCertificate: Certificate? = null
) {
    constructor(nickname: String, host: String, certThumbprint: Certificate)
            : this(nickname, host, 19080, certThumbprint, certThumbprint)
    constructor() : this("", "", 19080)

    val clusterEndpoint get() = "http://$host:$port"
}
