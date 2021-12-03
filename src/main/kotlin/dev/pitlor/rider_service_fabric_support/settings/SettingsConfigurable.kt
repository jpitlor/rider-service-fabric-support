package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.openapi.options.Configurable
import dev.pitlor.rider_service_fabric_support.Bundle
import javax.swing.JComponent

class SettingsConfigurable : Configurable {
    private var settingsComponent = SettingsComponent()

    override fun createComponent(): JComponent {
        settingsComponent = SettingsComponent()
        return settingsComponent.container
    }

    override fun getPreferredFocusedComponent(): JComponent {
        return settingsComponent.container
    }

    override fun isModified(): Boolean {
        val settings = SettingsState.getInstance().state
        val dirtyProfiles = settingsComponent.getClusterConnectionProfiles()
        return settings.connectionProfiles != dirtyProfiles
    }

    override fun apply() {
        SettingsState.getInstance().state.apply {
            connectionProfiles = settingsComponent.getClusterConnectionProfiles()
        }
//        ClusterManagerToolWindowFactory.refreshTabsList()
    }

    override fun reset() {
        SettingsState.getInstance().state.also {
            settingsComponent.setClusterConnectionProfiles(it.connectionProfiles)
        }
    }

    override fun getDisplayName(): String {
        return Bundle.string("settings.display_name")
    }
}