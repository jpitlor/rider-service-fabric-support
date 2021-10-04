package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil
import com.intellij.util.xmlb.annotations.OptionTag
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfile
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfileSerializationConverter

@State(
    name = "dev.pitlor.rider_service_fabric_support.SettingsState",
    storages = [Storage("RiderServiceFabricSupport.xml")]
)
class SettingsState : PersistentStateComponent<SettingsState> {
    @OptionTag(converter = ClusterConnectionProfileSerializationConverter::class)
    var connectionProfiles = listOf<ClusterConnectionProfile>()

    override fun getState(): SettingsState {
        return this
    }

    override fun loadState(state: SettingsState) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object {
        fun getInstance(): SettingsState {
            return ServiceManager.getService(SettingsState::class.java)
        }
    }
}