package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import com.intellij.util.ui.ColumnInfo

class NamedColumn<Parent, Child>(name: String, val getter: Parent.() -> Child) : ColumnInfo<Parent, Child>(name) {
    override fun valueOf(item: Parent): Child {
        return item.getter()
    }
}