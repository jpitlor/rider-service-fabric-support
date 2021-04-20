package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.execution.actions.RunConfigurationProducer;
import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class ServiceFabricRunConfigurationProducer extends RunConfigurationProducer<ServiceFabricRunConfiguration> {
	protected ServiceFabricRunConfigurationProducer() {
		super(false);
	}

	@Override
	protected boolean setupConfigurationFromContext(@NotNull ServiceFabricRunConfiguration serviceFabricRunConfiguration, @NotNull ConfigurationContext configurationContext, @NotNull Ref<PsiElement> ref) {
		return false;
	}

	@Override
	public boolean isConfigurationFromContext(@NotNull ServiceFabricRunConfiguration serviceFabricRunConfiguration, @NotNull ConfigurationContext configurationContext) {
		return false;
	}
}
