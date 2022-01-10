package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.util.ui.FormBuilder
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.swing_components.SfProjFolderTextField
import dev.pitlor.rider_service_fabric_support.utils.Utils
import dev.pitlor.rider_service_fabric_support.utils.Utils.getTildePath
import javax.swing.JComponent
import javax.swing.JPanel

class RunConfigurationEditor(project: Project) : SettingsEditor<RunConfiguration>() {
    private val sfprojFolder: SfProjFolderTextField = SfProjFolderTextField(project)
//    private val publishProfile: PublishProfileComboBox = PublishProfileComboBox(sfprojFolder, project)
    private val rootPanel: JPanel = FormBuilder()
        .setAlignLabelOnRight(false)
        .addLabeledComponent(Bundle.string("run_config.sf_project_folder.label"), sfprojFolder)
//        .addLabeledComponent(Bundle.string("run_config.publish_profile.label"), publishProfile)
        .panel

    override fun resetEditorFrom(runConfiguration: RunConfiguration) {
        sfprojFolder.text = runConfiguration.settings.sfProjFolder.getTildePath()
//        publishProfile.item = runConfiguration.settings.publishProfile
    }

    override fun applyEditorTo(runConfiguration: RunConfiguration) {
        runConfiguration.settings.sfProjFolder = Utils.findFile(sfprojFolder.text)
//        runConfiguration.settings.publishProfile = publishProfile.item
    }

    override fun createEditor(): JComponent {
        return rootPanel
    }

}