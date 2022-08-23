package dev.pitlor.rider_service_fabric_support

import com.intellij.DynamicBundle

private const val BUNDLE: String = "strings"
class Bundle : DynamicBundle(BUNDLE) {
    companion object {
        private val instance = Bundle()

        fun string(key: String, vararg params: Any?): String {
            return instance.getMessage(key, *params)
        }
    }
}
