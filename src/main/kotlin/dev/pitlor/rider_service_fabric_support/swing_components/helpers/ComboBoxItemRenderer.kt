package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import com.intellij.ui.components.JBLabel
import java.awt.Component
import javax.swing.JList
import javax.swing.ListCellRenderer

class ComboBoxItemRenderer<T>(private val getComponent: (T) -> Component) : ListCellRenderer<T?> {
    override fun getListCellRendererComponent(
        list: JList<out T>?,
        value: T?,
        index: Int,
        isSelected: Boolean,
        cellHasFocus: Boolean
    ): Component {
        return if (value == null) JBLabel("") else getComponent(value)
    }

    companion object {
        fun <T> basic(getName: (T) -> String): ComboBoxItemRenderer<T> = ComboBoxItemRenderer { x: T -> JBLabel(getName(x)) }
    }
}
