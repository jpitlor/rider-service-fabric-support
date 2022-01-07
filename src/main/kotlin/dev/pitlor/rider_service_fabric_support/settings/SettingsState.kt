package dev.pitlor.rider_service_fabric_support.settings

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.annotations.OptionTag
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import dev.pitlor.rider_service_fabric_support.serialization.ClusterProfileSerializationConverter

@State(
    name = "dev.pitlor.rider_service_fabric_support.SettingsState",
    storages = [Storage("RiderServiceFabricSupport.xml")]
)
class SettingsState : PersistentStateComponent<SettingsState.Companion.StateModel> {
    private var state = StateModel()

    override fun getState(): StateModel {
        return state
    }

    override fun loadState(state: StateModel) {
        this.state = state
    }

    companion object {
        data class StateModel(
            @OptionTag(converter = ClusterProfileSerializationConverter::class)
            var connectionProfiles: List<ClusterProfile> = listOf()
        )

        fun getInstance(): SettingsState {
            return ApplicationManager.getApplication().getService(SettingsState::class.java)
        }
    }
}