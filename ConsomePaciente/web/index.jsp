<%-- 
    Document   : index
    Created on : 21/03/2022, 21:27:57
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
        <h1>Consome Paciente!</h1>
        
        <%-- start web service invocation --%><hr/>
    <%
    try {
com.servico.criarpaciente.CriarPacienteService service = new com.servico.criarpaciente.CriarPacienteService();
com.servico.criarpaciente.CriarPaciente port = service.getCriarPacientePort();
java.lang.String nome = "Pedro";
java.lang.String tipoEnfermidade = "alergia";
com.servico.criarpaciente.Paciente objIndividuo = port.gerarPaciente(nome, tipoEnfermidade);
out.println(" Dados do paciente = " + objIndividuo.getNome() + ", tipo enfermidade " +
objIndividuo.getTipoEnfermidade());
} catch (Exception ex) {
// TODO handle custom exceptions here
}
%>
<%-- end web service invocation --%><hr/>
</body></html>
    </body>
</html>
    