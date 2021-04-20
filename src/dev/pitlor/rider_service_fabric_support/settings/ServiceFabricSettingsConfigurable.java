package dev.pitlor.rider_service_fabric_support.settings;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ServiceFabricSettingsConfigurable implements Configurable {
	@Override
	public @NlsContexts.ConfigurableName String getDisplayName() {
		return null;
	}

	@Override
	public @Nullable JComponent createComponent() {
		return null;
	}

	@Override
	public boolean isModified() {
		return false;
	}

	@Override
	public void apply() throws ConfigurationException {

	}
}
