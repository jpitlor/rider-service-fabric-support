package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.ui.TextFieldWithHistory;
import com.intellij.ui.TextFieldWithHistoryWithBrowseButton;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.ui.FormBuilder;
import com.intellij.util.ui.SwingHelper;
import com.intellij.webcore.ui.PathShortener;
import dev.pitlor.rider_service_fabric_support.Bundle;
import dev.pitlor.rider_service_fabric_support.run_configuration.ServiceFabricRunConfiguration;
import dev.pitlor.rider_service_fabric_support.utils.PublishProfileComboBox;
import dev.pitlor.rider_service_fabric_support.utils.SFUtil;
import dev.pitlor.rider_service_fabric_support.utils.SfProjFolderTextField;
import dev.pitlor.rider_service_fabric_support.utils.Utils;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class ServiceFabricRunConfigurationEditor extends SettingsEditor<ServiceFabricRunConfiguration> {
	private final SfProjFolderTextField sfprojFolder;
	private final PublishProfileComboBox publishProfile;
	private final JPanel rootPanel;

	public ServiceFabricRunConfigurationEditor(Project project) {
		sfprojFolder = new SfProjFolderTextField(project);
		publishProfile = new PublishProfileComboBox(sfprojFolder, project);
		rootPanel = new FormBuilder()
			.setAlignLabelOnRight(false)
			.addLabeledComponent(Bundle.string("run_config.sf_project_folder.label"), sfprojFolder)
			.addLabeledComponent(Bundle.string("run_config.publish_profile.label"), publishProfile)
			.getPanel();
	}

	@Override
	protected void resetEditorFrom(@NotNull ServiceFabricRunConfiguration runConfiguration) {
		sfprojFolder.setText(Utils.getTildePath(runConfiguration.settings.sfProjFolder));
		publishProfile.setItem(runConfiguration.settings.publishProfile);
	}

	@Override
	protected void applyEditorTo(@NotNull ServiceFabricRunConfiguration runConfiguration) {
		runConfiguration.settings.sfProjFolder = Utils.getFile(sfprojFolder.getText());
		runConfiguration.settings.publishProfile = publishProfile.getItem();
	}

	@NotNull
	@Override
	protected JComponent createEditor() {
		return rootPanel;
	}
}
