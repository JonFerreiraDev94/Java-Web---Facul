
package com.servico.verificarpoltrona;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.verificarpoltrona package. 
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

    private final static QName _Checarpoltrona_QNAME = new QName("http://verificarpoltrona.servico.com/", "checarpoltrona");
    private final static QName _ChecarpoltronaResponse_QNAME = new QName("http://verificarpoltrona.servico.com/", "checarpoltronaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.verificarpoltrona
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Checarpoltrona }
     * 
     */
    public Checarpoltrona createChecarpoltrona() {
        return new Checarpoltrona();
    }

    /**
     * Create an instance of {@link ChecarpoltronaResponse }
     * 
     */
    public ChecarpoltronaResponse createChecarpoltronaResponse() {
        return new ChecarpoltronaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checarpoltrona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://verificarpoltrona.servico.com/", name = "checarpoltrona")
    public JAXBElement<Checarpoltrona> createChecarpoltrona(Checarpoltrona value) {
        return new JAXBElement<Checarpoltrona>(_Checarpoltrona_QNAME, Checarpoltrona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChecarpoltronaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://verificarpoltrona.servico.com/", name = "checarpoltronaResponse")
    public JAXBElement<ChecarpoltronaResponse> createChecarpoltronaResponse(ChecarpoltronaResponse value) {
        return new JAXBElement<ChecarpoltronaResponse>(_ChecarpoltronaResponse_QNAME, ChecarpoltronaResponse.class, null, value);
    }

}
