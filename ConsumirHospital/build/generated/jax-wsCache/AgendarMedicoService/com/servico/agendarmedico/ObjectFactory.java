
package com.servico.agendarmedico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.agendarmedico package. 
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

    private final static QName _AgendarConsulta_QNAME = new QName("http://agendarmedico.servico.com/", "AgendarConsulta");
    private final static QName _AgendarConsultaResponse_QNAME = new QName("http://agendarmedico.servico.com/", "AgendarConsultaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.agendarmedico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgendarConsultaResponse }
     * 
     */
    public AgendarConsultaResponse createAgendarConsultaResponse() {
        return new AgendarConsultaResponse();
    }

    /**
     * Create an instance of {@link AgendarConsulta }
     * 
     */
    public AgendarConsulta createAgendarConsulta() {
        return new AgendarConsulta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgendarConsulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendarmedico.servico.com/", name = "AgendarConsulta")
    public JAXBElement<AgendarConsulta> createAgendarConsulta(AgendarConsulta value) {
        return new JAXBElement<AgendarConsulta>(_AgendarConsulta_QNAME, AgendarConsulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgendarConsultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendarmedico.servico.com/", name = "AgendarConsultaResponse")
    public JAXBElement<AgendarConsultaResponse> createAgendarConsultaResponse(AgendarConsultaResponse value) {
        return new JAXBElement<AgendarConsultaResponse>(_AgendarConsultaResponse_QNAME, AgendarConsultaResponse.class, null, value);
    }

}
