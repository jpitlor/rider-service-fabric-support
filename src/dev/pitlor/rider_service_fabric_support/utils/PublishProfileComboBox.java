package dev.pitlor.rider_service_fabric_support.utils;

import com.intellij.openapi.ui.ComboBox;

public class PublishProfileComboBox extends ComboBox<String> {
	public PublishProfileComboBox(SfProjFolderTextField sfProjFolderTextField) {
		super();
		setMinimumAndPreferredWidth(1000);
	}
}
