package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.vfs.VirtualFile
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.TextFieldChangeListener
import dev.pitlor.rider_service_fabric_support.swing_components.helpers.PublishProfileComboBoxRenderer
import dev.pitlor.rider_service_fabric_support.utils.SFUtil
import dev.pitlor.rider_service_fabric_support.utils.SFUtil.getSFFolders
import dev.pitlor.rider_service_fabric_support.utils.Utils.findIndex
import javax.swing.DefaultComboBoxModel
import javax.swing.event.DocumentEvent

class PublishProfileComboBox(sfProjFolderTextField: SfProjFolderTextField, project: Project) : ComboBox<VirtualFile>() {
    private val sfProjects: List<VirtualFile> = project.getSFFolders()

    private fun onServiceFabricProjectSelected(event: DocumentEvent) {
        try {
            val textBox = event.document
            val selectedProject = textBox.getText(0, textBox.length)
            val selectedProjectFile = sfProjects
                .toList()
                .first { FileUtil.getLocationRelativeToUserHome(it.path, false) == selectedProject }
            val publishProfiles = SFUtil.getPublishProfiles(selectedProjectFile)

            this.model = DefaultComboBoxModel(publishProfiles)
            this.selectedIndex = publishProfiles.findIndex { it.name.contains("Local") }
        } catch (e: Exception) {
            this.model = DefaultComboBoxModel(arrayOf())
        }
    }

    init {
        setMinimumAndPreferredWidth(1000)
        setRenderer(PublishProfileComboBoxRenderer())
        sfProjFolderTextField
            .childComponent
            .textEditor
            .document
            .addDocumentListener(TextFieldChangeListener(this::onServiceFabricProjectSelected))
    }
}