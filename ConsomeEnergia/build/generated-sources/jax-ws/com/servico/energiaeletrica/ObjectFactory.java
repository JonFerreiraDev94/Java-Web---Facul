
package com.servico.energiaeletrica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.energiaeletrica package. 
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

    private final static QName _CalcularConsumo_QNAME = new QName("http://energiaeletrica.servico.com/", "calcularConsumo");
    private final static QName _CalcularConsumoResponse_QNAME = new QName("http://energiaeletrica.servico.com/", "calcularConsumoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.energiaeletrica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularConsumoResponse }
     * 
     */
    public CalcularConsumoResponse createCalcularConsumoResponse() {
        return new CalcularConsumoResponse();
    }

    /**
     * Create an instance of {@link CalcularConsumo }
     * 
     */
    public CalcularConsumo createCalcularConsumo() {
        return new CalcularConsumo();
    }

    /**
     * Create an instance of {@link UnidadeConsumidora }
     * 
     */
    public UnidadeConsumidora createUnidadeConsumidora() {
        return new UnidadeConsumidora();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularConsumo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://energiaeletrica.servico.com/", name = "calcularConsumo")
    public JAXBElement<CalcularConsumo> createCalcularConsumo(CalcularConsumo value) {
        return new JAXBElement<CalcularConsumo>(_CalcularConsumo_QNAME, CalcularConsumo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularConsumoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://energiaeletrica.servico.com/", name = "calcularConsumoResponse")
    public JAXBElement<CalcularConsumoResponse> createCalcularConsumoResponse(CalcularConsumoResponse value) {
        return new JAXBElement<CalcularConsumoResponse>(_CalcularConsumoResponse_QNAME, CalcularConsumoResponse.class, null, value);
    }

}
