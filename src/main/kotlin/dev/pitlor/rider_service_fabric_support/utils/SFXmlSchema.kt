package dev.pitlor.rider_service_fabric_support.utils

import org.eclipse.persistence.oxm.NamespacePrefixMapper
import org.eclipse.persistence.oxm.annotations.XmlValueExtension
import javax.xml.bind.annotation.*

const val namespace = "http://schemas.microsoft.com/powershell/2004/04"

@XmlTransient
sealed class PowershellElement

@XmlRootElement(name = "Objs", namespace = namespace)
data class PSObjects(
    @field:XmlElements(
        XmlElement(type = PSObjects::class, name = "Objs", namespace = namespace),
        XmlElement(type = PSObject::class, name = "Obj", namespace = namespace),
        XmlElement(type = PSEmpty::class, name = "Nil", namespace = namespace),
        XmlElement(type = PSBoolean::class, name = "B", namespace = namespace),
        XmlElement(type = PSInteger::class, name = "I64", namespace = namespace),
        XmlElement(type = PSString::class, name = "S", namespace = namespace),
        XmlElement(type = PSTString::class, name = "TS", namespace = namespace),
        XmlElement(type = PSUri::class, name = "URI", namespace = namespace)
    )
    var objects: ArrayList<PowershellElement> = arrayListOf()
) : PowershellElement()

data class PSObject(
    @field:XmlAttribute(name = "N")
    var name: String? = null,

    @field:XmlElement(name = "ToString", namespace = namespace)
    var asString: String? = null,

    @field:XmlElementWrapper(name = "Props", namespace = namespace)
    @field:XmlElements(
        XmlElement(type = PSEmpty::class, name = "Nil", namespace = namespace),
        XmlElement(type = PSBoolean::class, name = "B", namespace = namespace),
        XmlElement(type = PSInteger::class, name = "I64", namespace = namespace),
        XmlElement(type = PSString::class, name = "S", namespace = namespace),
        XmlElement(type = PSTString::class, name = "TS", namespace = namespace),
        XmlElement(type = PSUri::class, name = "URI", namespace = namespace)
    )
    var properties: ArrayList<Primitive<Any>> = arrayListOf()
) : PowershellElement()

@XmlTransient
sealed class Primitive<T> : PowershellElement() {
    abstract var name: String?
    abstract var value: T?
}

data class PSEmpty(
    @field:XmlAttribute(name = "N")
    override var name: String? = null
) : Primitive<Nothing>() {
    @XmlTransient
    override var value = null
}

data class PSBoolean(
    @field:XmlAttribute(name = "N")
    var innerName: String? = null,

    @field:XmlAttribute(name = "S")
    var outerName: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: Boolean? = null
) : Primitive<Boolean>() {
    @Suppress("SuspiciousVarProperty")
    @field:XmlAttribute(name = "thisAttributeDoesntExist")
    override var name: String? = ""
        get() = innerName ?: outerName
}

data class PSInteger(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: Int? = null
) : Primitive<Int>()

data class PSString(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: String? = null
) : Primitive<String>()

data class PSTString(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: String? = null
) : Primitive<String>()

data class PSUri(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: String? = null
) : Primitive<String>()

class SFNamespacePrefixMapper : NamespacePrefixMapper() {
    override fun getPreferredPrefix(a: String?, b: String?, c: Boolean): String {
        return ""
    }
}
