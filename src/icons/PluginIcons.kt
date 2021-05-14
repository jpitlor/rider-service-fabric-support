package icons

import com.intellij.openapi.util.IconLoader

interface PluginIcons {
    companion object {
        val ServiceFabricLogo = IconLoader.getIcon("/sf-logo.svg", PluginIcons::class.java)
    }
}