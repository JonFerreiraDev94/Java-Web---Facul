package com.servico.calcularchuva;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(
        name = "CalcularChuva",
        serviceName = "CalcularChuvaService")
public class CalcularChuva {

    @WebMethod(operationName = "gerarCalculo")
    public Chuva gerarCalculo(@WebParam(name = "local") String local, @WebParam(name
            = "quantidade") double qtd, @WebParam(name = "duracao") double duracao) {
        Chuva objChuva = new Chuva(local, qtd, duracao);
        return objChuva;
    }
}
