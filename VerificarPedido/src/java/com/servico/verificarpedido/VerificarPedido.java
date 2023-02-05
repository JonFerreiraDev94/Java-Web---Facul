
package com.servico.verificarpedido;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebService(name = "verificarPedido",serviceName = "VerificarPedidoService")
public class VerificarPedido {

    private static final String banco = "jdbc:derby://localhost:1527/loja";
private static final String usuario = "jonatas";
private static final String senha = "jonatas";
private Connection conexao;
private PreparedStatement localizar;
@WebMethod(operationName = "checarpedido")
public boolean checarpedido(@WebParam(name = "produto") String produto, @WebParam(name = "fabricante") String fabricante) {
try {
conexao = DriverManager.getConnection(banco,usuario,senha);
localizar = conexao.prepareStatement("select codigo from compra where verificador = 1 and produto = ? and fabricante = ?");
localizar.setString(1, produto);
localizar.setString(2, fabricante);
ResultSet resultado = localizar.executeQuery();
if (resultado.next())
{
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
