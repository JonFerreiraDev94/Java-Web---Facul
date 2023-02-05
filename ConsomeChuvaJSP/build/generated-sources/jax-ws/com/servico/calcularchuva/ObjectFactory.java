
package com.servico.calcularchuva;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.calcularchuva package. 
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

    private final static QName _GerarCalculo_QNAME = new QName("http://calcularchuva.servico.com/", "gerarCalculo");
    private final static QName _GerarCalculoResponse_QNAME = new QName("http://calcularchuva.servico.com/", "gerarCalculoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.calcularchuva
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarCalculoResponse }
     * 
     */
    public GerarCalculoResponse createGerarCalculoResponse() {
        return new GerarCalculoResponse();
    }

    /**
     * Create an instance of {@link GerarCalculo }
     * 
     */
    public GerarCalculo createGerarCalculo() {
        return new GerarCalculo();
    }

    /**
     * Create an instance of {@link Chuva }
     * 
     */
    public Chuva createChuva() {
        return new Chuva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarCalculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularchuva.servico.com/", name = "gerarCalculo")
    public JAXBElement<GerarCalculo> createGerarCalculo(GerarCalculo value) {
        return new JAXBElement<GerarCalculo>(_GerarCalculo_QNAME, GerarCalculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarCalculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularchuva.servico.com/", name = "gerarCalculoResponse")
    public JAXBElement<GerarCalculoResponse> createGerarCalculoResponse(GerarCalculoResponse value) {
        return new JAXBElement<GerarCalculoResponse>(_GerarCalculoResponse_QNAME, GerarCalculoResponse.class, null, value);
    }

}
