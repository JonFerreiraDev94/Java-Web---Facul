
package com.servico.verificarpedido;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.verificarpedido package. 
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

    private final static QName _ChecarpedidoResponse_QNAME = new QName("http://verificarpedido.servico.com/", "checarpedidoResponse");
    private final static QName _Checarpedido_QNAME = new QName("http://verificarpedido.servico.com/", "checarpedido");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.verificarpedido
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Checarpedido }
     * 
     */
    public Checarpedido createChecarpedido() {
        return new Checarpedido();
    }

    /**
     * Create an instance of {@link ChecarpedidoResponse }
     * 
     */
    public ChecarpedidoResponse createChecarpedidoResponse() {
        return new ChecarpedidoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChecarpedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://verificarpedido.servico.com/", name = "checarpedidoResponse")
    public JAXBElement<ChecarpedidoResponse> createChecarpedidoResponse(ChecarpedidoResponse value) {
        return new JAXBElement<ChecarpedidoResponse>(_ChecarpedidoResponse_QNAME, ChecarpedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checarpedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://verificarpedido.servico.com/", name = "checarpedido")
    public JAXBElement<Checarpedido> createChecarpedido(Checarpedido value) {
        return new JAXBElement<Checarpedido>(_Checarpedido_QNAME, Checarpedido.class, null, value);
    }

}
