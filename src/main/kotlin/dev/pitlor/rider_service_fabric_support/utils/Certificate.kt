package dev.pitlor.rider_service_fabric_support.utils

import java.security.MessageDigest
import java.security.cert.X509Certificate
import javax.xml.bind.DatatypeConverter

class Certificate(private val certificate: X509Certificate) {
    private val sha1 = MessageDigest.getInstance("SHA-1")

    val name: String get() = certificate.subjectDN.name
        .split(", ")
        .firstOrNull { it.startsWith("CN=") }
        ?.substring("CN=".length) ?: certificate.subjectDN.name

    val thumbprint: String get() = DatatypeConverter.printHexBinary(sha1.digest(certificate.encoded)).uppercase();
}
