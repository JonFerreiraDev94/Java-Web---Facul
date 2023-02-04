<%-- 
    Document   : index
    Created on : 07/04/2022, 10:42:15
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
        <h1>Hello World!consome chuva</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.calcularchuva.IndiceService service = new com.servico.calcularchuva.IndiceService();
	com.servico.calcularchuva.Chuva port = service.getChuvaPort();
	 // TODO initialize WS operation arguments here
	java.lang.String local = "";
	double quantidade = 0.0d;
	double duracao = 0.0d;
	com.servico.calcularchuva.Chuva objChuva = port.gerarCalculo(local,quantidade, duracao);
out.println(" Dados da pessoa = " + objIndividuo.getNome() + ", peso " + objIndividuo.getPeso() + " altura " + objIndividuo.getAltura() );
out.println(" Seu imc é = " + objIndividuo.getImc());
if (objIndividuo.getImc() >= 30)
out.println(" individuo com obesidade moderada ");
else
if (objIndividuo.getImc() >= 25)
out.println(" individuo com sobrepeso ");
else
if (objIndividuo.getImc() >= 20)
out.println("individuo com Peso Ideal ");
else
out.println("individuo abaixo do peso ");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
