package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.RunConfigurationProducer
import com.intellij.openapi.util.Ref
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.utils.SFUtil

class ServiceFabricRunConfigurationProducer protected constructor() :
    RunConfigurationProducer<ServiceFabricRunConfiguration>(false) {
    override fun setupConfigurationFromContext(
        runConfiguration: ServiceFabricRunConfiguration,
        configurationContext: ConfigurationContext,
        ref: Ref<PsiElement>
    ): Boolean {
        if (ref.isNull
            || ref.get().containingFile.fileType.name != Bundle.string("file_type.name")
            || ref.get().containingFile.parent == null
        ) {
            return false
        }

        val folder = ref.get().containingFile.parent!!.virtualFile
        runConfiguration.settings.sfProjFolder = folder

        val publishProfiles = SFUtil.getPublishProfiles(folder).toList()
        runConfiguration.settings.publishProfile =
            publishProfiles.firstOrNull { s: VirtualFile -> s.name.contains("Local") }
            ?: publishProfiles[0]
        return true
    }

    override fun isConfigurationFromContext(
        runConfiguration: ServiceFabricRunConfiguration,
        configurationContext: ConfigurationContext
    ): Boolean {
        return false
    }
}