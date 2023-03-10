
package com.servico.boasvindas;

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
@WebService(name = "BoasVindas", targetNamespace = "http://boasvindas.servico.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BoasVindas {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GerarMensagem")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GerarMensagem", targetNamespace = "http://boasvindas.servico.com/", className = "com.servico.boasvindas.GerarMensagem")
    @ResponseWrapper(localName = "GerarMensagemResponse", targetNamespace = "http://boasvindas.servico.com/", className = "com.servico.boasvindas.GerarMensagemResponse")
    @Action(input = "http://boasvindas.servico.com/BoasVindas/GerarMensagemRequest", output = "http://boasvindas.servico.com/BoasVindas/GerarMensagemResponse")
    public String gerarMensagem(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
