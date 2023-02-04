
package com.servico.gerarcalculos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GerarCalculo", targetNamespace = "http://gerarcalculos.servico.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GerarCalculo {


    /**
     * 
     * @param altura
     * @param base
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "geraCalculoTriangulo", targetNamespace = "http://gerarcalculos.servico.com/", className = "com.servico.gerarcalculos.GeraCalculoTriangulo")
    @ResponseWrapper(localName = "geraCalculoTrianguloResponse", targetNamespace = "http://gerarcalculos.servico.com/", className = "com.servico.gerarcalculos.GeraCalculoTrianguloResponse")
    @Action(input = "http://gerarcalculos.servico.com/GerarCalculo/geraCalculoTrianguloRequest", output = "http://gerarcalculos.servico.com/GerarCalculo/geraCalculoTrianguloResponse")
    public int geraCalculoTriangulo(
        @WebParam(name = "base", targetNamespace = "")
        int base,
        @WebParam(name = "altura", targetNamespace = "")
        int altura);

    /**
     * 
     * @param altura
     * @param base
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "geraCalculoRetangulo", targetNamespace = "http://gerarcalculos.servico.com/", className = "com.servico.gerarcalculos.GeraCalculoRetangulo")
    @ResponseWrapper(localName = "geraCalculoRetanguloResponse", targetNamespace = "http://gerarcalculos.servico.com/", className = "com.servico.gerarcalculos.GeraCalculoRetanguloResponse")
    @Action(input = "http://gerarcalculos.servico.com/GerarCalculo/geraCalculoRetanguloRequest", output = "http://gerarcalculos.servico.com/GerarCalculo/geraCalculoRetanguloResponse")
    public int geraCalculoRetangulo(
        @WebParam(name = "base", targetNamespace = "")
        int base,
        @WebParam(name = "altura", targetNamespace = "")
        int altura);

}
