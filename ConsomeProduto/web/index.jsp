<%-- 
    Document   : index
    Created on : 28/03/2022, 20:02:04
    Author     : Jon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Estoque</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.criarprodutos.CriarProdutosService service = new com.servico.criarprodutos.CriarProdutosService();
	com.servico.criarprodutos.CriarProdutos port = service.getCriarProdutosPort();
	 // TODO initialize WS operation arguments here
	java.lang.String descricao = "Teclado";
	java.lang.String fabricante = "Microsoft";
	double valor = 200;
	com.servico.criarprodutos.Produto objIndividuo = port.gerarProduto(descricao, fabricante, valor);
out.println(" Nome do produto = " + objIndividuo.getDescricao()+ ", Fabricante = " +
objIndividuo.getFabricante()+ " , Valor = " + objIndividuo.getValor());
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
