package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.util.ui.ColumnInfo

class NamedColumn<ParentObject, Type>(name: String, val getter: ParentObject.() -> Type)
    : ColumnInfo<ParentObject, Type>(name)
{
    override fun valueOf(item: ParentObject): Type {
        return item.getter()
    }
}