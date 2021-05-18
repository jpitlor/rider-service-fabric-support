package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.vfs.VirtualFile
import dev.pitlor.rider_service_fabric_support.utils.SFUtil.getSFFolders
import dev.pitlor.rider_service_fabric_support.utils.Utils.findIndex
import java.awt.Component
import javax.swing.DefaultComboBoxModel
import javax.swing.DefaultListCellRenderer
import javax.swing.JList
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

@FunctionalInterface
class TextFieldChangeListener(private val onChange: (DocumentEvent) -> Unit) : DocumentListener {
    override fun insertUpdate(e: DocumentEvent) {
        onChange(e)
    }

    override fun removeUpdate(e: DocumentEvent) {
        onChange(e)
    }

    override fun changedUpdate(e: DocumentEvent) {
        onChange(e)
    }
}

class PublishProfileComboBox(sfProjFolderTextField: SfProjFolderTextField, project: Project) : ComboBox<VirtualFile?>() {
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

    private class PublishProfileComboBoxRenderer : DefaultListCellRenderer() {
        override fun getListCellRendererComponent(
            list: JList<*>?,
            value: Any,
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