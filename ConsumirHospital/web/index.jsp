<%-- 
    Document   : index
    Created on : 14/06/2022, 20:42:09
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
        <h1>Hello World! Consumir Agenda Hospitalar</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.agendarmedico.AgendarMedicoService service = new com.servico.agendarmedico.AgendarMedicoService();
	com.servico.agendarmedico.AgendarMedico port = service.getAgendarMedicoPort();
	 // TODO initialize WS operation arguments here
	java.lang.String medico = "psicologo";
	java.lang.String dia = "sexta";
	// TODO process result here
        
	boolean result = port.agendarConsulta(medico, dia);
        out.println("Médico = " + medico + ", Dia = " + dia + ", Result = " + result);
	
                
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
