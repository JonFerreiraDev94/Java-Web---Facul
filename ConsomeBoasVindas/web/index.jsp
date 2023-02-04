
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consumir o WEB service boas vindas!</h1>
    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.boasvindas.BoasVindasService service = new com.servico.boasvindas.BoasVindasService();
	com.servico.boasvindas.BoasVindas port = service.getBoasVindasPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "jonatas";
	// TODO process result here
	java.lang.String result = port.gerarMensagem(name);
	out.println("Resultado = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
