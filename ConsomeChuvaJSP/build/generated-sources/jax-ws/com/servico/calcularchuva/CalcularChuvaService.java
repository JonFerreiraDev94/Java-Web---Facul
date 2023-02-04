
package com.servico.calcularchuva;

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
@WebServiceClient(name = "CalcularChuvaService", targetNamespace = "http://calcularchuva.servico.com/", wsdlLocation = "http://localhost:8080/IndiceChuva/CalcularChuvaService?wsdl")
public class CalcularChuvaService
    extends Service
{

    private final static URL CALCULARCHUVASERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULARCHUVASERVICE_EXCEPTION;
    private final static QName CALCULARCHUVASERVICE_QNAME = new QName("http://calcularchuva.servico.com/", "CalcularChuvaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/IndiceChuva/CalcularChuvaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULARCHUVASERVICE_WSDL_LOCATION = url;
        CALCULARCHUVASERVICE_EXCEPTION = e;
    }

    public CalcularChuvaService() {
        super(__getWsdlLocation(), CALCULARCHUVASERVICE_QNAME);
    }

    public CalcularChuvaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULARCHUVASERVICE_QNAME, features);
    }

    public CalcularChuvaService(URL wsdlLocation) {
        super(wsdlLocation, CALCULARCHUVASERVICE_QNAME);
    }

    public CalcularChuvaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULARCHUVASERVICE_QNAME, features);
    }

    public CalcularChuvaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcularChuvaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalcularChuva
     */
    @WebEndpoint(name = "CalcularChuvaPort")
    public CalcularChuva getCalcularChuvaPort() {
        return super.getPort(new QName("http://calcularchuva.servico.com/", "CalcularChuvaPort"), CalcularChuva.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalcularChuva
     */
    @WebEndpoint(name = "CalcularChuvaPort")
    public CalcularChuva getCalcularChuvaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calcularchuva.servico.com/", "CalcularChuvaPort"), CalcularChuva.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULARCHUVASERVICE_EXCEPTION!= null) {
            throw CALCULARCHUVASERVICE_EXCEPTION;
        }
        return CALCULARCHUVASERVICE_WSDL_LOCATION;
    }

}
