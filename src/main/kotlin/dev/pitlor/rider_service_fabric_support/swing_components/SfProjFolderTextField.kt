package dev.pitlor.rider_service_fabric_support.swing_components

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.project.Project
import com.intellij.ui.TextFieldWithHistoryWithBrowseButton
import com.intellij.util.ui.SwingHelper
import com.intellij.webcore.ui.PathShortener
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.utils.SFUtil.getSFFolders
import dev.pitlor.rider_service_fabric_support.utils.Utils.getTildePath

class SfProjFolderTextField(project: Project) : TextFieldWithHistoryWithBrowseButton() {
    private val sfProjFolders = project
        .getSFFolders()
        .map { it.getTildePath() }
        .sorted()

    init {
        childComponent.setHistorySize(-1)
        childComponent.setMinimumAndPreferredWidth(0)
        childComponent.history = listOf("")
        PathShortener.enablePathShortening(childComponent.textEditor, null)
        SwingHelper.addHistoryOnExpansion(childComponent) {
            childComponent.history = emptyList()
            return@addHistoryOnExpansion sfProjFolders
        }
        SwingHelper.installFileCompletionAndBrowseDialog(
            project,
            this,
            Bundle.string("run_config.sf_project_folder.dialog_title"),
            FileChooserDescriptorFactory.createSingleFolderDescriptor()
        )
    }
}