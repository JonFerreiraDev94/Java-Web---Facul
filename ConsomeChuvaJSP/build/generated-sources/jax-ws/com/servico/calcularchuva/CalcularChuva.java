
package com.servico.calcularchuva;

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
@WebService(name = "CalcularChuva", targetNamespace = "http://calcularchuva.servico.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalcularChuva {


    /**
     * 
     * @param duracao
     * @param quantidade
     * @param local
     * @return
     *     returns com.servico.calcularchuva.Chuva
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gerarCalculo", targetNamespace = "http://calcularchuva.servico.com/", className = "com.servico.calcularchuva.GerarCalculo")
    @ResponseWrapper(localName = "gerarCalculoResponse", targetNamespace = "http://calcularchuva.servico.com/", className = "com.servico.calcularchuva.GerarCalculoResponse")
    @Action(input = "http://calcularchuva.servico.com/CalcularChuva/gerarCalculoRequest", output = "http://calcularchuva.servico.com/CalcularChuva/gerarCalculoResponse")
    public Chuva gerarCalculo(
        @WebParam(name = "local", targetNamespace = "")
        String local,
        @WebParam(name = "quantidade", targetNamespace = "")
        double quantidade,
        @WebParam(name = "duracao", targetNamespace = "")
        double duracao);

}