package dev.pitlor.rider_service_fabric_support.file_types

import com.intellij.lang.xml.XMLLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import dev.pitlor.rider_service_fabric_support.Bundle
import icons.PluginIcons
import javax.swing.Icon

class ServiceFabricFileType : LanguageFileType(XMLLanguage.INSTANCE) {
    override fun getName(): String {
        return Bundle.string("file_type.name")
    }

    override fun getDescription(): String {
        return Bundle.string("file_type.description")
    }

    override fun getDefaultExtension(): String {
        return Bundle.string("file_type.extension")
    }

    override fun getIcon(): Icon {
        return PluginIcons.ServiceFabricLogo
    }
}