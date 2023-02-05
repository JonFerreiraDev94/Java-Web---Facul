import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebService(
name = "VerificarPagamento",
serviceName = "VerificarPagamentoService")
public class VerificarMatricula {
private static final String banco = "jdbc:derby://localhost:1527/escola";
private static final String usuario = "marcelo";
private static final String senha = "marcelo";
private Connection conexao;
private PreparedStatement localizar;
@WebMethod(operationName = "checarmatricula")
public boolean checarmatricula(@WebParam(name = "nome") String nome, @WebParam(name = "email") String email) {
try {
conexao = DriverManager.getConnection(banco,usuario,senha);
localizar = conexao.prepareStatement("select codigo from aluno where matricula = 1 and nome = ? and email = ?");
localizar.setString(1, nome);
localizar.setString(2, email);
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