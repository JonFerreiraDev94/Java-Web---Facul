/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servico.calculararimc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(
name = "IMC",
serviceName = "IMCService")
public class CalcularImc {
@WebMethod(operationName = "gerarIMC")
public Individuo gerarIMC(@WebParam(name = "nome") String nome, @WebParam(name
= "peso") double peso, @WebParam(name = "altura") double altura) {
Individuo objIndividuo = new Individuo(nome,peso,altura);
return objIndividuo ;
}
}