
package com.servico.criarprodutos;

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
@WebService(name = "CriarProdutos", targetNamespace = "http://criarprodutos.servico.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CriarProdutos {


    /**
     * 
     * @param valor
     * @param fabricante
     * @param descricao
     * @return
     *     returns com.servico.criarprodutos.Produto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gerarProduto", targetNamespace = "http://criarprodutos.servico.com/", className = "com.servico.criarprodutos.GerarProduto")
    @ResponseWrapper(localName = "gerarProdutoResponse", targetNamespace = "http://criarprodutos.servico.com/", className = "com.servico.criarprodutos.GerarProdutoResponse")
    @Action(input = "http://criarprodutos.servico.com/CriarProdutos/gerarProdutoRequest", output = "http://criarprodutos.servico.com/CriarProdutos/gerarProdutoResponse")
    public Produto gerarProduto(
        @WebParam(name = "descricao", targetNamespace = "")
        String descricao,
        @WebParam(name = "fabricante", targetNamespace = "")
        String fabricante,
        @WebParam(name = "valor", targetNamespace = "")
        double valor);

}
