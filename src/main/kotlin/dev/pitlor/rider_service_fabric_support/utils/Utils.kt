package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import java.io.File
import java.security.KeyStore
import javax.net.ssl.TrustManagerFactory
import javax.net.ssl.X509TrustManager

object Utils {
    fun <T> Array<T>.findIndex(finder: (T) -> Boolean): Int {
        for (i in indices) {
            if (finder(this[i])) {
                return i
            }
        }
        return 0
    }

    fun VirtualFile?.getTildePath(): String {
        if (this == null) return ""
        val longPath = FileUtil.toSystemDependentName(path)
        return FileUtil.getLocationRelativeToUserHome(longPath, false)
    }

    fun findFile(path: String?): VirtualFile? {
        if (path == null) return null

        val nioPath = File(FileUtil.expandUserHome(path)).toPath()
        return VirtualFileManager.getInstance().findFileByNioPath(nioPath)
    }

    fun getCertificates(): Array<Certificate> {
        val trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
        trustManagerFactory.init(null as KeyStore?)

        return trustManagerFactory.trustManagers
            .filter { X509TrustManager::class.java.isInstance(it) }
            .flatMap { X509TrustManager::class.java.cast(it).acceptedIssuers.toList() }
            .map { Certificate(it) }
            .toTypedArray()
    }
}
