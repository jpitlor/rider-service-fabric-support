package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.configurations.RunConfigurationOptions

class SFRunConfigurationOptions : RunConfigurationOptions() {
    private val sfProjFolderPath = string("").provideDelegate(this, "sfProjFolder")
    private val publishProfilePath = string("").provideDelegate(this, "publishProfile")

    fun getSfProjFolder(): String {
        return sfProjFolderPath.getValue(this) ?: ""
    }

    fun setSfProjFolder(folder: String) {
        sfProjFolderPath.setValue(this, folder)
    }

    fun getPublishProfile(): String {
        return publishProfilePath.getValue(this) ?: ""
    }

    fun setPublishProfile(file: String) {
        publishProfilePath.setValue(this, file)
    }
}