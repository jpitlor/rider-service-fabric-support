package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.openapi.vfs.VirtualFile;
import dev.pitlor.rider_service_fabric_support.utils.Utils;

public class ServiceFabricRunConfigurationSettings {
	public VirtualFile sfProjFolder;
	public VirtualFile publishProfile;

	public static final class Builder {
		public VirtualFile sfProjFolder;
		public VirtualFile publishProfile;

		public Builder() {
		}

		public Builder withSfProjFolder(String sfProjFolder) {
			if (sfProjFolder != null) this.sfProjFolder = Utils.getFile(sfProjFolder);
			return this;
		}

		public Builder withPublishProfile(String publishProfile) {
			if (publishProfile != null) this.publishProfile = Utils.getFile(publishProfile);
			return this;
		}

		public ServiceFabricRunConfigurationSettings build() {
			ServiceFabricRunConfigurationSettings settings = new ServiceFabricRunConfigurationSettings();
			settings.publishProfile = this.publishProfile;
			settings.sfProjFolder = this.sfProjFolder;
			return settings;
		}
	}
}
