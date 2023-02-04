
package com.servico.boasvindas;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(
        name = "BoasVindas",
        serviceName = "BoasVindasService")
public class BoasVindas {

    @WebMethod(operationName = "GerarMensagem")
    public String geraMensagem(@WebParam(name = "name") String nome) {
        return "Seja bem vindo " + nome + " !";
    }
    
}
