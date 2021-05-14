package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.project.Project
import com.intellij.ui.TextFieldWithHistoryWithBrowseButton
import com.intellij.util.containers.ContainerUtil
import com.intellij.util.ui.SwingHelper
import com.intellij.webcore.ui.PathShortener
import dev.pitlor.rider_service_fabric_support.Bundle

class SfProjFolderTextField(project: Project) : TextFieldWithHistoryWithBrowseButton() {
    init {
        childComponent.setHistorySize(-1)
        childComponent.setMinimumAndPreferredWidth(0)
        childComponent.history = listOf("")
        PathShortener.enablePathShortening(childComponent.textEditor, null)
        SwingHelper.addHistoryOnExpansion(childComponent) {
            childComponent.history = emptyList()
            val newFilePaths = ContainerUtil.map(SFUtil.getSFFolders(project), Utils::getTildePath)
            newFilePaths.sort()
            return@addHistoryOnExpansion newFilePaths
        }
        SwingHelper.installFileCompletionAndBrowseDialog(
            project,
            this,
            Bundle.string("run_config.sf_project_folder.dialog_title"),
            FileChooserDescriptorFactory.createSingleFolderDescriptor()
        )
    }
}