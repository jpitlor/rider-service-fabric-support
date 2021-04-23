package dev.pitlor.rider_service_fabric_support.utils;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.vfs.VirtualFile;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.text.Document;
import java.util.List;

public class PublishProfileComboBox extends ComboBox<String> {
	private final List<VirtualFile> sfProjects;

	public PublishProfileComboBox(SfProjFolderTextField sfProjFolderTextField, Project project) {
		super();
		sfProjects = SFUtil.getSFFolders(project);

		setMinimumAndPreferredWidth(1000);

		sfProjFolderTextField
			.getChildComponent()
			.getTextEditor()
			.getDocument()
			.addDocumentListener((TextFieldChangeListener) this::onServiceFabricProjectSelected);
	}

	private void onServiceFabricProjectSelected(DocumentEvent event) {
		try {
			Document textBox = event.getDocument();
			String selectedProject = textBox.getText(0, textBox.getLength());
			VirtualFile selectedProjectFile = sfProjects
				.stream()
				.filter((VirtualFile p) -> p.getName().equals(selectedProject))
				.findFirst()
				.orElseThrow();
			this.setModel(new DefaultComboBoxModel<>(SFUtil.getPublishProfiles(selectedProjectFile)));
		} catch (Exception e) {
			this.setModel(new DefaultComboBoxModel<>(new String[] {}));
		}
	}
}
