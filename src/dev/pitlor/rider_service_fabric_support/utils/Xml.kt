package dev.pitlor.rider_service_fabric_support.utils;

import com.intellij.openapi.util.JDOMExternalizerUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import dev.pitlor.rider_service_fabric_support.run_configuration.ServiceFabricRunConfigurationSettings;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

public class Xml {
	private static final String SF_PROJ_FOLDER = "sf_proj_folder";
	private static final String PUBLISH_PROFILE = "publish_profile";

	public static ServiceFabricRunConfigurationSettings read(@NotNull Element element) {
		return new ServiceFabricRunConfigurationSettings.Builder()
			.withSfProjFolder(getField(element, SF_PROJ_FOLDER))
			.withPublishProfile(getField(element, PUBLISH_PROFILE))
			.build();
	}

	public static void write(@NotNull Element element, @NotNull ServiceFabricRunConfigurationSettings settings) {
		setField(element, SF_PROJ_FOLDER, settings.sfProjFolder);
		setField(element, PUBLISH_PROFILE, settings.publishProfile);
	}

	private static String getField(Element element, String field) {
		return JDOMExternalizerUtil.readCustomField(element, field);
	}

	private static void setField(Element element, String field, VirtualFile value) {
		if (value == null) return;

		JDOMExternalizerUtil.writeCustomField(element, field, value.toNioPath().toString());
	}
}
