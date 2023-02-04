
package com.servico.calculararimc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.calculararimc package. 
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

    private final static QName _GerarIMC_QNAME = new QName("http://calculararimc.servico.com/", "gerarIMC");
    private final static QName _GerarIMCResponse_QNAME = new QName("http://calculararimc.servico.com/", "gerarIMCResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.calculararimc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarIMCResponse }
     * 
     */
    public GerarIMCResponse createGerarIMCResponse() {
        return new GerarIMCResponse();
    }

    /**
     * Create an instance of {@link GerarIMC }
     * 
     */
    public GerarIMC createGerarIMC() {
        return new GerarIMC();
    }

    /**
     * Create an instance of {@link Individuo }
     * 
     */
    public Individuo createIndividuo() {
        return new Individuo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarIMC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculararimc.servico.com/", name = "gerarIMC")
    public JAXBElement<GerarIMC> createGerarIMC(GerarIMC value) {
        return new JAXBElement<GerarIMC>(_GerarIMC_QNAME, GerarIMC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarIMCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculararimc.servico.com/", name = "gerarIMCResponse")
    public JAXBElement<GerarIMCResponse> createGerarIMCResponse(GerarIMCResponse value) {
        return new JAXBElement<GerarIMCResponse>(_GerarIMCResponse_QNAME, GerarIMCResponse.class, null, value);
    }

}
