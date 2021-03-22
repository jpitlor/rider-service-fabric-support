package dev.pitlor.rider_service_fabric_support;

import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.VerticalFlowLayout;
import com.intellij.ui.ComboboxWithBrowseButton;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ServiceFabricSettingsEditor extends SettingsEditor<ServiceFabricRunConfiguration> {
	private JPanel formContainer;
	private LabeledComponent<ComboboxWithBrowseButton> sfprojFolder;
	private LabeledComponent<ComboBox<String>> publishProfile;

	@Override
	protected void resetEditorFrom(@NotNull ServiceFabricRunConfiguration runConfiguration) {
		sfprojFolder.getComponent().getComboBox().setSelectedItem(runConfiguration.sfProjFolder);
		publishProfile.getComponent().setItem(runConfiguration.publishProfile);
	}

	@Override
	protected void applyEditorTo(@NotNull ServiceFabricRunConfiguration runConfiguration) {
		runConfiguration.sfProjFolder = (String) sfprojFolder.getComponent().getComboBox().getSelectedItem();
		runConfiguration.publishProfile = publishProfile.getComponent().getItem();
	}

	@NotNull
	@Override
	protected JComponent createEditor() {
		return formContainer;
	}

	private void createUIComponents() {
		formContainer = new JPanel();
		formContainer.setLayout(new VerticalFlowLayout());

		sfprojFolder = new LabeledComponent<>();
		sfprojFolder.setText("Service Fabric project folder");
		sfprojFolder.setLabelLocation("West");
		sfprojFolder.setComponent(new ComboboxWithBrowseButton());
		formContainer.add(sfprojFolder);

		publishProfile = new LabeledComponent<>();
		publishProfile.setText("Publish profile");
		publishProfile.setLabelLocation("West");
		publishProfile.setComponent(new ComboBox<>());
		formContainer.add(publishProfile);
	}
}
