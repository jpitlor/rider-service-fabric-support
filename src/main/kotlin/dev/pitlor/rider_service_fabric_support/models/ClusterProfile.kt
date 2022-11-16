package dev.pitlor.rider_service_fabric_support.models

data class ClusterProfile(
    var nickname: String,
    var host: String,
    var port: Int,
    var serverCertificateThumbprint: String? = null,
    var clientCertificateThumbprint: String? = null
) {
    constructor(nickname: String, host: String, certificateThumbprint: String)
            : this(nickname, host, 19080, certificateThumbprint, certificateThumbprint)
    constructor() : this("", "", 19080)

    val clusterEndpoint get() = "http://$host:$port"
}
