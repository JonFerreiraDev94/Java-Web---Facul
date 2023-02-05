
package com.servico.verificaringressos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebService(
name = "VerificarIngressos",
serviceName = "VerificarIngressosService")
public class VerificarIngressos {
private static final String banco = "jdbc:derby://localhost:1527/ingressos";
private static final String usuario = "jon";
private static final String senha = "jon";
private Connection conexao;
private PreparedStatement localizar;
private PreparedStatement reservaringresso;
@WebMethod(operationName = "verificaringresso")
public boolean verificaringresso(@WebParam(name = "local") String local,
@WebParam(name = "area") String area) {
try {
conexao = DriverManager.getConnection(banco,usuario,senha);
localizar = conexao.prepareStatement("select codigo from local where verificador = 0 and local = ? and area = ?");
localizar.setString(1, local);
localizar.setString(2, area);
ResultSet resultado = localizar.executeQuery();
if (resultado.next())
{
int localizacao = resultado.getInt(1);
reservaringresso = conexao.prepareStatement("update local set verificador = 1 where codigo=? ");
reservaringresso.setInt(1, localizacao);
reservaringresso.executeUpdate();
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