
package com.servico.agendarmedico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebService(
name = "AgendarMedico",
serviceName = "AgendarMedicoService")
public class AgendarMedico {
private static final String banco = "jdbc:derby://localhost:1527/hospital";
private static final String usuario = "jon";
private static final String senha = "jon";
private Connection conexao;
private PreparedStatement localizar;
private PreparedStatement agendarHorario;
@WebMethod(operationName = "AgendarConsulta")
public boolean AgendarConsulta(@WebParam(name = "medico") String medico,
@WebParam(name = "dia") String dia) {
try {
conexao = DriverManager.getConnection(banco,usuario,senha);
localizar = conexao.prepareStatement("select codigo from consulta where verificacao = 0 and medico = ? and dia = ?");
localizar.setString(1, medico);
localizar.setString(2, dia);
ResultSet resultado = localizar.executeQuery();
if (resultado.next())
{
int agenda = resultado.getInt(1);
agendarHorario = conexao.prepareStatement("update consulta set verificacao = 1 where codigo=? ");
agendarHorario.setInt(1, agenda);
agendarHorario.executeUpdate();
return true;
}
return false;
}
catch(SQLException e)
{
e.printStackTrace();
return false;
}
}
}
