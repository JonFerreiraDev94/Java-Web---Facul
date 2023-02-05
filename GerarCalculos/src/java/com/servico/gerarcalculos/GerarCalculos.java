
package com.servico.gerarcalculos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(
name = "BoasVindas",
serviceName = "BoasVindasService")
public class GerarCalculos {
@WebMethod(operationName = "gerarCaculo")
public String CalcularRetangulo(@WebParam(name = "Base") int base,@WebParam(name = "Altura") int altura ) {
return "Àrea do retangulo: " + base * altura + " !";
}
@WebMethod(operationName = "gerarCaculo")
public String CalcularTriangulo(@WebParam(name = "Base") int base,@WebParam(name = "Altura") int altura ) {
return "Àrea do triangulo: " + (base * altura) /2 + " !";
}
}

