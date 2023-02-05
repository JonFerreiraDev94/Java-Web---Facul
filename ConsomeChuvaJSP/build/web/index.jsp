
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consumo índice de chuva</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                com.servico.calcularchuva.CalcularChuvaService service = new com.servico.calcularchuva.CalcularChuvaService();
                com.servico.calcularchuva.CalcularChuva port = service.getCalcularChuvaPort();
                // TODO initialize WS operation arguments here
                java.lang.String local = "Bauru";
                double quantidade = 20d;
                double duracao = 4d;
                com.servico.calcularchuva.Chuva objChuva = port.gerarCalculo(local, quantidade, duracao);
                out.print("<p>Local = " + objChuva.getLocal());
                out.print("<p>quantidade (em milímetros)= " + objChuva.getQtd());
                out.print("<p>Duração(em horas)= " + objChuva.getDuracao());
                out.print("<p>índice de chuva = " + objChuva.getIndice() + " litros por m²" + " em " + objChuva.getDuracao() + " horas");

                if (objChuva.getIndice() <= 1.25) {
                    out.println("<p> Nível de chuva: fraca ");
                } else if (objChuva.getIndice() > 1.25 && objChuva.getIndice() <= 6.25) {
                    out.println("<p> Nível de chuva: moderada ");
                } else if (objChuva.getIndice() > 6.25 && objChuva.getIndice() <= 12.5) {
                    out.println("<p> Nível de chuva: forte ");
                } else {
                    out.println("<p> Nível de chuva: Tempestade ");
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
