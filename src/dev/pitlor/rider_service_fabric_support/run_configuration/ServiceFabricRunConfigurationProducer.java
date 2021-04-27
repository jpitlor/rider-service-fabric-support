package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.execution.actions.RunConfigurationProducer;
import com.intellij.openapi.util.Ref;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import dev.pitlor.rider_service_fabric_support.Bundle;
import dev.pitlor.rider_service_fabric_support.utils.SFUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ServiceFabricRunConfigurationProducer extends RunConfigurationProducer<ServiceFabricRunConfiguration> {
	protected ServiceFabricRunConfigurationProducer() {
		super(false);
	}

	@Override
	protected boolean setupConfigurationFromContext(@NotNull ServiceFabricRunConfiguration runConfiguration, @NotNull ConfigurationContext configurationContext, @NotNull Ref<PsiElement> ref) {
		if (ref.isNull()
			|| !ref.get().getContainingFile().getFileType().getName().equals(Bundle.string("file_type.name"))
			|| ref.get().getContainingFile().getParent() == null) {
			return false;
		}

		VirtualFile folder = ref.get().getContainingFile().getParent().getVirtualFile();
		runConfiguration.sfProjFolder = folder.getPath();

		String[] publishProfiles = SFUtil.getPublishProfiles(folder);
		runConfiguration.publishProfile = Arrays.stream(publishProfiles)
			.filter(s -> s.contains("Local"))
			.findFirst()
			.orElse(publishProfiles[0]);
		return true;
	}

	@Override
	public boolean isConfigurationFromContext(@NotNull ServiceFabricRunConfiguration runConfiguration, @NotNull ConfigurationContext configurationContext) {
		return false;
	}
}
