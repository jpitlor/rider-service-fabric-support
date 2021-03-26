package dev.pitlor.rider_service_fabric_support;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Optional;

public class ServiceFabricRunConfiguration extends RunConfigurationBase<RunProfileState> {
	final private String suggestedSfProjFolder;
	final private String[] publishProfileOptions;

	public String sfProjFolder;
	public String publishProfile;

	protected ServiceFabricRunConfiguration(Project project, ConfigurationFactory factory, String name) {
		super(project, factory, name);

		Optional<VirtualFile> maybeSfFolder = Arrays.stream(ProjectRootManager.getInstance(project).getContentRoots())
			.filter(d -> d.isDirectory() && Arrays.stream(d.getChildren()).anyMatch(f -> f.getName().endsWith(".sfproj")))
			.findFirst();

		if (maybeSfFolder.isEmpty()) {
			// There isn't a SF project in the open project
			suggestedSfProjFolder = "";
			publishProfileOptions = new String[] {};
			return;
		}

		VirtualFile sfFolder = maybeSfFolder.get();
		suggestedSfProjFolder = sfFolder.getName();

		VirtualFile publishProfiles = sfFolder.findChild("PublishProfiles");
		if (publishProfiles == null || !publishProfiles.isDirectory()) {
			// There is a SF project, but it is malformed
			publishProfileOptions = new String[] {};
			return;
		}

		publishProfileOptions = Arrays.stream(publishProfiles.getChildren())
			.map(VirtualFile::getName)
			.toArray(String[]::new);
	}

	@NotNull
	@Override
	public SettingsEditor<ServiceFabricRunConfiguration> getConfigurationEditor() {
		return new ServiceFabricSettingsEditor(suggestedSfProjFolder, publishProfileOptions);
	}

	@Override
	public void checkConfiguration() {

	}

	@Nullable
	@Override
	public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) {
		return null;
	}
}
