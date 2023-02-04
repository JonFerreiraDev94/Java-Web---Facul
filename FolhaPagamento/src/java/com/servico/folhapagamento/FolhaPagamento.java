
package com.servico.folhapagamento;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "FolhaPagamento")
public class FolhaPagamento {//cria a classe do webservice

  
    
   @WebMethod(operationName = "gerarFuncionario")//cria o método do webservice para gerar o funcionario e os parametros que será usado
    public Celetista gerarFuncionario(@WebParam(name = "nome") String nome,@WebParam(name = "rua") String rua,@WebParam(name = "horas") double horas,@WebParam(name = "cpf") int cpf,@WebParam(name = "salario") double salario) {
        
        Celetista funcionarioUm = new Celetista(nome,rua,horas,cpf,salario);//cria um objeto funcionarioUm do tipo celetista e passo as informações
        funcionarioUm.calcularSalarioBruto(); //chama a função calcular salário bruto
        funcionarioUm.calcularINSS(); //chama a função calcular inss
        funcionarioUm.CalcularSalarioLiquido(); //chama a função calcular salario liquido 
        return funcionarioUm;
    }

}