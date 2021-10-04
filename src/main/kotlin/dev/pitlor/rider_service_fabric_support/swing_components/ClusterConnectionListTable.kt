package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.ui.AnActionButton
import com.intellij.ui.table.TableView
import com.intellij.util.ui.ListTableModel
import com.intellij.util.ui.table.*
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfile
import dev.pitlor.rider_service_fabric_support.utils.NamedColumn
import javax.swing.event.TableModelEvent

class ClusterConnectionListTable(
    tableModel: ListTableModel<ClusterConnectionProfile> = ListTableModel<ClusterConnectionProfile>(
        NamedColumn<ClusterConnectionProfile, String>("Nickname") { nickname },
        NamedColumn<ClusterConnectionProfile, String>("Host") { host },
    ),
) : TableView<ClusterConnectionProfile>(tableModel) {
    fun getClusterConnectionProfiles(): List<ClusterConnectionProfile> {
        return listTableModel.items
    }

    fun setClusterConnectionProfiles(profiles: List<ClusterConnectionProfile>) {
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