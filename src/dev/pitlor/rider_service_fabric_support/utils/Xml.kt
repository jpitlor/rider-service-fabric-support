package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.util.JDOMExternalizerUtil
import com.intellij.openapi.vfs.VirtualFile
import dev.pitlor.rider_service_fabric_support.run_configuration.ServiceFabricRunConfigurationSettings
import org.jdom.Element

object Xml {
    private const val SF_PROJ_FOLDER = "sf_proj_folder"
    private const val PUBLISH_PROFILE = "publish_profile"
    fun read(element: Element): ServiceFabricRunConfigurationSettings {
        return ServiceFabricRunConfigurationSettings.Builder()
            .withSfProjFolder(getField(element, SF_PROJ_FOLDER))
            .withPublishProfile(getField(element, PUBLISH_PROFILE))
            .build()
    }

    fun write(element: Element, settings: ServiceFabricRunConfigurationSettings) {
        setField(element, SF_PROJ_FOLDER, settings.sfProjFolder)
        setField(element, PUBLISH_PROFILE, settings.publishProfile)
    }

    private fun getField(element: Element, field: String): String? {
        return JDOMExternalizerUtil.readCustomField(element, field)
    }

    private fun setField(element: Element, field: String, value: VirtualFile?) {
        if (value == null) return
        JDOMExternalizerUtil.writeCustomField(element, field, value.toNioPath().toString())
    }
}