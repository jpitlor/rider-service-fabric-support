package dev.pitlor.rider_service_fabric_support;

import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ServiceFabricSettingsEditor extends SettingsEditor<ServiceFabricRunConfiguration> {
	private final TextFieldWithBrowseButton sfprojFolder;
	private final ComboBox<String> publishProfile;

	public ServiceFabricSettingsEditor(String suggestedSfProjFolder, String[] publishProfileOptions) {
		sfprojFolder = new TextFieldWithBrowseButton(new JTextField(suggestedSfProjFolder));
		publishProfile = new ComboBox<>(publishProfileOptions);
		publishProfile.setMinimumAndPreferredWidth(1000);
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
		return new FormBuilder()
			.setAlignLabelOnRight(false)
			.addLabeledComponent("Service Fabric project folder", sfprojFolder)
			.addLabeledComponent("Publish profile", publishProfile)
			.getPanel();
	}
}
