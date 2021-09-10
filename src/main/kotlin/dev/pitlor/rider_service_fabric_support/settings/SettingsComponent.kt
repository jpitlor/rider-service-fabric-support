package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.util.ui.FormBuilder
import javax.swing.JPanel

class SettingsComponent {
    val container: JPanel = FormBuilder.createFormBuilder()
        .addComponentFillVertically(JPanel(), 0)
        .panel
    val preferredFocusedComponent get() = container

}