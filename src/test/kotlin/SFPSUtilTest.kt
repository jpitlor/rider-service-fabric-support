import dev.pitlor.rider_service_fabric_support.utils.*
import org.eclipse.persistence.jaxb.JAXBContextFactory
import org.eclipse.persistence.jaxb.MarshallerProperties
import org.junit.Assert
import org.junit.Test
import java.io.StringReader
import java.io.StringWriter

class SFPSUtilTest {
    @Test
    fun canSerialize() {
        val writer = StringWriter()
        val psString = PSString("MyString", "42069")

        val marshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createMarshaller()
        marshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        marshaller.marshal(psString, writer)

        val expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><S xmlns=\"http://schemas.microsoft.com/powershell/2004/04\" N=\"MyString\">42069</S>"
        Assert.assertEquals(expected, writer.toString())
    }

    @Test
    fun canSerializeList() {
        val writer = StringWriter()
        val psObjs = PSObjects(arrayListOf(PSString("MyString", "42069")))

        val marshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createMarshaller()
        marshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        marshaller.marshal(psObjs, writer)

        val expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Objs xmlns=\"http://schemas.microsoft.com/powershell/2004/04\"><S N=\"MyString\">42069</S></Objs>"
        Assert.assertEquals(expected, writer.toString())
    }

    @Test
    fun canDeserialize() {
        val writer = StringWriter()
        val psObjs = PSObjects(arrayListOf(PSString("MyString", "42069")))

        val marshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createMarshaller()
        marshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        marshaller.marshal(psObjs, writer)

        val unmarshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createUnmarshaller()
        unmarshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        val output = unmarshaller.unmarshal(StringReader(writer.toString()))

        Assert.assertEquals(psObjs, output)
    }

    @Test
    fun canDeserializeObject() {
        val input = """
            <Obj N="FabricClientSettings" RefId="1" xmlns="http://schemas.microsoft.com/powershell/2004/04">
				<ToString>System.Fabric.FabricClientSettings</ToString>
				<Props>
					<S N="ClientFriendlyName">PowerShell-bc74e7c5-3590-48eb-bce1-15577b977c45</S>
				</Props>
			</Obj>
        """.trimIndent()

        val unmarshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createUnmarshaller()
        unmarshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        val output = unmarshaller.unmarshal(StringReader(input))

        val expected = PSObject(
            name = "FabricClientSettings",
            asString = "System.Fabric.FabricClientSettings",
            properties = arrayListOf(
                PSString(name = "ClientFriendlyName", value = "PowerShell-bc74e7c5-3590-48eb-bce1-15577b977c45")
            )
        )
        Assert.assertEquals(expected, output)
    }

    @Test
    fun canSerializeObject() {
        val writer = StringWriter()
        val psObject = PSObject(
            name = "FabricClientSettings",
            asString = "System.Fabric.FabricClientSettings",
            properties = arrayListOf(
                PSString(name = "ClientFriendlyName", value = "PowerShell-bc74e7c5-3590-48eb-bce1-15577b977c45")
            )
        )

        val marshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createMarshaller()
        marshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        marshaller.marshal(psObject, writer)

        val expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Obj xmlns=\"http://schemas.microsoft.com/powershell/2004/04\" N=\"FabricClientSettings\"><ToString>System.Fabric.FabricClientSettings</ToString><Props><S N=\"ClientFriendlyName\">PowerShell-bc74e7c5-3590-48eb-bce1-15577b977c45</S></Props></Obj>"
        Assert.assertEquals(expected, writer.toString())
    }

    @Test
    fun canSerializeAndDeserialize() {
        val writer = StringWriter()
        val psObject = PSObject(
            name = "FabricClientSettings",
            asString = "System.Fabric.FabricClientSettings",
            properties = arrayListOf(
                PSString(name = "ClientFriendlyName", value = "PowerShell-bc74e7c5-3590-48eb-bce1-15577b977c45")
            )
        )

        val marshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createMarshaller()
        marshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        marshaller.marshal(psObject, writer)

        val expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Obj xmlns=\"http://schemas.microsoft.com/powershell/2004/04\" N=\"FabricClientSettings\"><ToString>System.Fabric.FabricClientSettings</ToString><Props><S N=\"ClientFriendlyName\">PowerShell-bc74e7c5-3590-48eb-bce1-15577b977c45</S></Props></Obj>"
        Assert.assertEquals(expected, writer.toString())

        val unmarshaller = JAXBContextFactory
            .createContext(xmlTypes, mapOf<Any, Any>())
            .createUnmarshaller()
        unmarshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
        val output = unmarshaller.unmarshal(StringReader(writer.toString()))
        Assert.assertEquals(psObject, output)
    }
}