package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import com.intellij.ide.util.treeView.smartTree.*
import dev.pitlor.rider_service_fabric_support.models.Cluster

class FabricTreeModel(private val cluster: Cluster) : TreeModel {
    override fun getRoot(): TreeElement {
        TODO("Not yet implemented")
    }

    override fun getGroupers(): Array<Grouper> {
        TODO("Not yet implemented")
    }

    override fun getSorters(): Array<Sorter> {
        TODO("Not yet implemented")
    }

    override fun getFilters(): Array<Filter> {
        TODO("Not yet implemented")
    }
}