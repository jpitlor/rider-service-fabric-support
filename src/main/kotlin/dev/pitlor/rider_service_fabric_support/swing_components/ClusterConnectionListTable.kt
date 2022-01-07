package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.ui.AnActionButton
import com.intellij.ui.table.TableView
import com.intellij.util.ui.ListTableModel
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.NamedColumn

class ClusterConnectionListTable(
    tableModel: ListTableModel<ClusterProfile> = ListTableModel<ClusterProfile>(
        NamedColumn<ClusterProfile, String>("Nickname") { nickname },
        NamedColumn<ClusterProfile, String>("Host") { host },
    ),
) : TableView<ClusterProfile>(tableModel) {
    fun getClusterConnectionProfiles(): List<ClusterProfile> {
        return listTableModel.items
    }

    fun setClusterConnectionProfiles(profiles: List<ClusterProfile>) {
        listTableModel.items = profiles
    }

    fun addRow(@Suppress("UNUSED_PARAMETER") action: AnActionButton) {
        val dialog = ClusterConnectionEditDialog()
        if (dialog.showAndGet()) {
            val items = ArrayList(listTableModel.items)
            items.add(dialog.getClusterConnection())
            listTableModel.items = items
        }
    }

    fun editRow(@Suppress("UNUSED_PARAMETER") action: AnActionButton) {
        val dialog = ClusterConnectionEditDialog()
        val selectedIndex = component.selectedRow
        dialog.setClusterConnection(listTableModel.getItem(selectedIndex))
        if (dialog.showAndGet()) {
            val items = ArrayList(listTableModel.items)
            items[selectedIndex] = dialog.getClusterConnection()
            listTableModel.items = items
        }
    }

    fun deleteRow(@Suppress("UNUSED_PARAMETER") action: AnActionButton) {
        val selectedIndex = component.selectedRow
        if (selectedIndex != -1) {
            val items = ArrayList(listTableModel.items)
            items.removeAt(selectedIndex)
            listTableModel.items = items
        }
    }
}