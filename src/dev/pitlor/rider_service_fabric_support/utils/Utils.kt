package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import java.io.File
import java.util.*

object Utils {
    fun <T> findIndex(list: Array<T>, finder: T.() -> Boolean): Int {
        for (i in list.indices) {
            if (finder(list[i])) {
                return i
            }
        }
        return 0
    }

    fun getTildePath(file: VirtualFile?): String {
        if (file == null) return ""
        val path = FileUtil.toSystemDependentName(file.path)
        return FileUtil.getLocationRelativeToUserHome(path, false)
    }

    fun getFile(path: String?): VirtualFile? {
        val nioPath = File(FileUtil.expandUserHome(path!!)).toPath()
        return VirtualFileManager.getInstance().findFileByNioPath(nioPath)
    }

    fun getFile(parent: VirtualFile?, name: String?): VirtualFile? {
        return Objects.requireNonNull(parent!!.findChild(name!!))
    }
}