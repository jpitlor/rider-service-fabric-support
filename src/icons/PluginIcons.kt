package icons

import com.intellij.openapi.util.IconLoader

object PluginIcons {
    @JvmField
    val ServiceFabricLogo = IconLoader.getIcon("/sf-logo.svg", PluginIcons::class.java)

    @JvmField
    val GreyServiceFabricLogo = IconLoader.getIcon("/sf-logo-grey.svg", PluginIcons::class.java)
}