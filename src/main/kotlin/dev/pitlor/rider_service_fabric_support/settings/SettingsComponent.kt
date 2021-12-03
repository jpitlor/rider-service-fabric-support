package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.ui.ToolbarDecorator
import com.intellij.util.ui.FormBuilder
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfile
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterConnectionListTable
import javax.swing.JPanel

class SettingsComponent {
    private val listTable = ClusterConnectionListTable()
    val container: JPanel = FormBuilder.createFormBuilder()
        .addLabeledComponentFillVertically(
            Bundle.string("settings.table.label"),
            ToolbarDecorator
                .createDecorator(listTable.component)
                .setAddAction(listTable::addRow)
                .setEditAction(listTable::editRow)
                .setRemoveAction(listTable::deleteRow)
                .disableUpDownActions()
                .createPanel()
        )
        .panel

    fun getClusterConnectionProfiles(): List<ClusterConnectionProfile> {
        return listTable.getClusterConnectionProfiles()
    }

    fun setClusterConnectionProfiles(profiles: List<ClusterConnectionProfile>) {
        listTable.setClusterConnectionProfiles(profiles)
    }
}