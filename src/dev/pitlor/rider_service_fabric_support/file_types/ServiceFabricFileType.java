package dev.pitlor.rider_service_fabric_support.file_types;

import com.intellij.lang.xml.XMLLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import dev.pitlor.rider_service_fabric_support.Bundle;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ServiceFabricFileType extends LanguageFileType {
	protected ServiceFabricFileType() {
		super(XMLLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return Bundle.string("file_type.name");
	}

	@NotNull
	@Override
	public String getDescription() {
		return Bundle.string("file_type.description");
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return Bundle.string("file_type.extension");
	}

	@Override
	public Icon getIcon() {
		return PluginIcons.ServiceFabricLogo;
	}
}
