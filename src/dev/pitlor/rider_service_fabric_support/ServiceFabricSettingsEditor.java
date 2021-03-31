package dev.pitlor.rider_service_fabric_support;

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.TextFieldWithHistory;
import com.intellij.ui.TextFieldWithHistoryWithBrowseButton;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.ui.FormBuilder;
import com.intellij.util.ui.SwingHelper;
import com.intellij.webcore.ui.PathShortener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class ServiceFabricSettingsEditor extends SettingsEditor<ServiceFabricRunConfiguration> {
	private final TextFieldWithHistoryWithBrowseButton sfprojFolder;
	private final ComboBox<String> publishProfile;
	private final JPanel rootPanel;

	public ServiceFabricSettingsEditor(Project project) {
		sfprojFolder = makeSfProjFolderTextField(project);
		publishProfile = makePublishProfileComboBox();
		rootPanel = new FormBuilder()
			.setAlignLabelOnRight(false)
			.addLabeledComponent("Service Fabric project folder", sfprojFolder)
			.addLabeledComponent("Publish profile", publishProfile)
			.getPanel();
	}

	private TextFieldWithHistoryWithBrowseButton makeSfProjFolderTextField(Project project) {
		TextFieldWithHistoryWithBrowseButton result = new TextFieldWithHistoryWithBrowseButton();
		TextFieldWithHistory textFieldWithHistory = result.getChildComponent();
		List<VirtualFile> sfFolders = SFUtil.getSFFolders(project);

		textFieldWithHistory.setHistorySize(-1);
		textFieldWithHistory.setMinimumAndPreferredWidth(0);
		textFieldWithHistory.setHistory(Collections.singletonList(""));
		PathShortener.enablePathShortening(textFieldWithHistory.getTextEditor(), null);
		SwingHelper.addHistoryOnExpansion(textFieldWithHistory, () -> {
			textFieldWithHistory.setHistory(Collections.emptyList());
			List<String> newFilePaths = ContainerUtil.map(sfFolders, folder -> {
				String path = FileUtil.toSystemDependentName(folder.getPath());
				return FileUtil.getLocationRelativeToUserHome(path, false);
			});
			Collections.sort(newFilePaths);
			return newFilePaths;
		});

		SwingHelper.installFileCompletionAndBrowseDialog(
			project,
			sfprojFolder,
			"Service Fabric Project Folder",
			FileChooserDescriptorFactory.createSingleFolderDescriptor()
		);

		return result;
	}

	private ComboBox<String> makePublishProfileComboBox() {
		ComboBox<String> result = new ComboBox<>();
		result.setMinimumAndPreferredWidth(1000);

		return result;
	}

	@Override
	protected void resetEditorFrom(@NotNull ServiceFabricRunConfiguration runConfiguration) {
		sfprojFolder.setText(runConfiguration.sfProjFolder);
		publishProfile.setItem(runConfiguration.publishProfile);
	}

	@Override
	protected void applyEditorTo(@NotNull ServiceFabricRunConfiguration runConfiguration) {
		runConfiguration.sfProjFolder = sfprojFolder.getText();
		runConfiguration.publishProfile = publishProfile.getItem();
	}

	@NotNull
	@Override
	protected JComponent createEditor() {
		return rootPanel;
	}
}
