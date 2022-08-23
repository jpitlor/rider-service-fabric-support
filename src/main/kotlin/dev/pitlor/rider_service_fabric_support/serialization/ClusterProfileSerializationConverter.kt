package dev.pitlor.rider_service_fabric_support.serialization

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.intellij.util.xmlb.Converter
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile

class ClusterProfileSerializationConverter : Converter<List<ClusterProfile>>() {
    private val gson = Gson()

    override fun toString(profiles: List<ClusterProfile>): String? {
        return gson.toJson(profiles)
    }

    override fun fromString(string: String): List<ClusterProfile>? {
        return gson.fromJson(string, TypeToken.getParameterized(List::class.java, ClusterProfile::class.java).type)
    }
}
