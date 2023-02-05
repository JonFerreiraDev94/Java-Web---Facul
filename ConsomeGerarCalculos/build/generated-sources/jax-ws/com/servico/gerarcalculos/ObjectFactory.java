
package com.servico.gerarcalculos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.gerarcalculos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GeraCalculoTrianguloResponse_QNAME = new QName("http://gerarcalculos.servico.com/", "geraCalculoTrianguloResponse");
    private final static QName _GeraCalculoRetanguloResponse_QNAME = new QName("http://gerarcalculos.servico.com/", "geraCalculoRetanguloResponse");
    private final static QName _GeraCalculoTriangulo_QNAME = new QName("http://gerarcalculos.servico.com/", "geraCalculoTriangulo");
    private final static QName _GeraCalculoRetangulo_QNAME = new QName("http://gerarcalculos.servico.com/", "geraCalculoRetangulo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.gerarcalculos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeraCalculoRetanguloResponse }
     * 
     */
    public GeraCalculoRetanguloResponse createGeraCalculoRetanguloResponse() {
        return new GeraCalculoRetanguloResponse();
    }

    /**
     * Create an instance of {@link GeraCalculoTrianguloResponse }
     * 
     */
    public GeraCalculoTrianguloResponse createGeraCalculoTrianguloResponse() {
        return new GeraCalculoTrianguloResponse();
    }

    /**
     * Create an instance of {@link GeraCalculoTriangulo }
     * 
     */
    public GeraCalculoTriangulo createGeraCalculoTriangulo() {
        return new GeraCalculoTriangulo();
    }

    /**
     * Create an instance of {@link GeraCalculoRetangulo }
     * 
     */
    public GeraCalculoRetangulo createGeraCalculoRetangulo() {
        return new GeraCalculoRetangulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraCalculoTrianguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gerarcalculos.servico.com/", name = "geraCalculoTrianguloResponse")
    public JAXBElement<GeraCalculoTrianguloResponse> createGeraCalculoTrianguloResponse(GeraCalculoTrianguloResponse value) {
        return new JAXBElement<GeraCalculoTrianguloResponse>(_GeraCalculoTrianguloResponse_QNAME, GeraCalculoTrianguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraCalculoRetanguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gerarcalculos.servico.com/", name = "geraCalculoRetanguloResponse")
    public JAXBElement<GeraCalculoRetanguloResponse> createGeraCalculoRetanguloResponse(GeraCalculoRetanguloResponse value) {
        return new JAXBElement<GeraCalculoRetanguloResponse>(_GeraCalculoRetanguloResponse_QNAME, GeraCalculoRetanguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraCalculoTriangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gerarcalculos.servico.com/", name = "geraCalculoTriangulo")
    public JAXBElement<GeraCalculoTriangulo> createGeraCalculoTriangulo(GeraCalculoTriangulo value) {
        return new JAXBElement<GeraCalculoTriangulo>(_GeraCalculoTriangulo_QNAME, GeraCalculoTriangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraCalculoRetangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gerarcalculos.servico.com/", name = "geraCalculoRetangulo")
    public JAXBElement<GeraCalculoRetangulo> createGeraCalculoRetangulo(GeraCalculoRetangulo value) {
        return new JAXBElement<GeraCalculoRetangulo>(_GeraCalculoRetangulo_QNAME, GeraCalculoRetangulo.class, null, value);
    }

}
