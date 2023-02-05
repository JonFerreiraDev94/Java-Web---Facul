<%-- 
    Document   : index
    Created on : 14/03/2022, 22:17:35
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
        <h1>Gerar Cálculo da área!</h1>
    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.gerarcalculos.GerarCalculos service = new com.servico.gerarcalculos.GerarCalculos();
	com.servico.gerarcalculos.GerarCalculo port = service.getGerarCalculoPort();
	 // TODO initialize WS operation arguments here
	int base = 8;
	int altura = 2;
	// TODO process result here
	int result = port.geraCalculoRetangulo(base, altura);
	out.println("Area do retangulo = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.gerarcalculos.GerarCalculos service = new com.servico.gerarcalculos.GerarCalculos();
	com.servico.gerarcalculos.GerarCalculo port = service.getGerarCalculoPort();
	 // TODO initialize WS operation arguments here
	int base = 8;
	int altura = 2;
	// TODO process result here
	int result = port.geraCalculoTriangulo(base, altura);
	out.println("Area do triangulo = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
