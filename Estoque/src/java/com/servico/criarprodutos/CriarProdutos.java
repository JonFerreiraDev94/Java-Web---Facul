
package com.servico.criarprodutos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(
name = "CriarProdutos",
serviceName = "CriarProdutosService")
public class CriarProdutos {
@WebMethod(operationName = "gerarProduto")
public Produto gerarProduto(@WebParam(name = "descricao") String descricao, @WebParam(name =
"fabricante") String fabricante, @WebParam(name = "valor") double valor) {
Produto obejtoProduto = new Produto(descricao,fabricante,valor);
return obejtoProduto ; }
}
