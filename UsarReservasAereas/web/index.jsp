<%-- 
    Document   : index
    Created on : 06/06/2022, 20:16:29
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
        <h1>Hello World!usar reservas</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.verificarpoltrona.VerificarPoltronaService service = new com.servico.verificarpoltrona.VerificarPoltronaService();
	com.servico.verificarpoltrona.VerificarPoltrona port = service.getVerificarPoltronaPort();
	 // TODO initialize WS operation arguments here
	java.lang.String categoria = "classe 1";
	java.lang.String local = "janela";
	// TODO process result here
	boolean result = port.checarpoltrona(categoria, local);
	out.println("Result = "+result);
       
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
