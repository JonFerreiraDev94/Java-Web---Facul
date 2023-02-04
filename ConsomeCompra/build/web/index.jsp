<%-- 
    Document   : index
    Created on : 30/05/2022, 21:26:48
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
        <h1>Hello World!consome compra</h1>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.verificarpedido.VerificarPedidoService service = new com.servico.verificarpedido.VerificarPedidoService();
	com.servico.verificarpedido.VerificarPedido port = service.getVerificarPedidoPort();
	 // TODO initialize WS operation arguments here
	java.lang.String produto = "fone";
	java.lang.String fabricante = "motorola";
	// TODO process result here
	boolean result = port.checarpedido(produto, fabricante);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
