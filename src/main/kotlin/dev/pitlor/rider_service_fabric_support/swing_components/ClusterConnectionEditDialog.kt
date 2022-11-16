package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.JBIntSpinner
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.ComboBoxItemRenderer
import dev.pitlor.rider_service_fabric_support.utils.Certificate
import dev.pitlor.rider_service_fabric_support.utils.Utils
import javax.swing.JComponent

class ClusterConnectionEditDialog : DialogWrapper(null, false) {
    private val certificates = Utils.getCertificates()
    private val cbRenderer = ComboBoxItemRenderer.basic { c: Certificate -> c.name }

    private val nicknameTextField = JBTextField()
    private val hostTextField = JBTextField()
    private val portTextField = JBIntSpinner(19000, 0, 25565)
    private val serverCertificateComboBox = ComboBox(certificates).also { it.renderer = cbRenderer }
    private val clientCertificateComboBox = ComboBox(certificates).also { it.renderer = cbRenderer }

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
                serverCertificateComboBox
            )
            .addLabeledComponent(
                Bundle.string("settings.connections.edit.clientCertThumbprint.label"),
                clientCertificateComboBox
            )
            .panel
    }

    fun setClusterConnection(clusterConnection: ClusterProfile) {
        nicknameTextField.text = clusterConnection.nickname
        hostTextField.text = clusterConnection.host
        portTextField.number = clusterConnection.port
        serverCertificateComboBox.selectedItem = certificates.first { it.thumbprint == clusterConnection.serverCertificateThumbprint }
        clientCertificateComboBox.selectedItem = certificates.first { it.thumbprint == clusterConnection.clientCertificateThumbprint }
    }

    fun getClusterConnection(): ClusterProfile {
        return ClusterProfile(
            nicknameTextField.text,
            hostTextField.text,
            portTextField.number,
            (serverCertificateComboBox.selectedItem as Certificate).thumbprint,
            (clientCertificateComboBox.selectedItem as Certificate).thumbprint
        )
    }
}
