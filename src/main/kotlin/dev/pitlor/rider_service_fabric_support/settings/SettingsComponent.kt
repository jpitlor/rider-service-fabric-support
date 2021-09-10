package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.ui.table.JBTable
import com.intellij.util.ui.FormBuilder
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfileTableModel
import javax.swing.JPanel

class SettingsComponent {
    private val tableModel = ClusterConnectionProfileTableModel()
    val clusterConnectionProfiles get() = tableModel.getConnectionProfiles()

    private val table = JBTable(tableModel)
    val container: JPanel = FormBuilder.createFormBuilder()
        .addLabeledComponent(Bundle.string("settings.table.label"), table, true)
        .addComponentFillVertically(JPanel(), 0)
        .panel
    val preferredFocusedComponent get() = container

}