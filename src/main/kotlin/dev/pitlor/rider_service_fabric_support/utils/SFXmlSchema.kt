package dev.pitlor.rider_service_fabric_support.utils

import org.eclipse.persistence.oxm.NamespacePrefixMapper
import org.eclipse.persistence.oxm.annotations.XmlValueExtension
import javax.xml.bind.annotation.*


@XmlTransient
sealed class PowershellElement

@XmlRootElement(name = "Objs", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSObjects(
    @field:XmlElements(
        XmlElement(type = PSObjects::class, name = "Objs", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSObject::class, name = "Obj", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSEmpty::class, name = "Nil", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSBoolean::class, name = "B", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSInteger::class, name = "I64", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSString::class, name = "S", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSTString::class, name = "TS", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSUri::class, name = "URI", namespace = "http://schemas.microsoft.com/powershell/2004/04")
    )
    var objects: ArrayList<PowershellElement> = arrayListOf()
) : PowershellElement()

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Obj", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSObject(
    @field:XmlAttribute(name = "N")
    var name: String? = null,

    @field:XmlElement(name = "ToString", namespace = "http://schemas.microsoft.com/powershell/2004/04")
    var asString: String? = null,

    @field:XmlElementWrapper(name = "Props", namespace = "http://schemas.microsoft.com/powershell/2004/04")
    @field:XmlElements(
        XmlElement(type = PSEmpty::class, name = "Nil", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSBoolean::class, name = "B", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSInteger::class, name = "I64", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSString::class, name = "S", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSTString::class, name = "TS", namespace = "http://schemas.microsoft.com/powershell/2004/04"),
        XmlElement(type = PSUri::class, name = "URI", namespace = "http://schemas.microsoft.com/powershell/2004/04")
    )
    var properties: ArrayList<Primitive<Any>> = arrayListOf()
) : PowershellElement()

@XmlTransient
sealed class Primitive<T> : PowershellElement() {
    abstract var name: String?
    abstract var value: T?
}

@XmlRootElement(name = "Nil", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSEmpty(
    @field:XmlAttribute(name = "N")
    override var name: String? = null
) : Primitive<Nothing>() {
    @XmlTransient
    override var value = null
}

@XmlRootElement(name = "B", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSBoolean(
    @field:XmlAttribute(name = "N")
    var innerName: String? = null,

    @field:XmlAttribute(name = "S")
    var outerName: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: Boolean? = null
) : Primitive<Boolean>() {
    override var name: String?
        @get:XmlTransient
        get() = innerName ?: outerName
        set(value) {}
}

@XmlRootElement(name = "I64", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSInteger(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: Int? = null
) : Primitive<Int>()

@XmlRootElement(name = "S", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSString(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: String? = null
) : Primitive<String>()

@XmlRootElement(name = "TS", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSTString(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: String? = null
) : Primitive<String>()

@XmlRootElement(name = "URI", namespace = "http://schemas.microsoft.com/powershell/2004/04")
data class PSUri(
    @field:XmlAttribute(name = "N")
    override var name: String? = null,

    @field:XmlValue
    @field:XmlValueExtension
    override var value: String? = null
) : Primitive<String>()

val xmlTypes = arrayOf(
    PowershellElement::class.java,
    Primitive::class.java,
    PSObjects::class.java,
    PSObject::class.java,
    PSEmpty::class.java,
    PSBoolean::class.java,
    PSInteger::class.java,
    PSString::class.java,
    PSTString::class.java,
    PSUri::class.java
)

class SFNamespacePrefixMapper : NamespacePrefixMapper() {
    override fun getPreferredPrefix(namespaceUri: String?, suggestion: String?, requirePrefix: Boolean): String {
        return ""
    }
}