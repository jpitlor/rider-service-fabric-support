package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import com.intellij.openapi.vfs.VirtualFile
import java.awt.Component
import javax.swing.DefaultListCellRenderer
import javax.swing.JList

class PublishProfileComboBoxRenderer : DefaultListCellRenderer() {
    override fun getListCellRendererComponent(
        list: JList<*>?,
        value: Any?,
        index: Int,
        isSelected: Boolean,
        cellHasFocus: Boolean
    ): Component {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus)
        if (value is VirtualFile) {
            text = value.nameWithoutExtension
        }
        return this
    }
}