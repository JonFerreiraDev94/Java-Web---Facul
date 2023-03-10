
package com.servico.criarprodutos;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CriarProdutosService", targetNamespace = "http://criarprodutos.servico.com/", wsdlLocation = "http://localhost:8080/Estoque/CriarProdutosService?wsdl")
public class CriarProdutosService
    extends Service
{

    private final static URL CRIARPRODUTOSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CRIARPRODUTOSSERVICE_EXCEPTION;
    private final static QName CRIARPRODUTOSSERVICE_QNAME = new QName("http://criarprodutos.servico.com/", "CriarProdutosService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Estoque/CriarProdutosService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRIARPRODUTOSSERVICE_WSDL_LOCATION = url;
        CRIARPRODUTOSSERVICE_EXCEPTION = e;
    }

    public CriarProdutosService() {
        super(__getWsdlLocation(), CRIARPRODUTOSSERVICE_QNAME);
    }

    public CriarProdutosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CRIARPRODUTOSSERVICE_QNAME, features);
    }

    public CriarProdutosService(URL wsdlLocation) {
        super(wsdlLocation, CRIARPRODUTOSSERVICE_QNAME);
    }

    public CriarProdutosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CRIARPRODUTOSSERVICE_QNAME, features);
    }

    public CriarProdutosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CriarProdutosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CriarProdutos
     */
    @WebEndpoint(name = "CriarProdutosPort")
    public CriarProdutos getCriarProdutosPort() {
        return super.getPort(new QName("http://criarprodutos.servico.com/", "CriarProdutosPort"), CriarProdutos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CriarProdutos
     */
    @WebEndpoint(name = "CriarProdutosPort")
    public CriarProdutos getCriarProdutosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://criarprodutos.servico.com/", "CriarProdutosPort"), CriarProdutos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRIARPRODUTOSSERVICE_EXCEPTION!= null) {
            throw CRIARPRODUTOSSERVICE_EXCEPTION;
        }
        return CRIARPRODUTOSSERVICE_WSDL_LOCATION;
    }

}
