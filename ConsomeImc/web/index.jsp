<%-- 
    Document   : index
    Created on : 04/04/2022, 20:04:38
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
        <h1>Hello World consome imc!</h1>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.calculararimc.IMCService service = new com.servico.calculararimc.IMCService();
	com.servico.calculararimc.IMC port = service.getIMCPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nome = "Marcelo";
	double peso = 70.0d;
	double altura = 1.71d;
	com.servico.calculararimc.Individuo objIndividuo = port.gerarIMC(nome, peso, altura);
out.println(" Dados da pessoa = " + objIndividuo.getNome() +  "\n,peso" + objIndividuo.getPeso() + " altura " + objIndividuo.getAltura() );
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
