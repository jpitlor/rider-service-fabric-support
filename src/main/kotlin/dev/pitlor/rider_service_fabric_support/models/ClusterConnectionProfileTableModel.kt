package dev.pitlor.rider_service_fabric_support.models

import javax.swing.event.TableModelEvent
import javax.swing.event.TableModelListener
import javax.swing.table.TableModel

data class Column<T>(val name: String, val clazz: Class<T>)
class ClusterConnectionProfileTableModel : TableModel {
    private val listeners = arrayListOf<TableModelListener>()
    private val data = arrayListOf<ArrayList<Any>>(
        arrayListOf(),
        arrayListOf(),
        arrayListOf(),
        arrayListOf(),
        arrayListOf()
    )
    private val columns = listOf(
        Column("Nickname", String::class.java),
        Column("Host", String::class.java),
        Column("Port", Int::class.java),
        Column("Server Certificate Thumbprint", String::class.java),
        Column("Client Certificate Thumbprint", String::class.java),
    )

    fun getConnectionProfiles(): List<ClusterConnectionProfile> {

    }

    override fun getRowCount(): Int {
        return data.size
    }

    override fun getColumnCount(): Int {
        return columns.size
    }

    override fun getColumnName(columnIndex: Int): String {
        return columns[columnIndex].name
    }

    override fun getColumnClass(columnIndex: Int): Class<*> {
        return columns[columnIndex].clazz
    }

    override fun isCellEditable(rowIndex: Int, columnIndex: Int): Boolean {
        return true
    }

    override fun getValueAt(rowIndex: Int, columnIndex: Int): Any {
        return data[rowIndex][columnIndex]
    }

    override fun setValueAt(value: Any?, rowIndex: Int, columnIndex: Int) {
        if (value == null) return
        data[rowIndex][columnIndex] = value
        listeners.forEach { it.tableChanged(TableModelEvent(this, rowIndex, rowIndex, columnIndex)) }
    }

    override fun addTableModelListener(listener: TableModelListener?) {
        if (listener == null) return
        listeners += listener
    }

    override fun removeTableModelListener(listener: TableModelListener?) {
        if (listener == null) return
        listeners -= listener
    }
}
