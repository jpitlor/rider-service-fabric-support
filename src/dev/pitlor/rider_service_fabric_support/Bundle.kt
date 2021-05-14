package dev.pitlor.rider_service_fabric_support

import com.intellij.DynamicBundle
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.PropertyKey

private const val BUNDLE: @NonNls String = "strings"
object Bundle : DynamicBundle(BUNDLE) {
    fun string(key: @PropertyKey(resourceBundle = BUNDLE) String, vararg params: Any?): @Nls String {
        return INSTANCE.getMessage(key, *params)
    }
}