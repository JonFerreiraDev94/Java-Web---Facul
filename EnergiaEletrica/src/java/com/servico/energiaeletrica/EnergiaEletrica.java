
package com.servico.energiaeletrica;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(
        name = "EnergiaEletrica",
        serviceName = "ConsumoEnergiaEletrica")
public class EnergiaEletrica {

    
    @WebMethod(operationName = "calcularConsumo")
public UnidadeConsumidora calcularConsumo(@WebParam(name = "nome") String nome, @WebParam(name =
"endereco") String endereco,@WebParam(name = "leituraAnterior") double leituraAnterior, @WebParam(name =
"leituraAtual") double leituraAtual) {
UnidadeConsumidora unidadeUm = new UnidadeConsumidora(nome,endereco,leituraAnterior,leituraAtual);
unidadeUm.gerarQuantidadeEnergiaConsumida();
unidadeUm.gerarValorPagar();
return unidadeUm ;
    }
}
