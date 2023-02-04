
package com.servico.criarpaciente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.criarpaciente package. 
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

    private final static QName _GerarPacienteResponse_QNAME = new QName("http://criarpaciente.servico.com/", "gerarPacienteResponse");
    private final static QName _GerarPaciente_QNAME = new QName("http://criarpaciente.servico.com/", "gerarPaciente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.criarpaciente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarPaciente }
     * 
     */
    public GerarPaciente createGerarPaciente() {
        return new GerarPaciente();
    }

    /**
     * Create an instance of {@link GerarPacienteResponse }
     * 
     */
    public GerarPacienteResponse createGerarPacienteResponse() {
        return new GerarPacienteResponse();
    }

    /**
     * Create an instance of {@link Paciente }
     * 
     */
    public Paciente createPaciente() {
        return new Paciente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarPacienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://criarpaciente.servico.com/", name = "gerarPacienteResponse")
    public JAXBElement<GerarPacienteResponse> createGerarPacienteResponse(GerarPacienteResponse value) {
        return new JAXBElement<GerarPacienteResponse>(_GerarPacienteResponse_QNAME, GerarPacienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://criarpaciente.servico.com/", name = "gerarPaciente")
    public JAXBElement<GerarPaciente> createGerarPaciente(GerarPaciente value) {
        return new JAXBElement<GerarPaciente>(_GerarPaciente_QNAME, GerarPaciente.class, null, value);
    }

}
