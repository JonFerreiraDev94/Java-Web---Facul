<%-- 
    Document   : index
    Created on : 18/04/2022, 21:05:53
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
        <h1>Hello World!Consumo energia</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.energiaeletrica.ConsumoEnergiaEletrica service = new com.servico.energiaeletrica.ConsumoEnergiaEletrica();
	com.servico.energiaeletrica.EnergiaEletrica port = service.getEnergiaEletricaPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nome = "José";
	java.lang.String endereco = "Rua 3";
	double leituraAnterior = 3235d;
	double leituraAtual = 3298;
	com.servico.energiaeletrica.UnidadeConsumidora unidadeUm = port.calcularConsumo(nome, endereco, leituraAnterior, leituraAtual);
out.println(" <b>Nome do consumidor: </b> " + unidadeUm.getNomeProprietario()+ " &nbsp; &nbsp;    <b>endereço: </b>" + unidadeUm.getEndereco() + "<br>"+ "<b>Leitura anterior: </b> " + unidadeUm.getLeituraAnterior()+ " <b>&nbsp;&nbsp;&nbsp;leitura atual: </b> " + unidadeUm.getLeituraAtual() + "<br>" );
out.println(" <b>valor KWh:  </b>        " + unidadeUm.getValorTarifa() + " &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <b>Valor consumido: </b> " + unidadeUm.getQuantidadeConsumida() + ", <br><br><b>Total a pagar: </b>" +unidadeUm.getValorPagar());
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
