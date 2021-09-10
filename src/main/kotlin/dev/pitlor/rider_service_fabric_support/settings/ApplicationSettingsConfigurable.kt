package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.openapi.options.Configurable
import dev.pitlor.rider_service_fabric_support.Bundle
import javax.swing.JComponent

class ApplicationSettingsConfigurable : Configurable {
    lateinit var settingsComponent: SettingsComponent

    override fun createComponent(): JComponent {
        settingsComponent = SettingsComponent()
        return settingsComponent.container
    }

    override fun getPreferredFocusedComponent(): JComponent {
        return settingsComponent.preferredFocusedComponent
    }

    override fun isModified(): Boolean {
        val state = SettingsState.getInstance()
        TODO("Not yet implemented")
    }

    override fun apply() {
        val state = SettingsState.getInstance()
        TODO("Not yet implemented")
    }

    override fun reset() {
        val state = SettingsState.getInstance()
        TODO("Not yet implemented")
    }

    override fun getDisplayName(): String {
        return Bundle.string("settings.display_name")
    }
}