package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.openapi.vfs.VirtualFile
import dev.pitlor.rider_service_fabric_support.utils.Utils

class RunConfigurationSettings {
    var sfProjFolder: VirtualFile? = null
    var publishProfile: VirtualFile? = null

    class Builder {
        var sfProjFolder: VirtualFile? = null
        var publishProfile: VirtualFile? = null
        fun withSfProjFolder(sfProjFolder: String?): Builder {
            if (sfProjFolder != null) this.sfProjFolder = Utils.findFile(sfProjFolder)
            return this
        }

        fun withPublishProfile(publishProfile: String?): Builder {
            if (publishProfile != null) this.publishProfile = Utils.findFile(publishProfile)
            return this
        }

        fun build(): RunConfigurationSettings {
            val settings = RunConfigurationSettings()
            settings.publishProfile = publishProfile
            settings.sfProjFolder = sfProjFolder
            return settings
        }
    }
}