package dev.pitlor.rider_service_fabric_support.models

data class ClusterProfile(
    var nickname: String,
    var host: String,
    var port: Int,
    var serverCertThumbprint: String,
    var clientCertThumbprint: String
) {
    constructor(nickname: String, host: String, certThumbprint: String)
            : this(nickname, host, 19000, certThumbprint, certThumbprint)
    constructor() : this("", "", 19000, "", "")

    val clusterEndpoint get() = "$host:$port"
}
