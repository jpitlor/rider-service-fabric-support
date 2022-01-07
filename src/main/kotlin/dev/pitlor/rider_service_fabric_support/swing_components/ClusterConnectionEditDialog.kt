package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.JBIntSpinner
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import javax.swing.JComponent

class ClusterConnectionEditDialog() : DialogWrapper(null, false) {
    private val nicknameTextField = JBTextField()
    private val hostTextField = JBTextField()
    private val portTextField = JBIntSpinner(19000, 0, 25565)
    private val serverCertThumbprintTextField = JBTextField()
    private val clientCertThumbprintTextField = JBTextField()

    init {
        title = "Edit Cluster Connection"
        init()
    }

    override fun createCenterPanel(): JComponent {
        return FormBuilder.createFormBuilder()
            .addLabeledComponent(Bundle.string("settings.connections.edit.nickname.label"), nicknameTextField)
            .addLabeledComponent(Bundle.string("settings.connections.edit.host.label"), hostTextField)
            .addLabeledComponent(Bundle.string("settings.connections.edit.port.label"), portTextField)
            .addLabeledComponent(
                Bundle.string("settings.connections.edit.serverCertThumbprint.label"),
                serverCertThumbprintTextField
            )
            .addLabeledComponent(
                Bundle.string("settings.connections.edit.clientCertThumbprint.label"),
                clientCertThumbprintTextField
            )
            .panel
    }

    fun setClusterConnection(clusterConnection: ClusterProfile) {
        nicknameTextField.text = clusterConnection.nickname
        hostTextField.text = clusterConnection.host
        portTextField.number = clusterConnection.port
        serverCertThumbprintTextField.text = clusterConnection.serverCertThumbprint
        clientCertThumbprintTextField.text = clusterConnection.clientCertThumbprint
    }

    fun getClusterConnection(): ClusterProfile {
        return ClusterProfile(
            nicknameTextField.text,
            hostTextField.text,
            portTextField.number,
            serverCertThumbprintTextField.text,
            clientCertThumbprintTextField.text,
        )
    }
}