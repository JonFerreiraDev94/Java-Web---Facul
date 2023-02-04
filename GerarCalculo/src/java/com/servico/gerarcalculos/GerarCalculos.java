
package com.servico.gerarcalculos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(
        name = "GerarCalculo",
        serviceName = "GerarCalculos")
public class GerarCalculos {

   
    
    @WebMethod(operationName = "geraCalculoRetangulo")
    public int gerarCalculoRetangulo(@WebParam(name = "base") int base,@WebParam(name = "altura") int altura) {
        return   base * altura ;
    }
    @WebMethod(operationName = "geraCalculoTriangulo")
    public int gerarCalculoTriangulo(@WebParam(name = "base") int base,@WebParam(name = "altura") int altura) {
        return   (base * altura) / 2 ;
}
}
