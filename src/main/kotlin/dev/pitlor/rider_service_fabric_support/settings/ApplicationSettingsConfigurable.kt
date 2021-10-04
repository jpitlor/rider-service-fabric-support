package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.openapi.options.Configurable
import dev.pitlor.rider_service_fabric_support.Bundle
import javax.swing.JComponent

class ApplicationSettingsConfigurable : Configurable {
    private var settingsComponent = SettingsComponent()

    override fun createComponent(): JComponent {
        settingsComponent = SettingsComponent()
        return settingsComponent.container
    }

    override fun getPreferredFocusedComponent(): JComponent {
        return settingsComponent.container
    }

    override fun isModified(): Boolean {
        val settings = SettingsState.getInstance()
        val dirtyProfiles = settingsComponent.getClusterConnectionProfiles()
        return settings.connectionProfiles == dirtyProfiles
    }

    override fun apply() {
        val settings = SettingsState.getInstance()
        settings.connectionProfiles = settingsComponent.getClusterConnectionProfiles()
    }

    override fun reset() {
        val settings = SettingsState.getInstance()
        settingsComponent.setClusterConnectionProfiles(settings.connectionProfiles)
    }

    override fun getDisplayName(): String {
        return Bundle.string("settings.display_name")
    }
}