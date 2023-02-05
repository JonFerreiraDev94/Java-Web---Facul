
package com.servico.verificarpoltrona;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebService(
name = "VerificarPoltrona",
serviceName = "VerificarPoltronaService")
public class VerificarPoltrona {
private static final String banco = "jdbc:derby://localhost:1527/reservas";
private static final String usuario = "jonatas";
private static final String senha = "jonatas";
private Connection conexao;
private PreparedStatement localizar;
private PreparedStatement reservarpoltrona;
@WebMethod(operationName = "checarpoltrona")
public boolean checarpoltrona(@WebParam(name = "categoria") String categoria, @WebParam(name = "local") String local) {
try {
conexao = DriverManager.getConnection(banco,usuario,senha);
localizar = conexao.prepareStatement("select codigo from poltrona where status = 0 and categoria = ? and local = ?");
localizar.setString(1, categoria);
localizar.setString(2, local);
ResultSet resultado = localizar.executeQuery();
if (resultado.next())
{
int poltrona = resultado.getInt(1);
reservarpoltrona = conexao.prepareStatement("update poltrona set status = 1 where codigo=? ");
reservarpoltrona.setInt(1, poltrona);
reservarpoltrona.executeUpdate();
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
